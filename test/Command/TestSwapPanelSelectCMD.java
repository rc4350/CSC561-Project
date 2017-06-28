package Command;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

import Pokemon.PokemonFactory;
import UI.SwapPanel;
import gameworld.GameWorld;
import player.Player;

public class TestSwapPanelSelectCMD
{

	@Test
	public void testConstruct()
	{
		SwapPanelSelectCMD ci = new SwapPanelSelectCMD(null, null);
		assertNotNull(ci);
		assertTrue(ci instanceof CommandInterface);
	}

	@Test
	public void testExecute() throws IOException
	{
		Player p1 = new Player();
		PokemonFactory pf = new PokemonFactory();
		p1.addPokemon(pf.getBlastoise());
		p1.addPokemon(pf.getCharizard());
		p1.addPokemon(pf.getVenuSaur());
		p1.changeActive(p1.getPokemon(0));
		SwapPanel swap1 = new SwapPanel(p1);
		
		SwapPanelSelectCMD sc = new SwapPanelSelectCMD(swap1, p1.getPokemon(1));
		sc.execute();
		assertEquals(p1.getPokemon(1), swap1.getSelected());
		assertTrue(swap1.backButton.isEnabled());
		assertTrue(swap1.confirmButton.isEnabled());
		assertFalse(swap1.pokemonButton[0].isEnabled());
		assertFalse(swap1.pokemonButton[1].isEnabled());
		assertTrue(swap1.pokemonButton[2].isEnabled());
		
		
	}
}
/*
Player p1 = new Player();
PokemonFactory pf = new PokemonFactory();
p1.addPokemon(pf.getBlastoise());
p1.addPokemon(pf.getCharizard());
p1.addPokemon(pf.getVenuSaur());
p1.changeActive(p1.getPokemon(0));
SwapPanel sp = new SwapPanel(p1);
p1.changeActive(p1.getPokemon(0));
sp.setSelected(p1.getPokemon(2));

SwapPanelSelectCMD cm = new SwapPanelSelectCMD(sp);
*/