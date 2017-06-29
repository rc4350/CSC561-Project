package Command;

import static org.junit.Assert.*;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.io.IOException;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import org.junit.Test;

import Attack.AttackFactory;
import UI.AttackPanel;
import UI.MainBattleScreen;
import player.Player;

/**
 *Test Attack Panel, back command for player2
 * @author Deema Alrashdan, Ryan Campbell
 */
public class TestAttackPanelBackCMDPlayer2 
{

	@Test
	public void testConstruct()
	{
		AttackPanelBackCommandPlayer2 aPcM = new AttackPanelBackCommandPlayer2(null, null);
		assertNotNull(aPcM);
		assertTrue(aPcM instanceof CommandInterface);
	}
	
	@Test
	public void testBack() throws IOException
	{
		Player p2 = new Player();
		AttackFactory attF = new AttackFactory();
		AttackPanel attP2 = new AttackPanel(p2);
		attP2.setSelected(attF.getFireMedium());
		
		TestFrameAttack frameA = new TestFrameAttack();
	
		
		
		
		frameA.setAttackPanel1(attP2.getPanel());
		frameA.visable();
		assertEquals(JOptionPane.YES_OPTION, JOptionPane.showConfirmDialog(null, "Is left panel a Attack panel?"));
		AttackPanelBackCommandPlayer2 bc = new AttackPanelBackCommandPlayer2(frameA, attP2);
		bc.execute();
		
		assertNull(attP2.getSelected());
		assertTrue(attP2.backButton.isEnabled());
		
		assertEquals(JOptionPane.YES_OPTION, JOptionPane.showConfirmDialog(null, "Is left panel blank battle panel"));
		
		
	}

}

class TestFrameAttack2 extends MainBattleScreen
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel battlePanel;
	private JPanel attP1;
	private JPanel attP2;
	public TestFrameAttack2()
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
