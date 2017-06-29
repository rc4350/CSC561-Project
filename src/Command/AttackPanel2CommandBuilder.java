package Command;

import UI.AttackPanel;
import gameworld.GameWorld;

/**
* AttackPanel 2 CMD Builder
*@author DeemacAlrashdan, Ryan Campbell
*/
public class AttackPanel2CommandBuilder 
{
	public AttackPanel2CommandBuilder(AttackPanel ap)
	{
		ap.BtnAttack1Command = new AttackPanelAttackCMDPlayer2(ap, ap.getSelected());
		ap.BtnAttack2Command = new AttackPanelAttackCMDPlayer2(ap, ap.getSelected());
		ap.BtnAttack3Command = new AttackPanelAttackCMDPlayer2(ap, ap.getSelected());
		ap.BtnAttack4Command = new AttackPanelAttackCMDPlayer2(ap, ap.getSelected());
		ap.backButtonCommand = new AttackPanelBackCommandPlayer2(GameWorld.getInstance().getBattleScreen(), ap);
	}


}
