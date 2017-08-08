import javafx.application.Application;
import javafx.stage.Stage;

public class DeckOfCardTest extends Application {
	
	public void start(Stage stage) {
		DeckOfCards myDeckOfCard = new DeckOfCards();
		myDeckOfCard.shuffle();//coloca cards em ordem aleatória
		//imprime todas as cartas 52 cartas na ordem em que são distribuída
		for(int i=1; i<=52; i++){
			//distribui e exibe as cartas 
			System.out.printf("%-19s",myDeckOfCard.dealCard());
			if(i%4==0)
				System.out.println();//imprime uma nova linha
		}
	}
	
	public static void main(String[]args){
		launch(args);
	}
}