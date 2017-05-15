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
	
	private String numeroDente;
	private String loginPacien;
	private String dataEndodon;
	private String presencaDor;
	private String sondagemGen;
	private String grauMobilid;
	private String exposicaoCl;
	private String retracaoGen;
	private String dorPerussao;
	private String dorPercussa;
	private String dorPalpacao;
	private String testesSensi;
	private String edemiaIntra;
	private String esemiaExtra;
	private String carie;
	private String corCoroaAlt;
	private String coroaProtet;
	private String exposicaoPu;
	private String fistula;
	private String fraturaCoro;
	private String luxacaoDent;
	private String restauracao;
	private String outrosSinaiCli;
	private String carieCoroa;
	private String carieRaiz;
	private String calcificaca;
	private String noduloPulpa;
	private String canaisObtur;
	private String sobreObtura;
	private String instrumento;
	private String espessamenAPIC;
	private String espessament;
	private String nucleoMetal;
	private String perficacaoR;
	private String pulpotomia;
	private String lesaoPeriod;
	private String lesaoPeriaLATE;
	private String hipercremen;
	private String reabsorcaoE;
	private String reabsorcaoI;
	private String lesaoFurca;
	private String raizCurva;
	private String raizDelgada;
	private String rizogeneseI;
	private String densidadeDe;
	private String fraturaRaiz;
	private String outrosSinai;
	private String polpaNormal;
	private String pulpiteAguREVER;
	private String pulpiteAgud;
	private String pulpiteCron;
	private String necrosePulp;
	private String pericementi;
	private String abcessoDINI;
	private String abcessoDenEVOt;
	private String abcessoDent;
	private String lesaoPeriapCIRCUN;
	private String lesaoPeriap;
	private String lesaoEndoPe;
	private String tratamentoI;
	private String traumaOclusal;

	
	
	public int getCodigoEndodontia() {
		return codigoEndodontia;
	}
	public void setCodigoEndodontia(int codigoEndodontia) {
		this.codigoEndodontia = codigoEndodontia;
	}
	public String getNumeroDente() {
		return numeroDente;
	}
	public void setNumeroDente(String numeroDente) {
		this.numeroDente = numeroDente;
	}
	public String getLoginPacien() {
		return loginPacien;
	}
	public void setLoginPacien(String loginPacien) {
		this.loginPacien = loginPacien;
	}
	public String getDataEndodon() {
		return dataEndodon;
	}
	public void setDataEndodon(String dataEndodon) {
		this.dataEndodon = dataEndodon;
	}
	public String getPresencaDor() {
		return presencaDor;
	}
	public void setPresencaDor(String presencaDor) {
		this.presencaDor = presencaDor;
	}
	public String getSondagemGen() {
		return sondagemGen;
	}
	public void setSondagemGen(String sondagemGen) {
		this.sondagemGen = sondagemGen;
	}
	public String getGrauMobilid() {
		return grauMobilid;
	}
	public void setGrauMobilid(String grauMobilid) {
		this.grauMobilid = grauMobilid;
	}
	public String getExposicaoCl() {
		return exposicaoCl;
	}
	public void setExposicaoCl(String exposicaoCl) {
		this.exposicaoCl = exposicaoCl;
	}
	public String getRetracaoGen() {
		return retracaoGen;
	}
	public void setRetracaoGen(String retracaoGen) {
		this.retracaoGen = retracaoGen;
	}
	public String getDorPerussao() {
		return dorPerussao;
	}
	public void setDorPerussao(String dorPerussao) {
		this.dorPerussao = dorPerussao;
	}
	public String getDorPercussa() {
		return dorPercussa;
	}
	public void setDorPercussa(String dorPercussa) {
		this.dorPercussa = dorPercussa;
	}
	public String getDorPalpacao() {
		return dorPalpacao;
	}
	public void setDorPalpacao(String dorPalpacao) {
		this.dorPalpacao = dorPalpacao;
	}
	public String getTestesSensi() {
		return testesSensi;
	}
	public void setTestesSensi(String testesSensi) {
		this.testesSensi = testesSensi;
	}
	public String getEdemiaIntra() {
		return edemiaIntra;
	}
	public void setEdemiaIntra(String edemiaIntra) {
		this.edemiaIntra = edemiaIntra;
	}
	public String getEsemiaExtra() {
		return esemiaExtra;
	}
	public void setEsemiaExtra(String esemiaExtra) {
		this.esemiaExtra = esemiaExtra;
	}
	public String getCarie() {
		return carie;
	}
	public void setCarie(String carie) {
		this.carie = carie;
	}
	public String getCorCoroaAlt() {
		return corCoroaAlt;
	}
	public void setCorCoroaAlt(String corCoroaAlt) {
		this.corCoroaAlt = corCoroaAlt;
	}
	public String getCoroaProtet() {
		return coroaProtet;
	}
	public void setCoroaProtet(String coroaProtet) {
		this.coroaProtet = coroaProtet;
	}
	public String getExposicaoPu() {
		return exposicaoPu;
	}
	public void setExposicaoPu(String exposicaoPu) {
		this.exposicaoPu = exposicaoPu;
	}
	public String getFistula() {
		return fistula;
	}
	public void setFistula(String fistula) {
		this.fistula = fistula;
	}
	public String getFraturaCoro() {
		return fraturaCoro;
	}
	public void setFraturaCoro(String fraturaCoro) {
		this.fraturaCoro = fraturaCoro;
	}
	public String getLuxacaoDent() {
		return luxacaoDent;
	}
	public void setLuxacaoDent(String luxacaoDent) {
		this.luxacaoDent = luxacaoDent;
	}
	public String getRestauracao() {
		return restauracao;
	}
	public void setRestauracao(String restauracao) {
		this.restauracao = restauracao;
	}

	public String getOutrosSinaiCli() {
		return outrosSinaiCli;
	}
	public void setOutrosSinaiCli(String outrosSinaiCli) {
		this.outrosSinaiCli = outrosSinaiCli;
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
	public String getCalcificaca() {
		return calcificaca;
	}
	public void setCalcificaca(String calcificaca) {
		this.calcificaca = calcificaca;
	}
	public String getNoduloPulpa() {
		return noduloPulpa;
	}
	public void setNoduloPulpa(String noduloPulpa) {
		this.noduloPulpa = noduloPulpa;
	}
	public String getCanaisObtur() {
		return canaisObtur;
	}
	public void setCanaisObtur(String canaisObtur) {
		this.canaisObtur = canaisObtur;
	}
	public String getSobreObtura() {
		return sobreObtura;
	}
	public void setSobreObtura(String sobreObtura) {
		this.sobreObtura = sobreObtura;
	}
	public String getInstrumento() {
		return instrumento;
	}
	public void setInstrumento(String instrumento) {
		this.instrumento = instrumento;
	}
	public String getEspessamenAPIC() {
		return espessamenAPIC;
	}
	public void setEspessamenAPIC(String espessamenAPIC) {
		this.espessamenAPIC = espessamenAPIC;
	}
	public String getEspessament() {
		return espessament;
	}
	public void setEspessament(String espessament) {
		this.espessament = espessament;
	}
	public String getNucleoMetal() {
		return nucleoMetal;
	}
	public void setNucleoMetal(String nucleoMetal) {
		this.nucleoMetal = nucleoMetal;
	}
	public String getPerficacaoR() {
		return perficacaoR;
	}
	public void setPerficacaoR(String perficacaoR) {
		this.perficacaoR = perficacaoR;
	}
	public String getPulpotomia() {
		return pulpotomia;
	}
	public void setPulpotomia(String pulpotomia) {
		this.pulpotomia = pulpotomia;
	}
	public String getLesaoPeriod() {
		return lesaoPeriod;
	}
	public void setLesaoPeriod(String lesaoPeriod) {
		this.lesaoPeriod = lesaoPeriod;
	}
	public String getLesaoPeriaLATE() {
		return lesaoPeriaLATE;
	}
	public void setLesaoPeriaLATE(String lesaoPeriaLATE) {
		this.lesaoPeriaLATE = lesaoPeriaLATE;
	}
	public String getHipercremen() {
		return hipercremen;
	}
	public void setHipercremen(String hipercremen) {
		this.hipercremen = hipercremen;
	}
	public String getReabsorcaoE() {
		return reabsorcaoE;
	}
	public void setReabsorcaoE(String reabsorcaoE) {
		this.reabsorcaoE = reabsorcaoE;
	}
	public String getReabsorcaoI() {
		return reabsorcaoI;
	}
	public void setReabsorcaoI(String reabsorcaoI) {
		this.reabsorcaoI = reabsorcaoI;
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
	public String getRizogeneseI() {
		return rizogeneseI;
	}
	public void setRizogeneseI(String rizogeneseI) {
		this.rizogeneseI = rizogeneseI;
	}
	public String getDensidadeDe() {
		return densidadeDe;
	}
	public void setDensidadeDe(String densidadeDe) {
		this.densidadeDe = densidadeDe;
	}
	public String getFraturaRaiz() {
		return fraturaRaiz;
	}
	public void setFraturaRaiz(String fraturaRaiz) {
		this.fraturaRaiz = fraturaRaiz;
	}
	public String getOutrosSinai() {
		return outrosSinai;
	}
	public void setOutrosSinai(String outrosSinai) {
		this.outrosSinai = outrosSinai;
	}
	public String getPolpaNormal() {
		return polpaNormal;
	}
	public void setPolpaNormal(String polpaNormal) {
		this.polpaNormal = polpaNormal;
	}
	public String getPulpiteAguREVER() {
		return pulpiteAguREVER;
	}
	public void setPulpiteAguREVER(String pulpiteAguREVER) {
		this.pulpiteAguREVER = pulpiteAguREVER;
	}
	public String getPulpiteAgud() {
		return pulpiteAgud;
	}
	public void setPulpiteAgud(String pulpiteAgud) {
		this.pulpiteAgud = pulpiteAgud;
	}
	public String getPulpiteCron() {
		return pulpiteCron;
	}
	public void setPulpiteCron(String pulpiteCron) {
		this.pulpiteCron = pulpiteCron;
	}
	public String getNecrosePulp() {
		return necrosePulp;
	}
	public void setNecrosePulp(String necrosePulp) {
		this.necrosePulp = necrosePulp;
	}
	public String getPericementi() {
		return pericementi;
	}
	public void setPericementi(String pericementi) {
		this.pericementi = pericementi;
	}
	public String getAbcessoDINI() {
		return abcessoDINI;
	}
	public void setAbcessoDINI(String abcessoDINI) {
		this.abcessoDINI = abcessoDINI;
	}
	public String getAbcessoDenEVOt() {
		return abcessoDenEVOt;
	}
	public void setAbcessoDenEVOt(String abcessoDenEVOt) {
		this.abcessoDenEVOt = abcessoDenEVOt;
	}
	public String getAbcessoDent() {
		return abcessoDent;
	}
	public void setAbcessoDent(String abcessoDent) {
		this.abcessoDent = abcessoDent;
	}
	public String getLesaoPeriapCIRCUN() {
		return lesaoPeriapCIRCUN;
	}
	public void setLesaoPeriapCIRCUN(String lesaoPeriapCIRCUN) {
		this.lesaoPeriapCIRCUN = lesaoPeriapCIRCUN;
	}
	public String getLesaoPeriap() {
		return lesaoPeriap;
	}
	public void setLesaoPeriap(String lesaoPeriap) {
		this.lesaoPeriap = lesaoPeriap;
	}
	public String getLesaoEndoPe() {
		return lesaoEndoPe;
	}
	public void setLesaoEndoPe(String lesaoEndoPe) {
		this.lesaoEndoPe = lesaoEndoPe;
	}
	public String getTratamentoI() {
		return tratamentoI;
	}
	public void setTratamentoI(String tratamentoI) {
		this.tratamentoI = tratamentoI;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public void setTraumaOclusal(String traumaOclusal) {
		this.traumaOclusal = traumaOclusal;
	}
	public String getTraumaOclusal() {
		return traumaOclusal;
	}

	

	
	
	
	
}
