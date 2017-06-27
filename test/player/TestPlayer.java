package player;

import static org.junit.Assert.*;

import org.junit.Test;

import Pokemon.Pokemon;

public class TestPlayer
{

	/**
	 * Test constructor
	 */
	@Test
	public void testConstruct() 
	{
		Player pl = new Player();
		assertNotNull(pl);
	}
	
	/**
	 * test add pokemon
	 */
	@Test
	public void testAdd()
	{
		Pokemon pk = new Pokemon("p",100);
		Pokemon pk2 = new Pokemon("p2",100);
		Player pl = new Player();
		pl.addPokemon(pk);
		
		assertEquals("p",pk.getName());
		pl.addPokemon(pk2);
		assertEquals("p2",pk2.getName());	
	}
	
	@Test
	public void testChange()
	{
		Pokemon pk;
		Pokemon pk2 = new Pokemon("p2",100);
		
		Player pl = new Player();
		assertNull(pl.getActive());
		
		pk = pl.getActive();
		
		pl.changeActive(pk2);
		assertNotNull(pl.getActive());	
	}

}
