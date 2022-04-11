package br.edu.utfpr.astronomic_events_alert.model;

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

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
}
