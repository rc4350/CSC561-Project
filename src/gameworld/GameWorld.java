package gameworld;

import java.util.ArrayList;

import Attack.Attack;
import player.Player;
import Pokemon.Pokemon;

public class GameWorld 
{
	private static GameWorld gameWorld;
	private ArrayList<Pokemon> pokemon; 
	private Player player1;
	private Player player2;
	private int player1Action;
	private int player2Action;
	private boolean checkp1Ready;
	private boolean checkp2Ready;
	
	private Attack p1Attack;
	private Attack p2Attack;
	private Pokemon p1Pokemon;
	private Pokemon p2Pokemon;
	
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

	/**
	 * returns current value of player 1 action
	 * @return player1Action
	 */
	public int getPlayer1Action()
	{
		return player1Action;
	}

	/**
	 * returns attack selected by player 1
	 * @return p1Attack;
	 */
	public Attack getPlayer1Attack()
	{
		return p1Attack;
	}

	/**
	 * sets player1Action to 1, and sets p1Attack to the passed attk
	 * @param attk attack for player 1
	 */
	public void setActionPlayer1Attack(Attack attk)
	{
		player1Action = 1;
		p1Attack = attk;
	}

	/**
	 * sets player2Action to 1, and sets p1Attack to the passed attk
	 * @param attk attack for player 2
	 */
	public void setActionPlayer2Attack(Attack attk)
	{
		
		player2Action = 1;
		p2Attack = attk;
	}

	/**
	 * returns current value of player 2 action
	 * @return player2Action
	 */
	public int getPlayer2Action()
	{
		return player2Action;
	}

	/**
	 * returns attack selected by player 2
	 * @return p1Attack;
	 */
	public Attack getPlayer2Attack()
	{
		return p2Attack;
	}
	/**
	 * 
	 * @return p1Pokemon
	 */
	public Pokemon getPlayer1Pokemon()
	{
		return p1Pokemon;
	}
	/**
	 * sets player1Action to 2 and p1Pokemon to pass pokemon
	 * @param poke
	 */
	public void setActionPlayer1Swap(Pokemon poke)
	{
		player1Action = 2;
		p1Pokemon = poke;
		
	}
	/**
	 * 
	 * @return p2Pokemon
	 */
	public Pokemon getPlayer2Pokemon()
	{
		return p2Pokemon;
	}
	/**
	 * sets player1Action to 2 and p1Pokemon to pass pokemon
	 * @param poke
	 */
	public void setActionPlayer2Swap(Pokemon poke)
	{
		player2Action = 2;
		p2Pokemon = poke;
		
	}
	
	
	
}
