package Command;


import Attack.Attack;
import UI.AttackPanel;
import gameworld.GameWorld;
/**
* AttackPanel command player1
*@author DeemacAlrashdan, Ryan Campbell
*/

public class AttackPanelAttackCMDPlayer1 implements CommandInterface
{
	private Attack attack;
	private AttackPanel attackPanel;
	
	public AttackPanelAttackCMDPlayer1(AttackPanel watching, Attack att)
	{
		attackPanel = watching;
		attack = att;
	}
	/**
	 * override execute method and set action player1 attack 
	 */
	@Override
	public void execute()
	{
		GameWorld.getInstance().setActionPlayer1Attack(attack);	
		}
}