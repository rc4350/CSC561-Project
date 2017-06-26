package Attack;

public class Attack
{
	private int damage;
	private int speed;
	private char type;
	
	public Attack()
	{
		//defaults
		damage = 10;
		speed = 1;
		type = 'F';
	}
	/**
	 * 
	 * @return the ammount of base damage the attack does
	 */
	public int getDamage()
	{
		return damage;
	}
	
	/**
	 * sets the amount of damage an attack does
	 * @param dmg amount of damage to set
	 */
	public void setDamage(int dmg)
	{
		damage = dmg;
	}
	/**
	 * gets the speed of the attack
	 * @return speed of attack
	 */
	public int getSpeed()
	{
		// TODO Auto-generated method stub
		return speed;
	}
	/**
	 * sets the speed of the attack
	 * @param spd speed to set
	 */
	public void setSpeed(int spd)
	{
		speed = spd;
		
	}
	/**
	 * gets the attack type
	 * @return char represent the type of attack
	 */
	public char getType()
	{
		return type;
	}
	/**
	 * sets the type of attack
	 * @param attktype type to set
	 */
	public void setType(char attktype)
	{
		type = attktype;	
	}

}
