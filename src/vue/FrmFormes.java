package vue;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controleur.Controle;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JList;

public class FrmFormes extends JFrame {

	private JPanel contentPane;
	private JTextField txtCote;
	private JTextField txtRayon;
	private JLabel lblPerimetreCarre;
	private JLabel lblSurfaceCarre;
	private JLabel lblPerimetreRond;
	private JLabel lblSurfaceRond;
	//proprietes
	private Controle controle;

	/**
	 * Launch the application.
	 */
/*	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmFormes frame = new FrmFormes();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
*/
	
	// Les méthodes d'évenements
	/**
	 * clic sur le bouton calcul du carre
	 */
	public void cmdCalculCarre(){
		controle.demandeFrmFormesValeurs("carré", Float.parseFloat(txtCote.getText()));
	}
	
	/**
	 * clic sur le bouton calcul du rond
	 */
	public void cmdCalculRond(){
		controle.demandeFrmFormesValeurs("rond", Float.parseFloat(txtRayon.getText()));
	}
	
	/**
	 * clic sur le bouton DEL
	 */
	public void cmdDel(){
		
	}
	
	// Les méthodes d'affichage
	/**
	 * Affichage du périmètre et de la surface du carré
	 * @param perimetre
	 * @param surface
	 */
	// Méthode avec type primitif ou type simple variable float sur laquelle on ne peut pas appeller une méthode 
	// Mais on peut concatener une chaine vide devant la variable simple.
	// Quand on concatene une variable simple de type numérique à une chaine il transforme l'ensemble en chaine.
	public void afficheResultCarre(float perimetre, float surface){
		lblPerimetreCarre.setText(""+perimetre);
		lblSurfaceCarre.setText(""+surface);
	}
	
	/*
	 // Méthode avec type complexe classe Float sur laquelle on peut appeller une méthode comme toString().
	public void afficheResultCarre(Float perimetre, Float surface){
		lblPerimetreCarre.setText(perimetre.toString());
		lblSurfaceCarre.setText(surface.toString());
	}
	*/
	
	/**
	 * Affichage du périmètre et de la surface du rond
	 * @param perimetre
	 * @param surface
	 */
	// Méthode avec type primitif ou type simple variable float sur laquelle on ne peut pas appeller une méthode 
	// Mais on peut concatener une chaine vide devant la variable simple.
	// Quand on concatene une variable simple de type numérique à une chaine il transforme l'ensemble en chaine.
	public void afficheResultRond(float perimetre, float surface){
		lblPerimetreRond.setText(""+perimetre);
		lblSurfaceRond.setText(""+surface);
	}
	
	/**
	 * Create the frame.
	 */
	public FrmFormes(Controle controle) {
		this.controle = controle;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 754, 883);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(FrmFormes.class.getResource("/media/Carre.jpg")));
		lblNewLabel.setBounds(12, 13, 136, 137);
		contentPane.add(lblNewLabel);
		
		JLabel lblCt = new JLabel("c\u00F4t\u00E9 =");
		lblCt.setBounds(276, 13, 98, 33);
		contentPane.add(lblCt);
		
		JLabel lblPrimtre = new JLabel("P\u00E9rim\u00E8tre = ");
		lblPrimtre.setBounds(276, 74, 98, 24);
		contentPane.add(lblPrimtre);
		
		JLabel lblSurface = new JLabel("Surface = ");
		lblSurface.setBounds(276, 111, 98, 16);
		contentPane.add(lblSurface);
		
		txtCote = new JTextField();
		txtCote.setHorizontalAlignment(SwingConstants.RIGHT);
		txtCote.setBounds(438, 13, 136, 38);
		contentPane.add(txtCote);
		txtCote.setColumns(10);
		
		lblPerimetreCarre = new JLabel("0");
		lblPerimetreCarre.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPerimetreCarre.setBounds(518, 72, 56, 19);
		contentPane.add(lblPerimetreCarre);
		
		lblSurfaceCarre = new JLabel("0");
		lblSurfaceCarre.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSurfaceCarre.setBounds(518, 107, 56, 24);
		contentPane.add(lblSurfaceCarre);
		
		JButton btnCalculCarre = new JButton("Calcul");
		btnCalculCarre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cmdCalculCarre();
			}
		});
		btnCalculCarre.setBounds(601, 10, 113, 38);
		contentPane.add(btnCalculCarre);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(FrmFormes.class.getResource("/media/Rond.jpg")));
		lblNewLabel_1.setBounds(12, 192, 209, 197);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblRayon = new JLabel("Rayon = ");
		lblRayon.setBounds(276, 222, 98, 24);
		contentPane.add(lblRayon);
		
		JLabel lblPrimtre_1 = new JLabel("P\u00E9rim\u00E8tre = ");
		lblPrimtre_1.setBounds(276, 282, 98, 16);
		contentPane.add(lblPrimtre_1);
		
		JLabel lblSurface_1 = new JLabel("Surface = ");
		lblSurface_1.setBounds(276, 338, 98, 24);
		contentPane.add(lblSurface_1);
		
		txtRayon = new JTextField();
		txtRayon.setHorizontalAlignment(SwingConstants.RIGHT);
		txtRayon.setBounds(458, 223, 116, 38);
		contentPane.add(txtRayon);
		txtRayon.setColumns(10);
		
		lblPerimetreRond = new JLabel("0");
		lblPerimetreRond.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPerimetreRond.setBounds(518, 294, 56, 16);
		contentPane.add(lblPerimetreRond);
		
		lblSurfaceRond = new JLabel("0");
		lblSurfaceRond.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSurfaceRond.setBounds(518, 342, 56, 16);
		contentPane.add(lblSurfaceRond);
		
		JButton btnCalculRond = new JButton("Calcul");
		btnCalculRond.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cmdCalculRond();
			}
		});
		btnCalculRond.setBounds(601, 222, 103, 39);
		contentPane.add(btnCalculRond);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 432, 692, 322);
		contentPane.add(scrollPane);
		
		JList lstFormes = new JList();
		scrollPane.setViewportView(lstFormes);
		
		JButton btnDel = new JButton("DEL");
		btnDel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cmdDel();
			}
		});
		btnDel.setBounds(601, 767, 103, 39);
		contentPane.add(btnDel);
	}
}
