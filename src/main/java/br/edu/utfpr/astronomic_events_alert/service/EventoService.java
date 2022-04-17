package br.edu.utfpr.astronomic_events_alert.service;

import br.edu.utfpr.astronomic_events_alert.model.dao.EventoDAO;
import br.edu.utfpr.astronomic_events_alert.model.domain.Evento;

public class EventoService extends AbstractService<Long, Evento>{
    public EventoService() {
        dao = new EventoDAO();
    }
}
