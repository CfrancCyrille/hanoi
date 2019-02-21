package cfranc.hanoi;

import static org.junit.Assert.*;

import org.junit.Test;

public class DisqueTest {

	@Test
	public void testCompareTo_LesserThan_Negativ() {
		Disque petit = new Disque(1);
		Disque moyen = new Disque(2);
		Disque grand = new Disque(3);
		assertEquals(-1, petit.compareTo(moyen));
		assertEquals(-1, moyen.compareTo(grand));
		//TODO : à compléter
	}
	
	@Test
	public void testCompareTo_GreaterThan_Positiv() {
		Disque petit = new Disque(1);
		Disque moyen = new Disque(2);
		Disque grand = new Disque(3);
		assertEquals(1, grand.compareTo(moyen));
		assertEquals(1, moyen.compareTo(petit));
		//TODO : à compléter
	}

}
