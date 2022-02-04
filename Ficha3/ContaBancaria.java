package Ficha3;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ContaBancaria {
private  String titular;
private  double saldo;
private Date dataAbertura;




public ContaBancaria(String titular) {
	
	this.titular = titular;
	this.saldo = 0.0; 
	this.dataAbertura = new Date();
}


public ContaBancaria(String titular, float saldoInicial) {
	
	this.titular = titular;
	this.saldo = saldoInicial;
	this.dataAbertura = new Date();
}

public String getInformacaoConta(){
	SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy"); // https://www.javatpoint.com/java-simpledateformat Forma
	String dataForm = formatter.format(dataAbertura);
	String contaCriar = "Titular: " + titular + "Saldo " + new DecimalFormat("#,##0.00").format(saldo) + "Data: " +	dataForm;
	return contaCriar;
	
	
	
}

public void adicionarSaldo(float valorAdicionar){//metodo adicionar
	saldo = saldo + valorAdicionar;
	
}

public void levantarSaldo(double valorRetirar){
	saldo = saldo - valorRetirar;
}




public String getTitular() {
	return titular;
}





public double getSaldo() {
	return saldo;
}




public void setSaldo(double saldo) {
	this.saldo = saldo;
}




public Date getDataAbertura() {
	return dataAbertura;
}










}
