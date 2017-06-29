package Command;

import Pokemon.Pokemon;
import UI.SwapPanel;
/**
* SwapPanel select command
*@author DeemacAlrashdan, Ryan Campbell
*/
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
