package Command;

import UI.AttackPanel;
import UI.MainBattleScreen;
/**
* AttackPanel back command for player1
*@author DeemacAlrashdan, Ryan Campbell
*/
public class AttackPanelBackCommandPlayer1 implements CommandInterface
{
	private MainBattleScreen battleFrame;
	private AttackPanel attP;
	
	public AttackPanelBackCommandPlayer1(MainBattleScreen mbs, AttackPanel ap)
	{
		battleFrame = mbs;
		attP = ap;
	}
	/**
	 * override execute method and update player1 panel
	 */
	@Override
	public void execute() 
	{
		battleFrame.updatePlayer1Panel(1);
		attP.setSelected(null);
		
	}
}
