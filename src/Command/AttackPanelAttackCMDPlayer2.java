package Command;

import Attack.Attack;
import UI.AttackPanel;
import gameworld.GameWorld;

public class AttackPanelAttackCMDPlayer2 implements CommandInterface
{
	private Attack attack;
	private AttackPanel attackPanel;

	public AttackPanelAttackCMDPlayer2(AttackPanel watching, Attack att)
	{
		attackPanel = watching;
		attack = att;
	}
	
	@Override
	public void execute()
	{
		GameWorld.getInstance().setActionPlayer2Attack(attack);
	}
}
