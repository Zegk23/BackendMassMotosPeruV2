package com.massmotosperu.backend.Services;

import com.massmotosperu.backend.Models.MotoModel;
import com.massmotosperu.backend.Repositories.MotoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MotoServiceView {

    @Autowired
    private MotoRepository motoRepository;

    public List<MotoModel> obtenerMotos() {
        return motoRepository.findAll();
    }

    public Optional<MotoModel> obtenerMotoPorId(String id) {
        return motoRepository.findById(id);
    }

    public MotoModel agregarMoto(MotoModel moto) {
        return motoRepository.save(moto);
    }

    public Optional<MotoModel> editarMoto(String id, MotoModel moto) {
        return motoRepository.findById(id).map(m -> {
            m.setNombreMoto(moto.getNombreMoto());
            m.setEstadoMoto(moto.getEstadoMoto());
            m.setMarcaMoto(moto.getMarcaMoto());
            m.setModeloMoto(moto.getModeloMoto());
            m.setAnioFabricacion(moto.getAnioFabricacion());
            m.setVelocidadMaxima(moto.getVelocidadMaxima());
            m.setPrecioSoles(moto.getPrecioSoles());
            m.setPrecioDolares(moto.getPrecioDolares());
            m.setKilometraje(moto.getKilometraje());
            m.setDisponibilidad(moto.isDisponibilidad());
            m.setPeso(moto.getPeso());
            m.setNumAsientos(moto.getNumAsientos());
            m.setCargaUtil(moto.getCargaUtil());
            m.setGarantiaAnios(moto.getGarantiaAnios());
            m.setGarantiaKM(moto.getGarantiaKM());
            m.setDescripcionMoto(moto.getDescripcionMoto());

            return motoRepository.save(m);
        });
    }

    public boolean eliminarMoto(String id) {
        return motoRepository.findById(id).map(moto -> {
            motoRepository.delete(moto);
            return true;
        }).orElse(false);
    }
}
