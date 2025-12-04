
package com.example.GestionDocentes.repository;

import com.example.GestionDocentes.model.Docente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DocenteRepository extends JpaRepository<Docente, Long> {
    List<Docente> findAllByOrderByApellidos();
    List<Docente> findByDepartamentoNombre(String nombreDepartamento);
}
