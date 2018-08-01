import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CardTest {

	Card aceOfSpades;
	@Before
	public void before(){
		aceOfSpades = new Card(SuitType.SPADES, NumberType.ACE);
	}

	@Test
	public void canGetSuit(){
		assertEquals(SuitType.SPADES, aceOfSpades.getSuit());
	}

	@Test
	public void canGetNumber(){
		assertEquals(NumberType.ACE, aceOfSpades.getNumber());
	}

}
