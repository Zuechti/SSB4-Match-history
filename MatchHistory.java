
public class MatchHistory {
	private List<Challenger> chars = new List<Challenger>();
	public static void main(String[] args) {
		

	}
	
	public void searchOrAdd(String n){
		String i="";
		if(n.equalsIgnoreCase("mario")){
			i="Mario";

		}
		else if(n.equalsIgnoreCase("donkey kong")||n.equalsIgnoreCase("dk")){
			i="dk";

		}
		else if(n.equalsIgnoreCase("link")||n.equalsIgnoreCase("kink")||n.equalsIgnoreCase("lonk")){
			i="link";

		}
		else if(n.equalsIgnoreCase("samus")){
			i="samus";

			
		}
		else if(n.equalsIgnoreCase("kirby")){
			i="kirby";
		
			
		}
		else if(n.equalsIgnoreCase("fox")||n.equalsIgnoreCase("fox mc cloud")||n.equalsIgnoreCase("Luisa")){
			i="fox";

		}
		else if(n.equalsIgnoreCase("pikachu")){
			i="pikachu";

			
		}
		else if(n.equalsIgnoreCase("bowser")){
			i="bowser";

		}
		else if(n.equalsIgnoreCase("pit")){
			i="pit";

			
		}
		else if(n.equalsIgnoreCase("villager")||n.equalsIgnoreCase("bewohner")){
			i="bewohner";

		}
		else if(n.equalsIgnoreCase("mega man")){
			i="mega man";
			
		}
		else if(n.equalsIgnoreCase("wii fit trainer")||n.equalsIgnoreCase("trainer")){
			i="trainer";
			
		}
		else if(n.equalsIgnoreCase("Olimar")||n.equalsIgnoreCase("Pikmin")||n.equalsIgnoreCase("pikmin and olimar")||n.equalsIgnoreCase("pikmin und olimar")){
			i="olimar";
			
		}
		else if(n.equalsIgnoreCase("Luigi")||n.equalsIgnoreCase("idiot")){
			i="luigi";
		}
		else if(n.equalsIgnoreCase("Peach")){
			i="peach";
		}
		else if(n.equalsIgnoreCase("Toon link")){
			i="Toon Link";
		}
		else if(n.equalsIgnoreCase("Sonic")||n.equalsIgnoreCase("Sonic the Hedgeog")||n.equalsIgnoreCase("SAAANIC")){
			i="Sonic";
		}
		else if(n.equalsIgnoreCase("marth")){
			i="marth";
		}
		else if(n.equalsIgnoreCase("Rosalina")||n.equalsIgnoreCase("Luma")||n.equalsIgnoreCase("Rosalina and luma")||n.equalsIgnoreCase("rosalina und luma")){
			i="Rosalina";
		}
		else if(n.equalsIgnoreCase("Zelda")){
			i="zelda";
		}
		else if(n.equalsIgnoreCase("King Dedede")||n.equalsIgnoreCase("Koenig dedede")){
			i="dedede";
		}
		else if(n.equalsIgnoreCase("Lucario")){
			i="Lucario";
		}
		else if(n.equalsIgnoreCase("Little mac")){
			i="Little mac";
		}
		else if(n.equalsIgnoreCase("Diddy Kong")||n.equalsIgnoreCase("Diddy")){
			i="diddy";
		}
		else if(n.equalsIgnoreCase("Zero suit samus")||n.equals("zero suit")){
			i="Zero suit samus";
		}
		else if(n.equalsIgnoreCase("Sheik")){
			i="sheik";
		}
		else if(n.equalsIgnoreCase("Yoshi")){
			i="yoshi";
		}
		else if(n.equalsIgnoreCase("Charizard")||n.equals("Glurak")){
			i="Glurak";
		}
		else if(n.equalsIgnoreCase("Greninja")||n.equalsIgnoreCase("Quajutsu")){
			i="Quajutsu";
		}
		else if(n.equalsIgnoreCase("ike")){
			i="ike";
		}
		else if(n.equalsIgnoreCase("Mii")){
			i="mii";
		}
		else if(n.equalsIgnoreCase("Palutena")||n.equalsIgnoreCase("Lady Palutena")){
			i="Palutena";
		}
		else if(n.equalsIgnoreCase("Pac-Man")||n.equalsIgnoreCase("pacman")||n.equalsIgnoreCase("pac man")){
			i="pacman";
		}
		else if(n.equalsIgnoreCase("Captain falcon")||n.equalsIgnoreCase("falcon")||n.equalsIgnoreCase("captain")){
			i="falcon";
		}
		else if(n.equalsIgnoreCase("Robin")){
			i="captain falcon";
		}
		else if(n.equalsIgnoreCase("shulk")){
			i="shulk";
		}
		else if(n.equalsIgnoreCase("meta night")||n.equalsIgnoreCase("meta-night")){
			i="meta night";
		}
		else if(n.equalsIgnoreCase("ness")){
			i="ness";
		}
		else if(n.equalsIgnoreCase("falco")){
			i="falco";
		}
		else if(n.equalsIgnoreCase("wario")){
			i="wario";
		}
		else if(n.equalsIgnoreCase("lucina")){
			i="lucina";
		}
		else if(n.equalsIgnoreCase("Dark pit")){
			i="dark pit";
		}
		else if(n.equalsIgnoreCase("dr mario")||n.equalsIgnoreCase("dr. mario")){
			i="dr mario";
		}
		else if(n.equalsIgnoreCase("r.o.b.")||n.equalsIgnoreCase("rob")){
			i="rob";
		}
		else if(n.equalsIgnoreCase("Ganondorf")||n.equalsIgnoreCase("ganon")){
			i="Ganon";
		}
		else if(n.equalsIgnoreCase("mr game and watch")||n.equalsIgnoreCase("mr. game and watch")||n.equalsIgnoreCase("mgaw")){
			i="mgaw";
		}
		else if(n.equalsIgnoreCase("Bowser jr")||n.equalsIgnoreCase("bowser jr.")){
			i="Bowser Jr.";
		}
		else if(n.equalsIgnoreCase("Duck hunt")||n.equalsIgnoreCase("dog")){
			i="Duck hunt";
		}
		else if(n.equalsIgnoreCase("Jigglypuff")||n.equalsIgnoreCase("pummeluff")||n.equalsIgnoreCase("satan")){
			i="Satan";
		}
		else if(n.equalsIgnoreCase("Mewto")){
			i="Mewto";
		}
		else if(n.equalsIgnoreCase("lucas")){
			i="lucas";
		}
		else if(n.equalsIgnoreCase("Ryu")){
			i="Ryu";
		}
		else if(n.equalsIgnoreCase("Roy")){
			i="Roy";	
		}
		
		if(i.equals("")){
		    
		  }
		else if(isThere(i)){
			
		}
		else{
			chars.append(new Challenger(i));
			
		}
		
	}
	public boolean isThere(String n){
		chars.toFirst();
		while(chars.hasAccess()&&!chars.getContent().getName().equals(n)){
			chars.next();
		}
		return chars.getContent()!=null;
		
	}
	
	public List<Challenger> getChars(){
		return chars;
	}
}

