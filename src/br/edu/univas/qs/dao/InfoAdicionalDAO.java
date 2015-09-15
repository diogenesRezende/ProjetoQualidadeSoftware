package br.edu.univas.qs.dao;

import javax.persistence.EntityManager;

import br.edu.univas.qs.dominio.InfoAdicional;

public class InfoAdicionalDAO extends GenericDAO<InfoAdicional, Long> {
	public InfoAdicionalDAO(EntityManager em) {
		super(em);
	}
}
