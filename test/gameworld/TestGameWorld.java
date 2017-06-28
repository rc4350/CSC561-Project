package gameworld;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Attack.Attack;
import Pokemon.Pokemon;
import player.Player;

public class TestGameWorld 
{
	
	@Before
	public void reset()
	{
		GameWorld.reset();
	}
	
	@Test
	public void testConstruct()
	{
		GameWorld testGameWorld;
		testGameWorld = GameWorld.getInstance();
		assertNotNull(testGameWorld);

	}
	
	@Test
	public void  testPlayers()
	{
		GameWorld test = GameWorld.getInstance();
		Player p1 = new Player();
		Player p2 = new Player();
		assertNull(test.getPlayer1());
		assertNull(test.getPlayer2());
		test.addPlayer1(p1);
		test.addPlayer2(p2);
		assertEquals(p1, test.getPlayer1());
		assertEquals(p2, test.getPlayer2());
	}
	
	@Test
	public void testPokemon()
	{
		GameWorld test = GameWorld.getInstance();
		assertNull(test.getPokemon(0));
		assertEquals(0,test.getPokemonListSize());
		Pokemon p1 = new Pokemon("'M'", 20);
		Pokemon p2 = new Pokemon("Missingno", 40);
		test.addPokemon(p1);
		test.addPokemon(p2);
		assertEquals(p1, test.getPokemon(0));
		assertEquals(p2, test.getPokemon(1));
		assertNull(test.getPokemon(-1));
		assertNull(test.getPokemon(2));
		assertEquals(2,test.getPokemonListSize());
		test.addPokemon(null);
		assertEquals(2,test.getPokemonListSize());
		
		
	}
	
	@Test
	public void testActionSetAttackP1()
	{
		GameWorld test = GameWorld.getInstance();
		Attack attk = new Attack();
		
		test.setActionPlayer1Attack(attk);
		assertEquals(1, test.getPlayer1Action());
		assertEquals(attk, test.getPlayer1Attack());
	}
	@Test
	public void testActionSetAttackP2()
	{
		GameWorld test = GameWorld.getInstance();
		Attack attk = new Attack();
		
		test.setActionPlayer2Attack(attk);
		assertEquals(1, test.getPlayer2Action());
		assertEquals(attk, test.getPlayer2Attack());
	}
	
	@Test
	public void testActionSetPlayer1Swap()
	{
		GameWorld test = GameWorld.getInstance();
		Pokemon poke = new Pokemon("Missingno", 10);
		
		test.setActionPlayer1Swap(poke);
		assertEquals(2,  test.getPlayer1Action());
		assertEquals(poke, test.getPlayer1Pokemon());
	}
	@Test
	public void testActionSetPlayer2Swap()
	{
		GameWorld test = GameWorld.getInstance();
		Pokemon poke = new Pokemon("Missingno", 10);
		
		test.setActionPlayer2Swap(poke);
		assertEquals(2,  test.getPlayer2Action());
		assertEquals(poke, test.getPlayer2Pokemon());
	}
}