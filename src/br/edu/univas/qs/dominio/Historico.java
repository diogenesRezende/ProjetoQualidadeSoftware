package br.edu.univas.qs.dominio;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "historicos")
public class Historico {

	private Long idHistorico;

	private List<Voo> voos;
	private List<InfoAdicional> infos;

	@Id
	@GeneratedValue
	@Column(name = "id_historico", nullable = false)
	public Long getIdHistorico() {
		return idHistorico;
	}

	public void setIdHistorico(Long idHistorico) {
		this.idHistorico = idHistorico;
	}

	@OneToMany
	@JoinColumn(name = "id_voo")
	public List<Voo> getVoos() {
		return voos;
	}

	public void setVoos(List<Voo> voos) {
		this.voos = voos;
	}

	@ManyToOne
	@JoinColumn(name = "id_infoadicional")
	public List<InfoAdicional> getInfos() {
		return infos;
	}

	public void setInfos(List<InfoAdicional> infos) {
		this.infos = infos;
	}

}
