package br.edu.univas.qs.dominio;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "voos")
public class Voo {

	private Long idVoo;
	private String origem;
	private String destino;
	private Date horario;
	private Integer capacidade;
	private BigDecimal primeiraClasse;
	private BigDecimal classeEconomica;
	private List<Historico> historicos;

	@Id
	@SequenceGenerator(name = "id_voo", sequenceName = "seq_id_voo", allocationSize = 1)
	@GeneratedValue(generator = "id_voo", strategy = GenerationType.SEQUENCE)
	@Column(name = "id_voo", nullable = false)
	public Long getIdVoo() {
		return idVoo;
	}

	public void setIdVoo(Long idVoo) {
		this.idVoo = idVoo;
	}

	@Column(name = "vo_origem", length = 100, nullable = false)
	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	@Column(name = "vo_destino", length = 100, nullable = false)
	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "vo_horario", nullable = false)
	public Date getHorario() {
		return horario;
	}

	public void setHorario(Date horario) {
		this.horario = horario;
	}

	@Column(name = "vo_capacidade", nullable = false)
	public Integer getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(Integer capacidade) {
		this.capacidade = capacidade;
	}

	@Column(name = "vo_primeiraclasse", precision = 10, scale = 2, nullable = true)
	public BigDecimal getPrimeiraClasse() {
		return primeiraClasse;
	}

	public void setPrimeiraClasse(BigDecimal primeiraClasse) {
		this.primeiraClasse = primeiraClasse;
	}

	@Column(name = "vo_classeeconomica", precision = 10, scale = 2, nullable = true)
	public BigDecimal getClasseEconomica() {
		return classeEconomica;
	}

	public void setClasseEconomica(BigDecimal classeEconomica) {
		this.classeEconomica = classeEconomica;
	}

	@OneToMany
	public List<Historico> getHistoricos() {
		return historicos;
	}

	public void setHistoricos(List<Historico> historicos) {
		this.historicos = historicos;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idVoo == null) ? 0 : idVoo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Voo other = (Voo) obj;
		if (idVoo == null) {
			if (other.idVoo != null)
				return false;
		} else if (!idVoo.equals(other.idVoo))
			return false;
		return true;
	}
}
