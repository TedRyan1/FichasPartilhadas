package Ficha3;

import java.util.ArrayList;
import java.util.List;

import ExercioInvent.Trabalhador;



public class Banco {
	String nomeBanco;
	private List<ContaBancaria> conta;
	private List<Casa> casa; // faz uma lista das casas da classe casa
	
	
	
	
	//Construtores
	
	
	
public Banco(String nomeBanco) {
		
		this.nomeBanco = nomeBanco;
		this.conta =  new ArrayList<ContaBancaria>(100);
		
	}
//Métodos

public void adicionaCasas (Casa casaSum){
	casa.add(casaSum);
}

public void adiconaContas(ContaBancaria conta1){ // passar o array que está nos atributos para poder  adicionar contas
	conta.add(conta1);
}


public void removeCasas (String morada){
	for(Casa casaTotal: casa){
		if(morada.equals(casaTotal.getMorada())){
			casa.remove(casaTotal);
		}
	}
	
	
}

public double getLucroPrevisto(){
	double lucroTotal = 0.0;
	
	for(Casa casaTotal: casa){// for each: for(nomeClasse, nome variavel: nome da lista);
		lucroTotal+= casaTotal.getPercentagemMargemLucro();
	}
	return lucroTotal;
}


public ContaBancaria getConta (String oTitular){
	ContaBancaria contaBan = null;
	for(ContaBancaria contasLoop: conta){
		
		if(contasLoop.getTitular().equals(oTitular)){
			contaBan = contasLoop;
			
		}
			
	}
	return contaBan;
}

//Getters e Setters
public String getNomeBanco() {
		return nomeBanco;
	}


	public void setNomeBanco(String nomeBanco) {
		this.nomeBanco = nomeBanco;
	}


	public List<ContaBancaria> getConta() {
		return conta;
	}


	public void setConta(List<ContaBancaria> conta) {
		this.conta = conta;
	}
	
	
	
	

}
