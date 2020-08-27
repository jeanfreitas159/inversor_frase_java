import java.util.Scanner;

public class inversor {

	public static void main(String[] args) {
		 System.out.print("Bem vindo ao inversor de frases, ");
		 System.out.print("Digite uma frase :  ");
		
		Scanner leitor = new Scanner(System.in);
	    String palavra = leitor.nextLine();
	    String palavrainvertida = "";
	    for(int i = palavra.length() -1; i >=0; i--) {
	    	palavrainvertida = palavrainvertida + Character.toString(palavra.charAt(i));
	    }
	    System.out.print("A Frase invertida é : ");
	    System.out.println(palavrainvertida);
	    }

	}
