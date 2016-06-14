package main.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import main.java.battleShip;

public class TestBattleShip {
	
	private battleShip bs = new battleShip();

	@Before
	public void setUp() throws Exception {
		bs.initBoard(bs.board);
		bs.initShips(bs.ships);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		
		// ensure that three ships were set on the game board
		assertEquals(3, bs.ships.length);
				
		// test to see if a hit works or not
		bs.shoot[0] = bs.ships[0][0];
		bs.shoot[1] = bs.ships[0][1];
		bs.attempts++;
		Assert.assertEquals(true, bs.hit(bs.shoot, bs.ships));
		
		// The last test should have passed so now we should be able to check the value of hit shots
		Assert.assertEquals(1, bs.shotHit);
		
		// Test the number of attempts as well
		Assert.assertEquals(1, bs.attempts);
	}

}
