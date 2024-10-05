package com.massmotosperu.backend.Services;

import com.massmotosperu.backend.DTOs.MotoDTO;
import com.massmotosperu.backend.Models.MotoModel;
import com.massmotosperu.backend.Repositories.MotoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MotoService {

    @Autowired
    private MotoRepository motoRepository;

    public List<MotoModel> obtenerMotos() {
        return motoRepository.findAll();
    }

    public Optional<MotoModel> obtenerMotoPorNombre(String nombre) {
        return motoRepository.findByNombreMoto(nombre);
    }

    public Optional<MotoModel> obtenerMotoPorId(String id) {
        return motoRepository.findById(id);
    }

    public MotoModel agregarMoto(MotoDTO motoDTO) {
        MotoModel moto = new MotoModel();
        moto.setNombreMoto(motoDTO.getNombreMoto());
        moto.setEstadoMoto(motoDTO.getEstadoMoto());
        moto.setMarcaMoto(motoDTO.getMarcaMoto());
        moto.setModeloMoto(motoDTO.getModeloMoto());
        moto.setAnioFabricacion(motoDTO.getAnioFabricacion());
        moto.setVelocidadMaxima(motoDTO.getVelocidadMaxima());
        moto.setPrecioSoles(motoDTO.getPrecioSoles());
        moto.setPrecioDolares(motoDTO.getPrecioDolares());
        moto.setKilometraje(motoDTO.getKilometraje());
        moto.setDisponibilidad(motoDTO.isDisponibilidad());
        moto.setPeso(motoDTO.getPeso());
        moto.setNumAsientos(motoDTO.getNumAsientos());
        moto.setCargaUtil(motoDTO.getCargaUtil());
        moto.setGarantiaAnios(motoDTO.getGarantiaAnios());
        moto.setGarantiaKM(motoDTO.getGarantiaKM());
        moto.setDescripcionMoto(motoDTO.getDescripcionMoto());

        return motoRepository.save(moto);
    }

    public Optional<MotoModel> editarMoto(String id, MotoDTO motoDTO) {
        return motoRepository.findById(id).map(moto -> {
            moto.setNombreMoto(motoDTO.getNombreMoto());
            moto.setEstadoMoto(motoDTO.getEstadoMoto());
            moto.setMarcaMoto(motoDTO.getMarcaMoto());
            moto.setModeloMoto(motoDTO.getModeloMoto());
            moto.setAnioFabricacion(motoDTO.getAnioFabricacion());
            moto.setVelocidadMaxima(motoDTO.getVelocidadMaxima());
            moto.setPrecioSoles(motoDTO.getPrecioSoles());
            moto.setPrecioDolares(motoDTO.getPrecioDolares());
            moto.setKilometraje(motoDTO.getKilometraje());
            moto.setDisponibilidad(motoDTO.isDisponibilidad());
            moto.setPeso(motoDTO.getPeso());
            moto.setNumAsientos(motoDTO.getNumAsientos());
            moto.setCargaUtil(motoDTO.getCargaUtil());
            moto.setGarantiaAnios(motoDTO.getGarantiaAnios());
            moto.setGarantiaKM(motoDTO.getGarantiaKM());
            moto.setDescripcionMoto(motoDTO.getDescripcionMoto());

            return motoRepository.save(moto);
        });
    }

    public boolean eliminarMoto(String id) {
        return motoRepository.findById(id).map(moto -> {
            motoRepository.delete(moto);
            return true;
        }).orElse(false);
    }
}
