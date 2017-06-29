package UI;

import static org.junit.Assert.*;
import java.awt.GridLayout;
import java.io.IOException;

import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import org.junit.Test;

import Attack.AttackFactory;
import Pokemon.PokemonFactory;
import gameworld.GameWorld;
import player.Player;

public class TestAttackPanel {

	@Test
	public void testConstructor()
	{
		AttackPanel ap = new AttackPanel();
		assertNotNull(ap);
		assertTrue(ap.getPanel() instanceof JPanel);
	}
	@Test
	public void testViewAttackPanelP1() throws IOException
	{

		PokemonFactory poke = new PokemonFactory();
		Player p1 = new Player();
		p1.addPokemon(poke.getBlastoise());
		p1.changeActive(p1.getPokemon(0));
		
	
		AttackPanel attp = new AttackPanel(p1);
		TestFrameAttack frame = new TestFrameAttack();
		frame.setSize(640, 480);
		frame.setAttPan1(attp.getPanel());
		frame.setAttPan2(new JPanel());
		frame.addPanel();
		frame.visable();
		assertEquals(JOptionPane.YES_OPTION, JOptionPane.showConfirmDialog(null, "Does left Panel look correct?"));
		
	}
	
	@Test
	public void testViewAttackPanelP2() throws IOException
	{

		PokemonFactory poke = new PokemonFactory();
		Player p1 = new Player();
		Player p2 = new Player();
		p1.addPokemon(poke.getBulbasaur());
		p2.addPokemon(poke.getBlastoise());
		p2.changeActive(p2.getPokemon(0));
		
	
		AttackPanel attp1 = new AttackPanel(p2);
		AttackPanel attp2 = new AttackPanel(p2);
		
		TestFrameAttack frame = new TestFrameAttack();
		frame.setSize(640, 480);
		frame.setAttPan1(attp1.getPanel());
		frame.setAttPan2(attp2.getPanel());
		frame.addPanel();
		frame.visable();
		assertEquals(JOptionPane.YES_OPTION, JOptionPane.showConfirmDialog(null, "Does right Panel look correct?"));
		
	}
	
	@Test
	public void testSetSelected()
	{
		Player p1 = new Player(); 
		AttackPanel attP = new AttackPanel(p1);
		GameWorld.getInstance().addPlayer1(p1);
		
		AttackFactory attF = new AttackFactory();
		//set attack in the environment
		GameWorld.getInstance().setActionPlayer1Attack(attF.getFireMedium());
		
		//set attack in the attack panel
		attP.setSelected(attF.getFireMedium());
		
		assertEquals(GameWorld.getInstance().getPlayer1Attack(),attP.getSelected());	
	}
}


class TestFrameAttack
{
	private JFrame main;
	private JPanel attPan1;
	private JPanel attPan2;
	public TestFrameAttack()
	{
		main = new JFrame();
		main.setLayout(new GridLayout(1,2));
		
	}
	public void setAttPan1(JPanel tmp)
	{
		attPan1 = tmp;
	}
	public void setAttPan2(JPanel tmp)
	{
		attPan2 = tmp;
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
		main.add(attPan1);
		main.add(attPan2);
	}

}