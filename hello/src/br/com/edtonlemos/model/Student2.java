package br.com.edtonlemos.model;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Student2 {
	
	private String firstName;
	private String lastName;
	private String country;
	private String tipo;
	private String language;
	private List<String> tipoMatricula;
	private String[] listaIDE;
	
	public Student2() {
		popularMatriculas();
	}

	private void popularMatriculas() {
		tipoMatricula = new ArrayList<>();
		tipoMatricula.add("Bolsista");
		tipoMatricula.add("Aluno Especial");
		tipoMatricula.add("Privado");
		tipoMatricula.add("Regular");
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public List<String> getTipoMatricula() {
		return tipoMatricula;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getLanguage() {
		return this.language == null ? "Java" : language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String[] getListaIDE() {
		return listaIDE;
	}

	public void setListaIDE(String[] listaIDE) {
		this.listaIDE = listaIDE;
	}
	
	
	
	
}
