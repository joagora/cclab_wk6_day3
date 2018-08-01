import java.util.ArrayList;

public class Dealer {

	private Deck deck;


	public Dealer(){
		this.deck = new Deck();
	}

	public void dealCard(Player player){
		Card cardDealt = this.deck.removeTopCard();
		//we now have to give this card to the player
		player.receiveCard(cardDealt);
	}

	public Deck getDeck(){
		return this.deck;
	}



}
