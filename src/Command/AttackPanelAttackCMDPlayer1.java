package Command;


import Attack.Attack;
import UI.AttackPanel;
import gameworld.GameWorld;

public class AttackPanelAttackCMDPlayer1 implements CommandInterface
{
	private Attack attack;
	private AttackPanel attackPanel;
	
	public AttackPanelAttackCMDPlayer1(AttackPanel watching, Attack att)
	{
		attackPanel = watching;
		attack = att;
	}
	
	@Override
	public void execute()
	{
		GameWorld.getInstance().setActionPlayer1Attack(attack);	
		}
}