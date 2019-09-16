package com.edu.Parqueadero.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edu.Parqueadero.entity.Vehiculo;
import com.edu.Parqueadero.repository.TipoVehiculoRepository;
import com.edu.Parqueadero.repository.VehiculoRepository;
import com.edu.Parqueadero.service.ParqueaderoService;

@Service
public class ParqueaderoServiceImpl implements ParqueaderoService {
	
	@Autowired
    private VehiculoRepository vehiculoRepository;

    @Autowired
    private TipoVehiculoRepository tipoVehiculoRepository;


    public List<Vehiculo> findAll(){
        return vehiculoRepository.findAll();
    }


    public void insert(Vehiculo vehiculo) {
        vehiculo.setTipoVehiculo(tipoVehiculoRepository.findById(vehiculo.getTipoVehiculo().getId()).orElse(null));
        vehiculoRepository.save(vehiculo);
    }

    
    public Vehiculo findById(Long id) {
        return vehiculoRepository.findById(id).orElse(null);
    }


    public void update(Vehiculo vehiculo) {
    	vehiculoRepository.save(vehiculo);
    }


    public void deleteById(Long id) {
    	vehiculoRepository.deleteById(id);
    }

}
