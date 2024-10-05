package com.massmotosperu.backend.Controllers;

import com.massmotosperu.backend.Models.*;
import com.massmotosperu.backend.Services.MotoServiceView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/motos")
public class MotoControllerView {

    @Autowired
    private MotoServiceView motoServiceView;

    // Mostrar listado de motos en la vista
    @GetMapping("/listar")
    public String listarMotos(Model model) {
        List<MotoModel> motos = motoServiceView.obtenerMotos();
        model.addAttribute("motos", motos);
        return "motos/listar";
    }

    // Mostrar formulario para agregar una nueva moto
    @GetMapping("/agregar")
    public String mostrarFormularioAgregarMoto(Model model) {
        model.addAttribute("moto", new MotoModel());
        return "motos/agregar";
    }

    // Procesar el formulario para agregar una nueva moto
    @PostMapping("/agregar")
    public String agregarMoto(@ModelAttribute MotoModel moto) {
        motoServiceView.agregarMoto(moto);
        return "redirect:/motos/listar";
    }

    // Mostrar formulario para editar una moto y sus entidades relacionadas
    @GetMapping("/editar/{id}")
    public String mostrarFormularioEditarMoto(@PathVariable String id, Model model) {
        // Obtener la moto por su ID y cargar todas las relaciones
        MotoModel moto = motoServiceView.obtenerMotoPorId(id).orElse(null);

        if (moto == null) {
            // Si no se encuentra la moto, redirigir a la lista de motos
            return "redirect:/motos/listar";
        }

        // Inicializar entidades relacionadas si son nulas
        if (moto.getMotor() == null) {
            moto.setMotor(new MotorModel());
        }
        if (moto.getSuspensiones() == null) {
            moto.setSuspensiones(new SuspensionesModel());
        }
        if (moto.getCombustibles() == null) {
            moto.setCombustibles(new CombustiblesModel());
        }
        if (moto.getNeumaticos() == null) {
            moto.setNeumaticos(new NeumaticosModel());
        }
        if (moto.getFrenos() == null) {
            moto.setFrenos(new FrenosModel());
        }

        // Añadir la moto al modelo para mostrarla en el formulario de edición
        model.addAttribute("moto", moto);
        return "motos/editar";
    }

    // Procesar la edición de la moto y las entidades relacionadas
    @PostMapping("/editar")
    public String editarMoto(@ModelAttribute MotoModel moto) {
        // Asegúrate de que las relaciones estén correctamente establecidas antes de guardar
        motoServiceView.editarMoto(moto.getIdMoto(), moto);
        return "redirect:/motos/listar";
    }

    // Eliminar una moto
    @GetMapping("/eliminar/{id}")
    public String eliminarMoto(@PathVariable String id) {
        motoServiceView.eliminarMoto(id);
        return "redirect:/motos/listar";
    }
}
