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
	/**
	 * constructs with mainbattle screen and swappanel
	 * @param mbs MainBattleScreen
	 * @param sp SwapPanel
	 */
	public SwapPanelBackCMDPlayer2(MainBattleScreen mbs, SwapPanel sp)
	{
		battleFrame = mbs;
		swap = sp;
	}
	/**
	 * updates main battle screen and changes swappanel enables
	 */
	@Override
	public void execute()
	{
		battleFrame.updatePlayer2Panel(1);
		swap.setSelected(null);
		swap.setEnablesInitial();
		

	}

}
