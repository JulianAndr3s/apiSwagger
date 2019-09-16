package com.edu.Parqueadero.service;

import java.util.List;

import com.edu.Parqueadero.entity.Vehiculo;


public interface ParqueaderoService {

	List<Vehiculo> findAll();

    void insert(Vehiculo vehiculo);

    Vehiculo findById(Long id);

    void update(Vehiculo vehiculo);

    void deleteById(Long id);
}
