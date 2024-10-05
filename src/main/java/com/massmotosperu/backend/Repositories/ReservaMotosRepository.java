package com.massmotosperu.backend.Repositories;

import com.massmotosperu.backend.Models.ReservaMotosModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservaMotosRepository extends JpaRepository<ReservaMotosModel, String> {
}
