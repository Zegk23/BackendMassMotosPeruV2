package com.massmotosperu.backend.Repositories;

import com.massmotosperu.backend.Models.CombustiblesModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CombustiblesRepository extends JpaRepository<CombustiblesModel, String> {
}
