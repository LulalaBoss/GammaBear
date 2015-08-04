/**
 **/
public class Dish
{
	private String name;		
	private int prepTime;
	private int quality;
	
	public Dish(String name, int pTime)
	{
		this.name = name;
        prepTime = pTime;
		quality = 0;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getPrepTime()
	{
		return prepTime;
	}
	
	public int getQuality()
	{
		return quality;		
	}
	
}