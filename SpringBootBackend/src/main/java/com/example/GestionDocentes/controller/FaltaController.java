
package com.example.GestionDocentes.controller;

import com.example.GestionDocentes.dto.FaltaHorarioDTO;
import com.example.GestionDocentes.service.FaltaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/faltas")
public class FaltaController {

    @Autowired
    private FaltaService faltaService;

    @GetMapping
    public List<FaltaHorarioDTO> getAllFaltas() {
        return faltaService.getAllFaltasWithHorario();
    }
}
