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
	public GameWorld()
	{
		gameWorld = new GameWorld();
		player1 = new Player();
		player2 = new Player();
	}
	
	/**
	 * getInstance
	 * @return
	 */
	public static GameWorld getInstance()
	{
		return gameWorld;
	}
}
