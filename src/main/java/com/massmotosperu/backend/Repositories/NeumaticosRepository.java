package com.massmotosperu.backend.Repositories;

import com.massmotosperu.backend.Models.NeumaticosModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NeumaticosRepository extends JpaRepository<NeumaticosModel, String> {
}
