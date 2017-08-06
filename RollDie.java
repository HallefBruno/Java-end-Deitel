import java.util.Random;
import javafx.application.Application;
import javafx.stage.Stage;

public class RollDie extends Application {
	
    public void start(Stage stage) {
		
        Random r = new Random();
        int[] array = new int[8];
        for (int i = 1; i <= 6000; i++) 
            array[1 + r.nextInt(6)] = array[1 + r.nextInt(6)] + 1;
        
        for(int j=1; j<= array[j]; j++)
            System.out.printf("%5d%10d\n",j,array[j]);
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}