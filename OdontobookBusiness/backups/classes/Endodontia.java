package model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Endodontia implements Serializable {


	private static final long serialVersionUID = 1L;

	public Endodontia()
	{
		
	}
	@Id
	@GeneratedValue
	private int codigoEndodontia;
	
	private String dataEndodontia;
	private String presencaDor;
	private String sondagemGengival;
	private String grauMobilidade;
	private String exposicaoClinicaFurca;
	private String retracaoGengival;
	private String dorPerussaoVertical;
	private String dorPercussaoHorizontal;
	private String dorPalpacaoApical;
	private String testesSensibilidadePulparUtilizado;
	private String edemiaIntraBucal;
	private String esemiaExtraOral;
	private String carie;
	private String corCoroaAlterada;
	private String coroaProtetica;
	private String exposicaoPulpar;
	private String fistula;
	private String fraturaCoroa;
	private String luxacaoDental;
	private String restauracao;
	private String traumaOclusal;
	private String outrosSinaisClinicos;
	private String carieCoroa;
	private String carieRaiz;
	private String calcificacaoCanal;
	private String noduloPulpar;
	private String canaisObturados;
	private String sobreObturacao;
	private String instrumentoFraturado;
	private String espessamentoPeriodontalApical;
	private String espessamentoPeriodontalLateral;
	private String nucleoMetalico;
	private String perficacaoRadicular;
	private String pulpotomia;
	private String lesaoPeriodontalLateral;
	private String lesaoPeriapical;
	private String hipercrementose;
	private String reabsorcaoExtremaCervical;
	private String reabsorcaoInterna;
	private String lesaoFurca;
	private String raizCurva;
	private String raizDelgada;
	private String rizogeneseIncompleta;
	private String densidadeDente;
	private String fraturaRaiz;
	private String outrosSinaisRadiograficos;
	private String polpaNormal;
	private String pulpiteAgudaReversivel;
	private String pulpiteAgudaReversibilidadeDuvidosa;
	private String pulpiteAgudaIrreversivel;
	private String pulpiteCronicaHiperplastica;
	private String necrosePulpar;
	private String pericementiteApicalAguda;
	private String abcessoDentoAlveolarAgudoFaseInicial;
	private String abcessoDentoAlveolarAgudoFaseEvolucao;
	private String abcessoDentoAlveolarAgudoFaseEvoluida;
	private String lesaoPeriapicalCronicaCircunscrita;
	private String lesaoPeriapicalCronicaDifusa;
	private String lesaoEndoPeriodontal;
	private String tratamentoIndicato;
	
	@OneToOne
	@JoinColumn(name="denteDaEndodontia")
	private Dente dente;

	
	
	
	public int getCodigoEndodontia() {
		return codigoEndodontia;
	}

	public void setCodigoEndodontia(int codigoEndodontia) {
		this.codigoEndodontia = codigoEndodontia;
	}

	public String getDataEndodontia() {
		return dataEndodontia;
	}

	public void setDataEndodontia(String dataEndodontia) {
		this.dataEndodontia = dataEndodontia;
	}

	public String getPresencaDor() {
		return presencaDor;
	}

	public void setPresencaDor(String presencaDor) {
		this.presencaDor = presencaDor;
	}

	public String getSondagemGengival() {
		return sondagemGengival;
	}

	public void setSondagemGengival(String sondagemGengival) {
		this.sondagemGengival = sondagemGengival;
	}

	public String getGrauMobilidade() {
		return grauMobilidade;
	}

	public void setGrauMobilidade(String grauMobilidade) {
		this.grauMobilidade = grauMobilidade;
	}

	public String getExposicaoClinicaFurca() {
		return exposicaoClinicaFurca;
	}

	public void setExposicaoClinicaFurca(String exposicaoClinicaFurca) {
		this.exposicaoClinicaFurca = exposicaoClinicaFurca;
	}

	public String getRetracaoGengival() {
		return retracaoGengival;
	}

	public void setRetracaoGengival(String retracaoGengival) {
		this.retracaoGengival = retracaoGengival;
	}

	public String getDorPerussaoVertical() {
		return dorPerussaoVertical;
	}

	public void setDorPerussaoVertical(String dorPerussaoVertical) {
		this.dorPerussaoVertical = dorPerussaoVertical;
	}

	public String getDorPercussaoHorizontal() {
		return dorPercussaoHorizontal;
	}

	public void setDorPercussaoHorizontal(String dorPercussaoHorizontal) {
		this.dorPercussaoHorizontal = dorPercussaoHorizontal;
	}

	public String getDorPalpacaoApical() {
		return dorPalpacaoApical;
	}

	public void setDorPalpacaoApical(String dorPalpacaoApical) {
		this.dorPalpacaoApical = dorPalpacaoApical;
	}

	public String getTestesSensibilidadePulparUtilizado() {
		return testesSensibilidadePulparUtilizado;
	}

	public void setTestesSensibilidadePulparUtilizado(
			String testesSensibilidadePulparUtilizado) {
		this.testesSensibilidadePulparUtilizado = testesSensibilidadePulparUtilizado;
	}

	public String getEdemiaIntraBucal() {
		return edemiaIntraBucal;
	}

	public void setEdemiaIntraBucal(String edemiaIntraBucal) {
		this.edemiaIntraBucal = edemiaIntraBucal;
	}

	public String getEsemiaExtraOral() {
		return esemiaExtraOral;
	}

	public void setEsemiaExtraOral(String esemiaExtraOral) {
		this.esemiaExtraOral = esemiaExtraOral;
	}

	public String getCarie() {
		return carie;
	}

	public void setCarie(String carie) {
		this.carie = carie;
	}

	public String getCorCoroaAlterada() {
		return corCoroaAlterada;
	}

	public void setCorCoroaAlterada(String corCoroaAlterada) {
		this.corCoroaAlterada = corCoroaAlterada;
	}

	public String getCoroaProtetica() {
		return coroaProtetica;
	}

	public void setCoroaProtetica(String coroaProtetica) {
		this.coroaProtetica = coroaProtetica;
	}

	public String getExposicaoPulpar() {
		return exposicaoPulpar;
	}

	public void setExposicaoPulpar(String exposicaoPulpar) {
		this.exposicaoPulpar = exposicaoPulpar;
	}

	public String getFistula() {
		return fistula;
	}

	public void setFistula(String fistula) {
		this.fistula = fistula;
	}

	public String getFraturaCoroa() {
		return fraturaCoroa;
	}

	public void setFraturaCoroa(String fraturaCoroa) {
		this.fraturaCoroa = fraturaCoroa;
	}

	public String getLuxacaoDental() {
		return luxacaoDental;
	}

	public void setLuxacaoDental(String luxacaoDental) {
		this.luxacaoDental = luxacaoDental;
	}

	public String getRestauracao() {
		return restauracao;
	}

	public void setRestauracao(String restauracao) {
		this.restauracao = restauracao;
	}

	public String getTraumaOclusal() {
		return traumaOclusal;
	}

	public void setTraumaOclusal(String traumaOclusal) {
		this.traumaOclusal = traumaOclusal;
	}

	public String getOutrosSinaisClinicos() {
		return outrosSinaisClinicos;
	}

	public void setOutrosSinaisClinicos(String outrosSinaisClinicos) {
		this.outrosSinaisClinicos = outrosSinaisClinicos;
	}

	public String getCarieCoroa() {
		return carieCoroa;
	}

	public void setCarieCoroa(String carieCoroa) {
		this.carieCoroa = carieCoroa;
	}

	public String getCarieRaiz() {
		return carieRaiz;
	}

	public void setCarieRaiz(String carieRaiz) {
		this.carieRaiz = carieRaiz;
	}

	public String getCalcificacaoCanal() {
		return calcificacaoCanal;
	}

	public void setCalcificacaoCanal(String calcificacaoCanal) {
		this.calcificacaoCanal = calcificacaoCanal;
	}

	public String getNoduloPulpar() {
		return noduloPulpar;
	}

	public void setNoduloPulpar(String noduloPulpar) {
		this.noduloPulpar = noduloPulpar;
	}

	public String getCanaisObturados() {
		return canaisObturados;
	}

	public void setCanaisObturados(String canaisObturados) {
		this.canaisObturados = canaisObturados;
	}

	public String getSobreObturacao() {
		return sobreObturacao;
	}

	public void setSobreObturacao(String sobreObturacao) {
		this.sobreObturacao = sobreObturacao;
	}

	public String getInstrumentoFraturado() {
		return instrumentoFraturado;
	}

	public void setInstrumentoFraturado(String instrumentoFraturado) {
		this.instrumentoFraturado = instrumentoFraturado;
	}

	public String getEspessamentoPeriodontalApical() {
		return espessamentoPeriodontalApical;
	}

	public void setEspessamentoPeriodontalApical(
			String espessamentoPeriodontalApical) {
		this.espessamentoPeriodontalApical = espessamentoPeriodontalApical;
	}

	public String getEspessamentoPeriodontalLateral() {
		return espessamentoPeriodontalLateral;
	}

	public void setEspessamentoPeriodontalLateral(
			String espessamentoPeriodontalLateral) {
		this.espessamentoPeriodontalLateral = espessamentoPeriodontalLateral;
	}

	public String getNucleoMetalico() {
		return nucleoMetalico;
	}

	public void setNucleoMetalico(String nucleoMetalico) {
		this.nucleoMetalico = nucleoMetalico;
	}

	public String getPerficacaoRadicular() {
		return perficacaoRadicular;
	}

	public void setPerficacaoRadicular(String perficacaoRadicular) {
		this.perficacaoRadicular = perficacaoRadicular;
	}

	public String getPulpotomia() {
		return pulpotomia;
	}

	public void setPulpotomia(String pulpotomia) {
		this.pulpotomia = pulpotomia;
	}

	public String getLesaoPeriodontalLateral() {
		return lesaoPeriodontalLateral;
	}

	public void setLesaoPeriodontalLateral(String lesaoPeriodontalLateral) {
		this.lesaoPeriodontalLateral = lesaoPeriodontalLateral;
	}

	public String getLesaoPeriapical() {
		return lesaoPeriapical;
	}

	public void setLesaoPeriapical(String lesaoPeriapical) {
		this.lesaoPeriapical = lesaoPeriapical;
	}

	public String getHipercrementose() {
		return hipercrementose;
	}

	public void setHipercrementose(String hipercrementose) {
		this.hipercrementose = hipercrementose;
	}

	public String getReabsorcaoExtremaCervical() {
		return reabsorcaoExtremaCervical;
	}

	public void setReabsorcaoExtremaCervical(String reabsorcaoExtremaCervical) {
		this.reabsorcaoExtremaCervical = reabsorcaoExtremaCervical;
	}

	public String getReabsorcaoInterna() {
		return reabsorcaoInterna;
	}

	public void setReabsorcaoInterna(String reabsorcaoInterna) {
		this.reabsorcaoInterna = reabsorcaoInterna;
	}

	public String getLesaoFurca() {
		return lesaoFurca;
	}

	public void setLesaoFurca(String lesaoFurca) {
		this.lesaoFurca = lesaoFurca;
	}

	public String getRaizCurva() {
		return raizCurva;
	}

	public void setRaizCurva(String raizCurva) {
		this.raizCurva = raizCurva;
	}

	public String getRaizDelgada() {
		return raizDelgada;
	}

	public void setRaizDelgada(String raizDelgada) {
		this.raizDelgada = raizDelgada;
	}

	public String getRizogeneseIncompleta() {
		return rizogeneseIncompleta;
	}

	public void setRizogeneseIncompleta(String rizogeneseIncompleta) {
		this.rizogeneseIncompleta = rizogeneseIncompleta;
	}

	public String getDensidadeDente() {
		return densidadeDente;
	}

	public void setDensidadeDente(String densidadeDente) {
		this.densidadeDente = densidadeDente;
	}

	public String getFraturaRaiz() {
		return fraturaRaiz;
	}

	public void setFraturaRaiz(String fraturaRaiz) {
		this.fraturaRaiz = fraturaRaiz;
	}

	public String getOutrosSinaisRadiograficos() {
		return outrosSinaisRadiograficos;
	}

	public void setOutrosSinaisRadiograficos(String outrosSinaisRadiograficos) {
		this.outrosSinaisRadiograficos = outrosSinaisRadiograficos;
	}

	public String getPolpaNormal() {
		return polpaNormal;
	}

	public void setPolpaNormal(String polpaNormal) {
		this.polpaNormal = polpaNormal;
	}

	public String getPulpiteAgudaReversivel() {
		return pulpiteAgudaReversivel;
	}

	public void setPulpiteAgudaReversivel(String pulpiteAgudaReversivel) {
		this.pulpiteAgudaReversivel = pulpiteAgudaReversivel;
	}

	public String getPulpiteAgudaReversibilidadeDuvidosa() {
		return pulpiteAgudaReversibilidadeDuvidosa;
	}

	public void setPulpiteAgudaReversibilidadeDuvidosa(
			String pulpiteAgudaReversibilidadeDuvidosa) {
		this.pulpiteAgudaReversibilidadeDuvidosa = pulpiteAgudaReversibilidadeDuvidosa;
	}

	public String getPulpiteAgudaIrreversivel() {
		return pulpiteAgudaIrreversivel;
	}

	public void setPulpiteAgudaIrreversivel(String pulpiteAgudaIrreversivel) {
		this.pulpiteAgudaIrreversivel = pulpiteAgudaIrreversivel;
	}

	public String getPulpiteCronicaHiperplastica() {
		return pulpiteCronicaHiperplastica;
	}

	public void setPulpiteCronicaHiperplastica(String pulpiteCronicaHiperplastica) {
		this.pulpiteCronicaHiperplastica = pulpiteCronicaHiperplastica;
	}

	public String getNecrosePulpar() {
		return necrosePulpar;
	}

	public void setNecrosePulpar(String necrosePulpar) {
		this.necrosePulpar = necrosePulpar;
	}

	public String getPericementiteApicalAguda() {
		return pericementiteApicalAguda;
	}

	public void setPericementiteApicalAguda(String pericementiteApicalAguda) {
		this.pericementiteApicalAguda = pericementiteApicalAguda;
	}

	public String getAbcessoDentoAlveolarAgudoFaseInicial() {
		return abcessoDentoAlveolarAgudoFaseInicial;
	}

	public void setAbcessoDentoAlveolarAgudoFaseInicial(
			String abcessoDentoAlveolarAgudoFaseInicial) {
		this.abcessoDentoAlveolarAgudoFaseInicial = abcessoDentoAlveolarAgudoFaseInicial;
	}

	public String getAbcessoDentoAlveolarAgudoFaseEvolucao() {
		return abcessoDentoAlveolarAgudoFaseEvolucao;
	}

	public void setAbcessoDentoAlveolarAgudoFaseEvolucao(
			String abcessoDentoAlveolarAgudoFaseEvolucao) {
		this.abcessoDentoAlveolarAgudoFaseEvolucao = abcessoDentoAlveolarAgudoFaseEvolucao;
	}

	public String getAbcessoDentoAlveolarAgudoFaseEvoluida() {
		return abcessoDentoAlveolarAgudoFaseEvoluida;
	}

	public void setAbcessoDentoAlveolarAgudoFaseEvoluida(
			String abcessoDentoAlveolarAgudoFaseEvoluida) {
		this.abcessoDentoAlveolarAgudoFaseEvoluida = abcessoDentoAlveolarAgudoFaseEvoluida;
	}

	public String getLesaoPeriapicalCronicaCircunscrita() {
		return lesaoPeriapicalCronicaCircunscrita;
	}

	public void setLesaoPeriapicalCronicaCircunscrita(
			String lesaoPeriapicalCronicaCircunscrita) {
		this.lesaoPeriapicalCronicaCircunscrita = lesaoPeriapicalCronicaCircunscrita;
	}

	public String getLesaoPeriapicalCronicaDifusa() {
		return lesaoPeriapicalCronicaDifusa;
	}

	public void setLesaoPeriapicalCronicaDifusa(String lesaoPeriapicalCronicaDifusa) {
		this.lesaoPeriapicalCronicaDifusa = lesaoPeriapicalCronicaDifusa;
	}

	public String getLesaoEndoPeriodontal() {
		return lesaoEndoPeriodontal;
	}

	public void setLesaoEndoPeriodontal(String lesaoEndoPeriodontal) {
		this.lesaoEndoPeriodontal = lesaoEndoPeriodontal;
	}

	public String getTratamentoIndicato() {
		return tratamentoIndicato;
	}

	public void setTratamentoIndicato(String tratamentoIndicato) {
		this.tratamentoIndicato = tratamentoIndicato;
	}

	public Dente getDente() {
		return dente;
	}

	public void setDente(Dente dente) {
		this.dente = dente;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Endodontia [codigoEndodontia=" + codigoEndodontia
				+ ", dataEndodontia=" + dataEndodontia + ", presencaDor="
				+ presencaDor + ", sondagemGengival=" + sondagemGengival
				+ ", grauMobilidade=" + grauMobilidade
				+ ", exposicaoClinicaFurca=" + exposicaoClinicaFurca
				+ ", retracaoGengival=" + retracaoGengival
				+ ", dorPerussaoVertical=" + dorPerussaoVertical
				+ ", dorPercussaoHorizontal=" + dorPercussaoHorizontal
				+ ", dorPalpacaoApical=" + dorPalpacaoApical
				+ ", testesSensibilidadePulparUtilizado="
				+ testesSensibilidadePulparUtilizado + ", edemiaIntraBucal="
				+ edemiaIntraBucal + ", esemiaExtraOral=" + esemiaExtraOral
				+ ", carie=" + carie + ", corCoroaAlterada=" + corCoroaAlterada
				+ ", coroaProtetica=" + coroaProtetica + ", exposicaoPulpar="
				+ exposicaoPulpar + ", fistula=" + fistula + ", fraturaCoroa="
				+ fraturaCoroa + ", luxacaoDental=" + luxacaoDental
				+ ", restauracao=" + restauracao + ", traumaOclusal="
				+ traumaOclusal + ", outrosSinaisClinicos="
				+ outrosSinaisClinicos + ", carieCoroa=" + carieCoroa
				+ ", carieRaiz=" + carieRaiz + ", calcificacaoCanal="
				+ calcificacaoCanal + ", noduloPulpar=" + noduloPulpar
				+ ", canaisObturados=" + canaisObturados + ", sobreObturacao="
				+ sobreObturacao + ", instrumentoFraturado="
				+ instrumentoFraturado + ", espessamentoPeriodontalApical="
				+ espessamentoPeriodontalApical
				+ ", espessamentoPeriodontalLateral="
				+ espessamentoPeriodontalLateral + ", nucleoMetalico="
				+ nucleoMetalico + ", perficacaoRadicular="
				+ perficacaoRadicular + ", pulpotomia=" + pulpotomia
				+ ", lesaoPeriodontalLateral=" + lesaoPeriodontalLateral
				+ ", lesaoPeriapical=" + lesaoPeriapical + ", hipercrementose="
				+ hipercrementose + ", reabsorcaoExtremaCervical="
				+ reabsorcaoExtremaCervical + ", reabsorcaoInterna="
				+ reabsorcaoInterna + ", lesaoFurca=" + lesaoFurca
				+ ", raizCurva=" + raizCurva + ", raizDelgada=" + raizDelgada
				+ ", rizogeneseIncompleta=" + rizogeneseIncompleta
				+ ", densidadeDente=" + densidadeDente + ", fraturaRaiz="
				+ fraturaRaiz + ", outrosSinaisRadiograficos="
				+ outrosSinaisRadiograficos + ", polpaNormal=" + polpaNormal
				+ ", pulpiteAgudaReversivel=" + pulpiteAgudaReversivel
				+ ", pulpiteAgudaReversibilidadeDuvidosa="
				+ pulpiteAgudaReversibilidadeDuvidosa
				+ ", pulpiteAgudaIrreversivel=" + pulpiteAgudaIrreversivel
				+ ", pulpiteCronicaHiperplastica="
				+ pulpiteCronicaHiperplastica + ", necrosePulpar="
				+ necrosePulpar + ", pericementiteApicalAguda="
				+ pericementiteApicalAguda
				+ ", abcessoDentoAlveolarAgudoFaseInicial="
				+ abcessoDentoAlveolarAgudoFaseInicial
				+ ", abcessoDentoAlveolarAgudoFaseEvolucao="
				+ abcessoDentoAlveolarAgudoFaseEvolucao
				+ ", abcessoDentoAlveolarAgudoFaseEvoluida="
				+ abcessoDentoAlveolarAgudoFaseEvoluida
				+ ", lesaoPeriapicalCronicaCircunscrita="
				+ lesaoPeriapicalCronicaCircunscrita
				+ ", lesaoPeriapicalCronicaDifusa="
				+ lesaoPeriapicalCronicaDifusa + ", lesaoEndoPeriodontal="
				+ lesaoEndoPeriodontal + ", tratamentoIndicato="
				+ tratamentoIndicato + ", dente=" + dente + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((abcessoDentoAlveolarAgudoFaseEvolucao == null) ? 0
						: abcessoDentoAlveolarAgudoFaseEvolucao.hashCode());
		result = prime
				* result
				+ ((abcessoDentoAlveolarAgudoFaseEvoluida == null) ? 0
						: abcessoDentoAlveolarAgudoFaseEvoluida.hashCode());
		result = prime
				* result
				+ ((abcessoDentoAlveolarAgudoFaseInicial == null) ? 0
						: abcessoDentoAlveolarAgudoFaseInicial.hashCode());
		result = prime
				* result
				+ ((calcificacaoCanal == null) ? 0 : calcificacaoCanal
						.hashCode());
		result = prime * result
				+ ((canaisObturados == null) ? 0 : canaisObturados.hashCode());
		result = prime * result + ((carie == null) ? 0 : carie.hashCode());
		result = prime * result
				+ ((carieCoroa == null) ? 0 : carieCoroa.hashCode());
		result = prime * result
				+ ((carieRaiz == null) ? 0 : carieRaiz.hashCode());
		result = prime * result + codigoEndodontia;
		result = prime
				* result
				+ ((corCoroaAlterada == null) ? 0 : corCoroaAlterada.hashCode());
		result = prime * result
				+ ((coroaProtetica == null) ? 0 : coroaProtetica.hashCode());
		result = prime * result
				+ ((dataEndodontia == null) ? 0 : dataEndodontia.hashCode());
		result = prime * result
				+ ((densidadeDente == null) ? 0 : densidadeDente.hashCode());
		result = prime * result + ((dente == null) ? 0 : dente.hashCode());
		result = prime
				* result
				+ ((dorPalpacaoApical == null) ? 0 : dorPalpacaoApical
						.hashCode());
		result = prime
				* result
				+ ((dorPercussaoHorizontal == null) ? 0
						: dorPercussaoHorizontal.hashCode());
		result = prime
				* result
				+ ((dorPerussaoVertical == null) ? 0 : dorPerussaoVertical
						.hashCode());
		result = prime
				* result
				+ ((edemiaIntraBucal == null) ? 0 : edemiaIntraBucal.hashCode());
		result = prime * result
				+ ((esemiaExtraOral == null) ? 0 : esemiaExtraOral.hashCode());
		result = prime
				* result
				+ ((espessamentoPeriodontalApical == null) ? 0
						: espessamentoPeriodontalApical.hashCode());
		result = prime
				* result
				+ ((espessamentoPeriodontalLateral == null) ? 0
						: espessamentoPeriodontalLateral.hashCode());
		result = prime
				* result
				+ ((exposicaoClinicaFurca == null) ? 0 : exposicaoClinicaFurca
						.hashCode());
		result = prime * result
				+ ((exposicaoPulpar == null) ? 0 : exposicaoPulpar.hashCode());
		result = prime * result + ((fistula == null) ? 0 : fistula.hashCode());
		result = prime * result
				+ ((fraturaCoroa == null) ? 0 : fraturaCoroa.hashCode());
		result = prime * result
				+ ((fraturaRaiz == null) ? 0 : fraturaRaiz.hashCode());
		result = prime * result
				+ ((grauMobilidade == null) ? 0 : grauMobilidade.hashCode());
		result = prime * result
				+ ((hipercrementose == null) ? 0 : hipercrementose.hashCode());
		result = prime
				* result
				+ ((instrumentoFraturado == null) ? 0 : instrumentoFraturado
						.hashCode());
		result = prime
				* result
				+ ((lesaoEndoPeriodontal == null) ? 0 : lesaoEndoPeriodontal
						.hashCode());
		result = prime * result
				+ ((lesaoFurca == null) ? 0 : lesaoFurca.hashCode());
		result = prime * result
				+ ((lesaoPeriapical == null) ? 0 : lesaoPeriapical.hashCode());
		result = prime
				* result
				+ ((lesaoPeriapicalCronicaCircunscrita == null) ? 0
						: lesaoPeriapicalCronicaCircunscrita.hashCode());
		result = prime
				* result
				+ ((lesaoPeriapicalCronicaDifusa == null) ? 0
						: lesaoPeriapicalCronicaDifusa.hashCode());
		result = prime
				* result
				+ ((lesaoPeriodontalLateral == null) ? 0
						: lesaoPeriodontalLateral.hashCode());
		result = prime * result
				+ ((luxacaoDental == null) ? 0 : luxacaoDental.hashCode());
		result = prime * result
				+ ((necrosePulpar == null) ? 0 : necrosePulpar.hashCode());
		result = prime * result
				+ ((noduloPulpar == null) ? 0 : noduloPulpar.hashCode());
		result = prime * result
				+ ((nucleoMetalico == null) ? 0 : nucleoMetalico.hashCode());
		result = prime
				* result
				+ ((outrosSinaisClinicos == null) ? 0 : outrosSinaisClinicos
						.hashCode());
		result = prime
				* result
				+ ((outrosSinaisRadiograficos == null) ? 0
						: outrosSinaisRadiograficos.hashCode());
		result = prime
				* result
				+ ((perficacaoRadicular == null) ? 0 : perficacaoRadicular
						.hashCode());
		result = prime
				* result
				+ ((pericementiteApicalAguda == null) ? 0
						: pericementiteApicalAguda.hashCode());
		result = prime * result
				+ ((polpaNormal == null) ? 0 : polpaNormal.hashCode());
		result = prime * result
				+ ((presencaDor == null) ? 0 : presencaDor.hashCode());
		result = prime
				* result
				+ ((pulpiteAgudaIrreversivel == null) ? 0
						: pulpiteAgudaIrreversivel.hashCode());
		result = prime
				* result
				+ ((pulpiteAgudaReversibilidadeDuvidosa == null) ? 0
						: pulpiteAgudaReversibilidadeDuvidosa.hashCode());
		result = prime
				* result
				+ ((pulpiteAgudaReversivel == null) ? 0
						: pulpiteAgudaReversivel.hashCode());
		result = prime
				* result
				+ ((pulpiteCronicaHiperplastica == null) ? 0
						: pulpiteCronicaHiperplastica.hashCode());
		result = prime * result
				+ ((pulpotomia == null) ? 0 : pulpotomia.hashCode());
		result = prime * result
				+ ((raizCurva == null) ? 0 : raizCurva.hashCode());
		result = prime * result
				+ ((raizDelgada == null) ? 0 : raizDelgada.hashCode());
		result = prime
				* result
				+ ((reabsorcaoExtremaCervical == null) ? 0
						: reabsorcaoExtremaCervical.hashCode());
		result = prime
				* result
				+ ((reabsorcaoInterna == null) ? 0 : reabsorcaoInterna
						.hashCode());
		result = prime * result
				+ ((restauracao == null) ? 0 : restauracao.hashCode());
		result = prime
				* result
				+ ((retracaoGengival == null) ? 0 : retracaoGengival.hashCode());
		result = prime
				* result
				+ ((rizogeneseIncompleta == null) ? 0 : rizogeneseIncompleta
						.hashCode());
		result = prime * result
				+ ((sobreObturacao == null) ? 0 : sobreObturacao.hashCode());
		result = prime
				* result
				+ ((sondagemGengival == null) ? 0 : sondagemGengival.hashCode());
		result = prime
				* result
				+ ((testesSensibilidadePulparUtilizado == null) ? 0
						: testesSensibilidadePulparUtilizado.hashCode());
		result = prime
				* result
				+ ((tratamentoIndicato == null) ? 0 : tratamentoIndicato
						.hashCode());
		result = prime * result
				+ ((traumaOclusal == null) ? 0 : traumaOclusal.hashCode());
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
		Endodontia other = (Endodontia) obj;
		if (abcessoDentoAlveolarAgudoFaseEvolucao == null) {
			if (other.abcessoDentoAlveolarAgudoFaseEvolucao != null)
				return false;
		} else if (!abcessoDentoAlveolarAgudoFaseEvolucao
				.equals(other.abcessoDentoAlveolarAgudoFaseEvolucao))
			return false;
		if (abcessoDentoAlveolarAgudoFaseEvoluida == null) {
			if (other.abcessoDentoAlveolarAgudoFaseEvoluida != null)
				return false;
		} else if (!abcessoDentoAlveolarAgudoFaseEvoluida
				.equals(other.abcessoDentoAlveolarAgudoFaseEvoluida))
			return false;
		if (abcessoDentoAlveolarAgudoFaseInicial == null) {
			if (other.abcessoDentoAlveolarAgudoFaseInicial != null)
				return false;
		} else if (!abcessoDentoAlveolarAgudoFaseInicial
				.equals(other.abcessoDentoAlveolarAgudoFaseInicial))
			return false;
		if (calcificacaoCanal == null) {
			if (other.calcificacaoCanal != null)
				return false;
		} else if (!calcificacaoCanal.equals(other.calcificacaoCanal))
			return false;
		if (canaisObturados == null) {
			if (other.canaisObturados != null)
				return false;
		} else if (!canaisObturados.equals(other.canaisObturados))
			return false;
		if (carie == null) {
			if (other.carie != null)
				return false;
		} else if (!carie.equals(other.carie))
			return false;
		if (carieCoroa == null) {
			if (other.carieCoroa != null)
				return false;
		} else if (!carieCoroa.equals(other.carieCoroa))
			return false;
		if (carieRaiz == null) {
			if (other.carieRaiz != null)
				return false;
		} else if (!carieRaiz.equals(other.carieRaiz))
			return false;
		if (codigoEndodontia != other.codigoEndodontia)
			return false;
		if (corCoroaAlterada == null) {
			if (other.corCoroaAlterada != null)
				return false;
		} else if (!corCoroaAlterada.equals(other.corCoroaAlterada))
			return false;
		if (coroaProtetica == null) {
			if (other.coroaProtetica != null)
				return false;
		} else if (!coroaProtetica.equals(other.coroaProtetica))
			return false;
		if (dataEndodontia == null) {
			if (other.dataEndodontia != null)
				return false;
		} else if (!dataEndodontia.equals(other.dataEndodontia))
			return false;
		if (densidadeDente == null) {
			if (other.densidadeDente != null)
				return false;
		} else if (!densidadeDente.equals(other.densidadeDente))
			return false;
		if (dente == null) {
			if (other.dente != null)
				return false;
		} else if (!dente.equals(other.dente))
			return false;
		if (dorPalpacaoApical == null) {
			if (other.dorPalpacaoApical != null)
				return false;
		} else if (!dorPalpacaoApical.equals(other.dorPalpacaoApical))
			return false;
		if (dorPercussaoHorizontal == null) {
			if (other.dorPercussaoHorizontal != null)
				return false;
		} else if (!dorPercussaoHorizontal.equals(other.dorPercussaoHorizontal))
			return false;
		if (dorPerussaoVertical == null) {
			if (other.dorPerussaoVertical != null)
				return false;
		} else if (!dorPerussaoVertical.equals(other.dorPerussaoVertical))
			return false;
		if (edemiaIntraBucal == null) {
			if (other.edemiaIntraBucal != null)
				return false;
		} else if (!edemiaIntraBucal.equals(other.edemiaIntraBucal))
			return false;
		if (esemiaExtraOral == null) {
			if (other.esemiaExtraOral != null)
				return false;
		} else if (!esemiaExtraOral.equals(other.esemiaExtraOral))
			return false;
		if (espessamentoPeriodontalApical == null) {
			if (other.espessamentoPeriodontalApical != null)
				return false;
		} else if (!espessamentoPeriodontalApical
				.equals(other.espessamentoPeriodontalApical))
			return false;
		if (espessamentoPeriodontalLateral == null) {
			if (other.espessamentoPeriodontalLateral != null)
				return false;
		} else if (!espessamentoPeriodontalLateral
				.equals(other.espessamentoPeriodontalLateral))
			return false;
		if (exposicaoClinicaFurca == null) {
			if (other.exposicaoClinicaFurca != null)
				return false;
		} else if (!exposicaoClinicaFurca.equals(other.exposicaoClinicaFurca))
			return false;
		if (exposicaoPulpar == null) {
			if (other.exposicaoPulpar != null)
				return false;
		} else if (!exposicaoPulpar.equals(other.exposicaoPulpar))
			return false;
		if (fistula == null) {
			if (other.fistula != null)
				return false;
		} else if (!fistula.equals(other.fistula))
			return false;
		if (fraturaCoroa == null) {
			if (other.fraturaCoroa != null)
				return false;
		} else if (!fraturaCoroa.equals(other.fraturaCoroa))
			return false;
		if (fraturaRaiz == null) {
			if (other.fraturaRaiz != null)
				return false;
		} else if (!fraturaRaiz.equals(other.fraturaRaiz))
			return false;
		if (grauMobilidade == null) {
			if (other.grauMobilidade != null)
				return false;
		} else if (!grauMobilidade.equals(other.grauMobilidade))
			return false;
		if (hipercrementose == null) {
			if (other.hipercrementose != null)
				return false;
		} else if (!hipercrementose.equals(other.hipercrementose))
			return false;
		if (instrumentoFraturado == null) {
			if (other.instrumentoFraturado != null)
				return false;
		} else if (!instrumentoFraturado.equals(other.instrumentoFraturado))
			return false;
		if (lesaoEndoPeriodontal == null) {
			if (other.lesaoEndoPeriodontal != null)
				return false;
		} else if (!lesaoEndoPeriodontal.equals(other.lesaoEndoPeriodontal))
			return false;
		if (lesaoFurca == null) {
			if (other.lesaoFurca != null)
				return false;
		} else if (!lesaoFurca.equals(other.lesaoFurca))
			return false;
		if (lesaoPeriapical == null) {
			if (other.lesaoPeriapical != null)
				return false;
		} else if (!lesaoPeriapical.equals(other.lesaoPeriapical))
			return false;
		if (lesaoPeriapicalCronicaCircunscrita == null) {
			if (other.lesaoPeriapicalCronicaCircunscrita != null)
				return false;
		} else if (!lesaoPeriapicalCronicaCircunscrita
				.equals(other.lesaoPeriapicalCronicaCircunscrita))
			return false;
		if (lesaoPeriapicalCronicaDifusa == null) {
			if (other.lesaoPeriapicalCronicaDifusa != null)
				return false;
		} else if (!lesaoPeriapicalCronicaDifusa
				.equals(other.lesaoPeriapicalCronicaDifusa))
			return false;
		if (lesaoPeriodontalLateral == null) {
			if (other.lesaoPeriodontalLateral != null)
				return false;
		} else if (!lesaoPeriodontalLateral
				.equals(other.lesaoPeriodontalLateral))
			return false;
		if (luxacaoDental == null) {
			if (other.luxacaoDental != null)
				return false;
		} else if (!luxacaoDental.equals(other.luxacaoDental))
			return false;
		if (necrosePulpar == null) {
			if (other.necrosePulpar != null)
				return false;
		} else if (!necrosePulpar.equals(other.necrosePulpar))
			return false;
		if (noduloPulpar == null) {
			if (other.noduloPulpar != null)
				return false;
		} else if (!noduloPulpar.equals(other.noduloPulpar))
			return false;
		if (nucleoMetalico == null) {
			if (other.nucleoMetalico != null)
				return false;
		} else if (!nucleoMetalico.equals(other.nucleoMetalico))
			return false;
		if (outrosSinaisClinicos == null) {
			if (other.outrosSinaisClinicos != null)
				return false;
		} else if (!outrosSinaisClinicos.equals(other.outrosSinaisClinicos))
			return false;
		if (outrosSinaisRadiograficos == null) {
			if (other.outrosSinaisRadiograficos != null)
				return false;
		} else if (!outrosSinaisRadiograficos
				.equals(other.outrosSinaisRadiograficos))
			return false;
		if (perficacaoRadicular == null) {
			if (other.perficacaoRadicular != null)
				return false;
		} else if (!perficacaoRadicular.equals(other.perficacaoRadicular))
			return false;
		if (pericementiteApicalAguda == null) {
			if (other.pericementiteApicalAguda != null)
				return false;
		} else if (!pericementiteApicalAguda
				.equals(other.pericementiteApicalAguda))
			return false;
		if (polpaNormal == null) {
			if (other.polpaNormal != null)
				return false;
		} else if (!polpaNormal.equals(other.polpaNormal))
			return false;
		if (presencaDor == null) {
			if (other.presencaDor != null)
				return false;
		} else if (!presencaDor.equals(other.presencaDor))
			return false;
		if (pulpiteAgudaIrreversivel == null) {
			if (other.pulpiteAgudaIrreversivel != null)
				return false;
		} else if (!pulpiteAgudaIrreversivel
				.equals(other.pulpiteAgudaIrreversivel))
			return false;
		if (pulpiteAgudaReversibilidadeDuvidosa == null) {
			if (other.pulpiteAgudaReversibilidadeDuvidosa != null)
				return false;
		} else if (!pulpiteAgudaReversibilidadeDuvidosa
				.equals(other.pulpiteAgudaReversibilidadeDuvidosa))
			return false;
		if (pulpiteAgudaReversivel == null) {
			if (other.pulpiteAgudaReversivel != null)
				return false;
		} else if (!pulpiteAgudaReversivel.equals(other.pulpiteAgudaReversivel))
			return false;
		if (pulpiteCronicaHiperplastica == null) {
			if (other.pulpiteCronicaHiperplastica != null)
				return false;
		} else if (!pulpiteCronicaHiperplastica
				.equals(other.pulpiteCronicaHiperplastica))
			return false;
		if (pulpotomia == null) {
			if (other.pulpotomia != null)
				return false;
		} else if (!pulpotomia.equals(other.pulpotomia))
			return false;
		if (raizCurva == null) {
			if (other.raizCurva != null)
				return false;
		} else if (!raizCurva.equals(other.raizCurva))
			return false;
		if (raizDelgada == null) {
			if (other.raizDelgada != null)
				return false;
		} else if (!raizDelgada.equals(other.raizDelgada))
			return false;
		if (reabsorcaoExtremaCervical == null) {
			if (other.reabsorcaoExtremaCervical != null)
				return false;
		} else if (!reabsorcaoExtremaCervical
				.equals(other.reabsorcaoExtremaCervical))
			return false;
		if (reabsorcaoInterna == null) {
			if (other.reabsorcaoInterna != null)
				return false;
		} else if (!reabsorcaoInterna.equals(other.reabsorcaoInterna))
			return false;
		if (restauracao == null) {
			if (other.restauracao != null)
				return false;
		} else if (!restauracao.equals(other.restauracao))
			return false;
		if (retracaoGengival == null) {
			if (other.retracaoGengival != null)
				return false;
		} else if (!retracaoGengival.equals(other.retracaoGengival))
			return false;
		if (rizogeneseIncompleta == null) {
			if (other.rizogeneseIncompleta != null)
				return false;
		} else if (!rizogeneseIncompleta.equals(other.rizogeneseIncompleta))
			return false;
		if (sobreObturacao == null) {
			if (other.sobreObturacao != null)
				return false;
		} else if (!sobreObturacao.equals(other.sobreObturacao))
			return false;
		if (sondagemGengival == null) {
			if (other.sondagemGengival != null)
				return false;
		} else if (!sondagemGengival.equals(other.sondagemGengival))
			return false;
		if (testesSensibilidadePulparUtilizado == null) {
			if (other.testesSensibilidadePulparUtilizado != null)
				return false;
		} else if (!testesSensibilidadePulparUtilizado
				.equals(other.testesSensibilidadePulparUtilizado))
			return false;
		if (tratamentoIndicato == null) {
			if (other.tratamentoIndicato != null)
				return false;
		} else if (!tratamentoIndicato.equals(other.tratamentoIndicato))
			return false;
		if (traumaOclusal == null) {
			if (other.traumaOclusal != null)
				return false;
		} else if (!traumaOclusal.equals(other.traumaOclusal))
			return false;
		return true;
	}

	
	
	
}
