import java.util.Arrays;
import java.util.Scanner;

public class Exercicio07 {
	
	public static void main(String[]args) {
		
		Scanner s = new Scanner(System.in);
		int tamanhoVetor = 5;
		int[] array = new int[tamanhoVetor];
		boolean duplicata;
		int counter = 1;
		
		while (counter<=tamanhoVetor) {

			duplicata = false;

			System.out.println("Digite o número " + counter + ":");
			int temp = s.nextInt();
			
			if(temp >=10 && temp<=100 ) {
			
				for (int i=0; i<=counter-2; i++){ 
				
					if (temp==array[i]) { 
						duplicata = true;
						break;
					}
				}

				if (duplicata){
					System.out.println("Este número ja está neste vetor!");
				}
				else{
					array[counter-1] = temp;
					counter++;
				}
			}
			else {
				System.out.println("Digite números >= 10 ou <= 100 ");
			}
		}
		/*for(int i:array)
			System.out.printf(" "+i);
		*/
		System.out.println(Arrays.toString(array));
	}
}