package UI;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Attack.Attack;
import Command.CommandInterface;
import player.Player;

public class AttackPanel implements ActionListener
{
	private JPanel mainPanel;
	private JPanel pokemonPanel;
	private JPanel buttonsPanel;
	private JPanel backPanel;
	
	public JLabel iconPoke;
	
	private Player player;
	private Attack selected;
	
	private ImageIcon pokemonIcon;
	private JButton attackButton1, attackButton2, attackButton3, attackButton4;
	public JButton backButton;
	
	public CommandInterface BtnAttack1Command;
	public CommandInterface BtnAttack2Command;
	public CommandInterface BtnAttack3Command;
	public CommandInterface BtnAttack4Command;
	public CommandInterface backButtonCommand;
	
	/**
	 * Constructor
	 */
	public AttackPanel(Player p1)
	{
		player = p1;
		mainPanel = new JPanel( new BorderLayout());
		pokemonPanel = new JPanel (new GridLayout(1,1));
		buttonsPanel = new JPanel ( new GridLayout(2,2));
		backPanel = new JPanel (new GridLayout (1,1));
		//pokemonIcon = new ImageIcon();
		attackButton1 = new JButton("A1");
		attackButton2 = new JButton("A2");
		attackButton3 = new JButton("A3"); 
		attackButton4 = new JButton ("A4");
		
		attackButton1.addActionListener(this);
		attackButton2.addActionListener(this);
		attackButton3.addActionListener(this);
		attackButton4.addActionListener(this);	
		
		backButton = new JButton("BACK");

		
		/**
		 * Pokemon panel
		 */
		iconPoke = new JLabel(player.getActive().getImageIcon());
		pokemonPanel.add(iconPoke);
		
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
	
	/**
	 * Constructor two
	 * @param p1
	 */
	/*public AttackPanel(Player p1)
	{
		this();
		player = p1;

			//pokemonIcon = p1.getPokemon(0).getImageIcon();
			//System.out.println(pokemonIcon);
			//iconPoke.setIcon(pokemonIcon);	
	}*/
	
	/**
	 * get panel
	 * @return
	 */
	public JPanel getPanel()
	{
		return mainPanel;
	}
	
	/**
	 * get attack
	 * @return
	 */
	public Attack getSelected()
	{
		return selected;
	}
	
	/**
	 * Set attack
	 * @param selected
	 */
	public void setSelected(Attack selected)
	{
		this.selected = selected;
	}
	
	/**
	 * action listener for buttons
	 */
	@Override
	public void actionPerformed(ActionEvent event) 
	{
		if (event.getSource() == attackButton1)
		{
			BtnAttack1Command.execute();
		}
		else if (event.getSource() == attackButton2)
		{
			BtnAttack2Command.execute();
		}
		else if (event.getSource() == attackButton3)
		{
			BtnAttack3Command.execute();
		}
		else if (event.getSource() == attackButton4)
		{
			BtnAttack4Command.execute();
		}
		else if (event.getSource() == backButton)
		{
			backButtonCommand.execute();
		}		
	}
}