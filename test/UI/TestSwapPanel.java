package UI;

import static org.junit.Assert.*;

import java.awt.GridLayout;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import org.junit.Test;

import Pokemon.Pokemon;
import Pokemon.PokemonFactory;
import player.Player;

public class TestSwapPanel
{

	@Test
	public void testConstruct()
	{
		SwapPanel swap = new SwapPanel();
		assertNotNull(swap);
		assertTrue(swap.getPanel() instanceof JPanel);
	}
	
	@Test
	public void testLook() throws IOException
	{
		Player p1 = new Player();
		PokemonFactory pf = new PokemonFactory();
		p1.addPokemon(pf.getBlastoise());
		p1.addPokemon(pf.getCharizard());
		p1.addPokemon(pf.getVenuSaur());
		
		SwapPanel swap = new SwapPanel(p1);
		TestFrame frame = new TestFrame();
		frame.setSize(640, 480);
		frame.setSwap1(swap.getPanel());
		frame.setSwap2(new JPanel());
		frame.addPanel();
		frame.visable();
		assertEquals(JOptionPane.YES_OPTION, JOptionPane.showConfirmDialog(null, "Does left Panel look correct?"));
		
	}
	@Test
	public void testLookTwoPlayer() throws IOException
	{
		Player p1 = new Player();
		Player p2 = new Player();
		
		PokemonFactory pf = new PokemonFactory();
		Pokemon hpPoke = pf.getPoliwag();
		hpPoke.setCurrentHP(0);
		p1.addPokemon(pf.getBlastoise());
		p1.addPokemon(pf.getCharizard());
		p1.addPokemon(pf.getVenuSaur());
		p2.addPokemon(pf.getCaterpie());
		p2.addPokemon(pf.getVulpix());
		p2.addPokemon(hpPoke);
		
		
		
		SwapPanel swap1 = new SwapPanel(p1);
		SwapPanel swap2 = new SwapPanel(p2);
		TestFrame frame = new TestFrame();
		frame.setSize(640, 480);
		frame.setSwap1(swap1.getPanel());
		frame.setSwap2(swap2.getPanel());
		frame.addPanel();
		frame.visable();
		assertEquals(JOptionPane.YES_OPTION, JOptionPane.showConfirmDialog(null, "Does left Panel look correct?"));
	}
	
	@Test
	public void testSetSelected() throws IOException
	{
		Player p1 = new Player();
		PokemonFactory pf = new PokemonFactory();
		p1.addPokemon(pf.getBlastoise());
		p1.addPokemon(pf.getCharizard());
		p1.addPokemon(pf.getVenuSaur());
		
		SwapPanel swap1 = new SwapPanel(p1);
		swap1.setSelected(p1.getPokemon(2));
		assertEquals(p1.getPokemon(2), swap1.getSelected());
	}
	@Test
	public void testGetPlayer() throws IOException
	{
		Player p1 = new Player();
		PokemonFactory pf = new PokemonFactory();
		p1.addPokemon(pf.getBlastoise());
		p1.addPokemon(pf.getCharizard());
		p1.addPokemon(pf.getVenuSaur());
		SwapPanel swap1 = new SwapPanel(p1);
		assertEquals(p1, swap1.getPlayer());
	}
	
	@Test
	public void testEnableInitial() throws IOException
	{
		Player p1 = new Player();
		PokemonFactory pf = new PokemonFactory();
		p1.addPokemon(pf.getBlastoise());
		p1.addPokemon(pf.getCharizard());
		p1.addPokemon(pf.getVenuSaur());
		p1.changeActive(p1.getPokemon(0));
		SwapPanel swap1 = new SwapPanel(p1);
		
		swap1.setEnablesInitial();
		assertTrue(swap1.backButton.isEnabled());
		assertFalse(swap1.confirmButton.isEnabled());
		assertFalse(swap1.pokemonButton[0].isEnabled());
		assertTrue(swap1.pokemonButton[1].isEnabled());
		assertTrue(swap1.pokemonButton[2].isEnabled());
		
		p1.changeActive(p1.getPokemon(2));
		swap1.setEnablesInitial();
		assertTrue(swap1.backButton.isEnabled());
		assertFalse(swap1.confirmButton.isEnabled());
		assertFalse(swap1.pokemonButton[2].isEnabled());
		assertTrue(swap1.pokemonButton[1].isEnabled());
		assertTrue(swap1.pokemonButton[0].isEnabled());
	}
	@Test
	public void testEnableSelect() throws IOException
	{
		Player p1 = new Player();
		PokemonFactory pf = new PokemonFactory();
		p1.addPokemon(pf.getBlastoise());
		p1.addPokemon(pf.getCharizard());
		p1.addPokemon(pf.getVenuSaur());
		p1.changeActive(p1.getPokemon(0));
		SwapPanel swap1 = new SwapPanel(p1);
		
		swap1.setSelected(p1.getPokemon(1));
		swap1.setEnablesSelect();
		assertTrue(swap1.backButton.isEnabled());
		assertTrue(swap1.confirmButton.isEnabled());
		assertFalse(swap1.pokemonButton[0].isEnabled());
		assertFalse(swap1.pokemonButton[1].isEnabled());
		assertTrue(swap1.pokemonButton[2].isEnabled());
		
		swap1.setSelected(p1.getPokemon(2));
		swap1.setEnablesSelect();
		assertTrue(swap1.backButton.isEnabled());
		assertTrue(swap1.confirmButton.isEnabled());
		assertFalse(swap1.pokemonButton[0].isEnabled());
		assertTrue(swap1.pokemonButton[1].isEnabled());
		assertFalse(swap1.pokemonButton[2].isEnabled());
	}
}





class TestFrame
{
	private JFrame main;
	private JPanel swap1;
	private JPanel swap2;
	public TestFrame()
	{
		main = new JFrame();
		main.setLayout(new GridLayout(1,2));
		//swap = new JPanel();
		//main.add(swap);
		
		
	}
	public void setSwap1(JPanel tmp)
	{
		swap1 = tmp;
	}
	public void setSwap2(JPanel tmp)
	{
		swap2 = tmp;
	}
	public void setSize(int x, int y)
	{
		main.setSize(x, y);
	}
	public void visable()
	{
		main.setVisible(true);
	}
	public void addPanel()
	{
		main.add(swap1);
		main.add(swap2);
	}
	
}

