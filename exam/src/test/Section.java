package test;

public class Section {
	private int numSection;
	private String nomSection;
	private Etudiant etudiant;
	
	public Section(int numSection, String nomSection, Etudiant etudiant) {
		// TODO Auto-generated constructor stub
		super();
		this.numSection = numSection;
		this.nomSection = nomSection;
		this.etudiant = etudiant;
	}

	public int getNumSection() {
		return numSection;
	}

	public void setNumSection(int numSection) {
		this.numSection = numSection;
	}

	public String getNomSection() {
		return nomSection;
	}

	public void setNomSection(String nomSection) {
		this.nomSection = nomSection;
	}

	public Etudiant getEtudiant() {
		return etudiant;
	}

	public void setEtudiant(Etudiant etudiant) {
		this.etudiant = etudiant;
	}
}
