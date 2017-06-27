package Attack;

import Type.PkmnType;

public class AttackFactory 
{
	/**
	 * Get the type of Attack
	 * 1 for fire, 2 for water, 3 for grass
	 * @param typeAttack
	 * @return
	 */
	public Attack attackFactory(int typeAttack){
	/
	if(typeAttack == 1)
	{
		return new Attack(typeAttack, 100, 100);
	         
	} else if(typeAttack == 2)
	{
		return new Attack(typeAttack, 40, 40);
	         
	}else if(typeAttack == 3)
	{
		return new Attack(typeAttack, 10, 10);
	         
	}
	      
	 return null;
	 }

/*	public Attack getFireStrong()
	{
		//attack k = new Attack();
		//setters
		//return k
		return new Attack("FireBlast", PkmnType.FIRE, 80, 1);
		
	}*/
}
