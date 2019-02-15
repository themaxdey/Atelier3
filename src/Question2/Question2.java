package Question2;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Question2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JButton bouton1 = new JButton( "Simon" );
	private JButton bouton2 = new JButton( "Erik" );
	private JButton bouton3 = new JButton( "Margot" );
	private JButton bouton4 = new JButton( "Patrick" );
	private JButton bouton5 = new JButton( "Julie" );
	private JButton bouton6 = new JButton( "aimerait pratiquer" );
	private JButton bouton7 = new JButton( "deteste" );
	private JButton bouton8 = new JButton( "pratique" );
	private JButton bouton9 = new JButton( "l'escalade" );
	private JButton bouton10 = new JButton( "la natation" );
	private JButton bouton11 = new JButton( "le ski" );
	private JButton bouton12 = new JButton( "la raquette" );
	private JButton bouton13 = new JButton( "Nouvelle Phrase" );
	private JTextField message = new JTextField( 25 );
	private JTextArea message2 = new JTextArea( "Phrase:" );
	private ButtonGroup groupNom = new ButtonGroup();
	private ButtonGroup groupAction = new ButtonGroup();
	private ButtonGroup groupSport = new ButtonGroup();

	public Question2() {

		super( "Atelier 3 - Q2 - Maxime Dery" );
		JPanel panneau = new JPanel();
		setSize( 400, 300 );
		
		

		GestionQuestion2 listener1 = new GestionQuestion2( bouton1, bouton2, bouton3, bouton4, bouton4, bouton6, bouton7, bouton8, bouton9, bouton10, bouton11, bouton12, bouton13, message, groupNom, groupAction, groupSport );

		groupNom.add( bouton1 );
		groupNom.add( bouton2 );
		groupNom.add( bouton3 );
		groupNom.add( bouton4 );
		groupNom.add( bouton5 );
		panneau.add( bouton1 );
		panneau.add( bouton2 );
		panneau.add( bouton3 );
		panneau.add( bouton4 );
		panneau.add( bouton5 );

		groupAction.add( bouton6 );
		groupAction.add( bouton7 );
		groupAction.add( bouton8 );
		panneau.add( bouton6 );
		panneau.add( bouton7 );
		panneau.add( bouton8 );

		groupSport.add( bouton9 );
		groupSport.add( bouton10 );
		groupSport.add( bouton11 );
		groupSport.add( bouton12 );
		panneau.add( bouton9 );
		panneau.add( bouton10 );
		panneau.add( bouton11 );
		panneau.add( bouton12 );

		panneau.add( message2 );
		panneau.add( message );
		panneau.add( bouton13 );

		add( panneau );
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

		bouton1.addActionListener( listener1 );
		bouton2.addActionListener( listener1 );
		bouton3.addActionListener( listener1 );
		bouton4.addActionListener( listener1 );
		bouton4.addActionListener( listener1 );
		bouton6.addActionListener( listener1 );
		bouton7.addActionListener( listener1 );
		bouton8.addActionListener( listener1 );
		bouton9.addActionListener( listener1 );
		bouton10.addActionListener( listener1 );
		bouton11.addActionListener( listener1 );
		bouton12.addActionListener( listener1 );
		bouton13.addActionListener( listener1 );
		message.addActionListener( listener1 );

	}

	public static void main( String[] args ) {
		Question2 fenetre = new Question2();
		fenetre.setVisible( true );

	}

}
