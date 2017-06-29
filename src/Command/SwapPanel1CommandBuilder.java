package Command;

import UI.SwapPanel;
import gameworld.GameWorld;
/**
 * SwapPanel 1 command builder
 * @author Deema Alrashdan,Ryan Campbell
 *
 */
public class SwapPanel1CommandBuilder
{

	/**
	 * assigns commands to buttons
	 * @param sp SwapPanel
	 */
	public SwapPanel1CommandBuilder(SwapPanel sp)
	{
		sp.pokemonButton1Command = new SwapPanelSelectCMD(sp, sp.getPlayer().getPokemon(0));
		sp.pokemonButton2Command = new SwapPanelSelectCMD(sp, sp.getPlayer().getPokemon(1));
		sp.pokemonButton3Command = new SwapPanelSelectCMD(sp, sp.getPlayer().getPokemon(2));
		sp.backButtonCommand = new SwapPanelBackCMDPlayer1(GameWorld.getInstance().getBattleScreen(), sp);
		sp.confirmButtonCommand = new SwapPanelConfirmCMDPlayer1(sp);
	}
}
