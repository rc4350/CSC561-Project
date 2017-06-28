package Command;

import static org.junit.Assert.*;

import java.io.IOException;

import javax.swing.JFrame;

import org.junit.Test;

import Command.CommandInterface;
import Command.SwapPanelConfirmCMD;
import Pokemon.PokemonFactory;
import UI.SwapPanel;
import player.Player;

public class TestSwapPanelConfirmCMD
{

	@Test
	public void testConstruct()
	{
		SwapPanelConfirmCMD ci = new SwapPanelConfirmCMD(null, null);
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
		
		SwapPanelConfirmCMD sc = new SwapPanelConfirmCMD(new JFrame(), sp);
		sp.setSelected(p1.getPokemon(1));
		sc.execute();
		assertEquals(p1.getPokemon(1), p1.getActive());

	}

}
