package asb;

import java.util.Iterator;

public class participants {
	
	public int numOfTeams;
	 public String[] TeamName ;
	 public String[] TeamID ;
	 public int[] Team_score ;
	 public int[] num_of_qus ;
	 public int[] time ;
	public participants(int a) {
		numOfTeams=a;
		 TeamName = new String[numOfTeams];
		 TeamID = new String[numOfTeams];
		 Team_score = new int[numOfTeams];
		 num_of_qus = new int[numOfTeams];
		 time = new int[numOfTeams];

		 
	}
	public participants() {
	
	}
	public void Teams() {
	
		TeamName[0]="Just";
		TeamName[1]="HTU";
		TeamName[2]="Syntax-JU";
		TeamName[3]="Karak";
		TeamName[4]="Tafilah";
		TeamName[5]="Ajloun";
		TeamName[6]="Al-Ahliyya";
		TeamName[7]="Patra";
		TeamName[8]="GJU";
		TeamName[9]="AAU";
		TeamID[0]="011";
		TeamID[1]="111";
		TeamID[2]="211";
		TeamID[3]="311";
		TeamID[4]="411";
		TeamID[5]="511";
		TeamID[6]="611";
		TeamID[7]="711";
		TeamID[8]="811";
		TeamID[9]="911";
		
		for(int i=0;i<numOfTeams;i++) {
			Team_score[i]=0;
			num_of_qus[i]=0;
			time[i]=0;
		}
		
		
		
	}
	public String getTeamname(int a) {
		return TeamName[a];
	}
	public void setTeamname(String[] TeamName) {
		this.TeamName = TeamName;
	}
	
	public String getTeamid(int a) {
		return TeamID[a];
	}
	public void setTeamid(String[] TeamID) {
		this.TeamID = TeamID;
	}
	
	
	public int getscore(int a) {
		return Team_score[a];
			
		}
	public void setscore(int place,int numscore) {
		
		Team_score[place] = numscore+getscore(place);;
		
	}
	
	public int getqustions(int a) {
		return num_of_qus[a];
		}
	public void setqustions( int place,int numqus) {
		num_of_qus[place] = numqus+getqustions(place);
	}
	
	public int getTime(int a) {
		return time[a];

		}
	public void setTime(  int place,int numtime) {
		time[place] = numtime+getTime(place);
	}
	
	}
	
	
