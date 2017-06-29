package Command;

import UI.MainBattleScreen;
import UI.SwapPanel;

public class SwapPanelBackCMDPlayer1 implements CommandInterface
{
	private MainBattleScreen battleFrame;
	private SwapPanel swap;
	//TODO update with BattleFrame class
	public SwapPanelBackCMDPlayer1(MainBattleScreen mbs, SwapPanel sp)
	{
		battleFrame = mbs;
		swap = sp;
	}

	@Override
	public void execute()
	{
		battleFrame.updatePlayer1Panel(1);
		swap.setSelected(null);
		swap.setEnablesInitial();
		

	}

}
