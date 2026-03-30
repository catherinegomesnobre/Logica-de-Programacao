package catherine;

import java.util.Scanner;

public class Aula02Exercício2 {

	public static void main(String[] args) {
		
		int centigrados, fahrenheit; 	
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Qual a temperatura em centígrados? "); centigrados = teclado.nextInt();
		
		fahrenheit=((9*centigrados)+160)/5;
		
		System.out.println("A temperatura em Fahrenheit é: " + fahrenheit);
		
		teclado.close();
	}

}
