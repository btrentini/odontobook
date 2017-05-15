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
	

/*	@OneToOne
	@JoinColumn(name="EndodontiaDoDente")
	private Endodontia endodontia;*/
	 
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


	public static long getSerialversionuid() {
		return serialVersionUID;
	}

/*	public void setEndodontia(Endodontia endodontia) {
		this.endodontia = endodontia;
	}

	public Endodontia getEndodontia() {
		return endodontia;
	}
*/



}
