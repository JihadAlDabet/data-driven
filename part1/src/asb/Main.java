package asb;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		participants par = new participants(10);
		Rank rank=new Rank();
		par.Teams();
		  int[] arr_score = new int[10];
		  String[] arr_name = new String[10];
	
		//System.out.println(par.getTeamid(3));
		 par.setqustions(0,  (int) ( Math.random() * 10 + 1));
			par.setTime(0,(int) ( Math.random() * 300 + 30));
			
			par.setqustions(1, (int) ( Math.random() * 10 + 1));
			par.setTime(1,(int) ( Math.random() * 300 + 30));
			
			par.setqustions(2, (int) ( Math.random() * 10 + 1));
			par.setTime(2,(int) ( Math.random() * 300 + 30));
			
			
			par.setqustions(3, (int) ( Math.random() * 10 + 1));
			par.setTime(3,(int) ( Math.random() * 300 + 30));
			
			par.setqustions(4, (int) ( Math.random() * 10 + 1));
			par.setTime(4,(int) ( Math.random() * 300 + 30));
			
			par.setqustions(5, (int) ( Math.random() * 10 + 1));
			par.setTime(5,(int) ( Math.random() * 300 + 30));
			
			par.setqustions(6, (int) ( Math.random() * 10 + 1));
			par.setTime(6,(int) ( Math.random() * 300 + 30));
		 
			par.setqustions(7, (int) ( Math.random() * 10 + 1));
			par.setTime(7,(int) ( Math.random() * 300 + 30));
			
			par.setqustions(8, (int) ( Math.random() * 10 + 1));
			par.setTime(8,(int) ( Math.random() * 300 + 30));
			
			par.setqustions(9, (int) ( Math.random() * 10 + 1));
			par.setTime(9,(int) ( Math.random() * 300 + 30));
		  
			//for (int i = 0; i <par.numOfTeams; i++) {
				//System.out.println(par.getscore(i));
				
				//rank.bubblesort(par.getscore(i));
			//}
		
			
		  
			
		for(int i=0;i<10;i++) {
		
			
			
			Score score=new Score(par.getTeamname(i),par.getTeamid(i), par.getscore(i),par.getqustions(i),par.getTime(i));

			    score.solved();
			 
			  arr_score[i]=score.solved();
			  arr_name[i]=par.getTeamname(i);
			  
		}
		
		Rank.bubblesort(arr_name,arr_score);
		
		for(int i=0;i<10;i++) {
			System.out.println(arr_name[i]+" "+arr_score[i]);
		}
	   
	    
	}

}
