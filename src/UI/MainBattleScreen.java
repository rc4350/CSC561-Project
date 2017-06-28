package UI;
import java.awt.GridLayout;

/**
 * main battle screen for game
 * @author Ryan, Deema
 */
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainBattleScreen extends JFrame
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected JPanel battlePanelOne, battlePanelTwo;
	protected JPanel swapPanelOne, swapPanelTwo;
	protected JPanel attackPanelOne, attackPanelTwo;
	protected JPanel currentPanelOne, currentPanelTwo; //keeps track of current JPanel in container
	
	/**
	 * constructor receives the 6 player panels and sets the battle panels as the current panels
	 * @param p1bp
	 * @param p2bp
	 * @param p1sp
	 * @param p2sp
	 * @param p1ap
	 * @param p2ap
	 * JPanel p1bp, JPanel p2bp, JPanel p1sp, JPanel p2sp, JPanel p1ap, JPanel p2ap
	 */
	public MainBattleScreen()
	{
		this.setSize(640, 480);
		this.setLayout(new GridLayout(1,2));
	}

	/**
	 * setter for battlePanelOne
	 * @param panel
	 */
	public void setBattlePanelOne(JPanel panel)
	{
		battlePanelOne = panel;
	}
	/**
	 * setter for battlePanelTwo
	 * @param panel
	 */
	public void setBattlePanelTwo(JPanel panel)
	{
		battlePanelTwo = panel;		
	}
	/**
	 * setter for swapPanelOne
	 * @param panel
	 */
	public void setSwapPanelOne(JPanel panel)
	{
		swapPanelOne = panel;
		
	}
	/**
	 * setter for swapPanelTwo
	 * @param panel
	 */
	public void setSwapPanelTwo(JPanel panel)
	{
		swapPanelTwo = panel;
		
	}
	/**
	 * setter for attackPanelOne
	 * @param panel
	 */
	public void setAttackPanelOne(JPanel panel)
	{
		attackPanelOne = panel;
		
	}
	/**
	 * setter for attackPanelTwo
	 * @param panel
	 */
	public void setAttackPanelTwo(JPanel panel)
	{
		attackPanelTwo = panel;
		
	}
	/**
	 * setter for currentPanelOne
	 * @param panel
	 */
	public void setCurrentPanelOne(JPanel panel)
	{
		currentPanelOne = panel;
		
	}
	/**
	 * setter for currentPanelTwo
	 * @param panel
	 */
	public void setCurrentPanelTwo(JPanel panel)
	{
		currentPanelTwo = panel;
		
	}
	
	/**
	 * assigns panels to the correct variables and adds starting panels to frame.
	 * @param p2a player 2 attack panel
	 * @param p1a player 1 attack panel
	 * @param p2s player 2 swap panel
	 * @param p1s player 1 swap panel
	 * @param p2b player 2 battle panel
	 * @param p1b plaer 2 battle panel
	 */
	public void initialize(JPanel p1b, JPanel p2b, JPanel p1s, JPanel p2s, JPanel p1a, JPanel p2a)
	{
		battlePanelOne = p1b;
		battlePanelTwo = p2b;
		swapPanelOne = p1s;
		swapPanelTwo = p2s;
		attackPanelOne = p1a;
		attackPanelTwo = p2a;
		currentPanelOne  = p1b;
		currentPanelTwo = p2b;
		
		this.add(currentPanelOne);
		this.add(currentPanelTwo);
		this.validate();
		this.setVisible(true);
	}
	
	/**
	 * test method for updatePlayer1Panel
	 */
	protected void testMethodPlayer1SetUp()
	{
		this.add(currentPanelOne);
		this.add(currentPanelTwo);
		this.validate();
		this.setVisible(true);
	}
	/**
	 * updates frame to change player 1 panel
	 * @param swapTo panel to swap to for player1. 1 for battle, 2 for swap, 3 for attack
	 */
	public void updatePlayer1Panel(int swapTo)
	{
		if(swapTo == 1)
		{
			this.remove(currentPanelOne);
			this.remove(currentPanelTwo);
			currentPanelOne = battlePanelOne;
			this.add(currentPanelOne);
			this.add(currentPanelTwo);
			this.validate();
		}
		else if(swapTo == 2)
		{
			this.remove(currentPanelOne);
			this.remove(currentPanelTwo);
			currentPanelOne = swapPanelOne;
			this.add(currentPanelOne);
			this.add(currentPanelTwo);
			this.validate();
		}
		else if(swapTo == 3)
		{
			this.remove(currentPanelOne);
			this.remove(currentPanelTwo);
			currentPanelOne = attackPanelOne;
			this.add(currentPanelOne);
			this.add(currentPanelTwo);
			this.validate();
		}
		
	}
}
