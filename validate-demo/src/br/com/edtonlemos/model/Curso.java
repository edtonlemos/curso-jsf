package br.com.edtonlemos.model;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;
import javax.xml.bind.ValidationException;

@ManagedBean
public class Curso {

	private String Nome;
	private String codigo;

	public Curso() {

	}

	public void validarCodigoCurso(FacesContext context, 
								   UIComponent component, 
								   Object value)
			throws ValidationException {

		if (value == null)
			return;

		String data = value.toString();

		if (!data.startsWith("LUV")) {
			FacesMessage message = new FacesMessage("Código do curso precisa começar com LUV");
			throw new ValidatorException(message);
		}
	}

	// Getters and Setters
	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

}
