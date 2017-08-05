import javafx.stage.Stage;
import javafx.application.Application;

public class InitArray extends Application {
	
	public void start(Stage stage) {
		Integer[] array;
		array = new Integer[10];
		
		System.out.printf("%s%8s","Index","Value\n");
		
		for(int i=0; i<array.length; i++)
			System.out.printf("%5d%8d\n", i, array[i]);
	}
	
	public static void main(String[]args) {
		launch(args);
	}
}