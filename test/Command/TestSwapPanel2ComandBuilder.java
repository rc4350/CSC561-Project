package Command;

import static org.junit.Assert.*;

import org.junit.Test;

import Pokemon.Pokemon;
import UI.MainBattleScreen;
import UI.SwapPanel;
import gameworld.GameWorld;
import player.Player;

public class TestSwapPanel2ComandBuilder
{

	@Test
	public void testConstruct()
	{
		GameWorld world = GameWorld.getInstance();
		Player p1 = new Player();
		Pokemon poke1 = new Pokemon("1", 10);
		Pokemon poke2 = new Pokemon("2", 10);
		Pokemon poke3 = new Pokemon("3", 10);
		p1.addPokemon(poke1);
		p1.addPokemon(poke2);
		p1.addPokemon(poke3);
		MainBattleScreen mbs = new MainBattleScreen();
		world.setBattleScreen(mbs);
		SwapPanel sp = new SwapPanel(p1);
		SwapPanel2CommandBuilder cb = new SwapPanel2CommandBuilder(sp);
		assertNotNull(cb);
		
	}

}
