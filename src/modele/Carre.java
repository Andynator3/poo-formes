package modele;

public class Carre implements Forme {

	//proprietes
	private float cote;
	
	/**
	 * Constructeur
	 * @param cote
	 */
	public Carre(float cote){
		this.cote = cote;
	}
	
	@Override
	public float perimetre() {
		return this.cote*4;
	}

	@Override
	public float surface() {
		return this.cote * this.cote;
	}
	
	/**
	 * getter
	 * @return
	 */
	public float getCote() {
		return this.cote;
	}

}
