package com.example.percitencia.Respository;

import com.example.percitencia.domain.Reservar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReservasRepository extends JpaRepository<Reservar, String> {




}




