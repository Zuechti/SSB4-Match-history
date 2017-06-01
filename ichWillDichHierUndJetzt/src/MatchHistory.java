
public class MatchHistory {
	private BinarySearchTree<Challenger> chars = new BinarySearchTree<Challenger>();

	
	public Challenger searchOrAdd(String n){
		String i="";
		if(n.equalsIgnoreCase("mario")){
			i="Mario";

		}
		else if(n.equalsIgnoreCase("donkey kong")||n.equalsIgnoreCase("dk")){
			i="DK";

		}
		else if(n.equalsIgnoreCase("link")||n.equalsIgnoreCase("kink")||n.equalsIgnoreCase("lonk")){
			i="Link";

		}
		else if(n.equalsIgnoreCase("samus")){
			i="Samus";

			
		}
		else if(n.equalsIgnoreCase("kirby")){
			i="Kirby";
		
			
		}
		else if(n.equalsIgnoreCase("fox")||n.equalsIgnoreCase("fox mc cloud")||n.equalsIgnoreCase("Luisa")){
			i="Fox";

		}
		else if(n.equalsIgnoreCase("pikachu")){
			i="Pikachu";

			
		}
		else if(n.equalsIgnoreCase("bowser")){
			i="Bowser";

		}
		else if(n.equalsIgnoreCase("pit")){
			i="Pit";

			
		}
		else if(n.equalsIgnoreCase("villager")||n.equalsIgnoreCase("bewohner")){
			i="Bewohner";

		}
		else if(n.equalsIgnoreCase("mega man")){
			i="Mega man";
			
		}
		else if(n.equalsIgnoreCase("wii fit trainer")||n.equalsIgnoreCase("trainer")){
			i="Trainer";
			
		}
		else if(n.equalsIgnoreCase("Olimar")||n.equalsIgnoreCase("Pikmin")||n.equalsIgnoreCase("pikmin and olimar")||n.equalsIgnoreCase("pikmin und olimar")){
			i="Olimar";
			
		}
		else if(n.equalsIgnoreCase("Luigi")||n.equalsIgnoreCase("idiot")){
			i="Luigi";
		}
		else if(n.equalsIgnoreCase("Peach")){
			i="Peach";
		}
		else if(n.equalsIgnoreCase("Toon link")){
			i="Toon Link";
		}
		else if(n.equalsIgnoreCase("Sonic")||n.equalsIgnoreCase("Sonic the Hedgeog")||n.equalsIgnoreCase("SAAANIC")){
			i="Sonic";
		}
		else if(n.equalsIgnoreCase("marth")){
			i="Marth";
		}
		else if(n.equalsIgnoreCase("Rosalina")||n.equalsIgnoreCase("Luma")||n.equalsIgnoreCase("Rosalina and luma")||n.equalsIgnoreCase("rosalina und luma")){
			i="Rosalina";
		}
		else if(n.equalsIgnoreCase("Zelda")){
			i="Zelda";
		}
		else if(n.equalsIgnoreCase("King Dedede")||n.equalsIgnoreCase("König dedede")){
			i="Dedede";
		}
		else if(n.equalsIgnoreCase("Lucario")){
			i="Lucario";
		}
		else if(n.equalsIgnoreCase("Little mac")){
			i="Little mac";
		}
		else if(n.equalsIgnoreCase("Diddy Kong")||n.equalsIgnoreCase("Diddy")){
			i="Diddy";
		}
		else if(n.equalsIgnoreCase("Zero suit samus")||n.equals("zero suit")){
			i="Zero suit samus";
		}
		else if(n.equalsIgnoreCase("Sheik")){
			i="Sheik";
		}
		else if(n.equalsIgnoreCase("Yoshi")){
			i="Yoshi";
		}
		else if(n.equalsIgnoreCase("Charizard")||n.equals("Glurak")){
			i="Glurak";
		}
		else if(n.equalsIgnoreCase("Greninja")||n.equalsIgnoreCase("Quajutsu")){
			i="Quajutsu";
		}
		else if(n.equalsIgnoreCase("ike")){
			i="Ike";
		}
		else if(n.equalsIgnoreCase("Mii")){
			i="Mii";
		}
		else if(n.equalsIgnoreCase("Palutena")||n.equalsIgnoreCase("Lady Palutena")){
			i="Palutena";
		}
		else if(n.equalsIgnoreCase("Pac-Man")||n.equalsIgnoreCase("pacman")||n.equalsIgnoreCase("pac man")){
			i="Pacman";
		}
		else if(n.equalsIgnoreCase("Captain falcon")||n.equalsIgnoreCase("falcon")||n.equalsIgnoreCase("captain")){
			i="Falcon";
		}
		else if(n.equalsIgnoreCase("Robin")){
			i="Captain falcon";
		}
		else if(n.equalsIgnoreCase("shulk")){
			i="Shulk";
		}
		else if(n.equalsIgnoreCase("meta night")||n.equalsIgnoreCase("meta-night")){
			i="Meta night";
		}
		else if(n.equalsIgnoreCase("ness")){
			i="Ness";
		}
		else if(n.equalsIgnoreCase("falco")){
			i="Falco";
		}
		else if(n.equalsIgnoreCase("wario")){
			i="Wario";
		}
		else if(n.equalsIgnoreCase("lucina")){
			i="Lucina";
		}
		else if(n.equalsIgnoreCase("Dark pit")){
			i="Dark pit";
		}
		else if(n.equalsIgnoreCase("dr mario")||n.equalsIgnoreCase("dr. mario")){
			i="Dr. Mario";
		}
		else if(n.equalsIgnoreCase("r.o.b.")||n.equalsIgnoreCase("rob")){
			i="Rob";
		}
		else if(n.equalsIgnoreCase("Ganondorf")||n.equalsIgnoreCase("ganon")){
			i="Ganon";
		}
		else if(n.equalsIgnoreCase("mr game and watch")||n.equalsIgnoreCase("mr. game and watch")||n.equalsIgnoreCase("mgaw")){
			i="Mr. Game and Watch";
		}
		else if(n.equalsIgnoreCase("Bowser jr")||n.equalsIgnoreCase("bowser jr.")){
			i="Bowser Jr.";
		}
		else if(n.equalsIgnoreCase("Duck hunt")||n.equalsIgnoreCase("dog")){
			i="Duck hunt";
		}
		else if(n.equalsIgnoreCase("Jigglypuff")||n.equalsIgnoreCase("pummeluff")||n.equalsIgnoreCase("satan")){
			i="Pummeluff";
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
		else if(n.equalsIgnoreCase("Cloud")||n.equalsIgnoreCase("SCHEISS BLONDINE")||n.equalsIgnoreCase("wow")||n.equalsIgnoreCase("P2WSCHLAMPE"))
		if(i==""){
			return null;
		}
		if(isThere(i)){
			return chars.getContent();
		}
		else{
			chars.insert(new Challenger(i));
			return chars.getContent();
		}
		
	}
	public boolean isThere(String n){
		
		return chars.search(new Challenger(n))!=null;
		
	}
	public BinarySearchTree<Challenger> getChars(){
		return chars;
	}
}

