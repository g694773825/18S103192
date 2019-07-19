
import java.util.Scanner;

public class Game {
	
	public  Game(){

		Scanner in = new Scanner(System.in);
		while(true){
			System.out.println("请输入游戏类型：chess:国际象棋      go：围棋     end: 结束");
			String s = in.next();
			if(s.equals("end")){
				break;
			}
			System.out.println("请输入玩家1姓名");
			String playername = in.next();
			Player player1 = new Player();
			player1.setPlayername(playername);
			System.out.println("请输入玩家2姓名");
			playername = in.next();
			
			Player player2 = new Player();
			player2.setPlayername(playername);
			ActionImpl action = new ActionImpl();
			
			//共用变量
			int x = 0,y = 0;
			int x1= 0,y1= 0;
			int choose = 0;
			int p = 0;
			
			//国际象棋逻辑
			
			if(s.equals("chess")){
				Board chess = new Board();
				chess.createBoard(8);
				
				while(true){
					System.out.println("请player1 选择操作 1、落子  2、回合结束  3、end ");
					
					//player1 阶段
					choose = in.nextInt();
					if(choose==1){
						System.out.println("请输入移子坐标例如： 1 1 2 2 为将（1，1）位置的棋子移到（2，2）位置");
						x = in.nextInt();
						y = in.nextInt();
						x1= in.nextInt();
						y1= in.nextInt();
						action.chessPlaying(x, y, x1, y1, player1, chess);
						
					}
					if(choose==2){
						System.out.println("回合跳过");
					}
					if(choose==3){
						System.out.println("游戏结束,player2胜利");
						break;
					}
					chess.print();
					
					//Player2 阶段
					System.out.println("请player2  选择操作 1、落子  2、回合结束  3、end ");
					choose = in.nextInt();
					if(choose==1){
						System.out.println("请输入移子坐标例如： 1 1 2 2 为将（1，1）位置的棋子移到（2，2）位置");
						x = in.nextInt();
						y = in.nextInt();
						x1= in.nextInt();
						y1= in.nextInt();
						action.chessPlaying(x, y, x1, y1, player2, chess);
						
					}
					if(choose==2){
						System.out.println("回合跳过");
					}
					if(choose==3){
						System.out.println("游戏结束,player1胜利");
						break;
					}
					chess.print();
				}
				
				
				System.out.println("是否查看plaer1下棋记录？ 1、是  2、否");
				p = in.nextInt();
				if(p==1){
					player1.printRecord();
				}
				System.out.println("是否查看plaer2下棋记录？ 1、是  2、否");
				p = in.nextInt();
				if(p==1){
					player2.printRecord();
				}
				
				
				
				
				
				
				
				
				
			
				
			//围棋逻辑
				
			}else if(s.equals("go")){
					Board go = new Board();
					go.createBoard(18);
					while(true){
						//player1 阶段
						System.out.println("请player1 选择操作 1、落子  2、回合结束  3、end ");
						choose = in.nextInt();
						if(choose == 1){
							System.out.println("请输入落子坐标例如： 1 1");
							x = in.nextInt();
							y = in.nextInt();
							//go
							action.goPlaying(x, y, go, player1, 'A');
							System.out.println("请输入提子数量，0为不提子");
							int killNumber = in.nextInt();
							while(killNumber>0){
								System.out.println("请输入提子坐标例如： 1 1");
								x = in.nextInt();
								y = in.nextInt();
								action.takeAway(x, y, go);
								killNumber--;
							}
							System.out.println("提子阶段结束");
						}
						if(choose == 2){							
							System.out.println("回合跳过");
						}
						if(choose == 3){
							System.out.println("游戏结束,player2胜利");
							break;
						}
						go.print();
						//player2 阶段
						System.out.println("请player2  选择操作 1、落子  2、回合结束  3、end ");
						choose = in.nextInt();
						if(choose == 1){
							System.out.println("请输入落子坐标例如： 1 1");
							x = in.nextInt();
							y = in.nextInt();
							//go
							action.goPlaying(x, y, go, player2, 'B');
							System.out.println("请输入提子数量，0为不提子");
							int killNumber = in.nextInt();
							while(killNumber>0){
								System.out.println("请输入提子坐标例如： 1 1");
								x = in.nextInt();
								y = in.nextInt();
								action.takeAway(x, y, go);
								killNumber--;
							}
							System.out.println("提子阶段结束");
						}
						if(choose == 2){							
							System.out.println("回合跳过");
						}
						if(choose == 3){
							System.out.println("游戏结束,player1胜利");
							break;
						}
						go.print();
					
				}
				
				System.out.println("是否查看plaer1下棋记录？ 1、是  2、否");
				if(p==1){
					player1.printRecord();
				}
				System.out.println("是否查看plaer2下棋记录？ 1、是  2、否");
				p = in.nextInt();
				if(p==1){
					player2.printRecord();
				}
					
				
			}else{
				System.out.println("无效输入!");
			}
			
		}
		
		
	
	}
}
