import java.util.ArrayList;

public class Player {
	public String playername;
	public ArrayList<String> actionRecord = new ArrayList<>();
	
	public String getPlayername() {
		return playername;
	}
	public void setPlayername(String playername) {
		this.playername = playername;
	}
	public ArrayList<String> getActionRecord() {
		return actionRecord;
	}
	public void setActionRecord(ArrayList<String> actionRecord) {
		this.actionRecord = actionRecord;
	}
	public void record(int x,int y){
		actionRecord.add(""+x+", "+y);
	}
	public void printRecord(){
		for(int i =1;i<=actionRecord.size();i++){
			System.out.println(i+" "+actionRecord.get(i-1));
		}
	}
	public void chessRecord(int x,int y,int x1,int y1,char type){
		actionRecord.add(type+" "+x+" ,"+y+" "+"->"+x1+" ,"+y1);
	}
}
