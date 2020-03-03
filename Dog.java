public class Dog{
	private String navn ;
	private int alder;
	private double vægt;
	private double pris;
	private String køn;
	private String ejer;
        // TODO: Attribut til hvalpe
	
	public Dog(String navn){
		this.navn = navn;
                // TODO: initialisér hvalpearrayet
	}
	
	public String getOwner() {
		return this.ejer;
	}

	public String[] getOffSpring() {
          String[] retVal = new String[12];
          // TODO: returner det  rigtige array

          return retVal;
	}

	public void setOffSpring(String puppy) {
        //TODO:lav metoden setOffSpring som sætter en given Streng med
        //hvalpenavn ind i offSpring

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
	}
}
