package model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class AnamneseGeral implements Serializable {

	/**
	 * TELA editarAnamneseGeral
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private int codigoAnamneseGeral;
	private String apresentaProblemaDeSaude;
	private String estaEmTratamentoMedico;
	private String nomeMedico;
	private String telefoneMedico;
	private String tomaMedicamento;
	private String qualMedicamento;
	private String quandoMedicoUltimaVez;
	private String qualUltimoTratamento;
	private String jaPassouCirurgia;
	private String tipoCirurgia;
	private String dataCirurgia;
	private String doencaSeria;
	private String qualDoencaSeria;
	private String antineoplasticoFace;
	private String tempoAntioneoplastico;
	private String fumante;
	private String qtdeCigarrosDiarios;
	private String bebidaAlcoolicaFrequente;
	private String gravidaAmamentando;
	private String outrasInformacoes;
	private String ganhouPerdeuPesoUltimamente;
	private String faltaDeAr;
	private String juntasIncham;
	private String tonturasDesmaios;
	private String demoraCicatrizar;
	private String hemooragia;
	private String drogas;
	private String tiposDrogas;
	private String mesesGravidez;
	
	@OneToOne(cascade={CascadeType.ALL})
	@JoinColumn(name="id_anamnese_paciente")
	private Paciente paciente;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((antineoplasticoFace == null) ? 0 : antineoplasticoFace
						.hashCode());
		result = prime
				* result
				+ ((apresentaProblemaDeSaude == null) ? 0
						: apresentaProblemaDeSaude.hashCode());
		result = prime
				* result
				+ ((bebidaAlcoolicaFrequente == null) ? 0
						: bebidaAlcoolicaFrequente.hashCode());
		result = prime * result + codigoAnamneseGeral;
		result = prime * result
				+ ((dataCirurgia == null) ? 0 : dataCirurgia.hashCode());
		result = prime
				* result
				+ ((demoraCicatrizar == null) ? 0 : demoraCicatrizar.hashCode());
		result = prime * result
				+ ((doencaSeria == null) ? 0 : doencaSeria.hashCode());
		result = prime * result + ((drogas == null) ? 0 : drogas.hashCode());
		result = prime
				* result
				+ ((estaEmTratamentoMedico == null) ? 0
						: estaEmTratamentoMedico.hashCode());
		result = prime * result
				+ ((faltaDeAr == null) ? 0 : faltaDeAr.hashCode());
		result = prime * result + ((fumante == null) ? 0 : fumante.hashCode());
		result = prime
				* result
				+ ((ganhouPerdeuPesoUltimamente == null) ? 0
						: ganhouPerdeuPesoUltimamente.hashCode());
		result = prime
				* result
				+ ((gravidaAmamentando == null) ? 0 : gravidaAmamentando
						.hashCode());
		result = prime * result
				+ ((hemooragia == null) ? 0 : hemooragia.hashCode());
		result = prime
				* result
				+ ((jaPassouCirurgia == null) ? 0 : jaPassouCirurgia.hashCode());
		result = prime * result
				+ ((juntasIncham == null) ? 0 : juntasIncham.hashCode());

		result = prime * result
				+ ((nomeMedico == null) ? 0 : nomeMedico.hashCode());
		result = prime
				* result
				+ ((outrasInformacoes == null) ? 0 : outrasInformacoes
						.hashCode());
		result = prime * result
				+ ((paciente == null) ? 0 : paciente.hashCode());
	
		result = prime * result
				+ ((qualDoencaSeria == null) ? 0 : qualDoencaSeria.hashCode());
		result = prime * result
				+ ((qualMedicamento == null) ? 0 : qualMedicamento.hashCode());
		result = prime
				* result
				+ ((qualUltimoTratamento == null) ? 0 : qualUltimoTratamento
						.hashCode());
		result = prime
				* result
				+ ((quandoMedicoUltimaVez == null) ? 0 : quandoMedicoUltimaVez
						.hashCode());
		result = prime * result
				+ ((telefoneMedico == null) ? 0 : telefoneMedico.hashCode());
		
		result = prime * result
				+ ((tipoCirurgia == null) ? 0 : tipoCirurgia.hashCode());
		result = prime * result
				+ ((tiposDrogas == null) ? 0 : tiposDrogas.hashCode());
		result = prime * result
				+ ((tomaMedicamento == null) ? 0 : tomaMedicamento.hashCode());
		result = prime
				* result
				+ ((tonturasDesmaios == null) ? 0 : tonturasDesmaios.hashCode());
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
		AnamneseGeral other = (AnamneseGeral) obj;
		if (antineoplasticoFace == null) {
			if (other.antineoplasticoFace != null)
				return false;
		} else if (!antineoplasticoFace.equals(other.antineoplasticoFace))
			return false;
		if (apresentaProblemaDeSaude == null) {
			if (other.apresentaProblemaDeSaude != null)
				return false;
		} else if (!apresentaProblemaDeSaude
				.equals(other.apresentaProblemaDeSaude))
			return false;
		if (bebidaAlcoolicaFrequente == null) {
			if (other.bebidaAlcoolicaFrequente != null)
				return false;
		} else if (!bebidaAlcoolicaFrequente
				.equals(other.bebidaAlcoolicaFrequente))
			return false;
		if (codigoAnamneseGeral != other.codigoAnamneseGeral)
			return false;
		if (dataCirurgia == null) {
			if (other.dataCirurgia != null)
				return false;
		} else if (!dataCirurgia.equals(other.dataCirurgia))
			return false;
		if (demoraCicatrizar == null) {
			if (other.demoraCicatrizar != null)
				return false;
		} else if (!demoraCicatrizar.equals(other.demoraCicatrizar))
			return false;
		if (doencaSeria == null) {
			if (other.doencaSeria != null)
				return false;
		} else if (!doencaSeria.equals(other.doencaSeria))
			return false;
		if (drogas == null) {
			if (other.drogas != null)
				return false;
		} else if (!drogas.equals(other.drogas))
			return false;
		if (estaEmTratamentoMedico == null) {
			if (other.estaEmTratamentoMedico != null)
				return false;
		} else if (!estaEmTratamentoMedico.equals(other.estaEmTratamentoMedico))
			return false;
		if (faltaDeAr == null) {
			if (other.faltaDeAr != null)
				return false;
		} else if (!faltaDeAr.equals(other.faltaDeAr))
			return false;
		if (fumante == null) {
			if (other.fumante != null)
				return false;
		} else if (!fumante.equals(other.fumante))
			return false;
		if (ganhouPerdeuPesoUltimamente == null) {
			if (other.ganhouPerdeuPesoUltimamente != null)
				return false;
		} else if (!ganhouPerdeuPesoUltimamente
				.equals(other.ganhouPerdeuPesoUltimamente))
			return false;
		if (gravidaAmamentando == null) {
			if (other.gravidaAmamentando != null)
				return false;
		} else if (!gravidaAmamentando.equals(other.gravidaAmamentando))
			return false;
		if (hemooragia == null) {
			if (other.hemooragia != null)
				return false;
		} else if (!hemooragia.equals(other.hemooragia))
			return false;
		if (jaPassouCirurgia == null) {
			if (other.jaPassouCirurgia != null)
				return false;
		} else if (!jaPassouCirurgia.equals(other.jaPassouCirurgia))
			return false;
		if (juntasIncham == null) {
			if (other.juntasIncham != null)
				return false;
		} else if (!juntasIncham.equals(other.juntasIncham))
			return false;
		if (mesesGravidez != other.mesesGravidez)
			return false;
		if (nomeMedico == null) {
			if (other.nomeMedico != null)
				return false;
		} else if (!nomeMedico.equals(other.nomeMedico))
			return false;
		if (outrasInformacoes == null) {
			if (other.outrasInformacoes != null)
				return false;
		} else if (!outrasInformacoes.equals(other.outrasInformacoes))
			return false;
		if (paciente == null) {
			if (other.paciente != null)
				return false;
		} else if (!paciente.equals(other.paciente))
			return false;
		if (qtdeCigarrosDiarios != other.qtdeCigarrosDiarios)
			return false;
		if (qualDoencaSeria == null) {
			if (other.qualDoencaSeria != null)
				return false;
		} else if (!qualDoencaSeria.equals(other.qualDoencaSeria))
			return false;
		if (qualMedicamento == null) {
			if (other.qualMedicamento != null)
				return false;
		} else if (!qualMedicamento.equals(other.qualMedicamento))
			return false;
		if (qualUltimoTratamento == null) {
			if (other.qualUltimoTratamento != null)
				return false;
		} else if (!qualUltimoTratamento.equals(other.qualUltimoTratamento))
			return false;
		if (quandoMedicoUltimaVez == null) {
			if (other.quandoMedicoUltimaVez != null)
				return false;
		} else if (!quandoMedicoUltimaVez.equals(other.quandoMedicoUltimaVez))
			return false;
		if (telefoneMedico == null) {
			if (other.telefoneMedico != null)
				return false;
		} else if (!telefoneMedico.equals(other.telefoneMedico))
			return false;
		if (tempoAntioneoplastico != other.tempoAntioneoplastico)
			return false;
		if (tipoCirurgia == null) {
			if (other.tipoCirurgia != null)
				return false;
		} else if (!tipoCirurgia.equals(other.tipoCirurgia))
			return false;
		if (tiposDrogas == null) {
			if (other.tiposDrogas != null)
				return false;
		} else if (!tiposDrogas.equals(other.tiposDrogas))
			return false;
		if (tomaMedicamento == null) {
			if (other.tomaMedicamento != null)
				return false;
		} else if (!tomaMedicamento.equals(other.tomaMedicamento))
			return false;
		if (tonturasDesmaios == null) {
			if (other.tonturasDesmaios != null)
				return false;
		} else if (!tonturasDesmaios.equals(other.tonturasDesmaios))
			return false;
		return true;
	}


	public int getCodigoAnamneseGeral() {
		return codigoAnamneseGeral;
	}

	public void setCodigoAnamneseGeral(int codigoAnamneseGeral) {
		this.codigoAnamneseGeral = codigoAnamneseGeral;
	}

	public String getApresentaProblemaDeSaude() {
		return apresentaProblemaDeSaude;
	}

	public void setApresentaProblemaDeSaude(String apresentaProblemaDeSaude) {
		this.apresentaProblemaDeSaude = apresentaProblemaDeSaude;
	}

	public String getEstaEmTratamentoMedico() {
		return estaEmTratamentoMedico;
	}

	public void setEstaEmTratamentoMedico(String estaEmTratamentoMedico) {
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

	public String getTomaMedicamento() {
		return tomaMedicamento;
	}

	public void setTomaMedicamento(String tomaMedicamento) {
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

	public String getJaPassouCirurgia() {
		return jaPassouCirurgia;
	}

	public void setJaPassouCirurgia(String jaPassouCirurgia) {
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

	public String getDoencaSeria() {
		return doencaSeria;
	}

	public void setDoencaSeria(String doencaSeria) {
		this.doencaSeria = doencaSeria;
	}

	public String getQualDoencaSeria() {
		return qualDoencaSeria;
	}

	public void setQualDoencaSeria(String qualDoencaSeria) {
		this.qualDoencaSeria = qualDoencaSeria;
	}

	public String getAntineoplasticoFace() {
		return antineoplasticoFace;
	}

	public void setAntineoplasticoFace(String antineoplasticoFace) {
		this.antineoplasticoFace = antineoplasticoFace;
	}

	public String getTempoAntioneoplastico() {
		return tempoAntioneoplastico;
	}

	public void setTempoAntioneoplastico(String tempoAntioneoplastico) {
		this.tempoAntioneoplastico = tempoAntioneoplastico;
	}

	public String getFumante() {
		return fumante;
	}

	public void setFumante(String fumante) {
		this.fumante = fumante;
	}

	public String getQtdeCigarrosDiarios() {
		return qtdeCigarrosDiarios;
	}

	public void setQtdeCigarrosDiarios(String qtdeCigarrosDiarios) {
		this.qtdeCigarrosDiarios = qtdeCigarrosDiarios;
	}

	public String getBebidaAlcoolicaFrequente() {
		return bebidaAlcoolicaFrequente;
	}

	public void setBebidaAlcoolicaFrequente(String bebidaAlcoolicaFrequente) {
		this.bebidaAlcoolicaFrequente = bebidaAlcoolicaFrequente;
	}

	public String getGravidaAmamentando() {
		return gravidaAmamentando;
	}

	public void setGravidaAmamentando(String gravidaAmamentando) {
		this.gravidaAmamentando = gravidaAmamentando;
	}

	public String getOutrasInformacoes() {
		return outrasInformacoes;
	}

	public void setOutrasInformacoes(String outrasInformacoes) {
		this.outrasInformacoes = outrasInformacoes;
	}

	public String getGanhouPerdeuPesoUltimamente() {
		return ganhouPerdeuPesoUltimamente;
	}

	public void setGanhouPerdeuPesoUltimamente(String ganhouPerdeuPesoUltimamente) {
		this.ganhouPerdeuPesoUltimamente = ganhouPerdeuPesoUltimamente;
	}

	public String getFaltaDeAr() {
		return faltaDeAr;
	}

	public void setFaltaDeAr(String faltaDeAr) {
		this.faltaDeAr = faltaDeAr;
	}

	public String getJuntasIncham() {
		return juntasIncham;
	}

	public void setJuntasIncham(String juntasIncham) {
		this.juntasIncham = juntasIncham;
	}

	public String getTonturasDesmaios() {
		return tonturasDesmaios;
	}

	public void setTonturasDesmaios(String tonturasDesmaios) {
		this.tonturasDesmaios = tonturasDesmaios;
	}

	public String getDemoraCicatrizar() {
		return demoraCicatrizar;
	}

	public void setDemoraCicatrizar(String demoraCicatrizar) {
		this.demoraCicatrizar = demoraCicatrizar;
	}

	public String getHemooragia() {
		return hemooragia;
	}

	public void setHemooragia(String hemooragia) {
		this.hemooragia = hemooragia;
	}

	public String getDrogas() {
		return drogas;
	}

	public void setDrogas(String drogas) {
		this.drogas = drogas;
	}

	public String getTiposDrogas() {
		return tiposDrogas;
	}

	public void setTiposDrogas(String tiposDrogas) {
		this.tiposDrogas = tiposDrogas;
	}

	public String getMesesGravidez() {
		return mesesGravidez;
	}

	public void setMesesGravidez(String mesesGravidez) {
		this.mesesGravidez = mesesGravidez;
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

}
