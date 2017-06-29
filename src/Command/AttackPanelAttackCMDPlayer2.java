package Command;

import Attack.Attack;
import UI.AttackPanel;
import gameworld.GameWorld;

/**
* AttackPanel command player2
*@author DeemacAlrashdan, Ryan Campbell
*/
public class AttackPanelAttackCMDPlayer2 implements CommandInterface
{
	private Attack attack;
	private AttackPanel attackPanel;

	public AttackPanelAttackCMDPlayer2(AttackPanel watching, Attack att)
	{
		attackPanel = watching;
		attack = att;
	}
	/**
	 * override execute method and set action player2 attack 
	 */
	@Override
	public void execute()
	{
		GameWorld.getInstance().setActionPlayer2Attack(attack);
	}
}
