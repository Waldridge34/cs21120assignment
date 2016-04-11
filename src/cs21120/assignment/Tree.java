package cs21120.assignment;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;

public class Tree{
	public ArrayList<String> teams = new ArrayList<String>();
	private BNode root;
	BNode pointer = root;
	
	
	public void main() throws FileNotFoundException{
		startComp();
	}
	
	public void startComp() throws FileNotFoundException{
		CompetitionManager CompManger = new CompetitionManager(null);
		 teams = CompManger.readPlayers("Teams.txt");
	}
	
	public void playTree(ArrayList<String> teams){
		
	}
	
	public void setTree (ArrayList<String> teams){
		int numberOfTeams = teams.size();
		double levelDown = Math.floor((Math.log(numberOfTeams)/Math.log(2)));
		int expand = (int) (numberOfTeams - Math.pow(levelDown, 2));
		int down = 0;
		int ex = 0;
		int t = 0;
		
		while(root.name!="not played"){
			if (root.left.name == "not played" && root.right.name == "not played"){
				pointer.name = "not played";
				break;
			}
				
			if (pointer.left.name == "not played" && pointer.right.name == "not played"){
				pointer.name = "not played";
				if (pointer != root){
					pointer.parent = pointer;
				}
	
			}	
			if (down == levelDown){
				if(ex == expand){
					pointer.name = teams.get(t);
					pointer.parent.right.name = teams.get(t+1);
					pointer.parent.name = "not played";
					pointer.parent.parent = pointer;
					down = down -1;
					t=t+2;
				}
				else {
					pointer.left.name = teams.get(t);
					pointer.right.name = teams.get(t+1);
					pointer.name = "not played";
					pointer.parent = pointer;
					down = down -1;
					t=t+2;
					ex++;
				}
			}
			else if (pointer.left.name != "not played"){
				pointer.left = pointer;
				down++;
			}
			else if (pointer.left.name == "not played"){
				pointer.right = pointer;
			}
				
			
		}
		
		
	}
	
	
	
	
	public class BNode implements IBinaryTree{
		private BNode left, right, parent;
		private String name;
		private int score;
		
		public BNode getLeft() {
			return left;
		}
		
		public void setLeft(BNode left) {
			this.left = left;
		}
		
		public BNode getRight() {
			return right;
		}
		
		public void setRight(BNode right) {
			this.right = right;
		}
		
		public BNode getParent() {
			return parent;
		}
		
		public void setParent(BNode parent) {
			this.parent = parent;
		}
		
		public String getName() {
			return name;
		}
		
		public void setName(String name) {
			this.name = name;
		}
		
		public int getScore() {
			return score;
		}
		
		public void setScore(int score) {
			this.score = score;
		}

		@Override
		public String getPlayer() {
			return name;
		}	
	}
}













