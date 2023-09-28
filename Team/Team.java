class Team{
	
//1.c
private  String teamName;

//1.d
private int teamRanks;

//1.e
private String namesOfPlayers;


//1.f
public Team(String teamName){

this.teamName=teamName;

}

public void setRanks( int teamRanks){

	this.teamRanks=teamRanks;


}

// 1.j
public String toString (){

	return "Hold: "+ teamName + "Rank: "+teamRanks;
}


}