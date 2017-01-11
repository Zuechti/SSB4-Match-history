
public class Challenger {
    private String name;
    List<Match> matches=new List<Match>();
    public List<Match> getMatches(){
        return matches;
       }
    
    public Challenger(String n){
        name=n;
    }
    
    public void newGame(boolean w, int l, int lp, String opp){
        Match e= new Match(w,l,lp,opp);
        matches.append(e);
        
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
        float i=0;//Z�hler
        matches.toFirst();
        while(matches.hasAccess()){
            if(matches.getContent().hasWon()){
                i++;
            }
            matches.next();
        }
        int z= Math.round(i/getGamesSum()*100);
        return z;   
        
        
    }

    public int getGamesSum(){
        int i=0;
        matches.toFirst();
        while(matches.hasAccess()){
            i++;
            matches.next();
        }
        return i;  //K�nnte fehler
    }
    
}
