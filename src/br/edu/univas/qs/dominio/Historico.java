package br.edu.univas.qs.dominio;

import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.GeneratedValue;
import javax.persistence.Column;


@Entity
@Table(name = "historicos")
public class Historico {

	private Long idHistorico;

	private Voo voo;
	private InfoAdicional info;

	
	

	@Id
    @SequenceGenerator(name = "id_historico", sequenceName = "seq_id_historico", allocationSize = 1)
    @GeneratedValue(generator = "id_historico", strategy = GenerationType.SEQUENCE)
    @Column(name = "id_historico", nullable = false)
	public Long getIdHistorico() {
		return idHistorico;
	}

	public void setIdHistorico(Long idHistorico) {
		this.idHistorico = idHistorico;
	}

	@ManyToOne
	@JoinColumn(name = "id_voo")
	public Voo getVoo() {
		return voo;
	}

	public void setVoo(Voo voo) {
		this.voo = voo;
	}

	@ManyToOne
	@JoinColumn(name = "id_info")
	public InfoAdicional getInfo() {
		return info;
	}

	public void setInfo(InfoAdicional info) {
		this.info = info;
	}

}
