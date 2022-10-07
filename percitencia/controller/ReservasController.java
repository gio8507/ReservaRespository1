package com.example.percitencia.controller;

import com.example.percitencia.Respository.ReservasRepository;
import com.example.percitencia.domain.Reservar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ReservasController {


    @Autowired
   private ReservasRepository reservasRepository;

    @PostMapping("/reservas/coche/{matricula}/cliente/{dni}")
    public ResponseEntity<String> hacerReserva(@PathVariable String matricula, @PathVariable String dni) {
        Reservar reserva = new Reservar(matricula, dni);
        reservasRepository.save(reserva);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/reservas/coche/{matricula}/cliente/{dni}")
    public ResponseEntity<String> cancelarReserva(@PathVariable String matricula, @PathVariable String dni) {
        try {
          reservasRepository.delete(new Reservar(matricula, dni));
        }catch (Exception e1){
            return ResponseEntity.badRequest().build();
        }

        return ResponseEntity.status(HttpStatus.OK).build();
    }

}