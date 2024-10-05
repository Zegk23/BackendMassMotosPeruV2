package com.massmotosperu.backend.Repositories;

import com.massmotosperu.backend.Models.MotoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MotoRepository extends JpaRepository<MotoModel, String> {
    Optional<MotoModel> findByNombreMoto(String nombre);
}
