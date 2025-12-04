
package com.example.GestionDocentes.repository;

import com.example.GestionDocentes.model.Ciclo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CicloRepository extends JpaRepository<Ciclo, Long> {
}
