package cat;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CatTeste {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int numero;
		
		System.out.println("DIgite uma Numero");
		try {
		
		
		numero = ler.nextInt();
		}
		catch(InputMismatchException erro) {
			System.out.println("Por favor, digite números");
		}
		
		

	}

}
