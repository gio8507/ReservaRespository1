package com.example.percitencia.domain;

import com.sun.istack.NotNull;
import org.aspectj.bridge.IMessage;
import org.aspectj.bridge.Message;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="reservas")
public class Reservar {
    @Id
    private String dni;
    private String matricula;


    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Reservar(String dni,  String matricula) {
        this.dni = dni;
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Reservar{" +
                "dni='" + dni + '\'' +
                ", matricula='" + matricula + '\'' +
                '}';
    }

    public Reservar(){

        }

}

