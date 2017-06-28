package UI;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Command.CommandInterface;
import Pokemon.Pokemon;
import player.Player;

public class SwapPanel
{
	private JPanel myPanel;
	private JPanel pokemonPanel;
	private JPanel southPanel;
	
	private Player player;
	private Pokemon selected;
	
	private ImageIcon pokemonIcon[];
	private JButton pokemonButton[];
	private JLabel pokemonNameLabel[];
	private JLabel pokemonHPLabel[];
	private JButton backButton, confirmButton;
	
	private CommandInterface pokemonButton1Command;
	private CommandInterface pokemonButton2Command;
	private CommandInterface pokemonButton3Command;
	private CommandInterface backButtonCommand;
	private CommandInterface confirmButtonCommand;
	
	public SwapPanel()
	{
		myPanel = new JPanel(new BorderLayout());
		pokemonPanel = new JPanel(new GridLayout(3, 3));
		southPanel = new JPanel(new GridLayout (1, 2));
		pokemonIcon = new ImageIcon[3];
		pokemonButton = new JButton[3];
		pokemonNameLabel = new JLabel[3];
		pokemonHPLabel = new JLabel[3];
		
		for(int i = 0; i <3; i++)
		{
			pokemonIcon[i] = new ImageIcon();
			pokemonButton[i] = new JButton();
			pokemonNameLabel[i] = new JLabel();
			pokemonHPLabel[i] = new JLabel();
		}
		backButton = new JButton("BACK");
		confirmButton = new JButton("CONFIRM");
		buildPokemonPanel();
		buildSouthPanel();
		myPanel.add("Center",pokemonPanel);
		myPanel.add("South",southPanel);
		
	}
	
	public SwapPanel(Player p1)
	{
		this();
		player = p1;
		for (int i = 0; i<3; i++)
		{
			pokemonIcon[i] = player.getPokemon(i).getImageIcon();
			pokemonButton[i].setIcon(pokemonIcon[i]);
			pokemonNameLabel[i].setText(player.getPokemon(i).getName());
		}
		updateHPLabel();
		
		
	}

	/**
	 * returns main JPanel of class
	 * @return myPanel
	 */
	public JPanel getPanel()
	{
		return myPanel;
	}
	
	public void updateHPLabel()
	{
		for (int i = 0; i<3; i++)
		{
			pokemonHPLabel[i].setText("HP:"+player.getPokemon(i).getCurrentHP()+"/"+player.getPokemon(i).getMaxHP());
		}
	}

	private void buildPokemonPanel()
	{
		for(int i = 0; i<3; i++)
		{
			pokemonPanel.add(pokemonButton[i]);
			pokemonPanel.add(pokemonNameLabel[i]);
			pokemonPanel.add(pokemonHPLabel[i]);
		}
	}
	
	private void buildSouthPanel()
	{
		southPanel.add(confirmButton);
		southPanel.add(backButton);
	}

	/**
	 * sets selected to the pokemon
	 * @param pokemon
	 */
	public void setSelected(Pokemon pokemon)
	{
		if(pokemon != null)
		{
			selected = pokemon;
		}
		
	}
	/**
	 * returns pokemon being stored in selected
	 * @return selected
	 */
	public Pokemon getSelected()
	{
		return selected;
	}
	/**
	 * returns the player stored in swap panel
	 * @return player
	 */
	public Player getPlayer()
	{
		return player;
	}
	
	
}
