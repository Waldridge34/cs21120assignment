package cs21120.assignment;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;

public class Tree implements IBinaryTree{
	public ArrayList<String> teams = new ArrayList<String>();
	
	
	public void main() throws FileNotFoundException{
		
	
		
		
		startComp();
		
	}
	
	@Override
	public IBinaryTree getLeft() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IBinaryTree getRight() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getPlayer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getScore() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	public void startComp() throws FileNotFoundException{
		CompetitionManager CompManger = new CompetitionManager(null);
		 teams = CompManger.readPlayers("Teams.txt");
	}
	
	public void playTree(ArrayList<String> teams){
		
		int noOfTeams = teams.size();
		BNode pointer;		
		pointer = root;
		if (noOfTeams == 1) {
			root.name = teams.get(1);
		} 
		else{ 
			
		}
		
		
		double x = Math.floor(Math.log(noOfTeams));
		for (int y = 0; y < teams.size(); y++){
			for (int i = 0; i < x; i++){
				pointer.left.perent = pointer;
				pointer.left = pointer;
			
			}
			if(pointer.left.name != "not played"){
				pointer.left.name = teams.get(y);
			}
			else if(pointer.right.name != "not played"){
				pointer.right.name = teams.get(y);
			}
			else 
		}
		
	}
	
	
	public void setTree (ArrayList<String> teams){
		
	}
	
	
	
	private BNode root;
	
	public class BNode{
		private BNode left, right, perent;
		private String name;
	}
}













