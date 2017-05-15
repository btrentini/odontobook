package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
//==========================================================================
//============              CLASSE PACIENTE                       ==========
//==========================================================================
@Entity
public class Paciente implements Serializable{

	/**
	 * Classe Paciente para o Sistema FACEODONTO BOOK
	 * @author Bruno 
	 * Varias telas
	 */
	private static final long serialVersionUID = 1L;

	
	@GeneratedValue
	private int codigoPaciente;
	
	 @OneToOne(cascade={CascadeType.ALL})
	 @JoinColumn(name="IdPessoa")
	 private Pessoa pessoa;
	 
	@OneToMany(cascade={CascadeType.ALL}, mappedBy="paciente")
	 private List <Permissao> permissao;
	 

	@OneToOne(cascade={CascadeType.ALL})
	@JoinColumn(name="id_anamnese")
	private AnamneseGeral anameseGeral;
	
	@OneToMany(cascade={CascadeType.ALL}, mappedBy="paciente")
	 private List <Dente> dente;
	 
	private String nomeResponsavelPaciente;
	private String ocupacaoPaciente;
	private String profissaoPaciente;
	private String indicacaoPaciente;
	@Id
	private String cpfPaciente;
	
	
	
	//==========================================================================
	//============              CONSTRUTOR                            ==========
	//==========================================================================
	public Paciente(String nomeResponsavelPaciente, String ocupacaoPaciente,
			String profissaoPaciente, String indicacaoPaciente) {
		super();
		this.nomeResponsavelPaciente = nomeResponsavelPaciente;
		this.ocupacaoPaciente = ocupacaoPaciente;
		this.profissaoPaciente = profissaoPaciente;
		this.indicacaoPaciente = indicacaoPaciente;
	}

	
	public Paciente() {
		// TODO Auto-generated constructor stub
		permissao = new ArrayList<Permissao>();
	}


	//==========================================================================
	//============              GETTERS AND SETTERS                   ==========
	//==========================================================================
	public String getNomeResponsavelPaciente() {
		return nomeResponsavelPaciente;
	}
	public void setNomeResponsavelPaciente(String nomeResponsavelPaciente) {
		this.nomeResponsavelPaciente = nomeResponsavelPaciente;
	}
	public String getOcupacaoPaciente() {
		return ocupacaoPaciente;
	}
	public void setOcupacaoPaciente(String ocupacaoPaciente) {
		this.ocupacaoPaciente = ocupacaoPaciente;
	}
	public String getProfissaoPaciente() {
		return profissaoPaciente;
	}
	public void setProfissaoPaciente(String profissaoPaciente) {
		this.profissaoPaciente = profissaoPaciente;
	}
	public String getIndicacaoPaciente() {
		return indicacaoPaciente;
	}
	public void setIndicacaoPaciente(String indicacaoPaciente) {
		this.indicacaoPaciente = indicacaoPaciente;
	}
	@Override
	public String toString() {
		return "Paciente [codigoPaciente=" + codigoPaciente + ", pessoa="
				+ pessoa + ", nomeResponsavelPaciente="
				+ nomeResponsavelPaciente + ", ocupacaoPaciente="
				+ ocupacaoPaciente + ", profissaoPaciente=" + profissaoPaciente
				+ ", indicacaoPaciente=" + indicacaoPaciente + ", cpfPaciente="
				+ cpfPaciente + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codigoPaciente;
		result = prime * result
				+ ((cpfPaciente == null) ? 0 : cpfPaciente.hashCode());
		result = prime
				* result
				+ ((indicacaoPaciente == null) ? 0 : indicacaoPaciente
						.hashCode());
		result = prime
				* result
				+ ((nomeResponsavelPaciente == null) ? 0
						: nomeResponsavelPaciente.hashCode());
		result = prime
				* result
				+ ((ocupacaoPaciente == null) ? 0 : ocupacaoPaciente.hashCode());
		result = prime * result + ((pessoa == null) ? 0 : pessoa.hashCode());
		result = prime
				* result
				+ ((profissaoPaciente == null) ? 0 : profissaoPaciente
						.hashCode());
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
		Paciente other = (Paciente) obj;
		if (codigoPaciente != other.codigoPaciente)
			return false;
		if (cpfPaciente == null) {
			if (other.cpfPaciente != null)
				return false;
		} else if (!cpfPaciente.equals(other.cpfPaciente))
			return false;
		if (indicacaoPaciente == null) {
			if (other.indicacaoPaciente != null)
				return false;
		} else if (!indicacaoPaciente.equals(other.indicacaoPaciente))
			return false;
		if (nomeResponsavelPaciente == null) {
			if (other.nomeResponsavelPaciente != null)
				return false;
		} else if (!nomeResponsavelPaciente
				.equals(other.nomeResponsavelPaciente))
			return false;
		if (ocupacaoPaciente == null) {
			if (other.ocupacaoPaciente != null)
				return false;
		} else if (!ocupacaoPaciente.equals(other.ocupacaoPaciente))
			return false;
		if (pessoa == null) {
			if (other.pessoa != null)
				return false;
		} else if (!pessoa.equals(other.pessoa))
			return false;
		if (profissaoPaciente == null) {
			if (other.profissaoPaciente != null)
				return false;
		} else if (!profissaoPaciente.equals(other.profissaoPaciente))
			return false;
		return true;
	}


	public void setCodigoPaciente(int codigoPaciente) {
		this.codigoPaciente = codigoPaciente;
	}


	public int getCodigoPaciente() {
		return codigoPaciente;
	}


	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}


	public Pessoa getPessoa() {
		return pessoa;
	}



	public void setCpfPaciente(String cpfPaciente) {
		this.cpfPaciente = cpfPaciente;
	}


	public String getCpfPaciente() {
		return cpfPaciente;
	}


	public void setPermissao(List <Permissao> permissao) {
		this.permissao = permissao;
	}


	public List <Permissao> getPermissao() {
		return permissao;
	}


	public void setAnameseGeral(AnamneseGeral anameseGeral) {
		this.anameseGeral = anameseGeral;
	}


	public AnamneseGeral getAnameseGeral() {
		return anameseGeral;
	}


	public void setDente(List <Dente> dente) {
		this.dente = dente;
	}


	public List <Dente> getDente() {
		return dente;
	}




/*	public void setPermissao(Permissao permissao) {
		this.permissao = permissao;
	}


	public Permissao getPermissao() {
		return permissao;
	}*/


}
