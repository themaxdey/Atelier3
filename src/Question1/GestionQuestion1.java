package Question1;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


public class GestionQuestion1 implements ActionListener {

	private JButton button1;
	private JTextField texte1;
	private JRadioButton selectNormal;
	private JRadioButton selectGras;
	private JRadioButton selectItalique;
	private JRadioButton selectGrasItalique;
	private JCheckBox selectTexte;


	public GestionQuestion1(JRadioButton selectNormal, JRadioButton selectGras, JRadioButton selectItalic,
			JRadioButton selectGrasItalic, JButton button1, JTextField texte1, JCheckBox selectTexte) {
		this.selectNormal = selectNormal;
		this.selectGras = selectGras;
		this.selectItalique = selectItalic;
		this.selectGrasItalique = selectGrasItalic;
		this.texte1 = texte1;
		this.button1 = button1;
		this.selectTexte = selectTexte;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//button
		if (e.getSource() == button1) {
			texte1.setText(" ");
		} 
		
		//Radiobutton
		if (e.getSource() == selectGras) {
			Font font = texte1.getFont();
			font = font.deriveFont(font.BOLD);
			texte1.setFont(font);			
			
		} else if(e.getSource() == selectItalique){
			Font font = texte1.getFont();
			font = font.deriveFont(font.ITALIC);
			texte1.setFont(font);
			
		} else if (e.getSource() == selectGrasItalique){
			Font font = texte1.getFont();
			font = font.deriveFont(font.BOLD + font.ITALIC);
			texte1.setFont(font);
			
		} else if (e.getSource() == selectNormal) {
			Font font = texte1.getFont();
			font = font.deriveFont(font.PLAIN);
			texte1.setFont(font);
		}
		
		//checkbox
		if (e.getSource() == selectTexte) {
			texte1.setForeground(Color.BLUE);
		} else {
			texte1.setForeground(Color.black);
		}
		
	}
}
