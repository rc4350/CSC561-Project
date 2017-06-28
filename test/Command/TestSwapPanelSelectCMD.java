package Command;

import static org.junit.Assert.*;

import java.io.IOException;

import javax.swing.JFrame;

import org.junit.Test;

import Pokemon.PokemonFactory;
import UI.SwapPanel;
import player.Player;

public class TestSwapPanelSelectCMD
{

	@Test
	public void testConstruct()
	{
		SwapPanelSelectCMD ci = new SwapPanelSelectCMD(null);
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
		SwapPanel sp = new SwapPanel(p1);
		p1.changeActive(p1.getPokemon(0));
		sp.setSelected(p1.getPokemon(2));
		
		SwapPanelSelectCMD cm = new SwapPanelSelectCMD(sp);
		
		
	}
}
