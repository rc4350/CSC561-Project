package Command;

import UI.SwapPanel;
import gameworld.GameWorld;
/**
* SwapPanel confirm command for player2
*@author DeemacAlrashdan, Ryan Campbell
*/
public class SwapPanelConfirmCMDPlayer2 implements CommandInterface
{
	private SwapPanel swapPanel;
	
	public SwapPanelConfirmCMDPlayer2(SwapPanel watching)
	{
		swapPanel = watching;
	}

	@Override
	public void execute()
	{
		GameWorld.getInstance().setActionPlayer2Swap(swapPanel.getSelected());

	}

}
