package player;

import java.util.ArrayList;

import Pokemon.Pokemon;

public class Player 
{
	private ArrayList<Pokemon> team;
	private Pokemon active = null;
	//private PlayerScreen pscr = new PlayerScreen();
	
	/**
	 * Constructor
	 */
	public Player()
	{
		team = new ArrayList<Pokemon>();
	}
	
	/**
	 * addPokemon
	 * @param poke
	 */
	public void addPokemon(Pokemon poke)
	{
		team.add(poke);
	}
	
	/**
	 * ChangeActive
	 * @param poke
	 * @return 
	 */
	public void changeActive(Pokemon poke)
	{
		active = poke;
	}
	
	
	public Pokemon getActive()
	{
		return active;
	}
	

}
