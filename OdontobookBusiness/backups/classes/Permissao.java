package model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Generated;

@Entity
public class Permissao implements Serializable {

	/**
	 * TELA solicitacoesPendentes
	 */
	private static final long serialVersionUID = 1L;
	
	public Permissao()
	{
		
	}
	
	@Id
	@GeneratedValue
	private int codigoPermissao;
	private int duracaoTratamentoEstimada;
	private float valorEstimadoTratamento;
	private int numeroConsultasEstimadas;
	private int numeroProntuario;
	private boolean statusPermissao;
	
	private String dataInicio;

	
	@OneToOne
	 (cascade={CascadeType.ALL})
	@JoinColumn(name="cpfPaciente")
	private Paciente paciente;
	
	@OneToMany
	 (cascade={CascadeType.ALL})
	 @JoinColumn(name="cro")
	Set<Dentista> dentistas;
	
	public Set <Dentista> getDentistas() {
		return dentistas;
	}

	public void setDentistas(Set<Dentista> dentistas) {
		
		this.dentistas = dentistas;
	}
	public int getDuracaoTratamentoEstimada() {
		return duracaoTratamentoEstimada;
	}
	public void setDuracaoTratamentoEstimada(int duracaoTratamentoEstimada) {
		this.duracaoTratamentoEstimada = duracaoTratamentoEstimada;
	}
	public float getValorEstimadoTratamento() {
		return valorEstimadoTratamento;
	}
	public void setValorEstimadoTratamento(float valorEstimadoTratamento) {
		this.valorEstimadoTratamento = valorEstimadoTratamento;
	}
	public int getNumeroConsultasEstimadas() {
		return numeroConsultasEstimadas;
	}
	public void setNumeroConsultasEstimadas(int numeroConsultasEstimadas) {
		this.numeroConsultasEstimadas = numeroConsultasEstimadas;
	}
	public int getNumeroProntuario() {
		return numeroProntuario;
	}
	public void setNumeroProntuario(int numeroProntuario) {
		this.numeroProntuario = numeroProntuario;
	}
	public void setCodigoPermissao(int codigoPermissao) {
		this.codigoPermissao = codigoPermissao;
	}
	public int getCodigoPermissao() {
		return codigoPermissao;
	}

	public void setStatusPermissao(boolean statusPermissao) {
		this.statusPermissao = statusPermissao;
	}
	public boolean isStatusPermissao() {
		return statusPermissao;
	}
	public void addPaciente(Dentista paciente)
	{
		
	}
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	public Paciente getPaciente() {
		return paciente;
	}

	public void setDataInicio(String dataInicio) {
		this.dataInicio = dataInicio;
	}

	public String getDataInicio() {
		return dataInicio;
	}

}
