package br.edu.utfpr.astronomic_events_alert.model.domain;

import java.io.Serializable;
import java.util.Date;

public class Evento implements Serializable {
    private String titulo;
    private String desc;
    private Date data;

    public Evento(String titulo, String desc, Date data) {
        this.titulo = titulo;
        this.desc = desc;
        this.data = data;
    }

}
