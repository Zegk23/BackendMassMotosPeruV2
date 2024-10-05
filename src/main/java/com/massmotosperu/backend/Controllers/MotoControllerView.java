package com.massmotosperu.backend.Controllers;

import com.massmotosperu.backend.Models.MotoModel;
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

    @GetMapping("/editar/{id}")
    public String mostrarFormularioEditarMoto(@PathVariable String id, Model model) {
        MotoModel moto = motoServiceView.obtenerMotoPorId(id).orElse(null);
        model.addAttribute("moto", moto);
        return "motos/editar";
    }

    @PostMapping("/editar")
    public String editarMoto(@ModelAttribute MotoModel moto) {
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
