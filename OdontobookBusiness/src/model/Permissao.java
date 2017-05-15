package model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
public class Permissao implements Serializable {



	private static final long serialVersionUID = 1L;
	
	public Permissao()
	{
		
	}
	
	@Id
	@GeneratedValue
	private int codigoPermissao;
	
	private String duracaoTratamentoEstimada;
	private String valorEstimadoTratamento;
	private String numeroConsultasEstimadas;
	private String numeroProntuario;
	private String dataInicio;

	
	@ManyToOne(cascade={CascadeType.ALL})
	@JoinColumn(name="Paciente_Permissao") 
	private Paciente paciente;
	
	
	@ManyToOne(cascade={CascadeType.ALL})
	@JoinColumn(name="Dentista_Permissao") 
	
	
	private Dentista dentista;

	public int getCodigoPermissao() {
		return codigoPermissao;
	}


	public void setCodigoPermissao(int codigoPermissao) {
		this.codigoPermissao = codigoPermissao;
	}


	public String getDuracaoTratamentoEstimada() {
		return duracaoTratamentoEstimada;
	}


	public void setDuracaoTratamentoEstimada(String duracaoTratamentoEstimada) {
		this.duracaoTratamentoEstimada = duracaoTratamentoEstimada;
	}


	public String getValorEstimadoTratamento() {
		return valorEstimadoTratamento;
	}


	public void setValorEstimadoTratamento(String valorEstimadoTratamento) {
		this.valorEstimadoTratamento = valorEstimadoTratamento;
	}


	public String getNumeroConsultasEstimadas() {
		return numeroConsultasEstimadas;
	}


	public void setNumeroConsultasEstimadas(String numeroConsultasEstimadas) {
		this.numeroConsultasEstimadas = numeroConsultasEstimadas;
	}


	public String getNumeroProntuario() {
		return numeroProntuario;
	}


	public void setNumeroProntuario(String numeroProntuario) {
		this.numeroProntuario = numeroProntuario;
	}


	public String getDataInicio() {
		return dataInicio;
	}


	public void setDataInicio(String dataInicio) {
		this.dataInicio = dataInicio;
	}


	public Paciente getPaciente() {
		return paciente;
	}


	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}


	public Dentista getDentista() {
		return dentista;
	}


	public void setDentista(Dentista dentista) {
		this.dentista = dentista;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	@Override
	public String toString() {
		return "Permissao [codigoPermissao=" + codigoPermissao
				+ ", duracaoTratamentoEstimada=" + duracaoTratamentoEstimada
				+ ", valorEstimadoTratamento=" + valorEstimadoTratamento
				+ ", numeroConsultasEstimadas=" + numeroConsultasEstimadas
				+ ", numeroProntuario=" + numeroProntuario + ", dataInicio="
				+ dataInicio + ", paciente=" + paciente + ", dentista="
				+ dentista + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codigoPermissao;
		result = prime * result
				+ ((dataInicio == null) ? 0 : dataInicio.hashCode());
		result = prime * result
				+ ((dentista == null) ? 0 : dentista.hashCode());
		result = prime
				* result
				+ ((duracaoTratamentoEstimada == null) ? 0
						: duracaoTratamentoEstimada.hashCode());
		result = prime
				* result
				+ ((numeroConsultasEstimadas == null) ? 0
						: numeroConsultasEstimadas.hashCode());
		result = prime
				* result
				+ ((numeroProntuario == null) ? 0 : numeroProntuario.hashCode());
		result = prime * result
				+ ((paciente == null) ? 0 : paciente.hashCode());
		result = prime
				* result
				+ ((valorEstimadoTratamento == null) ? 0
						: valorEstimadoTratamento.hashCode());
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
		Permissao other = (Permissao) obj;
		if (codigoPermissao != other.codigoPermissao)
			return false;
		if (dataInicio == null) {
			if (other.dataInicio != null)
				return false;
		} else if (!dataInicio.equals(other.dataInicio))
			return false;
		if (dentista == null) {
			if (other.dentista != null)
				return false;
		} else if (!dentista.equals(other.dentista))
			return false;
		if (duracaoTratamentoEstimada == null) {
			if (other.duracaoTratamentoEstimada != null)
				return false;
		} else if (!duracaoTratamentoEstimada
				.equals(other.duracaoTratamentoEstimada))
			return false;
		if (numeroConsultasEstimadas == null) {
			if (other.numeroConsultasEstimadas != null)
				return false;
		} else if (!numeroConsultasEstimadas
				.equals(other.numeroConsultasEstimadas))
			return false;
		if (numeroProntuario == null) {
			if (other.numeroProntuario != null)
				return false;
		} else if (!numeroProntuario.equals(other.numeroProntuario))
			return false;
		if (paciente == null) {
			if (other.paciente != null)
				return false;
		} else if (!paciente.equals(other.paciente))
			return false;
		if (valorEstimadoTratamento == null) {
			if (other.valorEstimadoTratamento != null)
				return false;
		} else if (!valorEstimadoTratamento
				.equals(other.valorEstimadoTratamento))
			return false;
		return true;
	}
	

	

}
