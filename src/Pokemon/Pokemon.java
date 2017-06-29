package Pokemon;

/**
* Pokemon object.
*@author DeemacAlrashdan, Ryan Campbell
*/
import java.util.ArrayList;

import javax.swing.ImageIcon;

import Attack.Attack;
import Type.NoType;
import Type.TypeBehavior;

public class Pokemon
{
	private String name;
	private int maxHitPoints;
	private int currentHP;
	private TypeBehavior myType;
	private ArrayList<Attack> attacks;
	private ImageIcon myImage;
	
	/**
	 * creates a pokemon with given name and hp
	 * @param pokemonName name
	 * @param hp hitpoints
	 */
	public Pokemon(String pokemonName, int hp)
	{
		name = pokemonName;
		if(hp < 1)
		{
			maxHitPoints = 1;
		}
		else
		{
			maxHitPoints = hp;
		}
		currentHP = maxHitPoints;
		attacks = new ArrayList<Attack>();
		myType = new NoType();
	}
	/**
	 * creates a pokemon with given name and hp and TypeBehavior
	 * @param pokemonName name
	 * @param hp hitpoints
	 * @tb TypeBehavrio
	 */
	public Pokemon(String pokemonName, int hp, TypeBehavior tb)
	{
		this(pokemonName, hp);
		myType = tb;
	}

	/**
	 * gets the max HP of  pokemon
	 * @return maxHitPoints
	 */
	public int getMaxHP()
	{

		return maxHitPoints;
	}

	/**
	 * returns current hit points of pokemon
	 * @return currentHP
	 */
	public int getCurrentHP()
	{
	
		return currentHP;
	}

	/**
	 * sets maxHitPoints and currentHP to the passed value.
	 * values less than 1 default to 1
	 * @param newHP new Hit Points
	 */
	public void setHP(int newHP)
	{
		if(newHP <1)
		{
			maxHitPoints = 1;
		}
		else
		{
			maxHitPoints = newHP;
		}
		currentHP = maxHitPoints;
		
	}
	/**
	 * changes the currentHP of the pokemon
	 * if value is less than zero, currentHP is set to zero
	 * if value is more than maxHitPoints, currentHP is set to maxHitPoints
	 * @param newCurrent new current hit points
	 */
	public void setCurrentHP(int newCurrent)
	{
		if(newCurrent < 0)
		{
			currentHP = 0;
		}
		else if(newCurrent >maxHitPoints)
		{
			currentHP = maxHitPoints;
		}
		else
		{
			currentHP = newCurrent;
		}
	}
	/**
	 * gets the name of the pokemon
	 * @return name
	 */
	public String getName()
	{
		
		return name;
	}
	/**
	 * changes the name of the pokemon
	 * @param newName new Name for pokemon
	 */
	public void setName(String newName)
	{
		if(newName != null)
		{
			name = newName;
		}
		
	}
	/**
	 * returns the attack from the attacks Array List at the specified index
	 * @param index index of attack
	 * @return attack at index
	 */
	public Attack getAttack(int index)
	{
		if(index >= attacks.size() || index < 0)
		{
			return null;
		}
		else
			return attacks.get(index);
	}
	/**
	 * adds an attack to the array list if room available
	 * @param newAttack new attack to add to list
	 */
	public void addAttack(Attack newAttack)
	{
		if (attacks.size()<4)
		{
			attacks.add(newAttack);
		}
		
	}
	/**
	 * returns pokemon's type
	 * @return myType
	 */
	public TypeBehavior getType()
	{
		
		return myType;
	}
	/**
	 * sets the pokemon's type to the specified type
	 * @param newType instance of type to set myType to
	 */
	public void setType(TypeBehavior newType)
	{
		if(newType != null)
			myType = newType;
		
	}
	/**
	 * method for dealing damage to a pokemon
	 * @param recAttack attack pokemon is receiving
	 */
	public void takeHit(Attack recAttack)
	{
		if (recAttack != null)
		{
			currentHP -= myType.takeHit(recAttack.getType(), recAttack.getDamage());
			if (currentHP < 0)
			{
				currentHP = 0;
			}
		}
		
	}
	/**
	 * sets the icon for the pokemon
	 * @param newImage ImageIcon for pokemon
	 */
	public void setImageIcon(ImageIcon newImage)
	{
		if(newImage != null)
		{
			myImage = newImage;
		}
		
	}
	/**
	 * gets the pokemon's image
	 * @return pokemon's myImage
	 */
	public ImageIcon getImageIcon()
	{
		
		return myImage;
	}

}
