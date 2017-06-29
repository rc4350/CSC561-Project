package Command;

import static org.junit.Assert.*;

import org.junit.Test;

import Attack.Attack;
import UI.AttackPanel;
import UI.MainBattleScreen;
import gameworld.GameWorld;
import player.Player;

/**
 *Test Attack Panel Builder
 * @author Deema Alrashdan, Ryan Campbell
 */

public class TestAttackPanel1CommandBuilder 
{

	@Test
	public void testConstruct()
	{
		GameWorld world = GameWorld.getInstance();
		Player p1 = new Player();
		world.addPlayer1(p1);

		Attack att1 = new Attack();
		Attack att2 = new Attack();
		Attack att3 = new Attack();
		Attack att4 = new Attack();
		
		world.setActionPlayer1Attack(att1);
		world.setActionPlayer1Attack(att2);
		world.setActionPlayer1Attack(att3);
		world.setActionPlayer1Attack(att4);
		
		MainBattleScreen mbs = new MainBattleScreen();
		world.setBattleScreen(mbs);
		AttackPanel ap = new AttackPanel(p1);
		AttackPanel1CommandBuilder cb = new AttackPanel1CommandBuilder(ap);
		assertNotNull(cb);
		
	}
}
