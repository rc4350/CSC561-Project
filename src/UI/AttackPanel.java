package UI;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

import Attack.Attack;
import Command.CommandInterface;
import player.Player;

public class AttackPanel 
{
	private JPanel mainPanel;
	private JPanel pokemonPanel;
	private JPanel buttonsPanel;
	private JPanel backPanel;
	
	private Player player;
	private Attack selected;
	
	private ImageIcon pokemonIcon;
	private JButton attackButton1, attackButton2, attackButton3, attackButton4;
	private JButton backButton;
	
	private CommandInterface BtnAttack1Command;
	private CommandInterface BtnAttack2Command;
	private CommandInterface BtnAttack3Command;
	private CommandInterface BtnAttack4Command;
	private CommandInterface backButtonCommand;
	
	/**
	 * Constructor
	 */
	public AttackPanel()
	{
		mainPanel = new JPanel( new BorderLayout());
		pokemonPanel = new JPanel (new GridLayout(1,1));
		buttonsPanel = new JPanel ( new GridLayout(2,2));
		backPanel = new JPanel (new GridLayout (1,1));
		pokemonIcon = new ImageIcon();
		attackButton1 = new JButton("A1");
		attackButton2 = new JButton("A2");
		attackButton3 = new JButton("A3");
		attackButton4 = new JButton ("A4");
		backButton = new JButton("BACK");
		
		/**
		 * Pokemon panel
		 */
		pokemonIcon = player.getActive().getImageIcon();
		//.setIcon(pokemonIcon); 
		
		/**
		 * buttons Panel
		 */
		buttonsPanel.add(attackButton1);
		buttonsPanel.add(attackButton2);
		buttonsPanel.add(attackButton3);
		buttonsPanel.add(attackButton4);
		
		/**
		 * back button
		 */
		backPanel.add(backButton);
		
		/**
		 * add panels to main panel 
		 */
		mainPanel.add("North", pokemonPanel);
		mainPanel.add("Center",buttonsPanel);
		mainPanel.add("South", backPanel);		
	}
	
	public JPanel getPanel()
	{
		return mainPanel;
	}
	public Attack getSelected()
	{
		return selected;
	}
	public void setSelected(Attack selected)
	{
		this.selected = selected;
	}
}