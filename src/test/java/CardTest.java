import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CardTest {

	Card aceOfSpades;
	Card nineOfSpades;
	Card kingOfClubs;
	Card nineOfClubs;
	@Before
	public void before(){

		aceOfSpades = new Card(SuitType.SPADES, NumberType.ACE);
		nineOfSpades = new Card(SuitType.SPADES, NumberType.NINE);
		kingOfClubs = new Card(SuitType.CLUBS, NumberType.KING);
		nineOfClubs = new Card(SuitType.CLUBS, NumberType.NINE);
	}

	@Test
	public void canGetSuit(){
		assertEquals(SuitType.SPADES, aceOfSpades.getSuit());
	}

	@Test
	public void canGetNumber(){
		assertEquals(NumberType.ACE, aceOfSpades.getNumber());
	}

	@Test
	public void checkIfSuitStrongerTrue(){
		assertEquals(true, aceOfSpades.isStrongerSuit(kingOfClubs));
	}

	@Test
	public void checkIfSuitStrongerFalse(){
		assertEquals(false, kingOfClubs.isStrongerSuit(nineOfSpades));
	}

	@Test
	public void checkIfStrongeSameSuitDiffNumbersFirstStronger(){
		assertEquals(true, aceOfSpades.isStrongerThan(nineOfSpades));
	}

	@Test
	public void checkIfStrongerSameSuitSecondNumberStronger(){
		assertEquals(false, nineOfSpades.isStrongerThan(aceOfSpades));
	}

	@Test
	public void checkIfStrongerSecondSuitStrongerNumSame(){
		assertEquals(false, nineOfClubs.isStrongerThan(nineOfSpades));
	}

	@Test
	public void checkIfStrongerFirstSuitStrongerNumSame(){
		assertEquals(true, nineOfSpades.isStrongerThan(nineOfClubs));
	}


}
