package com.massmotosperu.backend.Repositories;

import com.massmotosperu.backend.Models.ColoresModel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ColoresRepository extends JpaRepository<ColoresModel, String> {
    List<ColoresModel> findByColoresID(String coloresID);
}
