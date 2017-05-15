package model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AnamneseClinica implements Serializable {

	/**
	 * TEla editarAnamneseClinica
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	private int codigoAnamneseClinica;
	
	private String dataUltimaConsulta;
	private boolean dorDente;
	private boolean problemasExtrairDente;
	private boolean gengivaSangraMuito;
	private boolean dificuldadeAbrirOuFecharBoca;
	private boolean barulhoAbrirBoca;
	private boolean doresFace;
	private boolean possuiProtese;

	
	public String getDataUltimaConsulta() {
		return dataUltimaConsulta;
	}
	public void setDataUltimaConsulta(String dataUltimaConsulta) {
		this.dataUltimaConsulta = dataUltimaConsulta;
	}
	public boolean isDorDente() {
		return dorDente;
	}
	public void setDorDente(boolean dorDente) {
		this.dorDente = dorDente;
	}
	public boolean isProblemasExtrairDente() {
		return problemasExtrairDente;
	}
	public void setProblemasExtrairDente(boolean problemasExtrairDente) {
		this.problemasExtrairDente = problemasExtrairDente;
	}
	public boolean isGengivaSangraMuito() {
		return gengivaSangraMuito;
	}
	public void setGengivaSangraMuito(boolean gengivaSangraMuito) {
		this.gengivaSangraMuito = gengivaSangraMuito;
	}
	public boolean isDificuldadeAbrirOuFecharBoca() {
		return dificuldadeAbrirOuFecharBoca;
	}
	public void setDificuldadeAbrirOuFecharBoca(boolean dificuldadeAbrirOuFecharBoca) {
		this.dificuldadeAbrirOuFecharBoca = dificuldadeAbrirOuFecharBoca;
	}
	public boolean isBarulhoAbrirBoca() {
		return barulhoAbrirBoca;
	}
	public void setBarulhoAbrirBoca(boolean barulhoAbrirBoca) {
		this.barulhoAbrirBoca = barulhoAbrirBoca;
	}
	public boolean isDoresFace() {
		return doresFace;
	}
	public void setDoresFace(boolean doresFace) {
		this.doresFace = doresFace;
	}
	public boolean isPossuiProtese() {
		return possuiProtese;
	}
	public void setPossuiProtese(boolean possuiProtese) {
		this.possuiProtese = possuiProtese;
	}
	
	public int getCodigoAnamneseClinica() {
		return codigoAnamneseClinica;
	}


}
