package Command;

import UI.AttackPanel;
import UI.MainBattleScreen;

/**
* Attack Panel back command for player2
*@author DeemacAlrashdan, Ryan Campbell
*/
public class AttackPanelBackCommandPlayer2 implements CommandInterface
{
	private MainBattleScreen battleFrame;
	private AttackPanel attP;
	
	public AttackPanelBackCommandPlayer2(MainBattleScreen frame, AttackPanel ap)
	{
		battleFrame = frame;
		attP = ap;
	}

	@Override
	public void execute() 
	{
		battleFrame.updatePlayer2Panel(1);
		attP.setSelected(null);
		
	}

}
