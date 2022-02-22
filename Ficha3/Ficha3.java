package Ficha3;

import java.io.ObjectInputStream.GetField;

public class Ficha3 {
	public static void main(String[] args) {
	ContaBancaria Tony = new ContaBancaria("Antonio Jose Almeida");
	ContaBancaria Tony2 = new ContaBancaria("Tony2", 2000); // É o segundo construtor dá para criar multiplos construtores
	
	
	Tony.adicionarSaldo(1000); // Comeca a 0 e depois podemos ir adicionando com a funcao adicionarSaldo
	Tony.levantarSaldo(30.0);
	
Tony.adicionarSaldo(1000);
System.out.println(Tony.getSaldo());

Casa casa1 = new Casa("Rua do sol");
Casa casa2 = new Casa("Rua da escola");
Casa casa3 = new Casa("Rua da ribeira");






	
}

}
