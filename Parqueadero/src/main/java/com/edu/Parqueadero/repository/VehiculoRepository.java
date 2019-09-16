package com.edu.Parqueadero.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edu.Parqueadero.entity.Vehiculo;


@Repository
public interface VehiculoRepository extends JpaRepository<Vehiculo, Long> {

}
