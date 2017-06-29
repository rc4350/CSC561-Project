package player;

import java.util.ArrayList;

import Pokemon.Pokemon;
/**
*Player class builds players information including pokemon team
*@author DeemacAlrashdan, Ryan Campbell
*/
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

	/**
	 * returns pokemon from team at specified index
	 * @param index index
	 * @return pokemon at index
	 */
	public Pokemon getPokemon(int index)
	{
		if(index < 0 || index>=team.size())
		{
			return null;
		}
		else
			return team.get(index);
	}
	
	
}
