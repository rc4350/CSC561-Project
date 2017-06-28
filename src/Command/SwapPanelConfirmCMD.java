package Command;

import javax.swing.JFrame;

import Pokemon.Pokemon;
import UI.SwapPanel;

public class SwapPanelConfirmCMD implements CommandInterface
{
	private JFrame mainFrame;
	private SwapPanel swapPanel;
	
	public SwapPanelConfirmCMD(JFrame jFrame, SwapPanel watching)
	{
		swapPanel = watching;
	}

	@Override
	public void execute()
	{
		Pokemon temp = swapPanel.getSelected();
		swapPanel.getPlayer().changeActive(temp);

	}

}
