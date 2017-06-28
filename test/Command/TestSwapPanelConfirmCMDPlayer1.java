package Command;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

import Command.CommandInterface;
import Command.SwapPanelConfirmCMDPlayer1;
import Pokemon.Pokemon;
import UI.SwapPanel;
import gameworld.GameWorld;

public class TestSwapPanelConfirmCMDPlayer1
{

	@Test
	public void testConstruct()
	{
		SwapPanelConfirmCMDPlayer1 ci = new SwapPanelConfirmCMDPlayer1(null);
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
		SwapPanelConfirmCMDPlayer1 ci = new SwapPanelConfirmCMDPlayer1(swap);
		
		
		ci.execute();
		assertEquals(2, GameWorld.getInstance().getPlayer1Action());
		assertEquals(poke, GameWorld.getInstance().getPlayer1Pokemon());
		assertTrue(GameWorld.getInstance().getPlayer1ReadyStatus());

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