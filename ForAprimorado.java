import javafx.application.Application;
import javafx.stage.Stage;

public class ForAprimorado extends Application {
	
	public void start(Stage stage) {
		
		int[]array = {87,68,94,100,83,78,85,91,72,87};
		int total = 0;
		
		for(int number : array){ //for aprimorado
			total = total + number;
			System.out.printf("%s%8d\n","Valor de number: ",number);
		}
		System.out.println();
		
		System.out.println("Valor total: "+total);
	}
	
	public static void main(String[]args){
		launch(args);
	}
}