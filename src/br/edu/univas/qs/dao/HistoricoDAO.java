package br.edu.univas.qs.dao;

import javax.persistence.EntityManager;

import br.edu.univas.qs.dominio.Historico;

public class HistoricoDAO extends GenericDAO<Historico, Long> {
	public HistoricoDAO(EntityManager em) {
		super(em);
	}
}
