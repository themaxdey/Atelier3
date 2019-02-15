package Question1;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Question1 extends JFrame{
	
	private static final long serialVersionUID = 1L;
	private static JButton button1 = new JButton ("Effacer");
	private static JTextField texte1 = new JTextField ("Voyer les changements de style", 30);
	private static JRadioButton selectNormal = new JRadioButton("Normal");
	private static JRadioButton selectGras = new JRadioButton("Gras");
	private static JRadioButton selectItalique = new JRadioButton("Italique");
	private static JRadioButton selectGrasItalique = new JRadioButton("Gras/Italique");
	private static JCheckBox selectTexte = new JCheckBox( "Texte en bleu" );
	private ButtonGroup group = new ButtonGroup();
	
	public Question1(){
		
		super("Atelier 3 - Q1 - Maxime Dery");
		JPanel panneau = new JPanel();
		setSize(400, 150);
		texte1.setSize( 400, 300 );
		panneau.add(texte1);
		group.add(selectGras);
		group.add(selectGrasItalique);
		group.add(selectItalique);
		group.add(selectNormal);
		panneau.add(selectNormal);
		panneau.add(selectGras);
		panneau.add(selectItalique);
		panneau.add(selectGrasItalique);
		panneau.add(selectTexte);
		panneau.add(button1);
		add(panneau);
		GestionQuestion1 listener1=new GestionQuestion1(selectNormal, selectGras, selectItalique, selectGrasItalique, button1, texte1, selectTexte);
		button1.addActionListener(listener1);
		selectGras.addActionListener(listener1);
		selectNormal.addActionListener(listener1);
		selectItalique.addActionListener(listener1);
		texte1.addActionListener(listener1);
		selectGrasItalique.addActionListener(listener1);
		selectTexte.addActionListener(listener1);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		
	}
	
	
	public static void main( String[] args ) {
		
		Question1 fenetre= new Question1();
		fenetre.setVisible(true);
		ImageIcon icone = new ImageIcon( Question1.class.getResource( "coke.jpg" ) );
		fenetre.setIconImage( icone.getImage() );
		
		
	}

}
