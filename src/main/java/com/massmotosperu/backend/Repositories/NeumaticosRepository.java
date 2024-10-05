package com.massmotosperu.backend.Repositories;

import com.massmotosperu.backend.Models.NeumaticosModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public interface NeumaticosRepository extends JpaRepository<NeumaticosModel, String> {
    List<NeumaticosModel> findByNeumaticosID(String neumaticosID);
}
