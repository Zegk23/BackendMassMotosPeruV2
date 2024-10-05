package com.massmotosperu.backend.Repositories;

import com.massmotosperu.backend.Models.RolModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolRepository extends JpaRepository<RolModel, Integer> {
}
