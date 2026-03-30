// Moara Lima Souza e Catherine Gomes
package catherine;

import java.util.Scanner;

public class Exercício6 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		float valorCompra, valorDesconto; 
		
		System.out.print("Escreva o valor da compra:"); valorCompra = teclado.nextFloat();
		
		valorDesconto = valorCompra * 0.1f;
		
		if(valorCompra > 500.00) {
			System.out.print("O valor total será de " + (valorCompra - valorDesconto) + " reais e o valor do desconto será de " + valorDesconto + " reais");
		}else {
			System.out.println("O valor total será de " + valorCompra + " e não terá desconto");
		}
		teclado.close();
	}

}
