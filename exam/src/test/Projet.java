package test;

public class Projet {
	private int numProjet;
	private String theme;
	private Etudiant etudiant;
	
	public Projet(int numProjet, String theme, Etudiant etudiant) {
		// TODO Auto-generated constructor stub
		super();
		this.numProjet = numProjet;
		this.theme = theme;
		this.etudiant = etudiant;
		
		
	}

	public int getNumProjet() {
		return numProjet;
	}

	public void setNumProjet(int numProjet) {
		this.numProjet = numProjet;
	}

	public String getTheme() {
		return theme;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}

	public Etudiant getEtudiant() {
		return etudiant;
	}

	public void setEtudiant(Etudiant etudiant) {
		this.etudiant = etudiant;
	}
}
