package UI;


import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Pokemon.Pokemon;
import player.Player;


/**
 * Battle panel class which contain active pokemon icon, HP for the active pokemon, and attack and swpe buttons
 * @author Deema Alrashdan, Ryan Campbell
 */
public class BattlePanel
{
	private JPanel mainPanel;
	private JPanel pokemonPanel;
	private JPanel statsPanel;
	private JPanel buttonsPanel;
	
	public JLabel iconPoke;
	private Player player;
	private ImageIcon pokemonImage;
	private Pokemon pokemon;
	private JLabel hpInfo;
	private JButton attackButton;
	private JButton swapButton;
	
	/**
	 * Constructor
	 */
	public BattlePanel()
	{
		
		mainPanel = new JPanel( new BorderLayout());
		pokemonPanel = new JPanel (new GridLayout(1,1));
		statsPanel = new JPanel (new GridLayout(1,1));
		buttonsPanel = new JPanel (new GridLayout(2,1));
		pokemonImage = new ImageIcon();
		
		hpInfo = new JLabel("HP Info");
		attackButton = new JButton("Attack");
		swapButton = new JButton("Swap");
		
		/**
		 * Pokemon panel icon
		 */
		iconPoke = new JLabel(player.getActive().getImageIcon());
		pokemonPanel.add(iconPoke);
		
		/**
		 * HPInfo
		 */
		statsPanel.add(hpInfo);
		/**
		 * Buttons
		 */
		buttonsPanel.add(attackButton);
		buttonsPanel.add(swapButton);
		
		/**
		 * add panels to main panel 
		 */ 
		mainPanel.add("North", pokemonPanel);
		mainPanel.add("Center", statsPanel);
		mainPanel.add("South", buttonsPanel);	
	}

	
	/**
	 * returns main JPanel of class
	 * @return myPanel
	 */
	public JPanel getPanel()
	{
		return mainPanel;
	}
}