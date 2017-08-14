import java.util.Scanner;

public class Exercicio07 {
	public static void main(String[]args) {
		
		Scanner s = new Scanner(System.in);
		int[] array = new int[5];
		boolean verifica;
		int primeiro;
		int segundo;
		int terceiro;
		
		for(int i = 0; i < array.length; i++){
			verifica = false;
			while(verifica == false) {
				System.out.println("Digite o numero");
				array[i] = s.nextInt();
				if(array[i]) {
					System.out.println( "Número inserido no array." );
					verifica = true;
				}
				else {
					System.out.println( "Número NÃO inserido no array." );
				}
			}
		}
	}
}