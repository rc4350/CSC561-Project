package Command;

import UI.SwapPanel;

public class SwapPanelBackCMDPlayer1 implements CommandInterface
{
	private TestFrame battleFrame;
	private SwapPanel swap;
	//TODO update with BattleFrame class
	public SwapPanelBackCMDPlayer1(TestFrame frame, SwapPanel sp)
	{
		battleFrame = frame;
		swap = sp;
	}

	@Override
	public void execute()
	{
		battleFrame.setBattle(swap.getPanel());
		swap.setSelected(null);
		swap.setEnablesInitial();
		

	}

}
