/**
 * A Hotjava game ( http://toomkygames.com/download-free-games/hot-java )
 * 
 */
public class HotjavaGame
{
	/**
	 * the board
	 */
	private Board board;
	
	/**
	 * the player
	 */
	private Player player;

	/**
	 * Return a new Hotjava game, with a board full of pipes choose randomly, hidden or discovered, 
	 * contain also a starting and an ending case. Player is ready to play.
	 */
	public HotjavaGame()
	{
		this.board = new Board();
		this.player = new Player();
	}
	
	/**
	 * Plays the game, wait for user's action and do the instruction.
	 * each user's action decrease the cooldown before the coffee start.
	 * restart the process while the game is not over.
	 * 
	 * 
	 * while(<game not over>)
	 *  do
	 *  	<ask player for action> (select a hidden pipe or swap 2 visible pipe)
	 *  while (<action is not valid>)
	 *  <perform action>
	 *  <update coffee stream>
	 *  	
	 */
	public void play()
	{
		boolean gameover = false;
		
		
		while(gameover == false)
		{
			Player.action();
			while(Player.valid == false)
			{
				
			}
			UpdateCoffee();
		}
	}

	// TODO rename method (coding conventions)
	private void UpdateCoffee() 
	{
		
	}

}
