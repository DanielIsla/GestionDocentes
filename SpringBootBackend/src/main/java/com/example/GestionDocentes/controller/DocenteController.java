
package com.example.GestionDocentes.controller;

import com.example.GestionDocentes.dto.DocenteDTO;
import com.example.GestionDocentes.model.Docente;
import com.example.GestionDocentes.service.DocenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/docentes")
public class DocenteController {

    @Autowired
    private DocenteService docenteService;

    @GetMapping
    public List<DocenteDTO> getAllDocentes() {
        return docenteService.getAllDocentes();
    }

    @GetMapping("/ordenados-apellidos")
    public List<Docente> getAllDocentesSortedByApellidos() {
        return docenteService.getAllDocentesSortedByApellidos();
    }

    @GetMapping("/departamento/{nombreDepartamento}")
    public List<Docente> getDocentesByDepartamento(@PathVariable String nombreDepartamento) {
        return docenteService.getDocentesByDepartamento(nombreDepartamento);
    }
}
