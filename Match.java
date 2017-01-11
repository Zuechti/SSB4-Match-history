
public class Match {
    private boolean win;
    private int lifes;
    private int latestpercent;
    private String Opponent;

    public Match(boolean w, int l, int lp, String opp) {
        win=w;
        if(w){
            lifes=l;
            latestpercent=l;
        }
        lifes=l;
        latestpercent=lp;
        Opponent=opp;
    }

    

    public String getOpponent(){
        return Opponent;
    }

    public boolean hasWon(){
        return win;
    }

    public int getLifes(){
        return lifes;
    }

    public int getLatestPercent(){
        return latestpercent;
    }

}
