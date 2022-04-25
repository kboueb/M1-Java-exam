package test;

public class Etudiant {
	private int numEtudiant;
	private String nom;
	private String prenom;
	
	public Etudiant(int numEtudiant, String nom, String prenom) {
		// TODO Auto-generated constructor stub
		super();
		this.numEtudiant = numEtudiant;
		this.nom = nom;
		this.prenom = prenom;
	}

	public int getNumEtudiant() {
		return numEtudiant;
	}

	public void setNumEtudiant(int numEtudiant) {
		this.numEtudiant = numEtudiant;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	

}
