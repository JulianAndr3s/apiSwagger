package com.edu.Parqueadero.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edu.Parqueadero.entity.TipoVehiculo;

@Repository
public interface TipoVehiculoRepository extends JpaRepository<TipoVehiculo, Integer>{

}
