package gameworld;

import static org.junit.Assert.*;

import java.awt.GridLayout;
import java.io.IOException;

import javax.swing.JLabel;
import javax.swing.JPanel;

import org.junit.Before;
import org.junit.Test;

import Attack.Attack;
import Pokemon.Pokemon;
import Pokemon.PokemonFactory;
import UI.AttackPanel;
import UI.MainBattleScreen;
import UI.SwapPanel;
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
		assertTrue(test.getPlayer1ReadyStatus());
	}
	@Test
	public void testActionSetAttackP2()
	{
		GameWorld test = GameWorld.getInstance();
		Attack attk = new Attack();
		
		test.setActionPlayer2Attack(attk);
		assertEquals(1, test.getPlayer2Action());
		assertEquals(attk, test.getPlayer2Attack());
		assertTrue(test.getPlayer2ReadyStatus());
	}
	
	@Test
	public void testActionSetPlayer1Swap()
	{
		GameWorld test = GameWorld.getInstance();
		Pokemon poke = new Pokemon("Missingno", 10);
		
		test.setActionPlayer1Swap(poke);
		assertEquals(2,  test.getPlayer1Action());
		assertEquals(poke, test.getPlayer1Pokemon());
		assertTrue(test.getPlayer1ReadyStatus());
	}
	@Test
	public void testActionSetPlayer2Swap()
	{
		GameWorld test = GameWorld.getInstance();
		Pokemon poke = new Pokemon("Missingno", 10);
		
		test.setActionPlayer2Swap(poke);
		assertEquals(2,  test.getPlayer2Action());
		assertEquals(poke, test.getPlayer2Pokemon());
		assertTrue(test.getPlayer2ReadyStatus());
	}
	
	@Test
	public void testCommenceTurn() throws IOException
	{
		GameWorld test = GameWorld.getInstance();
		PokemonFactory pf = new PokemonFactory();
		Player p1 = new Player();
		Player p2 = new Player();
		p1.addPokemon(pf.getBlastoise());
		p1.addPokemon(pf.getBulbasaur());
		p1.addPokemon(pf.getCaterpie());
		p2.addPokemon(pf.getCharmander());
		p2.addPokemon(pf.getVenuSaur());
		p2.addPokemon(pf.getVulpix());
		MainBattleScreen mbs = new MainBattleScreen();
		SwapPanel spp1 = new SwapPanel(p1);
		SwapPanel spp2 = new SwapPanel(p2);
		AttackPanel atp1 = new AttackPanel(p1);
		AttackPanel atp2 = new AttackPanel(p2);
		JPanel bp1 = new JPanel(new GridLayout(1,1));
		JPanel bp2 = new JPanel(new GridLayout(1,1));
		bp2.add(new JLabel("bp2"));
		bp2.add(new JLabel("bp1"));
		mbs.initialize(bp1, bp2, spp1.getPanel(), spp2.getPanel(), atp1.getPanel(), atp2.getPanel());
		
		test.setActionPlayer1Attack(p1.getPokemon(0).getAttack(0));
		test.setActionPlayer2Attack(p2.getPokemon(0).getAttack(0));
		test.checkStartTurn();
		assertEquals(10,p2.getPokemon(0).getCurrentHP());
		assertEquals(300, p2.getPokemon(0).getCurrentHP());
		assertFalse(test.getPlayer1ReadyStatus());
		assertFalse(test.getPlayer2ReadyStatus());
	}
}