package com.example.app.Repository;

import com.example.app.Modal.Motorbike;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MotorbikeRepository extends JpaRepository<Motorbike,String> {
}
