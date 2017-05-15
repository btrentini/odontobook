package model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


@Entity
public class Dentista implements Serializable {

	/**
	 * Tela visualizarDentistas
	 * Tela Perfil
	 * etc...
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((anoFormacaoCurriculo == null) ? 0 : anoFormacaoCurriculo
						.hashCode());
		result = prime
				* result
				+ ((bairroConsultorio == null) ? 0 : bairroConsultorio
						.hashCode());
		result = prime
				* result
				+ ((cidadeConsultorio == null) ? 0 : cidadeConsultorio
						.hashCode());
		result = prime
				* result
				+ ((consultorioDentista == null) ? 0 : consultorioDentista
						.hashCode());
		result = prime * result + ((cro == null) ? 0 : cro.hashCode());
		result = prime
				* result
				+ ((enderecoConsultorio == null) ? 0 : enderecoConsultorio
						.hashCode());
		result = prime
				* result
				+ ((especializacaoCurriculo == null) ? 0
						: especializacaoCurriculo.hashCode());
		result = prime * result
				+ ((faxConsultorio == null) ? 0 : faxConsultorio.hashCode());
		result = prime
				* result
				+ ((graduacaoCurriculo == null) ? 0 : graduacaoCurriculo
						.hashCode());
		result = prime * result + ((pessoa == null) ? 0 : pessoa.hashCode());
		result = prime
				* result
				+ ((telefone1Consultorio == null) ? 0 : telefone1Consultorio
						.hashCode());
		result = prime
				* result
				+ ((telefone2Consultorio == null) ? 0 : telefone2Consultorio
						.hashCode());
		result = prime * result
				+ ((ufConsultorio == null) ? 0 : ufConsultorio.hashCode());
		result = prime
				* result
				+ ((websiteConsultorio == null) ? 0 : websiteConsultorio
						.hashCode());
		return result;
	}
	public Dentista(String cro, Pessoa pessoa, String consultorioDentista,
			String enderecoConsultorio, String telefone1Consultorio,
			String telefone2Consultorio, String cidadeConsultorio,
			String bairroConsultorio, String ufConsultorio,
			String faxConsultorio, String websiteConsultorio,
			String graduacaoCurriculo, String especializacaoCurriculo,
			String anoFormacaoCurriculo) {
		super();
		this.cro = cro;
		this.pessoa = pessoa;
		this.consultorioDentista = consultorioDentista;
		this.enderecoConsultorio = enderecoConsultorio;
		this.telefone1Consultorio = telefone1Consultorio;
		this.telefone2Consultorio = telefone2Consultorio;
		this.cidadeConsultorio = cidadeConsultorio;
		this.bairroConsultorio = bairroConsultorio;
		this.ufConsultorio = ufConsultorio;
		this.faxConsultorio = faxConsultorio;
		this.websiteConsultorio = websiteConsultorio;
		this.graduacaoCurriculo = graduacaoCurriculo;
		this.especializacaoCurriculo = especializacaoCurriculo;
		this.anoFormacaoCurriculo = anoFormacaoCurriculo;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dentista other = (Dentista) obj;
		if (anoFormacaoCurriculo == null) {
			if (other.anoFormacaoCurriculo != null)
				return false;
		} else if (!anoFormacaoCurriculo.equals(other.anoFormacaoCurriculo))
			return false;
		if (bairroConsultorio == null) {
			if (other.bairroConsultorio != null)
				return false;
		} else if (!bairroConsultorio.equals(other.bairroConsultorio))
			return false;
		if (cidadeConsultorio == null) {
			if (other.cidadeConsultorio != null)
				return false;
		} else if (!cidadeConsultorio.equals(other.cidadeConsultorio))
			return false;
		if (consultorioDentista == null) {
			if (other.consultorioDentista != null)
				return false;
		} else if (!consultorioDentista.equals(other.consultorioDentista))
			return false;
		if (cro == null) {
			if (other.cro != null)
				return false;
		} else if (!cro.equals(other.cro))
			return false;
		if (enderecoConsultorio == null) {
			if (other.enderecoConsultorio != null)
				return false;
		} else if (!enderecoConsultorio.equals(other.enderecoConsultorio))
			return false;
		if (especializacaoCurriculo == null) {
			if (other.especializacaoCurriculo != null)
				return false;
		} else if (!especializacaoCurriculo
				.equals(other.especializacaoCurriculo))
			return false;
		if (faxConsultorio == null) {
			if (other.faxConsultorio != null)
				return false;
		} else if (!faxConsultorio.equals(other.faxConsultorio))
			return false;
		if (graduacaoCurriculo == null) {
			if (other.graduacaoCurriculo != null)
				return false;
		} else if (!graduacaoCurriculo.equals(other.graduacaoCurriculo))
			return false;
		if (pessoa == null) {
			if (other.pessoa != null)
				return false;
		} else if (!pessoa.equals(other.pessoa))
			return false;
		if (telefone1Consultorio == null) {
			if (other.telefone1Consultorio != null)
				return false;
		} else if (!telefone1Consultorio.equals(other.telefone1Consultorio))
			return false;
		if (telefone2Consultorio == null) {
			if (other.telefone2Consultorio != null)
				return false;
		} else if (!telefone2Consultorio.equals(other.telefone2Consultorio))
			return false;
		if (ufConsultorio == null) {
			if (other.ufConsultorio != null)
				return false;
		} else if (!ufConsultorio.equals(other.ufConsultorio))
			return false;
		if (websiteConsultorio == null) {
			if (other.websiteConsultorio != null)
				return false;
		} else if (!websiteConsultorio.equals(other.websiteConsultorio))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Dentista [cro=" + cro + ", pessoa=" + pessoa
				+ ", consultorioDentista=" + consultorioDentista
				+ ", enderecoConsultorio=" + enderecoConsultorio
				+ ", telefone1Consultorio=" + telefone1Consultorio
				+ ", telefone2Consultorio=" + telefone2Consultorio
				+ ", cidadeConsultorio=" + cidadeConsultorio
				+ ", bairroConsultorio=" + bairroConsultorio
				+ ", ufConsultorio=" + ufConsultorio + ", faxConsultorio="
				+ faxConsultorio + ", websiteConsultorio=" + websiteConsultorio
				+ ", graduacaoCurriculo=" + graduacaoCurriculo
				+ ", especializacaoCurriculo=" + especializacaoCurriculo
				+ ", anoFormacaoCurriculo=" + anoFormacaoCurriculo + "]";
	}
	public Dentista()
	{
		
	}
	@Id
	private String cro;
	
	 @OneToMany(cascade={CascadeType.ALL})
	 @JoinColumn(name="dentista_permissao_id")
	  private List<Permissao> permissoes;

	 @OneToOne
	 (cascade={CascadeType.ALL})
	 @JoinColumn(name="IdPessoa")
	  private Pessoa pessoa;
	
/*	 @OneToMany(cascade={CascadeType.ALL})
	 @JoinColumn(name="dentista_tratamento_id")
	  private List<Tratamento> tratamentos;*/
	 
	public String getConsultorioDentista() {
		return consultorioDentista;
	}
	public void setConsultorioDentista(String consultorioDentista) {
		this.consultorioDentista = consultorioDentista;
	}
	public String getEnderecoConsultorio() {
		return enderecoConsultorio;
	}
	public void setEnderecoConsultorio(String enderecoConsultorio) {
		this.enderecoConsultorio = enderecoConsultorio;
	}
	public String getTelefone1Consultorio() {
		return telefone1Consultorio;
	}
	public void setTelefone1Consultorio(String telefone1Consultorio) {
		this.telefone1Consultorio = telefone1Consultorio;
	}
	public String getTelefone2Consultorio() {
		return telefone2Consultorio;
	}
	public void setTelefone2Consultorio(String telefone2Consultorio) {
		this.telefone2Consultorio = telefone2Consultorio;
	}
	public String getCidadeConsultorio() {
		return cidadeConsultorio;
	}
	public void setCidadeConsultorio(String cidadeConsultorio) {
		this.cidadeConsultorio = cidadeConsultorio;
	}
	public String getBairroConsultorio() {
		return bairroConsultorio;
	}
	public void setBairroConsultorio(String bairroConsultorio) {
		this.bairroConsultorio = bairroConsultorio;
	}
	public String getUfConsultorio() {
		return ufConsultorio;
	}
	public void setUfConsultorio(String ufConsultorio) {
		this.ufConsultorio = ufConsultorio;
	}
	public String getFaxConsultorio() {
		return faxConsultorio;
	}
	public void setFaxConsultorio(String faxConsultorio) {
		this.faxConsultorio = faxConsultorio;
	}
	public String getWebsiteConsultorio() {
		return websiteConsultorio;
	}
	public void setWebsiteConsultorio(String websiteConsultorio) {
		this.websiteConsultorio = websiteConsultorio;
	}
	public String getGraduacaoCurriculo() {
		return graduacaoCurriculo;
	}
	public void setGraduacaoCurriculo(String graduacaoCurriculo) {
		this.graduacaoCurriculo = graduacaoCurriculo;
	}
	public String getEspecializacaoCurriculo() {
		return especializacaoCurriculo;
	}
	public void setEspecializacaoCurriculo(String especializacaoCurriculo) {
		this.especializacaoCurriculo = especializacaoCurriculo;
	}
	public String getAnoFormacaoCurriculo() {
		return anoFormacaoCurriculo;
	}
	public void setAnoFormacaoCurriculo(String anoFormacaoCurriculo) {
		this.anoFormacaoCurriculo = anoFormacaoCurriculo;
	}
	private String consultorioDentista;
	private String enderecoConsultorio;
	private String telefone1Consultorio;
	private String telefone2Consultorio;
	private String cidadeConsultorio;
	private String bairroConsultorio;
	private String ufConsultorio;
	private String faxConsultorio;
	private String websiteConsultorio;
	private String graduacaoCurriculo;
	private String especializacaoCurriculo;
	private String anoFormacaoCurriculo;
	
	public String getCro() {
		return cro;
	}
	public void setCro(String cro) {
		this.cro = cro;
	}
/*	public void setPermissoes(List<Permissao> permissoes) {
		this.permissoes = permissoes;
	}
	public List<Permissao> getPermissoes() {
		return permissoes;
	}*/
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	public Pessoa getPessoa() {
		return pessoa;
	}
	/*public void setTratamentos(List<Tratamento> tratamentos) {
		this.tratamentos = tratamentos;
	}
	public List<Tratamento> getTratamentos() {
		return tratamentos;
	}*/

	
}
