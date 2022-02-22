package Ficha3;

public class Casa {
	private String morada;
	private double precoCusto;
	private double precoVenda;
	
	
	//Construtores
	
	public Casa(String morada) {
	
		this.morada = morada;
		
	}




	public Casa() {
		
	}


	//Métodos
	
public double getLucro(){ // nao precisa de passar parametros
	double resultado = precoVenda - precoCusto;
	return resultado;
}


public double getPercentagemMargemLucro (){
	double margem = precoVenda / precoCusto;
	return margem;
}




//Getters e Setters


public String getMorada() {
	return morada;
}




public void setMorada(String morada) {
	this.morada = morada;
}




public double getPrecoCusto() {
	return precoCusto;
}




public void setPrecoCusto(double precoCusto) {
	this.precoCusto = precoCusto;
}




public double getPrecoVenda() {
	return precoVenda;
}




public void setPrecoVenda(double precoVenda) {
	this.precoVenda = precoVenda;
}

	
	
	
	
	
	
	

	
	
	
	
	

}
