public class Dogg {
	private String navn ;
	private int alder;
	private double vægt;
	private double pris;
	private String køn;
	private String ejer;
        // TODO: Attribut til hvalpe
	private String[] offSpring;
	private boolean isHungry;
	
	public Dogg(String navn, boolean isHungry){
		this.navn = navn;
		this.isHungry = isHungry;
                // TODO: initialisér hvalpearrayet
		this.offSpring = new String[12];
	}
	
	public String getOwner() {
		return this.ejer;
	}
	public String[] getOffSpring() {
		return this.offSpring;
	}
        //TODO:lav metoden setOffSpring som sætter en given Streng med
        //hvalpenavn ind i offSpring
	public void setOffSpring(String puppy) {
		int counter = 0;
		while(this.offSpring[counter]!= null) {
			counter++;
		}
		this.offSpring[counter]=puppy;
	}

	public void setOwner(String myOwner) {
		this.ejer = myOwner;
	}
	public void setAlder(int hundeAlder){
		alder = hundeAlder;
	}
	public int getAlder(){
		return alder;
	}
	public String getName(){
		return this.navn;
	}
	public String toString() {
		return "Dog named " + navn;
	}
	public String feedDog() {
		// TODO: hunden skal fodres kun hvis den er sulten
		// hvis den er blevet fodret skal der sættes en attribut-værdi
		// returnér en besked om hvorvidt den er blevet fodret
		String msg;
		if (this.isHungry) {
			msg = "Feeding " + navn;
				this.isHungry = false;
		} else {
			msg = "Not Feeding "+ navn;
		}
		return msg;
	}
}
