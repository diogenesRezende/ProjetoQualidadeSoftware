package br.edu.univas.qs.dominio;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import br.edu.univas.qs.util.JpaUtil;

public class CreateTable {

	public static void main(String[] args) {
		Persistence.createEntityManagerFactory("WsVooUnivas");

		EntityManager manager = JpaUtil.getEntityManager();

	}
}
