package br.edu.utfpr.astronomic_events_alert.model.dto;

import lombok.Data;
import lombok.NonNull;

@Data
public class UsuarioDTO {
    @NonNull
    private String nome;
    @NonNull
    private String email;
}
