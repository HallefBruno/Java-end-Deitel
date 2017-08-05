import javafx.application.Application;
import javafx.stage.Stage;

public class InitArray2 extends Application {
	
	public void start(Stage stage) {
		
		final int ARRAY_LENGTH = 10;//contante
		Integer[] array = new Integer[ARRAY_LENGTH];//cria o array
		
		//calcula o valor de cada elemento do array
		for(int i=0; i<ARRAY_LENGTH; i++)
			array[i] = 2 + 2 * i;
		
		System.out.printf("%s%8s\n","Index","Value");//títulos da coluna
		
		//gera a saída do valor de cada elemento do array
		for(int i=0; i<array.length; i++)
			System.out.printf("%5d%8d\n",i,array[i]);
		
	}
	
	public static void main(String[]args) {
		launch(args);
	}
}