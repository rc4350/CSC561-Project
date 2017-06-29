package UI;

import static org.junit.Assert.*;
import java.awt.GridLayout;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


import org.junit.Test;

import Pokemon.PokemonFactory;
import player.Player;

 /**
 * TestBattlePanel to test the Battle panel
 * @author Deema Alrashdan, Ryan Campbell
 */

public class TestBattlePanel {

	@Test
	public void testConstructor()
	{
		BattlePanel bp = new BattlePanel();
		assertNotNull(bp);
		assertTrue(bp.getPanel() instanceof JPanel);
	}
	
	@Test
	public void testViewBattlePanelP1() throws IOException
	{

		PokemonFactory poke = new PokemonFactory();
		Player p1 = new Player();
		p1.addPokemon(poke.getBlastoise());
		p1.changeActive(p1.getPokemon(0));
		
	
		BattlePanel battp = new BattlePanel();
		TestFrameBattle frame = new TestFrameBattle();
		frame.setSize(640, 480);
		frame.setBattPan1(battp.getPanel());
		frame.setBattPan2(new JPanel());
		frame.addPanel();
		frame.visable();
		assertEquals(JOptionPane.YES_OPTION, JOptionPane.showConfirmDialog(null, "Does left Panel look correct?"));
		
	}
	
	@Test
	public void testViewBattlePanelP2() throws IOException
	{

		PokemonFactory poke = new PokemonFactory();
		Player p1 = new Player();
		Player p2 = new Player();
		p1.addPokemon(poke.getBlastoise());
		p2.addPokemon(poke.getBlastoise());
		p2.changeActive(p2.getPokemon(0));
		
	
		BattlePanel battp1 = new BattlePanel();
		BattlePanel battp2 = new BattlePanel();
		
		
		TestFrameBattle frame = new TestFrameBattle();
		frame.setSize(640, 480);
		frame.setBattPan1(battp1.getPanel());
		//second player
		frame.setBattPan2(battp2.getPanel());
		frame.addPanel();
		frame.visable();
		assertEquals(JOptionPane.YES_OPTION, JOptionPane.showConfirmDialog(null, "Does left Panel look correct?"));
		
	}	

}


class TestFrameBattle
{
	private JFrame main;
	private JPanel battPan1;
	private JPanel battPan2;
	public TestFrameBattle()
	{
		main = new JFrame();
		main.setLayout(new GridLayout(1,2));
		
	}
	public void setBattPan1(JPanel tmp)
	{
		battPan1 = tmp;
	}
	public void setBattPan2(JPanel tmp)
	{
		battPan2 = tmp;
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
		main.add(battPan1);
		main.add(battPan2);
	}

}

