public class Menu
{
	public String name;
	public int price;
	public Dish dish;
	
	public Menu(String name, int price, Dish dish)
	{
		this.dish = dish;
		this.price = price;
		this.name = name;
	}
	
	public int getPrice()
	{
		return price;
	}
	
	public String getName()
	{
		return name;
	}
	
	public Dish getDish()
	{
		return dish;
	}
}