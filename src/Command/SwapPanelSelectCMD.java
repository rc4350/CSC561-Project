package Command;

import javax.swing.JFrame;

import Pokemon.Pokemon;
import UI.SwapPanel;

public class SwapPanelSelectCMD implements CommandInterface
{

	private SwapPanel swap;
	private Pokemon assigned;
	
	public SwapPanelSelectCMD(SwapPanel sp, Pokemon poke)
	{
		swap = sp;
		assigned = poke;
	}

	@Override
	public void execute()
	{
		swap.setSelected(assigned);
		swap.setEnablesSelect();

	}

}
