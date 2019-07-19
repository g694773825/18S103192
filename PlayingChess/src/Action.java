import javax.swing.border.Border;

public interface Action {
	public  void goPlaying(int x,int y,Board boa,Player player,char type);
	public  void takeAway(int x,int y,Board boa);
	public  void chessPlaying(int x,int y,int x1,int y1,Player player,Board boa);
}
