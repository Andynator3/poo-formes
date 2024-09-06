package controleur;

import modele.Carre;
import modele.Rond;
import vue.FrmFormes;

public class Controle {
	
	// proprietes
	private FrmFormes frmFormes;

	public static void main(String[] args) {
		new Controle();
	}
	
	/**
	 * Demande de la vue pour obtenir p�rim�tre et surface de la forme
	 * @param typeForme "carr�" ou "rond"
	 * @param valeur "c�t�" ou "rayon"
	 */
	public void demandeFrmFormesValeurs(String typeForme, Object valeur){
		//1-Cr�er des objets
		if(typeForme == "carr�"){
			Carre unCarre = new Carre((float) valeur);
		//2-Contacter le mod�le pour obtenir le p�rim�tre et la surface puis Solliciter FrmFormes pour pouvoir afficher les informations
			frmFormes.afficheResultCarre(unCarre.perimetre(), unCarre.surface());
		}else{
			//1-Cr�er des objets
			Rond unRond = new Rond((float) valeur);
			//2-Contacter le mod�le pour obtenir le p�rim�tre et la surface puis Solliciter FrmFormes pour pouvoir afficher les informations
			frmFormes.afficheResultRond(unRond.perimetre(), unRond.surface());
		}
		
		
	}
	
	/**
	 * Constructeur
	 */
	public Controle(){
		frmFormes = new FrmFormes(this);
		frmFormes.setVisible(true);
		
	}

}
