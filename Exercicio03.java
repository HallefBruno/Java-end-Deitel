import java.util.Arrays;
import java.util.Random;

public class Exercicio03 {
	
	public static void main(String[]args) {
		Random r = new Random();
		
		int[] vetor1 = new int[10];
		int[] vetor2 = new int[vetor1.length];
		int numero;
		int vrificaContador = 0;
		
		for (int i = 0; i < vetor1.length; i++){
			
			vetor1[i] = r.nextInt(10)+1;
			numero = vetor1[i];
			int contador = 0;
			int foi = 0;
			
			for(int x=1; x<=numero; x++){
				if(numero%x==0){
					contador++;
					System.out.println(contador);
				}
			}
			if(contador==2){
				foi++;
				vetor2[i] = vetor1[i];
				System.out.println("Foi");
			} 
		}

		System.out.println(Arrays.toString(vetor2));
	}
}