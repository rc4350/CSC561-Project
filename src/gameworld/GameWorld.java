package gameworld;

import java.util.ArrayList;

import player.Player;
import Pokemon.Pokemon;

public class GameWorld 
{
	private static GameWorld gameWorld;
	private ArrayList<Pokemon> pokemon; 
	private Player player1;
	private Player player2;
	
	
	/**
	 * Constructor
	 */
	private GameWorld()
	{
		pokemon = new ArrayList<Pokemon>();
	}
	
	/**
	 * getInstance
	 * @return
	 */
	public static GameWorld getInstance()
	{
		if(gameWorld == null)
		{
			gameWorld = new GameWorld();
			return gameWorld;
		}
		else
			return gameWorld;
	}
	
	/**
	 * sets player1
	 * @param plyr player to assaign as player1
	 */
	public void addPlayer1(Player plyr)
	{
		if(player1 == null)
		{
			player1 = plyr;
		}
	}
	/**
	 * sets player2
	 * @param plyr player to assaign as player2
	 */
	public void addPlayer2(Player plyr)
	{
		if(player2 == null)
		{
			player2 = plyr;
		}
	}
	
	
	/**
	 * test method for reseting environment
	 */
	protected static void reset()
	{
		gameWorld = null;
	}

	/**
	 * gets player1
	 * @return player1
	 */
	public Player getPlayer1()
	{
		return player1;
	}
	/**
	 * gets player2
	 * @return player2
	 */
	public Player getPlayer2()
	{
		return player2;
	}
	/**
	 * adds a pokemon to the pokemon list
	 * @param p1
	 */
	public void addPokemon(Pokemon pkmn)
	{
		if(pkmn != null)
		{
			pokemon.add(pkmn);
		}
		
	}
	/**
	 * returns the pokemon at the specificed index
	 * @param index index
	 * @return pokemon at index
	 */
	public Pokemon getPokemon(int index)
	{
		if(index  < 0 || index >= pokemon.size())
		{
			return null;
		}
		else
			return pokemon.get(index);
	}
	/**
	 * returns the size of the pokemon list
	 * @return pokemon.size
	 */
	public int getPokemonListSize()
	{
		return pokemon.size();
	}
}
