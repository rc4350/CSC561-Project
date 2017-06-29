package Command;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

import Attack.Attack;
import UI.AttackPanel;
import gameworld.GameWorld;

public class TestAttcakPanelAttackCMDPlayer1 
{
	@Test
	public void testConstructor()
	{
		AttackPanelAttackCMDPlayer1 cmdP1 = new AttackPanelAttackCMDPlayer1(null,null);
		assertNotNull(cmdP1);
		assertTrue(cmdP1 instanceof CommandInterface);
	}
	
	@Test
	public void testExecute() throws IOException
	{ 
		GameWorld.getInstance();
		Attack attack = new Attack();
		AttackPanel attP = new AttackPanel();
		
		attP.setSelected(attack);
		AttackPanelAttackCMDPlayer1 attPaCMD = new AttackPanelAttackCMDPlayer1(attP, attack);
		
		
		attPaCMD.execute();
		assertEquals(1, GameWorld.getInstance().getPlayer1Action());
		assertTrue(GameWorld.getInstance().getPlayer1ReadyStatus());
		assertEquals(10, GameWorld.getInstance().getPlayer1Attack().getDamage());

	}

}

