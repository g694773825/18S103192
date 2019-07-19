

public class PlayerImpl implements PlayerAction {
	public String player1name;
	public String player2name;
	@Override
	public void addPlayer(String player1, String player2) {
		player1name = player1;
		player2name = player2;

	}
	
	public void getPlayersName(){
		System.out.println("play1 的名字："+player1name+"    player2 的名字"+player2name);
	}
	

}
