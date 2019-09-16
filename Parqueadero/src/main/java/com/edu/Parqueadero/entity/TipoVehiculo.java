package com.edu.Parqueadero.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "tipo_vehiculo")
public class TipoVehiculo {

	@Id
    @Column(name = "id")
    private Integer id;

    @Column(name ="tipo")
    private String tipo;

    @Column(name ="marca")
    private String marca;
}
