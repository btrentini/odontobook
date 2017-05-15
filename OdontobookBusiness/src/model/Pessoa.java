package model;

import java.io.Serializable;
import java.util.Arrays;

import javax.persistence.Cacheable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
@Cacheable(value = false)
public class Pessoa implements Serializable{

	/**
	 * TEla 
	 */
	private static final long serialVersionUID = -3703276082248775459L;
	

	@Id
	@GeneratedValue
	@Column(name="codpessoa")
	private long codigoPessoa;
	
	private String dataNascimentoPessoa;
	private String estadoCivilPessoa;
	private String rgPessoa;
	private String nacionalidadePessoa;
	private String naturalidadePessoa;
	private String emailPessoa;
	private String enderecoResidencialPessoa;
	private String cidadePessoa;
	private String bairroPessoa;
	private String cepPessoa;
	private String fone1Pessoa;
	private String fone2Pessoa;
	private String fone3Pessoa;
	private String foneRecadoPessoa;
	private String nomeRecadoPessoa;
	private String nomePaiPessoa;
	private String nomeMaePessoa;
	private String ufPessoa;
	private byte[] fotoPessoa;
	private String login;
	private String senha;
	private String perfil;
	private String nome;
	private String sobrenome;
	
	private String identificador;
	
	 @OneToOne
	 (cascade={CascadeType.ALL})
	 @JoinColumn(name="cro")
	  private Dentista dentista;
	 
	 @OneToOne
	 (cascade={CascadeType.ALL})
	 @JoinColumn(name="cpfpaciente")
	  private Paciente paciente;
	 
	 
	public String getDataNascimentoPessoa() {
		return dataNascimentoPessoa;
	}


	public void setDataNascimentoPessoa(String dataNascimentoPessoa) {
		this.dataNascimentoPessoa = dataNascimentoPessoa;
	}


	public String getEstadoCivilPessoa() {
		return estadoCivilPessoa;
	}


	public void setEstadoCivilPessoa(String estadoCivilPessoa) {
		this.estadoCivilPessoa = estadoCivilPessoa;
	}


	public String getRgPessoa() {
		return rgPessoa;
	}


	public void setRgPessoa(String rgPessoa) {
		this.rgPessoa = rgPessoa;
	}

	public String getNacionalidadePessoa() {
		return nacionalidadePessoa;
	}


	public void setNacionalidadePessoa(String nacionalidadePessoa) {
		this.nacionalidadePessoa = nacionalidadePessoa;
	}


	public String getNaturalidadePessoa() {
		return naturalidadePessoa;
	}


	public void setNaturalidadePessoa(String naturalidadePessoa) {
		this.naturalidadePessoa = naturalidadePessoa;
	}


	public String getEmailPessoa() {
		return emailPessoa;
	}


	public void setEmailPessoa(String emailPessoa) {
		this.emailPessoa = emailPessoa;
	}


	public String getEnderecoResidencialPessoa() {
		return enderecoResidencialPessoa;
	}


	public void setEnderecoResidencialPessoa(String enderecoResidencialPessoa) {
		this.enderecoResidencialPessoa = enderecoResidencialPessoa;
	}


	public String getCidadePessoa() {
		return cidadePessoa;
	}


	public void setCidadePessoa(String cidadePessoa) {
		this.cidadePessoa = cidadePessoa;
	}


	public String getBairroPessoa() {
		return bairroPessoa;
	}


	public void setBairroPessoa(String bairroPessoa) {
		this.bairroPessoa = bairroPessoa;
	}


	public String getCepPessoa() {
		return cepPessoa;
	}


	public void setCepPessoa(String cepPessoa) {
		this.cepPessoa = cepPessoa;
	}


	public String getFone1Pessoa() {
		return fone1Pessoa;
	}


	public void setFone1Pessoa(String fone1Pessoa) {
		this.fone1Pessoa = fone1Pessoa;
	}


	public String getFone2Pessoa() {
		return fone2Pessoa;
	}


	public void setFone2Pessoa(String fone2Pessoa) {
		this.fone2Pessoa = fone2Pessoa;
	}


	public String getFone3Pessoa() {
		return fone3Pessoa;
	}


	public void setFone3Pessoa(String fone3Pessoa) {
		this.fone3Pessoa = fone3Pessoa;
	}


	public String getFoneRecadoPessoa() {
		return foneRecadoPessoa;
	}


	public void setFoneRecadoPessoa(String foneRecadoPessoa) {
		this.foneRecadoPessoa = foneRecadoPessoa;
	}


	public String getNomeRecadoPessoa() {
		return nomeRecadoPessoa;
	}


	public void setNomeRecadoPessoa(String nomeRecadoPessoa) {
		this.nomeRecadoPessoa = nomeRecadoPessoa;
	}


	public String getNomePaiPessoa() {
		return nomePaiPessoa;
	}


	public void setNomePaiPessoa(String nomePaiPessoa) {
		this.nomePaiPessoa = nomePaiPessoa;
	}


	public String getNomeMaePessoa() {
		return nomeMaePessoa;
	}


	public void setNomeMaePessoa(String nomeMaePessoa) {
		this.nomeMaePessoa = nomeMaePessoa;
	}


	public String getUfPessoa() {
		return ufPessoa;
	}


	public void setUfPessoa(String ufPessoa) {
		this.ufPessoa = ufPessoa;
	}


	public byte[] getFotoPessoa() {
		return fotoPessoa;
	}


	public void setFotoPessoa(byte[] fotoPessoa) {
		this.fotoPessoa = fotoPessoa;
	}



	public Pessoa() {
		super();

	}
	
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Override
	public String toString() {
		return "Pessoa [codigoPessoa=" + codigoPessoa
				+ ", dataNascimentoPessoa=" + dataNascimentoPessoa
				+ ", estadoCivilPessoa=" + estadoCivilPessoa + ", rgPessoa="
				+ rgPessoa + ", nacionalidadePessoa=" + nacionalidadePessoa
				+ ", naturalidadePessoa=" + naturalidadePessoa
				+ ", emailPessoa=" + emailPessoa
				+ ", enderecoResidencialPessoa=" + enderecoResidencialPessoa
				+ ", cidadePessoa=" + cidadePessoa + ", bairroPessoa="
				+ bairroPessoa + ", cepPessoa=" + cepPessoa + ", fone1Pessoa="
				+ fone1Pessoa + ", fone2Pessoa=" + fone2Pessoa
				+ ", fone3Pessoa=" + fone3Pessoa + ", foneRecadoPessoa="
				+ foneRecadoPessoa + ", nomeRecadoPessoa=" + nomeRecadoPessoa
				+ ", nomePaiPessoa=" + nomePaiPessoa + ", nomeMaePessoa="
				+ nomeMaePessoa + ", ufPessoa=" + ufPessoa + ", fotoPessoa="
				+ Arrays.toString(fotoPessoa) + ", login=" + login + ", senha="
				+ senha + ", perfil=" + perfil + ", nome=" + nome
				+ ", sobrenome=" + sobrenome + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((bairroPessoa == null) ? 0 : bairroPessoa.hashCode());
		result = prime * result
				+ ((cepPessoa == null) ? 0 : cepPessoa.hashCode());
		result = prime * result
				+ ((cidadePessoa == null) ? 0 : cidadePessoa.hashCode());
		result = prime * result + (int) (codigoPessoa ^ (codigoPessoa >>> 32));
		result = prime
				* result
				+ ((dataNascimentoPessoa == null) ? 0 : dataNascimentoPessoa
						.hashCode());
		result = prime * result
				+ ((emailPessoa == null) ? 0 : emailPessoa.hashCode());
		result = prime
				* result
				+ ((enderecoResidencialPessoa == null) ? 0
						: enderecoResidencialPessoa.hashCode());
		result = prime
				* result
				+ ((estadoCivilPessoa == null) ? 0 : estadoCivilPessoa
						.hashCode());
		result = prime * result
				+ ((fone1Pessoa == null) ? 0 : fone1Pessoa.hashCode());
		result = prime * result
				+ ((fone2Pessoa == null) ? 0 : fone2Pessoa.hashCode());
		result = prime * result
				+ ((fone3Pessoa == null) ? 0 : fone3Pessoa.hashCode());
		result = prime
				* result
				+ ((foneRecadoPessoa == null) ? 0 : foneRecadoPessoa.hashCode());
		result = prime * result + Arrays.hashCode(fotoPessoa);
		result = prime * result + ((login == null) ? 0 : login.hashCode());
		result = prime
				* result
				+ ((nacionalidadePessoa == null) ? 0 : nacionalidadePessoa
						.hashCode());
		result = prime
				* result
				+ ((naturalidadePessoa == null) ? 0 : naturalidadePessoa
						.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result
				+ ((nomeMaePessoa == null) ? 0 : nomeMaePessoa.hashCode());
		result = prime * result
				+ ((nomePaiPessoa == null) ? 0 : nomePaiPessoa.hashCode());
		result = prime
				* result
				+ ((nomeRecadoPessoa == null) ? 0 : nomeRecadoPessoa.hashCode());
		result = prime * result + ((perfil == null) ? 0 : perfil.hashCode());
		result = prime * result
				+ ((rgPessoa == null) ? 0 : rgPessoa.hashCode());
		result = prime * result + ((senha == null) ? 0 : senha.hashCode());
		result = prime * result
				+ ((sobrenome == null) ? 0 : sobrenome.hashCode());
		result = prime * result
				+ ((ufPessoa == null) ? 0 : ufPessoa.hashCode());
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
		Pessoa other = (Pessoa) obj;
		if (bairroPessoa == null) {
			if (other.bairroPessoa != null)
				return false;
		} else if (!bairroPessoa.equals(other.bairroPessoa))
			return false;
		if (cepPessoa == null) {
			if (other.cepPessoa != null)
				return false;
		} else if (!cepPessoa.equals(other.cepPessoa))
			return false;
		if (cidadePessoa == null) {
			if (other.cidadePessoa != null)
				return false;
		} else if (!cidadePessoa.equals(other.cidadePessoa))
			return false;
		if (codigoPessoa != other.codigoPessoa)
			return false;
		if (dataNascimentoPessoa == null) {
			if (other.dataNascimentoPessoa != null)
				return false;
		} else if (!dataNascimentoPessoa.equals(other.dataNascimentoPessoa))
			return false;
		if (emailPessoa == null) {
			if (other.emailPessoa != null)
				return false;
		} else if (!emailPessoa.equals(other.emailPessoa))
			return false;
		if (enderecoResidencialPessoa == null) {
			if (other.enderecoResidencialPessoa != null)
				return false;
		} else if (!enderecoResidencialPessoa
				.equals(other.enderecoResidencialPessoa))
			return false;
		if (estadoCivilPessoa == null) {
			if (other.estadoCivilPessoa != null)
				return false;
		} else if (!estadoCivilPessoa.equals(other.estadoCivilPessoa))
			return false;
		if (fone1Pessoa == null) {
			if (other.fone1Pessoa != null)
				return false;
		} else if (!fone1Pessoa.equals(other.fone1Pessoa))
			return false;
		if (fone2Pessoa == null) {
			if (other.fone2Pessoa != null)
				return false;
		} else if (!fone2Pessoa.equals(other.fone2Pessoa))
			return false;
		if (fone3Pessoa == null) {
			if (other.fone3Pessoa != null)
				return false;
		} else if (!fone3Pessoa.equals(other.fone3Pessoa))
			return false;
		if (foneRecadoPessoa == null) {
			if (other.foneRecadoPessoa != null)
				return false;
		} else if (!foneRecadoPessoa.equals(other.foneRecadoPessoa))
			return false;
		if (!Arrays.equals(fotoPessoa, other.fotoPessoa))
			return false;
		if (login == null) {
			if (other.login != null)
				return false;
		} else if (!login.equals(other.login))
			return false;
		if (nacionalidadePessoa == null) {
			if (other.nacionalidadePessoa != null)
				return false;
		} else if (!nacionalidadePessoa.equals(other.nacionalidadePessoa))
			return false;
		if (naturalidadePessoa == null) {
			if (other.naturalidadePessoa != null)
				return false;
		} else if (!naturalidadePessoa.equals(other.naturalidadePessoa))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (nomeMaePessoa == null) {
			if (other.nomeMaePessoa != null)
				return false;
		} else if (!nomeMaePessoa.equals(other.nomeMaePessoa))
			return false;
		if (nomePaiPessoa == null) {
			if (other.nomePaiPessoa != null)
				return false;
		} else if (!nomePaiPessoa.equals(other.nomePaiPessoa))
			return false;
		if (nomeRecadoPessoa == null) {
			if (other.nomeRecadoPessoa != null)
				return false;
		} else if (!nomeRecadoPessoa.equals(other.nomeRecadoPessoa))
			return false;
		if (perfil == null) {
			if (other.perfil != null)
				return false;
		} else if (!perfil.equals(other.perfil))
			return false;
		if (rgPessoa == null) {
			if (other.rgPessoa != null)
				return false;
		} else if (!rgPessoa.equals(other.rgPessoa))
			return false;
		if (senha == null) {
			if (other.senha != null)
				return false;
		} else if (!senha.equals(other.senha))
			return false;
		if (sobrenome == null) {
			if (other.sobrenome != null)
				return false;
		} else if (!sobrenome.equals(other.sobrenome))
			return false;
		if (ufPessoa == null) {
			if (other.ufPessoa != null)
				return false;
		} else if (!ufPessoa.equals(other.ufPessoa))
			return false;
		return true;
	}


	public Pessoa(long codigoPessoa, String dataNascimentoPessoa,
			String estadoCivilPessoa, String rgPessoa,
			String nacionalidadePessoa, String naturalidadePessoa,
			String emailPessoa, String enderecoResidencialPessoa,
			String cidadePessoa, String bairroPessoa, String cepPessoa,
			String fone1Pessoa, String fone2Pessoa, String fone3Pessoa,
			String foneRecadoPessoa, String nomeRecadoPessoa,
			String nomePaiPessoa, String nomeMaePessoa, String ufPessoa,
			byte[] fotoPessoa, String login, String senha, String perfil,
			String nome, String sobrenome) {
		super();
		this.codigoPessoa = codigoPessoa;
		this.dataNascimentoPessoa = dataNascimentoPessoa;
		this.estadoCivilPessoa = estadoCivilPessoa;
		this.rgPessoa = rgPessoa;
		this.nacionalidadePessoa = nacionalidadePessoa;
		this.naturalidadePessoa = naturalidadePessoa;
		this.emailPessoa = emailPessoa;
		this.enderecoResidencialPessoa = enderecoResidencialPessoa;
		this.cidadePessoa = cidadePessoa;
		this.bairroPessoa = bairroPessoa;
		this.cepPessoa = cepPessoa;
		this.fone1Pessoa = fone1Pessoa;
		this.fone2Pessoa = fone2Pessoa;
		this.fone3Pessoa = fone3Pessoa;
		this.foneRecadoPessoa = foneRecadoPessoa;
		this.nomeRecadoPessoa = nomeRecadoPessoa;
		this.nomePaiPessoa = nomePaiPessoa;
		this.nomeMaePessoa = nomeMaePessoa;
		this.ufPessoa = ufPessoa;
		this.fotoPessoa = fotoPessoa;
		this.login = login;
		this.senha = senha;
		this.perfil = perfil;
		this.nome = nome;
		this.sobrenome = sobrenome;
	}


	public void setCodigoPessoa(long codigoPessoa) {
		this.codigoPessoa = codigoPessoa;
	}


	public long getCodigoPessoa() {
		return codigoPessoa;
	}


	public void setPerfil(String perfil) {
	
		this.perfil = perfil;
	}
	public String getPerfil(){
		return perfil;
	}


	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}


	public String getSobrenome() {
		return sobrenome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getNome() {
		return nome;
	}


	public void setDentista(Dentista dentista) {
		this.dentista = dentista;
	}


	public Dentista getDentista() {
		return dentista;
	}


	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}


	public Paciente getPaciente() {
		return paciente;
	}


	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}


	public String getIdentificador() {
		return identificador;
	}



	
}
