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

	@Test
	public void testGetPokemon()
	{
		Player p1 = new Player();
		Pokemon poke1 = new Pokemon("x", 10);
		Pokemon poke2 = new Pokemon("y", 10);
		Pokemon poke3 = new Pokemon("z", 10);
		assertNull(p1.getPokemon(0));
		assertNull(p1.getPokemon(-1));
		p1.addPokemon(poke1);
		p1.addPokemon(poke2);
		p1.addPokemon(poke3);
		assertEquals(poke1, p1.getPokemon(0));
		assertEquals(poke3, p1.getPokemon(2));
		assertNull(p1.getPokemon(3));
	}
}
