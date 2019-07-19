
public class Board {
	public char[][] boa  ;
	public Piece piece;
	
	public Piece getPiece() {
		return piece;
	}
	public void setPiece(Piece piece) {
		this.piece = piece;
	}
	public char[][] createBoard(int n){
		boa = new char[n][n];
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				boa[i][j]='*';
			}
		}
		if(n==8){
			boa[0][0] = 'R'; boa[7][0] = 'r';
			boa[0][7] = 'R'; boa[7][7] = 'r';
			boa[0][1] = 'K'; boa[7][1] = 'k';
			boa[0][6] = 'K'; boa[7][6] = 'k';
			boa[0][2] = 'B'; boa[7][2] = 'b';
			boa[0][5] = 'B'; boa[7][5] = 'b';
			boa[0][3] = 'W'; boa[7][3] = 'w';
			boa[0][4] = 'Q'; boa[7][4] = 'q';
			for(int i=0;i<n;i++){
				boa[1][i] = 'P';
				boa[6][i] = 'p';
			}
		}
		return boa;
	}
	public void print(){
		if(boa==null||boa.length==0){
			System.out.println("请先初始化棋盘");
		}else{
			for(int i=0;i<boa.length;i++){
				for(int j=0;j<boa[0].length;j++){
					System.out.print(boa[i][j]+" ");
				
				}
				System.out.println();
			}
		}
	}
	
	public char[][] getBoa() {
		return boa;
	}
	public void setBoa(char[][] boa) {
		this.boa = boa;
	}
	public void goPlay(int x,int y,char type){
		boa[x-1][y-1] = type;
	}
	public void chessPlay(int x,int y,int x1,int y1){
		boa[x1-1][y1-1] = boa[x-1][y-1];
		boa[x-1][y-1]   = '*';
	}
}
