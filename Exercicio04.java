import javafx.application.Application;
import javafx.stage.Stage;
import java.util.Random;

public class Exercicio04 extends Application {
	
	public void start(Stage stage){
		
		Random r = new Random();
		
		int[] array = new int[20];
		int[] qtdNotas = new int[6];

		for(int i=0; i<array.length; i++){
			array[i] = (r.nextInt(5)+1);
			++qtdNotas[array[i]];
		}
	
		System.out.printf("%s%10s","Quantidade","Notas\n");
		
		for(int i=1; i<qtdNotas.length; i++) {
			System.out.printf("%5d %s %5d\n",i," => ",qtdNotas[i]);
		}
		System.out.println("----------Verification-------------");
		for(int i=0; i<20; i++) {
			System.out.printf("%2d",array[i]);
			if(i % 4 == 0) 
				System.out.println();
		}
		System.exit(0);
		
	}
	
	public static void main(String[]args){
		launch(args);
	}
}