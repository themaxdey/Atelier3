package Question2;

import java.awt.event.ActionEvent;

public class GestionQuestion2 {

	private String nom = " ";
	private String sport = " ";
	private String action = " ";

	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == Question2.groupNom) {
			if (e.getSource() == Question2.bouton1) {
				nom = Question2.bouton1.getText();
			} else if (e.getSource() == Question2.bouton2) {
				nom = Question2.bouton2.getText();
			} else if (e.getSource() == Question2.bouton3) {
				nom = Question2.bouton3.getText();
			} else if (e.getSource() == Question2.bouton4) {
				nom = Question2.bouton4.getText();
			} else if (e.getSource() == Question2.bouton5) {
				nom = Question2.bouton5.getText();
			}
		}
		
		if (e.getSource() == Question2.groupAction) {
			if (e.getSource() == Question2.bouton6) {
				action = Question2.bouton6.getText();
			} else if (e.getSource() == Question2.bouton7) {
				action = Question2.bouton7.getText();
			} else if (e.getSource() == Question2.bouton8) {
				action = Question2.bouton8.getText();
			}
		}
		
		if (e.getSource() == Question2.groupSport) {
			if (e.getSource() == Question2.bouton9) {
				sport = Question2.bouton9.getText();
			} else if (e.getSource() == Question2.bouton10) {
				sport = Question2.bouton10.getText();
			} else if (e.getSource() == Question2.bouton11) {
				sport = Question2.bouton11.getText();
			}else if (e.getSource() == Question2.bouton12) {
				sport = Question2.bouton12.getText();
			}
		}

		if (e.getSource() == Question2.bouton13) {
			nom = null;
			action = null;
			sport = null;
			Question2.message.setText(" ");
		}

		Question2.message.setText(nom + " " + action + " " + sport);

	}
}
