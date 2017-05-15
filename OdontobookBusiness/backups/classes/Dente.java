package model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Dente implements Serializable {


	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private int codigoDente;
	
	private String numeroDente;
	private String situacaoPresente;
	private String canal;
	private String CAD;
	private String CTEX;
	private String CTG;
	private String CTES;
	private String CRD;
	private String CT;
	private String referencia;
	private String instrumento;
	private String instrumentoPatencia;
	private String numDA;
	private String numDC;
	private String X;
	private String incidenciaDoRX;
	private String conePrincipal;
	private String cimentoObturador;
	private String tecnicaObturacao;
	
	@ManyToOne(cascade={CascadeType.ALL})
	@JoinColumn(name="Paciente_Dente") 
	private Paciente paciente;
	
	 @OneToOne(cascade={CascadeType.ALL})
	 @JoinColumn(name="IdEndodontia")
	 private Endodontia endodontia;
	 
	public Dente()
	{
		
	}

	public int getCodigoDente() {
		return codigoDente;
	}

	public void setCodigoDente(int codigoDente) {
		this.codigoDente = codigoDente;
	}

	public String getNumeroDente() {
		return numeroDente;
	}

	public void setNumeroDente(String numeroDente) {
		this.numeroDente = numeroDente;
	}

	public String getSituacaoPresente() {
		return situacaoPresente;
	}

	public void setSituacaoPresente(String situacaoPresente) {
		this.situacaoPresente = situacaoPresente;
	}

	public String getCanal() {
		return canal;
	}

	public void setCanal(String canal) {
		this.canal = canal;
	}

	public String getCAD() {
		return CAD;
	}

	public void setCAD(String cAD) {
		CAD = cAD;
	}

	public String getCTEX() {
		return CTEX;
	}

	public void setCTEX(String cTEX) {
		CTEX = cTEX;
	}

	public String getCTG() {
		return CTG;
	}

	public void setCTG(String cTG) {
		CTG = cTG;
	}

	public String getCTES() {
		return CTES;
	}

	public void setCTES(String cTES) {
		CTES = cTES;
	}

	public String getCRD() {
		return CRD;
	}

	public void setCRD(String cRD) {
		CRD = cRD;
	}

	public String getCT() {
		return CT;
	}

	public void setCT(String cT) {
		CT = cT;
	}

	public String getReferencia() {
		return referencia;
	}

	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}

	public String getInstrumento() {
		return instrumento;
	}

	public void setInstrumento(String instrumento) {
		this.instrumento = instrumento;
	}

	public String getInstrumentoPatencia() {
		return instrumentoPatencia;
	}

	public void setInstrumentoPatencia(String instrumentoPatencia) {
		this.instrumentoPatencia = instrumentoPatencia;
	}

	public String getNumDA() {
		return numDA;
	}

	public void setNumDA(String numDA) {
		this.numDA = numDA;
	}

	public String getNumDC() {
		return numDC;
	}

	public void setNumDC(String numDC) {
		this.numDC = numDC;
	}

	public String getX() {
		return X;
	}

	public void setX(String x) {
		X = x;
	}

	public String getIncidenciaDoRX() {
		return incidenciaDoRX;
	}

	public void setIncidenciaDoRX(String incidenciaDoRX) {
		this.incidenciaDoRX = incidenciaDoRX;
	}

	public String getConePrincipal() {
		return conePrincipal;
	}

	public void setConePrincipal(String conePrincipal) {
		this.conePrincipal = conePrincipal;
	}

	public String getCimentoObturador() {
		return cimentoObturador;
	}

	public void setCimentoObturador(String cimentoObturador) {
		this.cimentoObturador = cimentoObturador;
	}

	public String getTecnicaObturacao() {
		return tecnicaObturacao;
	}

	public void setTecnicaObturacao(String tecnicaObturacao) {
		this.tecnicaObturacao = tecnicaObturacao;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public Endodontia getEndodontia() {
		return endodontia;
	}

	public void setEndodontia(Endodontia endodontia) {
		this.endodontia = endodontia;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Dente [codigoDente=" + codigoDente + ", numeroDente="
				+ numeroDente + ", situacaoPresente=" + situacaoPresente
				+ ", canal=" + canal + ", CAD=" + CAD + ", CTEX=" + CTEX
				+ ", CTG=" + CTG + ", CTES=" + CTES + ", CRD=" + CRD + ", CT="
				+ CT + ", referencia=" + referencia + ", instrumento="
				+ instrumento + ", instrumentoPatencia=" + instrumentoPatencia
				+ ", numDA=" + numDA + ", numDC=" + numDC + ", X=" + X
				+ ", incidenciaDoRX=" + incidenciaDoRX + ", conePrincipal="
				+ conePrincipal + ", cimentoObturador=" + cimentoObturador
				+ ", tecnicaObturacao=" + tecnicaObturacao + ", paciente="
				+ paciente + ", endodontia=" + endodontia + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((CAD == null) ? 0 : CAD.hashCode());
		result = prime * result + ((CRD == null) ? 0 : CRD.hashCode());
		result = prime * result + ((CT == null) ? 0 : CT.hashCode());
		result = prime * result + ((CTES == null) ? 0 : CTES.hashCode());
		result = prime * result + ((CTEX == null) ? 0 : CTEX.hashCode());
		result = prime * result + ((CTG == null) ? 0 : CTG.hashCode());
		result = prime * result + ((X == null) ? 0 : X.hashCode());
		result = prime * result + ((canal == null) ? 0 : canal.hashCode());
		result = prime
				* result
				+ ((cimentoObturador == null) ? 0 : cimentoObturador.hashCode());
		result = prime * result + codigoDente;
		result = prime * result
				+ ((conePrincipal == null) ? 0 : conePrincipal.hashCode());
		result = prime * result
				+ ((endodontia == null) ? 0 : endodontia.hashCode());
		result = prime * result
				+ ((incidenciaDoRX == null) ? 0 : incidenciaDoRX.hashCode());
		result = prime * result
				+ ((instrumento == null) ? 0 : instrumento.hashCode());
		result = prime
				* result
				+ ((instrumentoPatencia == null) ? 0 : instrumentoPatencia
						.hashCode());
		result = prime * result + ((numDA == null) ? 0 : numDA.hashCode());
		result = prime * result + ((numDC == null) ? 0 : numDC.hashCode());
		result = prime * result
				+ ((numeroDente == null) ? 0 : numeroDente.hashCode());
		result = prime * result
				+ ((paciente == null) ? 0 : paciente.hashCode());
		result = prime * result
				+ ((referencia == null) ? 0 : referencia.hashCode());
		result = prime
				* result
				+ ((situacaoPresente == null) ? 0 : situacaoPresente.hashCode());
		result = prime
				* result
				+ ((tecnicaObturacao == null) ? 0 : tecnicaObturacao.hashCode());
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
		Dente other = (Dente) obj;
		if (CAD == null) {
			if (other.CAD != null)
				return false;
		} else if (!CAD.equals(other.CAD))
			return false;
		if (CRD == null) {
			if (other.CRD != null)
				return false;
		} else if (!CRD.equals(other.CRD))
			return false;
		if (CT == null) {
			if (other.CT != null)
				return false;
		} else if (!CT.equals(other.CT))
			return false;
		if (CTES == null) {
			if (other.CTES != null)
				return false;
		} else if (!CTES.equals(other.CTES))
			return false;
		if (CTEX == null) {
			if (other.CTEX != null)
				return false;
		} else if (!CTEX.equals(other.CTEX))
			return false;
		if (CTG == null) {
			if (other.CTG != null)
				return false;
		} else if (!CTG.equals(other.CTG))
			return false;
		if (X == null) {
			if (other.X != null)
				return false;
		} else if (!X.equals(other.X))
			return false;
		if (canal == null) {
			if (other.canal != null)
				return false;
		} else if (!canal.equals(other.canal))
			return false;
		if (cimentoObturador == null) {
			if (other.cimentoObturador != null)
				return false;
		} else if (!cimentoObturador.equals(other.cimentoObturador))
			return false;
		if (codigoDente != other.codigoDente)
			return false;
		if (conePrincipal == null) {
			if (other.conePrincipal != null)
				return false;
		} else if (!conePrincipal.equals(other.conePrincipal))
			return false;
		if (endodontia == null) {
			if (other.endodontia != null)
				return false;
		} else if (!endodontia.equals(other.endodontia))
			return false;
		if (incidenciaDoRX == null) {
			if (other.incidenciaDoRX != null)
				return false;
		} else if (!incidenciaDoRX.equals(other.incidenciaDoRX))
			return false;
		if (instrumento == null) {
			if (other.instrumento != null)
				return false;
		} else if (!instrumento.equals(other.instrumento))
			return false;
		if (instrumentoPatencia == null) {
			if (other.instrumentoPatencia != null)
				return false;
		} else if (!instrumentoPatencia.equals(other.instrumentoPatencia))
			return false;
		if (numDA == null) {
			if (other.numDA != null)
				return false;
		} else if (!numDA.equals(other.numDA))
			return false;
		if (numDC == null) {
			if (other.numDC != null)
				return false;
		} else if (!numDC.equals(other.numDC))
			return false;
		if (numeroDente == null) {
			if (other.numeroDente != null)
				return false;
		} else if (!numeroDente.equals(other.numeroDente))
			return false;
		if (paciente == null) {
			if (other.paciente != null)
				return false;
		} else if (!paciente.equals(other.paciente))
			return false;
		if (referencia == null) {
			if (other.referencia != null)
				return false;
		} else if (!referencia.equals(other.referencia))
			return false;
		if (situacaoPresente == null) {
			if (other.situacaoPresente != null)
				return false;
		} else if (!situacaoPresente.equals(other.situacaoPresente))
			return false;
		if (tecnicaObturacao == null) {
			if (other.tecnicaObturacao != null)
				return false;
		} else if (!tecnicaObturacao.equals(other.tecnicaObturacao))
			return false;
		return true;
	}



}
