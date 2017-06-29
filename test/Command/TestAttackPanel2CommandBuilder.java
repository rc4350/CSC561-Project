package Command;

import static org.junit.Assert.*;

import org.junit.Test;

import Attack.Attack;
import UI.AttackPanel;
import UI.MainBattleScreen;
import gameworld.GameWorld;
import player.Player;

/**
 *Test Attack Panel2 Builder
 * @author Deema Alrashdan, Ryan Campbell
 */

public class TestAttackPanel2CommandBuilder {

	@Test
	public void testConstruct()
	{
		GameWorld world = GameWorld.getInstance();
		Player p2 = new Player();
		world.addPlayer1(p2);

		Attack att1 = new Attack();
		Attack att2 = new Attack();
		Attack att3 = new Attack();
		Attack att4 = new Attack();
		
		world.setActionPlayer2Attack(att1);
		world.setActionPlayer2Attack(att2);
		world.setActionPlayer2Attack(att3);
		world.setActionPlayer2Attack(att4);
		
		MainBattleScreen mbs = new MainBattleScreen();
		world.setBattleScreen(mbs);
		AttackPanel ap = new AttackPanel(p2);
		AttackPanel2CommandBuilder cb = new AttackPanel2CommandBuilder(ap);
		assertNotNull(cb);
		
	}

}
