import javafx.application.Application;
import javafx.stage.Stage;

public class SumArray extends Application {
	
	public void start(Stage stage) {
		
		Integer[] array = {1,2,3,4,5,6,7,8,9,10};
		
		int total = 0;
		
		// adiciona a cada soma ao valor total
		for(int i=0; i<array.length; i++)
			total = total + array[i];
		
		System.out.printf("Soma dos valores contidos no array %d\n",total);
	}
	
	public static void main(String[]args) {
		launch(args);
	}
}