import java.util.Random;
public class DeckOfCards {
	
	private Card[] deck; // array de objetos Card
	private int currentCard; //indice do proximo Card a ser distribuído
	private static final int NUMBER_OF_CARDS = 52;
	private static final Random randomNumbers = new Random();//gerador de numeros aleatórios
	
	//Construtor preenche o baralhos de carta
	public DeckOfCards() {
		String[]faces = {"Ace","Deuce","Three",
						 "Four","Five","Six",
						 "Seven","Eight","Nine",
						 "Ten","Jack","Queen",
						 "King"};
						 
		String[]suits = {"Hearts","Diamonds","Clubs","Spades"};
		
		deck = new Card[NUMBER_OF_CARDS];//Cria array de objetos Card
		currentCard = 0;//Configura currentCard então o primeiro Card distribuído é deck[0]
		
		//Preenche o baralho com objetos Card
		for(int cout=0; cout<deck.length; cout++) {
			deck[cout] = new Card(faces[cout % 13],suits[cout / 13]);
		}
	}//Fim do construtor
	
	//Embaralha as cartas com um algoritmo de uma passagem
	public void shuffle() {
		currentCard = 0;//Reinicializa current card
		
		//Para cada Card, Seleciona outro Card aleatório e os compara
		for(int first=0; first<deck.length; first++) {
			
			//Seleciona um numero aleatório entre 0 e 51
			int second = randomNumbers.nextInt(NUMBER_OF_CARDS);
			
			//compara card atual com Card aleatóriomente selecionado
			Card temp = deck[first];
			deck[first] = deck[second];
			deck[second] = temp;
		}//fim for
	}//fim shuffle
	
	//Distribui um card
	public Card dealCard() {
		//determina se ainda há card a serem distribuidos
		if(currentCard < deck.length)
			return deck[currentCard++];//retorna card atual no array
		else
			return null;
	}
}