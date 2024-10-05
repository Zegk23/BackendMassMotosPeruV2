package com.massmotosperu.backend.Repositories;

import com.massmotosperu.backend.Models.CombustiblesModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface CombustiblesRepository extends JpaRepository<CombustiblesModel, String> {
    List<CombustiblesModel> findByCombustiblesID(String combustiblesID);
}
