import java.util.ArrayList;

public class Dealer {

	private Deck deck;
	private ArrayList<Player> gamePlayers;


	public Dealer(){
		this.deck = new Deck();
		this.gamePlayers = new ArrayList<Player>();
	}

	public void dealCard(Player player){
		Card cardDealt = this.deck.removeTopCard();
		//we now have to give this card to the player
		player.receiveCard(cardDealt);
	}

	public Deck getDeck(){
		return this.deck;
	}

	public int countPlayers(){
		return this.gamePlayers.size();
	}

	public void addPlayerToGame(Player player){
		this.gamePlayers.add(player);
	}





}
