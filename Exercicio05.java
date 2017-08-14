import java.util.Random;
public class Exercicio05 {
	
	public static void main(String[]args) {
		
		Random r = new Random();
		
		int[]arrayElementos = new int[15];
		int concelho = 0;
		int pMaior = 0;
		int sMaior = 0;
		int esclarecer1 = 0;
		int esclarecer2 = 0;
		
		for(int i=0; i<arrayElementos.length; i++) {
			arrayElementos[i] = r.nextInt(99);
			for(int j=0; j<arrayElementos.length; j++){
				if(arrayElementos[i] < arrayElementos[j]){
					concelho = arrayElementos[i];
					arrayElementos[i] = arrayElementos[j];
					arrayElementos[j] = concelho;
	
				}
				//É execultado 15 x 15 = 225
				esclarecer2 = esclarecer2 + 1;
			}
			pMaior = arrayElementos[arrayElementos.length-1];
			sMaior = arrayElementos[arrayElementos.length-2];
			esclarecer1 = esclarecer1 + 1;
		}
		System.out.println(esclarecer1+" "+esclarecer2);
		for(int i: arrayElementos) {
			System.out.printf("%d%s",i,",");
		}
		System.out.println("\n");
		
	System.out.println("1 => "+pMaior+" ; "+" 2 => "+sMaior);
	}
}