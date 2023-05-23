package br.com.Gabriel.hrpayroll.entities;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Payment implements Serializable{

	
	private static final long serialVersionUID = 1L;
	
	private String name;
	private Double dailyIncome;
	private Integer days; //INTEGER POIS NÃO QUEREMOS QUE ELE ASSUMA UM VALOR PADRÃO
	
	public Payment() {
		// TODO Auto-generated constructor stub
	}

	public Payment(String name, Double dailyIncome, Integer days) {
		super();
		this.name = name;
		this.dailyIncome = dailyIncome;
		this.days = days;
	}
	
	public double getTotal() {
		return dailyIncome * days;
	}
	
	
	
	
}
