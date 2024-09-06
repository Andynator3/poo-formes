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
	 * Demande de la vue pour obtenir périmètre et surface de la forme
	 * @param typeForme "carré" ou "rond"
	 * @param valeur "côté" ou "rayon"
	 */
	public void demandeFrmFormesValeurs(String typeForme, Object valeur){
		//1-Créer des objets
		if(typeForme == "carré"){
			Carre unCarre = new Carre((float) valeur);
		//2-Contacter le modèle pour obtenir le périmètre et la surface puis Solliciter FrmFormes pour pouvoir afficher les informations
			frmFormes.afficheResultCarre(unCarre.perimetre(), unCarre.surface());
		}else{
			//1-Créer des objets
			Rond unRond = new Rond((float) valeur);
			//2-Contacter le modèle pour obtenir le périmètre et la surface puis Solliciter FrmFormes pour pouvoir afficher les informations
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
