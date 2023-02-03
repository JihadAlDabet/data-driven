package asb;

public class Score
{
	int time;
	int score=0;
	String team_name;
	String team_id;
	int qus;
	
	public Score(String name,String ID,int score_team,int num_qus,int elapsedtime ) {
		team_name=name;
		team_id=ID;
		score=score_team;
		time=elapsedtime;
		qus=num_qus;
	}
	
	public int solved() {
		if (qus>10) {
			System.out.println("you have solver all qustions");
			
			return 0;
		}else {
			System.out.println("##################################################################");
			System.out.println("#"+ "  Rank"+ " # "+ "  Team ID"+ " # "+ "  Team Name"+ " # "+ "  Solved Questions"+ " # "+ "  Elapsed Time"+ " # ");
			System.out.println("##################################################################");
			System.out.println("#"+ "\t" + "# "+ "    "+ team_id + ""+"   # "+ "    "+ team_name + "   "+" # "+ "\t"+ qus + "  \t"+"\t# "+ "  "+ time + "  "+"# ");
			
			return qus*10;
		}
		
	}

}
