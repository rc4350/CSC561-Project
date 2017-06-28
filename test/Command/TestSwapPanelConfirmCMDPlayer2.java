package Command;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

import Command.CommandInterface;
import Pokemon.Pokemon;
import UI.SwapPanel;
import gameworld.GameWorld;

public class TestSwapPanelConfirmCMDPlayer2
{

	@Test
	public void testConstruct()
	{
		SwapPanelConfirmCMDPlayer2 ci = new SwapPanelConfirmCMDPlayer2(null);
		assertNotNull(ci);
		assertTrue(ci instanceof CommandInterface);
	}
	
	@Test
	public void testExecute() throws IOException
	{
		GameWorld.getInstance();
		Pokemon poke = new Pokemon("Missingno", 10);
		SwapPanel swap = new SwapPanel();
		swap.setSelected(poke);
		SwapPanelConfirmCMDPlayer2 ci = new SwapPanelConfirmCMDPlayer2(swap);
		
		
		ci.execute();
		assertEquals(2, GameWorld.getInstance().getPlayer2Action());
		assertEquals(poke, GameWorld.getInstance().getPlayer2Pokemon());
		assertTrue(GameWorld.getInstance().getPlayer2ReadyStatus());

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

SwapPanelConfirmCMD sc = new SwapPanelConfirmCMD(new JFrame(), sp);
sp.setSelected(p1.getPokemon(1));
sc.execute();
assertEquals(p1.getPokemon(1), p1.getActive());*/