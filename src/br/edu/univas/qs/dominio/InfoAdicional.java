package br.edu.univas.qs.dominio;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "infoadicionais")
public class InfoAdicional {

	private Long idInfo;
	private String descricao;
	private BigDecimal valor;
	private Historico Historico;


	@Id
	@GeneratedValue
	@Column(name = "id_infoadicional", nullable = false)
	public Long getIdInfo() {
		return idInfo;
	}

	public void setIdInfo(Long idInfo) {
		this.idInfo = idInfo;
	}

	@Column(name = "inf_descricao", length = 100, nullable = false)
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Column(name = "inf_valor", precision = 10, scale = 2, nullable = true)
	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	@OneToMany
	public Historico getHistorico() {
		return Historico;
	}

	public void setHistorico(Historico historico) {
		Historico = historico;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idInfo == null) ? 0 : idInfo.hashCode());
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
		InfoAdicional other = (InfoAdicional) obj;
		if (idInfo == null) {
			if (other.idInfo != null)
				return false;
		} else if (!idInfo.equals(other.idInfo))
			return false;
		return true;
	}

}
