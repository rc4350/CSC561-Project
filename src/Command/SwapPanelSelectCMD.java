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
	/**
	 * constructs with  swappanel and pokemon
	 * @param sp SwapPanel
	 * @param poke Pokemo
	 */
	public SwapPanelSelectCMD(SwapPanel sp, Pokemon poke)
	{
		swap = sp;
		assigned = poke;
	}

	/**
	 * sets pokmeon as selected in swap panel, and changes swap panel enables
	 */
	@Override
	public void execute()
	{
		swap.setSelected(assigned);
		swap.setEnablesSelect();

	}

}
