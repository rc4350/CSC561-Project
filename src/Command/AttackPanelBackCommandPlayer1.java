package Command;

import UI.AttackPanel;
import UI.MainBattleScreen;

public class AttackPanelBackCommandPlayer1 implements CommandInterface
{
	private MainBattleScreen battleFrame;
	private AttackPanel attP;
	
	public AttackPanelBackCommandPlayer1(MainBattleScreen mbs, AttackPanel ap)
	{
		battleFrame = mbs;
		attP = ap;
	}

	@Override
	public void execute() 
	{
		battleFrame.updatePlayer1Panel(1);
		attP.setSelected(null);
		
	}
}
