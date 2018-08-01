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

	public void determineWhoWins(){
		//declare a winner
		Player winner = null;
		//for each player
		for (Player player:	this.gamePlayers		) {
			if (winner == null){
				winner = player;
			}
			if (didFirstOneWin(player , winner)){
				winner = player;
			}

		}
		//decide if they are the winner
	}

	public boolean didFirstOneWin(ArrayList<Card> hand1, ArrayList<Card> hand2){
		Card card1 = hand1.get(0);
		Card card2 = hand2.get(0);

		return card1.isStrongerThan(card2);
	}




}
