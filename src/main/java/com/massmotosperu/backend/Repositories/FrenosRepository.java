package com.massmotosperu.backend.Repositories;

import com.massmotosperu.backend.Models.FrenosModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FrenosRepository extends JpaRepository<FrenosModel, String> {
}
