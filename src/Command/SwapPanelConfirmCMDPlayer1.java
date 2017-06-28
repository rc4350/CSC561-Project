package Command;

import UI.SwapPanel;
import gameworld.GameWorld;

public class SwapPanelConfirmCMDPlayer1 implements CommandInterface
{
	private SwapPanel swapPanel;
	
	public SwapPanelConfirmCMDPlayer1(SwapPanel watching)
	{
		swapPanel = watching;
	}

	@Override
	public void execute()
	{
		GameWorld.getInstance().setActionPlayer1Swap(swapPanel.getSelected());

	}

}
