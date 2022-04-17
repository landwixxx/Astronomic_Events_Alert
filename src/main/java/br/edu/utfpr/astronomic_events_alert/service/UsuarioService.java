package br.edu.utfpr.astronomic_events_alert.service;

import br.edu.utfpr.astronomic_events_alert.model.dao.UsuarioDAO;
import br.edu.utfpr.astronomic_events_alert.model.domain.Usuario;

public class UsuarioService extends AbstractService<Long, Usuario>{
    public UsuarioService() {
        dao = new UsuarioDAO();
    }
}
