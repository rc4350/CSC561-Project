package Command;

import UI.SwapPanel;
import gameworld.GameWorld;

public class SwapPanel2CommandBuilder
{

	public SwapPanel2CommandBuilder(SwapPanel sp)
	{
		sp.pokemonButton1Command = new SwapPanelSelectCMD(sp, sp.getPlayer().getPokemon(0));
		sp.pokemonButton2Command = new SwapPanelSelectCMD(sp, sp.getPlayer().getPokemon(1));
		sp.pokemonButton3Command = new SwapPanelSelectCMD(sp, sp.getPlayer().getPokemon(2));
		sp.backButtonCommand = new SwapPanelBackCMDPlayer2(GameWorld.getInstance().getBattleScreen(), sp);
		sp.confirmButtonCommand = new SwapPanelConfirmCMDPlayer2(sp);
	}
}
