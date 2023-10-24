package br.com.edtonlemos.model;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class CounterTwo {
	
	private int value = 0;

	public CounterTwo() {
	}
	
	public String increment() {
		value += 2;
		return "counter_two";
	}
	
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	
}
