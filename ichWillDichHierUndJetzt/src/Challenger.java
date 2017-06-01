
public class Challenger implements ComparableContent<Challenger>{
	private String name;
	List<Match> matches=new List<Match>();
	
	public Challenger(String n){
		name=n;
	}
	
	public void newGame(boolean w, int l, int lp, String opp){
		matches.append(new Match(w,l,lp,opp));
	}
	
	public String getName(){
		return name;
	}
	
	public Match getLast(){
		matches.toLast();
		return matches.getContent();
	}
	
	public Match getprevious(){
		matches.back();
		return matches.getContent();
	}
	
	public int getWinRate(){
		if(getGamesSum()==0)
			return 0;
		int i=0;//Zähler
		matches.toFirst();
		while(matches.hasAccess()){
			if(matches.getContent().hasWon()){
				i++;
			}
			matches.next();
		}
		return i/getGamesSum();	
		
		
	}
	
	public int getGamesSum(){
		int i=0;
		matches.toFirst();
		while(matches.hasAccess()){
			i++;
			matches.next();
		}
		return i;  //Könnte fehler
	}

	

	@Override
	public boolean isGreater(Challenger pContent) {
		// TODO Auto-generated method stub
		return this.getName().compareToIgnoreCase(pContent.getName())<0;
	}

	@Override
	public boolean isEqual(Challenger pContent) {
		// TODO Auto-generated method stub
		return this.getName().compareToIgnoreCase(pContent.getName())==0;
	}

	@Override
	public boolean isLess(Challenger pContent) {
		// TODO Auto-generated method stub
		return this.getName().compareToIgnoreCase(pContent.getName())>0;
	}
	
}
