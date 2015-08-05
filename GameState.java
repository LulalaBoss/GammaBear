/**

 **/
public class GameState
{
	private Store store;
	private Environment environment;
	
	// Constructor used for creating new game state
	public GameState(String name, int cash)
	{
		store = new Store(name, cash);
		environment = new Environment();
	}
	
	// TODO: a constructor for loading a saved game
	
	public int getStoreCash()
	{
		return store.cash;
	}
	
	public String getStoreName()
	{
		return store.name;
	}
}