package Command;

import UI.AttackPanel;

import gameworld.GameWorld;

/**
* AttackPanel 1 CMD Builder
*@author DeemacAlrashdan, Ryan Campbell
*/
public class AttackPanel1CommandBuilder 
	{
		public AttackPanel1CommandBuilder(AttackPanel ap)
		{
			ap.BtnAttack1Command = new AttackPanelAttackCMDPlayer1(ap, ap.getSelected());
			ap.BtnAttack2Command = new AttackPanelAttackCMDPlayer1(ap, ap.getSelected());
			ap.BtnAttack3Command = new AttackPanelAttackCMDPlayer1(ap, ap.getSelected());
			ap.BtnAttack4Command = new AttackPanelAttackCMDPlayer1(ap, ap.getSelected());
			ap.backButtonCommand = new AttackPanelBackCommandPlayer1(GameWorld.getInstance().getBattleScreen(), ap);
		}
}