package Command;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

import Attack.Attack;
import UI.AttackPanel;
import gameworld.GameWorld;

public class TestAttackPanelAttackCMDPlayer2 {

	@Test
	public void testConstructor()
	{
		AttackPanelAttackCMDPlayer2 cmdP2 = new AttackPanelAttackCMDPlayer2(null,null);
		assertNotNull(cmdP2);
		assertTrue(cmdP2 instanceof CommandInterface);
	}
	
	@Test
	public void testExecute() throws IOException
	{ 
		GameWorld.getInstance();
		Attack attack = new Attack();
		AttackPanel attP = new AttackPanel();
		
		attP.setSelected(attack);
		AttackPanelAttackCMDPlayer2 attPaCMD = new AttackPanelAttackCMDPlayer2(attP, attack);
		
		
		attPaCMD.execute();
		assertEquals(1, GameWorld.getInstance().getPlayer2Action());
		assertTrue(GameWorld.getInstance().getPlayer2ReadyStatus());
		assertEquals(10, GameWorld.getInstance().getPlayer2Attack().getDamage());
		

	}

}

