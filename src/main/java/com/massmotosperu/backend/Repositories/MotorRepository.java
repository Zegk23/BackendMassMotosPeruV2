package com.massmotosperu.backend.Repositories;

import com.massmotosperu.backend.Models.MotorModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public interface MotorRepository extends JpaRepository<MotorModel, String> {
    List<MotorModel> findByMotorID(String motorID);
}
