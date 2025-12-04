
package com.example.GestionDocentes.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ValidarDiaPropioRequest {
    private Long asuntoPropioId;
    private boolean aceptado;
}
