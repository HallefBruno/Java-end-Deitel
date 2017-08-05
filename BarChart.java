import javafx.application.Application;
import javafx.stage.Stage;

public class BarChart extends Application {
	
	public void start(Stage stage) {
		
		Integer[] array = {0,0,0,0,0,0,1,2,4,2,1};
		System.out.println("Grade distribution:");
		
		//para cada elemento do array, gera saída de barra de gráfico
		for(int i=0; i<array.length; i++) {
			//imprime rótulo de barra
			if(i == 10)
				System.out.printf("%5d",100);
			else
				System.out.printf("%02d-%02d: ",i * 10, i * 10 + 9);
			
			//imprime barra de asterisco
			for(int j=0; j<array[i]; j++)
				System.out.print("*");
			
			System.out.println();//inicia uma nova linha de saída
		}	
	}
	
	public static void main(String[]args){
		launch(args);
	}
}