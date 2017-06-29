package Command;

import UI.MainBattleScreen;
import UI.SwapPanel;
/**
* SwapPanel back command for player2
*@author DeemacAlrashdan, Ryan Campbell
*/
public class SwapPanelBackCMDPlayer2 implements CommandInterface
{
	private MainBattleScreen battleFrame;
	private SwapPanel swap;
	//TODO update with BattleFrame class
	public SwapPanelBackCMDPlayer2(MainBattleScreen mbs, SwapPanel sp)
	{
		battleFrame = mbs;
		swap = sp;
	}

	@Override
	public void execute()
	{
		battleFrame.updatePlayer2Panel(1);
		swap.setSelected(null);
		swap.setEnablesInitial();
		

	}

}
