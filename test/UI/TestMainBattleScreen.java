package UI;

import static org.junit.Assert.*;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import org.junit.Test;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class TestMainBattleScreen
{

	@Test
	public void testConstruct()
	{
		MainBattleScreen mb = new MainBattleScreen();
		assertNotNull(mb);
		assertTrue(mb instanceof JFrame);
		assertEquals(640, mb.getWidth());
		assertEquals(480, mb.getHeight());
		
	}

	@Test
	public void testPanelSetGet()
	{
		MainBattleScreen mb = new MainBattleScreen();
		JPanel panel = new JPanel();
		mb.setBattlePanelOne(panel);
		mb.setBattlePanelTwo(panel);
		mb.setSwapPanelOne(panel);
		mb.setSwapPanelTwo(panel);
		mb.setAttackPanelOne(panel);
		mb.setAttackPanelTwo(panel);
		mb.setCurrentPanelOne(panel);
		mb.setCurrentPanelTwo(panel);
		
		assertEquals(panel, mb.battlePanelOne);
		assertEquals(panel, mb.battlePanelTwo);
		assertEquals(panel, mb.swapPanelOne);
		assertEquals(panel, mb.swapPanelTwo);
		assertEquals(panel, mb.attackPanelOne);
		assertEquals(panel, mb.attackPanelTwo);
		assertEquals(panel, mb.currentPanelOne);
		assertEquals(panel, mb.currentPanelTwo);
	}
	
	@Test
	public void testInitialize()
	{
		MainBattleScreen mb = new MainBattleScreen();
		JPanel p1b = new JPanel(new BorderLayout());
		JPanel p1s = new JPanel();
		JPanel p1a = new JPanel();
		JPanel p2b = new JPanel(new BorderLayout());
		JPanel p2s = new JPanel();
		JPanel p2a = new JPanel();
		
		p1b.add("Center",new JLabel("player 1 battle"));
		p2b.add("Center",new JLabel("player 2 battle"));
		
		mb.initialize(p1b, p2b, p1s, p2s, p1a, p2a);
		
		assertEquals(p1b, mb.battlePanelOne);
		assertEquals(p2b, mb.battlePanelTwo);
		assertEquals(p1s, mb.swapPanelOne);
		assertEquals(p2s, mb.swapPanelTwo);
		assertEquals(p1a, mb.attackPanelOne);
		assertEquals(p2a, mb.attackPanelTwo);
		assertEquals(p1b, mb.currentPanelOne);
		assertEquals(p2b, mb.currentPanelTwo);
		assertTrue(mb.isVisible());
		assertEquals(JOptionPane.YES_OPTION, JOptionPane.showConfirmDialog(null, "are the battle panels displayer?"));
	}
	
	@Test
	public void testUpdatePlayer1Panel() throws InterruptedException
	{
		MainBattleScreen mb = new MainBattleScreen();
		JPanel panelp2 = new JPanel(new BorderLayout());
		JPanel p1b = new JPanel(new BorderLayout());
		JPanel p1s = new JPanel(new BorderLayout());
		JPanel p1a = new JPanel(new BorderLayout());
		
		panelp2.add("Center", new JLabel("player 2 panel"));
		p1b.add("Center", new JLabel("p1b"));
		p1s.add("Center", new JLabel("p1s"));
		p1a.add("Center", new JLabel("p1a"));
		
		mb.setBattlePanelTwo(panelp2);
		mb.setBattlePanelOne(p1b);
		mb.setAttackPanelOne(p1a);
		mb.setSwapPanelOne(p1s);
		mb.setCurrentPanelOne(p1b);
		mb.setCurrentPanelTwo(panelp2);
		
		assertEquals(p1b, mb.battlePanelOne);
		
		
		
		mb.testMethodPlayer1SetUp();
		assertEquals(p1b, mb.currentPanelOne);
		assertEquals(p1b, mb.battlePanelOne);
		assertEquals(p1s, mb.swapPanelOne);
		assertEquals(p1a, mb.attackPanelOne);
		
		assertEquals(JOptionPane.YES_OPTION, JOptionPane.showConfirmDialog(null, "does left panel display p1b?"));
		
		
		
		mb.updatePlayer1Panel(2);
		assertEquals(p1s, mb.currentPanelOne);
		assertEquals(p1b, mb.battlePanelOne);
		assertEquals(p1s, mb.swapPanelOne);
		assertEquals(p1a, mb.attackPanelOne);
		
		assertEquals(JOptionPane.YES_OPTION, JOptionPane.showConfirmDialog(null, "does left panel display p1s?"));
		
		
		mb.updatePlayer1Panel(3);
		assertEquals(p1a, mb.currentPanelOne);
		assertEquals(p1b, mb.battlePanelOne);
		assertEquals(p1s, mb.swapPanelOne);
		assertEquals(p1a, mb.attackPanelOne);
	
		assertEquals(JOptionPane.YES_OPTION, JOptionPane.showConfirmDialog(null, "does left panel display p1a?"));
		
		/*
		 * if this following 2 lines are un commented, the next mb.updatePlayer1Panel(2) will display corerctly
		 * otherwise the left panel will still say p1a
		 */
		
		//TestMFrame test = new TestMFrame(mb.swapPanelOne);
		//assertEquals(JOptionPane.YES_OPTION, JOptionPane.showConfirmDialog(null, "does new frame display p1s"));
		
		mb.updatePlayer1Panel(2);
		assertEquals(p1s, mb.currentPanelOne);
		assertEquals(p1b, mb.battlePanelOne);
		assertEquals(p1s, mb.swapPanelOne);
		assertEquals(p1a, mb.attackPanelOne);
	
		assertEquals(JOptionPane.YES_OPTION, JOptionPane.showConfirmDialog(null, "does left panel display p1s?"));
		
		
		mb.updatePlayer1Panel(1);
		assertEquals(p1b, mb.currentPanelOne);
		assertEquals(p1b, mb.battlePanelOne);
		assertEquals(p1s, mb.swapPanelOne);
		assertEquals(p1a, mb.attackPanelOne);
		
		assertEquals(JOptionPane.YES_OPTION, JOptionPane.showConfirmDialog(null, "does left panel display p1b?"));
		
		
		mb.updatePlayer1Panel(3);
		assertEquals(p1b, mb.battlePanelOne);
		assertEquals(p1s, mb.swapPanelOne);
		assertEquals(p1a, mb.attackPanelOne);
		assertEquals(p1a, mb.currentPanelOne);
		
		assertEquals(JOptionPane.YES_OPTION, JOptionPane.showConfirmDialog(null, "does left panel display p1a?"));
		
		mb.updatePlayer1Panel(1);
		assertEquals(p1b, mb.battlePanelOne);
		assertEquals(p1s, mb.swapPanelOne);
		assertEquals(p1a, mb.attackPanelOne);
		assertEquals(p1b, mb.currentPanelOne);
		
		assertEquals(JOptionPane.YES_OPTION, JOptionPane.showConfirmDialog(null, "does left panel display p1b?"));
	}
}

class TestMFrame extends JFrame
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public TestMFrame(JPanel x)
	{
		this.setLayout(new BorderLayout());
		this.add("Center", x);
		this.pack();
		this.setVisible(true);
		
	}
}