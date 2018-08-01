public class Dealer {

	private Deck deck;


	public Dealer(){
		this.deck = new Deck();
	}

	public void dealCard(){
		Card cardDealt = this.deck.removeTopCard();
		//we now have to give this card to the player

	}

	public Deck getDeck(){
		return this.deck;
	}



}
