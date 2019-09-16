package com.edu.Parqueadero.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "vehiculo")
public class Vehiculo {
	
	 	@Id
	 	@GeneratedValue
	 	@Column(name="id")
	    private Long id;
	    @Column(name = "propietario")
	    private String propietario;
	    @Column(name="placa")
	    private String placa;
	    @Column(name = "telefono")
	    private String telefono;
	    @ManyToOne
	    @JoinColumn(name="id_tipo_vehiculo")
	    private TipoVehiculo tipoVehiculo;

	    public TipoVehiculo getTipoVehiculo()
	    {
	        if(tipoVehiculo == null){
	        	tipoVehiculo = new TipoVehiculo();
	        }
	        return tipoVehiculo;
	    }

}
