package UI;
/**
* makes panel for swapping pokemon
*@author DeemacAlrashdan, Ryan Campbell
*/
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Command.CommandInterface;
import Pokemon.Pokemon;
import player.Player;

public class SwapPanel implements ActionListener
{
	private JPanel myPanel;
	private JPanel pokemonPanel;
	private JPanel southPanel;
	
	private Player player;
	private Pokemon selected;
	
	private ImageIcon pokemonIcon[];
	public JButton pokemonButton[];
	private JLabel pokemonNameLabel[];
	private JLabel pokemonHPLabel[];
	public JButton backButton, confirmButton;
	
	public CommandInterface pokemonButton1Command;
	public CommandInterface pokemonButton2Command;
	public CommandInterface pokemonButton3Command;
	public CommandInterface backButtonCommand;
	public CommandInterface confirmButtonCommand;
	
	/**
	 * constructs SwapPanel, building the JPanel to be used
	 */
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
			pokemonButton[i].addActionListener(this);
			pokemonNameLabel[i] = new JLabel();
			pokemonHPLabel[i] = new JLabel();
		}
		backButton = new JButton("BACK");
		backButton.addActionListener(this);
		confirmButton = new JButton("CONFIRM");
		confirmButton.addActionListener(this);
		buildPokemonPanel();
		buildSouthPanel();
		myPanel.add("Center",pokemonPanel);
		myPanel.add("South",southPanel);
		
	}
	/**
	 * constructs swap panel using the pokemon information of a player
	 * @param p1 player
	 */
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
	/**
	 * updates the HP label for all pokemon to show their current hp
	 */
	public void updateHPLabel()
	{
		for (int i = 0; i<3; i++)
		{
			pokemonHPLabel[i].setText("HP:"+player.getPokemon(i).getCurrentHP()+"/"+player.getPokemon(i).getMaxHP());
		}
	}
	/**
	 * creates the Pokemon sub panel
	 */
	private void buildPokemonPanel()
	{
		for(int i = 0; i<3; i++)
		{
			pokemonPanel.add(pokemonButton[i]);
			pokemonPanel.add(pokemonNameLabel[i]);
			pokemonPanel.add(pokemonHPLabel[i]);
		}
	}
	/**
	 * creates the confirm/back panel
	 */
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
		
			selected = pokemon;

		
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

	/**
	 * sets which buttons are enabled for panel on initial launch
	 */
	public void setEnablesInitial()
	{
		for(int i = 0; i<3; i++)
		{
			if(player.getPokemon(i) == player.getActive())
			{
				pokemonButton[i].setEnabled(false);
			}
			else
			{
				pokemonButton[i].setEnabled(true);
			}
		}
		confirmButton.setEnabled(false);
		
	}

	/**
	 * sets which buttons are enabled after clicking a pokemon button
	 */
	public void setEnablesSelect()
	{
		for(int i = 0; i<3; i++)
		{
			if(player.getPokemon(i) == player.getActive() || player.getPokemon(i) == selected)
			{
				pokemonButton[i].setEnabled(false);
			}
			else
			{
				pokemonButton[i].setEnabled(true);
			}
		}
		confirmButton.setEnabled(true);
		
	}

	/**
	 * handles button clicks
	 */
	@Override
	public void actionPerformed(ActionEvent event)
	{
		if (event.getSource() == pokemonButton[1])
		{
			pokemonButton1Command.execute();
		}
		else if (event.getSource() == pokemonButton[2])
		{
			pokemonButton2Command.execute();
		}
		else if (event.getSource() == pokemonButton[3])
		{
			pokemonButton3Command.execute();
		}
		else if (event.getSource() == backButton)
		{
			backButtonCommand.execute();
		}
		else if (event.getSource() == confirmButton)
		{
			confirmButtonCommand.execute();
		}
		
	}
	
	
}
