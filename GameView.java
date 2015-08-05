/**

 **/
public class GameView
{
	private GameState gameState;
	
	public GameView(GameState gameState)
	{
		this.gameState = gameState;
	}
	
	public int storeCash()
	{
		return gameState.getStoreCash();
	}
	
	public String storeName()
	{
		return gameState.getStoreName();
	}
}