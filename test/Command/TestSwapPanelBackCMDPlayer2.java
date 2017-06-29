package Command;

import static org.junit.Assert.*;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import org.junit.Test;

import Pokemon.PokemonFactory;
import UI.MainBattleScreen;
import UI.SwapPanel;
import player.Player;

public class TestSwapPanelBackCMDPlayer2
{

	@Test
	public void testConstruct()
	{
		SwapPanelBackCMDPlayer1 ci = new SwapPanelBackCMDPlayer1(null, null);
		assertNotNull(ci);
		assertTrue(ci instanceof CommandInterface);
	}
	@Test
	public void testBack() throws IOException
	{
		Player p1 = new Player();
		PokemonFactory pf = new PokemonFactory();
		p1.addPokemon(pf.getBlastoise());
		p1.addPokemon(pf.getCharizard());
		p1.addPokemon(pf.getVenuSaur());
		p1.changeActive(p1.getPokemon(0));
		SwapPanel swap1 = new SwapPanel(p1);
		swap1.setSelected(p1.getPokemon(1));
		
		TestFrame frame = new TestFrame();
	
		
		
		
		frame.setSwap1(swap1.getPanel());
		frame.visable();
		assertEquals(JOptionPane.YES_OPTION, JOptionPane.showConfirmDialog(null, "Is left panel a swap panel?"));
		SwapPanelBackCMDPlayer1 bc = new SwapPanelBackCMDPlayer1(frame, swap1);
		bc.execute();
		
		assertNull(swap1.getSelected());
		assertTrue(swap1.backButton.isEnabled());
		assertFalse(swap1.confirmButton.isEnabled());
		assertFalse(swap1.pokemonButton[0].isEnabled());
		assertTrue(swap1.pokemonButton[1].isEnabled());
		assertTrue(swap1.pokemonButton[2].isEnabled());
		
		assertEquals(JOptionPane.YES_OPTION, JOptionPane.showConfirmDialog(null, "Is left panel blank battle panel"));
		
		
	}

}
class TestFrame extends MainBattleScreen
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel battlePanel;
	private JPanel swap1;
	private JPanel swap2;
	public TestFrame()
	{
		super();
		this.setSize(640,  480);
		this.setLayout(new GridLayout(1,2));
		swap1 = new JPanel();
		swap2 = new JPanel(new BorderLayout());
		swap2.add(new JLabel("swap 2"));
		battlePanel = new JPanel(new BorderLayout());
		battlePanel.add(new JLabel("Battle Panel"));
		//JPanel p = new JPanel(new BorderLayout());
		//p.add("Center", new JLabel("Hello"));
		//add(p);
		add(swap2);
		
		
	}
	public void setBattle(JPanel swapPanelToRemove)
	{
		this.remove(swapPanelToRemove);
		this.remove(swap2);
		this.add(battlePanel);
		this.add(swap2);
		this.validate();
	}
	public void setSwap1(JPanel temp)
	{
		this.remove(battlePanel);
		this.remove(swap2);
		//this.validate();
		//this.setLayout(new GridLayout(1,2));
		//JPanel p = new JPanel();
		//p.add(new JLabel("Hello Back"));
		//this.getContentPane().add(p);
		this.add(temp);
		this.add(swap2);
		//this.setVisible(false);
		//this.setVisible(true);
		this.validate();
	}

	public void visable()
	{
		this.setVisible(true);
	}
	public void addPanel()
	{
		this.add(swap1);
		this.add(swap2);
	}
	
}