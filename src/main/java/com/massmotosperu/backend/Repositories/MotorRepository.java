package com.massmotosperu.backend.Repositories;

import com.massmotosperu.backend.Models.MotorModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MotorRepository extends JpaRepository<MotorModel, String> {
}
