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

import Attack.AttackFactory;
import Pokemon.PokemonFactory;
import UI.AttackPanel;
import UI.MainBattleScreen;
import UI.SwapPanel;
import player.Player;
/**
 *Test Attack Panel,back command for player1
 * @author Deema Alrashdan, Ryan Campbell
 */
public class TestAttackPanelBackCMDPlayer1 
{

	@Test
	public void testConstruct()
	{
		AttackPanelBackCommandPlayer1 aPcM = new AttackPanelBackCommandPlayer1(null, null);
		assertNotNull(aPcM);
		assertTrue(aPcM instanceof CommandInterface);
	}
	
	@Test
	public void testBack() throws IOException
	{
		Player p1 = new Player();
		AttackFactory attF = new AttackFactory();
		AttackPanel attP1 = new AttackPanel(p1);
		attP1.setSelected(attF.getFireMedium());
		
		TestFrameAttack frameA = new TestFrameAttack();
	
		
		
		
		frameA.setAttackPanel1(attP1.getPanel());
		frameA.visable();
		assertEquals(JOptionPane.YES_OPTION, JOptionPane.showConfirmDialog(null, "Is left panel a Attack panel?"));
		AttackPanelBackCommandPlayer1 bc = new AttackPanelBackCommandPlayer1(frameA, attP1);
		bc.execute();
		
		assertNull(attP1.getSelected());
		assertTrue(attP1.backButton.isEnabled());
		
		assertEquals(JOptionPane.YES_OPTION, JOptionPane.showConfirmDialog(null, "Is left panel blank battle panel"));
		
		
	}

}

class TestFrameAttack extends MainBattleScreen
{
	private static final long serialVersionUID = 1L;
	private JPanel battlePanel;
	private JPanel attP1;
	private JPanel attP2;
	public TestFrameAttack()
	{
		super();
		this.setSize(640,  480);
		this.setLayout(new GridLayout(1,2));
		attP1 = new JPanel();
		attP2 = new JPanel(new BorderLayout());
		attP2.add(new JLabel("Attack Panel 2"));
		battlePanel = new JPanel(new BorderLayout());
		battlePanel.add(new JLabel("Battle Panel"));
		JPanel p = new JPanel(new BorderLayout());
		add(attP2);
		
		
	}
	public void setBattle(JPanel AttackPanelToRemove)
	{
		this.remove(AttackPanelToRemove);
		this.remove(attP2);
		this.add(battlePanel);
		this.add(attP2);
		this.validate();
	}
	public void setAttackPanel1(JPanel temp)
	{
		this.remove(battlePanel);
		this.remove(attP2);
		this.add(temp);
		this.add(attP2);
		this.validate();
	}

	public void visable()
	{
		this.setVisible(true);
	}
	public void addPanel()
	{
		this.add(attP2);
		this.add(attP2);
	}

}
