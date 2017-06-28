package UI;

import static org.junit.Assert.*;

import javax.swing.JPanel;


import org.junit.Test;

public class TestAttackPanel {

	@Test
	public void testConstructor()
	{
		AttackPanel ap = new AttackPanel();
		assertNotNull(ap);
		assertTrue(ap.getPanel() instanceof JPanel);
	}
}
