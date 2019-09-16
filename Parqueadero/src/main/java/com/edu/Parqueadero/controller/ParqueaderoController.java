package com.edu.Parqueadero.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edu.Parqueadero.entity.Vehiculo;
import com.edu.Parqueadero.service.ParqueaderoService;


@RestController
@RequestMapping("/parqueadero")
public class ParqueaderoController {
	
	@Autowired
    private ParqueaderoService parqueaderoService;
	
	@GetMapping("/vehiculos")
    public List<Vehiculo> findAll(){
        return parqueaderoService.findAll();
    }

    @PostMapping("/vehiculo")
    public void insert(@RequestBody Vehiculo vehiculo){
    	parqueaderoService.insert(vehiculo);
    }

    @GetMapping("/{id}/vehiculo")
    public Vehiculo findById(@PathVariable Long id){
        return parqueaderoService.findById(id);
    }

    @PutMapping("/{id}/vehiculo")
    public void update(@RequestBody Vehiculo vehiculo, @PathVariable Long id){
    	vehiculo.setId(id);
         parqueaderoService.update(vehiculo);
    }

    @DeleteMapping("/{id}/vehiculo")
    public void delete(@PathVariable Long id){
    	parqueaderoService.deleteById(id);
    }

}
