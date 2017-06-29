package Attack;

import Type.PkmnType;
/**
 * AttackFactory class to create instances of attack that have different name, type, damage ,and speed
 * @author Deema Alrashdan, Ryan Campbell
 */
public class AttackFactory 
{
	
	/**
	 * get attack (fireStrong) 
	 * @return the new attack
	 */
	public Attack getFireStrong()
	{
		return new Attack ("FireStrong", PkmnType.FIRE,80,1);
	}
	
	/**
	 * get attack (fireMedium) 
	 * @return the new attack
	 */
	public Attack getFireMedium()
	{
		return new Attack ("FireMedium", PkmnType.FIRE,60,2);
	}
	
	/**
	 * get attack (fireWeak) 
	 * @return the new attack
	 */
	public Attack getFireWeak()
	{
		return new Attack ("FireWeak", PkmnType.FIRE,40,3);
	}
	/**
	 * get attack (waterStrong) 
	 * @return the new attack
	 */
	public Attack getWaterStrong()
	{
		return new Attack ("WaterStrong", PkmnType.WATER,80,1);
	}
	
	/**
	 * get attack (waterMedium) 
	 * @return the new attack
	 */
	public Attack getWaterMedium()
	{
		return new Attack ("WaterMedium", PkmnType.WATER,60,2);
	}
	
	/**
	 * get attack (waterWeak) 
	 * @return the new attack
	 */
	public Attack getWaterWeak()
	{
		return new Attack ("WaterWeak", PkmnType.WATER,40,3);
	}
	
	/**
	 * get attack (grassStrong) 
	 * @return the new attack
	 */
	public Attack getGrassStrong()
	{
		return new Attack ("GrassStrong", PkmnType.GRASS,80,1);
	}
	
	/**
	 * get attack (grassMedium) 
	 * @return the new attack
	 */
	public Attack getGrassMedium()
	{
		return new Attack ("GrassMedium", PkmnType.GRASS,60,2);
	}
	
	/**
	 * get attack (grassWeak) 
	 * @return the new attack
	 */
	public Attack getGrassWeak()
	{
		return new Attack ("GrassWeak", PkmnType.GRASS,40,3);
	}
}