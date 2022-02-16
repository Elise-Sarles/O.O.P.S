package stockproject;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SMCheck {

	@Test
	void testMainmenu() {
		assertEquals((2), 2);
		assertEquals((4), 4);
	}
	
	@Test
	void testValidact() {
		assertEquals(Marketuser.validact(2), true);
		assertEquals(Marketuser.validact(3), true);
		assertEquals(Marketuser.validact(6), false);
		assertEquals(Marketuser.validact(0), false);
		
	}
	@Test
	void testValidTrans() {
		assertEquals(Marketuser.validTrans(2), true);
		assertEquals(Marketuser.validTrans(3), true);
		assertEquals(Marketuser.validTrans(4), false);
	}
	@Test
	void testValidgame() {
		assertEquals(Marketuser.validgame(4), false);
		assertEquals(Marketuser.validgame(3), false);
		assertEquals(Marketuser.validgame(2), true);
	}
	

}
