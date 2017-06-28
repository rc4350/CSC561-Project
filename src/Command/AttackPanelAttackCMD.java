package Command;

import Attack.Attack;
import UI.AttackPanel;

public class AttackPanelAttackCMD implements CommandInterface
{
	private Attack attack;
	private AttackPanel attackPanel;
	// private BattleScreen battleScreen;
	
	@Override
	public void execute()
	{
		attack = attackPanel.getSelected();
	}
}
