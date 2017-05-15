package model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AnamneseGeral implements Serializable {

	/**
	 * TELA editarAnamneseGeral
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private int codigoAnamneseGeral;
	private boolean apresentaProblemaDeSaude;
	private boolean estaEmTratamentoMedico;
	private String nomeMedico;
	private String telefoneMedico;
	private boolean tomaMedicamento;
	private String qualMedicamento;
	private String quandoMedicoUltimaVez;
	private String qualUltimoTratamento;
	private boolean jaPassouCirurgia;
	private String tipoCirurgia;
	private String dataCirurgia;
	private boolean doencaSeria;
	private String qualDoencaSeria;
	private boolean antineoplasticoFace;
	private int tempoAntioneoplastico;
	private boolean fumante;
	private int qtdeCigarrosDiarios;
	private boolean bebidaAlcoolicaFrequente;
	private boolean gravidaAmamentando;
	private String outrasInformacoes;
	private boolean ganhouPerdeuPesoUltimamente;
	private boolean faltaDeAr;
	private boolean juntasIncham;
	private boolean tonturasDesmaios;
	private boolean demoraCicatrizar;
	private boolean hemooragia;
	private boolean drogas;
	private String tiposDrogas;
	private int mesesGravidez;

	public boolean isApresentaProblemaDeSaude() {
		return apresentaProblemaDeSaude;
	}
	public void setApresentaProblemaDeSaude(boolean apresentaProblemaDeSaude) {
		this.apresentaProblemaDeSaude = apresentaProblemaDeSaude;
	}
	public boolean isEstaEmTratamentoMedico() {
		return estaEmTratamentoMedico;
	}
	public void setEstaEmTratamentoMedico(boolean estaEmTratamentoMedico) {
		this.estaEmTratamentoMedico = estaEmTratamentoMedico;
	}
	public String getNomeMedico() {
		return nomeMedico;
	}
	public void setNomeMedico(String nomeMedico) {
		this.nomeMedico = nomeMedico;
	}
	public String getTelefoneMedico() {
		return telefoneMedico;
	}
	public void setTelefoneMedico(String telefoneMedico) {
		this.telefoneMedico = telefoneMedico;
	}
	public boolean isTomaMedicamento() {
		return tomaMedicamento;
	}
	public void setTomaMedicamento(boolean tomaMedicamento) {
		this.tomaMedicamento = tomaMedicamento;
	}
	public String getQualMedicamento() {
		return qualMedicamento;
	}
	public void setQualMedicamento(String qualMedicamento) {
		this.qualMedicamento = qualMedicamento;
	}
	public String getQuandoMedicoUltimaVez() {
		return quandoMedicoUltimaVez;
	}
	public void setQuandoMedicoUltimaVez(String quandoMedicoUltimaVez) {
		this.quandoMedicoUltimaVez = quandoMedicoUltimaVez;
	}
	public String getQualUltimoTratamento() {
		return qualUltimoTratamento;
	}
	public void setQualUltimoTratamento(String qualUltimoTratamento) {
		this.qualUltimoTratamento = qualUltimoTratamento;
	}
	public boolean isJaPassouCirurgia() {
		return jaPassouCirurgia;
	}
	public void setJaPassouCirurgia(boolean jaPassouCirurgia) {
		this.jaPassouCirurgia = jaPassouCirurgia;
	}
	public String getTipoCirurgia() {
		return tipoCirurgia;
	}
	public void setTipoCirurgia(String tipoCirurgia) {
		this.tipoCirurgia = tipoCirurgia;
	}
	public String getDataCirurgia() {
		return dataCirurgia;
	}
	public void setDataCirurgia(String dataCirurgia) {
		this.dataCirurgia = dataCirurgia;
	}
	public boolean isDoencaSeria() {
		return doencaSeria;
	}
	public void setDoencaSeria(boolean doencaSeria) {
		this.doencaSeria = doencaSeria;
	}
	public String getQualDoencaSeria() {
		return qualDoencaSeria;
	}
	public void setQualDoencaSeria(String qualDoencaSeria) {
		this.qualDoencaSeria = qualDoencaSeria;
	}
	public boolean isAntineoplasticoFace() {
		return antineoplasticoFace;
	}
	public void setAntineoplasticoFace(boolean antineoplasticoFace) {
		this.antineoplasticoFace = antineoplasticoFace;
	}
	public int getTempoAntioneoplastico() {
		return tempoAntioneoplastico;
	}
	public void setTempoAntioneoplastico(int tempoAntioneoplastico) {
		this.tempoAntioneoplastico = tempoAntioneoplastico;
	}
	public boolean isFumante() {
		return fumante;
	}
	public void setFumante(boolean fumante) {
		this.fumante = fumante;
	}
	public int getQtdeCigarrosDiarios() {
		return qtdeCigarrosDiarios;
	}
	public void setQtdeCigarrosDiarios(int qtdeCigarrosDiarios) {
		this.qtdeCigarrosDiarios = qtdeCigarrosDiarios;
	}
	public boolean isBebidaAlcoolicaFrequente() {
		return bebidaAlcoolicaFrequente;
	}
	public void setBebidaAlcoolicaFrequente(boolean bebidaAlcoolicaFrequente) {
		this.bebidaAlcoolicaFrequente = bebidaAlcoolicaFrequente;
	}
	public boolean isGravidaAmamentando() {
		return gravidaAmamentando;
	}
	public void setGravidaAmamentando(boolean gravidaAmamentando) {
		this.gravidaAmamentando = gravidaAmamentando;
	}
	public String getOutrasInformacoes() {
		return outrasInformacoes;
	}
	public void setOutrasInformacoes(String outrasInformacoes) {
		this.outrasInformacoes = outrasInformacoes;
	}

	public boolean isGanhouPerdeuPesoUltimamente() {
		return ganhouPerdeuPesoUltimamente;
	}
	public void setGanhouPerdeuPesoUltimamente(boolean ganhouPerdeuPesoUltimamente) {
		this.ganhouPerdeuPesoUltimamente = ganhouPerdeuPesoUltimamente;
	}
	public boolean isFaltaDeAr() {
		return faltaDeAr;
	}
	public void setFaltaDeAr(boolean faltaDeAr) {
		this.faltaDeAr = faltaDeAr;
	}
	public boolean isJuntasIncham() {
		return juntasIncham;
	}
	public void setJuntasIncham(boolean juntasIncham) {
		this.juntasIncham = juntasIncham;
	}
	public boolean isTonturasDesmaios() {
		return tonturasDesmaios;
	}
	public void setTonturasDesmaios(boolean tonturasDesmaios) {
		this.tonturasDesmaios = tonturasDesmaios;
	}
	public boolean isDemoraCicatrizar() {
		return demoraCicatrizar;
	}
	public void setDemoraCicatrizar(boolean demoraCicatrizar) {
		this.demoraCicatrizar = demoraCicatrizar;
	}
	public boolean isHemooragia() {
		return hemooragia;
	}
	public void setHemooragia(boolean hemooragia) {
		this.hemooragia = hemooragia;
	}
	public boolean isDrogas() {
		return drogas;
	}
	public void setDrogas(boolean drogas) {
		this.drogas = drogas;
	}
	public String getTiposDrogas() {
		return tiposDrogas;
	}
	public void setTiposDrogas(String tiposDrogas) {
		this.tiposDrogas = tiposDrogas;
	}
	public int getMesesGravidez() {
		return mesesGravidez;
	}
	public void setMesesGravidez(int mesesGravidez) {
		this.mesesGravidez = mesesGravidez;
	}
	public void setCodigoAnamneseGeral(int codigoAnamneseGeral) {
		this.codigoAnamneseGeral = codigoAnamneseGeral;
	}
	public int getCodigoAnamneseGeral() {
		return codigoAnamneseGeral;
	}

}
