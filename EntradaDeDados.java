package oi;

import java.util.Scanner;

public class EntradaDeDados {

	public static void main(String[] args) {
		int anos, meses, dias, idade;
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Informe quantos anos você tem: ");  anos = teclado.nextInt(); 
		System.out.print("Informe quantos meses você tem: "); meses = teclado.nextInt();
		System.out.print("Informe quantos dias você tem: ");  dias = teclado.nextInt();
		
		idade = (anos * 365) + (meses * 30) + dias;
		teclado.close();
		
		System.out.println("Você viveu " + idade + " dias");
		
		
	} 
	

}
