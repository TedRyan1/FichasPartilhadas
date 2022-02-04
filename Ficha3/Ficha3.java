package Ficha3;

import java.io.ObjectInputStream.GetField;

public class Ficha3 {
	public static void main(String[] args) {
	ContaBancaria Tony = new ContaBancaria("Antonio Jose Almeida");
	ContaBancaria Tony2 = new ContaBancaria("Tony2", 2000); // É o segundo construtor dá para criar multiplos construtores
	
	
	Tony.adicionarSaldo(1000); // Comeca a 0 e depois podemos ir adicionando com a funcao adicionarSaldo
	Tony.levantarSaldo(30.0);
	



	
}

}
