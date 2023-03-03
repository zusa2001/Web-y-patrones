package com.tienda_k.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name="cliente")
public class Cliente implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  //cambiar estas variables a la de mysql workbench
    private long id_pais;
    
    private int id_cedula;
    private String nombre;
    private String capital;
    private String poblacion;

    public Cliente() {
        
    }

    public Cliente(int id_pais,int id_cedula,String nombre, String capital, String poblacion) {
        this.id_pais = id_pais;
        this.nombre = nombre;
        this.capital = capital;
        this.poblacion = poblacion;
    }
    
}
