package Ficha3;

import java.util.ArrayList;
import java.util.List;



public class Banco {
	String nomeBanco;
	private List<ContaBancaria> conta;
	
	
	public Banco(String nomeBanco) {
		
		this.nomeBanco = nomeBanco;
		this.conta =  new ArrayList<ContaBancaria>();
		
	}
	
	
	
	

}
