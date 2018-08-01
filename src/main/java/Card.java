public class Card {

	private SuitType suit;
	private NumberType number;

	public Card(SuitType suit, NumberType number){
		this.suit = suit;
		this.number = number;
	}

	public SuitType getSuit(){
		return this.suit;
	}

	public NumberType getNumber(){
		return this.number;
	}

	public boolean isStrongerThan(Card cardToCompareTo){
		Boolean flag;
		if ( this.number.getValue() > cardToCompareTo.number.getValue()){
			flag = true;
		}else if ( this.number.getValue() == cardToCompareTo.number.getValue()) {
//		suit logic
			flag = isStrongerSuit(cardToCompareTo);
		}else{
			flag = false;
		}
		return flag;

	}


	public boolean isStrongerSuit(Card cardToCompareTo){
		if (this.suit.getValue() > cardToCompareTo.suit.getValue()){
			return true;
		} else {
			return false;
		}
	}

}
