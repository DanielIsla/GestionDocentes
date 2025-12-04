
package com.example.GestionDocentes.service;

import com.example.GestionDocentes.dto.DocenteDTO;
import com.example.GestionDocentes.model.Docente;
import com.example.GestionDocentes.repository.DocenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DocenteService {

    @Autowired
    private DocenteRepository docenteRepository;

    public List<DocenteDTO> getAllDocentes() {
        return docenteRepository.findAll().stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());
    }

    public List<Docente> getDocentesByDepartamento(String nombreDepartamento) {
        return docenteRepository.findByDepartamentoNombre(nombreDepartamento);
    }

    public List<Docente> getAllDocentesSortedByApellidos() {
        return docenteRepository.findAllByOrderByApellidos();
    }

    private DocenteDTO convertToDto(Docente docente) {
        return new DocenteDTO(
                docente.getId(),
                docente.getNombre(),
                docente.getApellidos(),
                docente.getEmail(),
                docente.getSiglas()
        );
    }
}
