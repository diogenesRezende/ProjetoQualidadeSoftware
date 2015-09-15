package br.edu.univas.qs.dao;

import javax.persistence.EntityManager;

import br.edu.univas.qs.dominio.Voo;

public class VooDAO extends GenericDAO<Voo, Long> {
	public VooDAO(EntityManager em) {
		super(em);
	}
}
