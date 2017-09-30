package for_loops;

import javax.swing.JOptionPane;

public class VotingMachine {
	public static void main(String[] args) {
		
		int r = 0;
		int b = 0;
		String vo = JOptionPane.showInputDialog("How many people will be voting?");
		int v = Integer.parseInt(vo);
		for(int i = 0; i<v; i++){
			
			String m = JOptionPane.showInputDialog("Press 1 to vote for the Rock. Press 2 to vote for Bil Nye");
			if(m.equals("1")){
				r++;
			}
			if(m.equals("2")){
				b++;
			}
			
		}
		
		if(r>b){
			JOptionPane.showMessageDialog(null, "The Rock owns the universe!");
		}
		if(b>r){
			JOptionPane.showMessageDialog(null, "Bill Nye owns the universe!");
		}
		if(r==b){
			JOptionPane.showMessageDialog(null, "Voting is indecisive.");
		}
		
	}
}
