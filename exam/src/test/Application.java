package test;
import java.util.*;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Etudiant> listeEtudiant  = new ArrayList<Etudiant>();
		ArrayList<Projet> listeProjet  = new ArrayList<Projet>();
		ArrayList<Section> listeSection  = new ArrayList<Section>();
		
		int choix=0;
		String nom = null, prenom = null, theme, nomSection, rep;
		int numEtudiant = 0, numProjet, numSection;
		
		Etudiant etudiant = null;
		Etudiant etd = null;
		
		do {
			System.out.println("-----------------------");
			System.out.println("1.Créer une section");
			System.out.println("2.Créer un projet");
			System.out.println("3.Créer un etudiant");
			System.out.println("4.Lister les sections");
			System.out.println("5.Lister les projets");
			System.out.println("6.Lister les etudiants");
			System.out.println("7.Afficher les étudiants d'une section donnée");
			System.out.println("8.Afficher les étudiants qui travillent dans un projet donné");
			System.out.println("9.Afficher pour chaque projet, les étudiants qui y travillent et leurs sections respectives");
			System.out.println("10.Sortie");
			System.out.println("-----------------------\n");
			System.out.println("Votre choix?");
			choix=sc.nextInt();
			sc.nextLine();
			
			switch(choix) {
				case 1:
					System.out.println("Numéro de la section ?");
					numSection = sc.nextInt();
					sc.nextLine();
					System.out.println("Nom de la section ?");
					nomSection = sc.nextLine();
					System.out.println("Y a t'il des étudiants dans cette section? (O/N)");
					rep = sc.nextLine();
					rep = rep.toUpperCase();
					if(rep.equals("N")) {
						etudiant = null;
						Section sec = new Section(numSection, nomSection, etudiant);
						listeSection.add(sec);
					}else {
						System.out.println("Le numéro de l'étudiant ?");
						int num = sc.nextInt();
						sc.nextLine();
						etd = null;
						for(Etudiant x: listeEtudiant) {
							if(x.getNumEtudiant()==num) {
								etd = x;
								break;
							}
						}
						if(etd == null)
							System.out.println("Le numéro de l'étudiant est inexistant");
						else {
							Section sect = new Section(numSection, nomSection, etd);
							listeSection.add(sect);
						}
					}
					break;
				case 2:
					System.out.println("Numéro du projet ?");
					numProjet = sc.nextInt();
					sc.nextLine();
					System.out.println("Thème ?");
					theme = sc.nextLine();
					System.out.println("Y a t'il des étudiants alloué à ce projet? (O/N)");
					rep = sc.nextLine();
					rep = rep.toUpperCase();
					if(rep.equals("N")) {
						etudiant = null;
						Projet pro = new Projet(numProjet, theme, etudiant);
						listeProjet.add(pro);
					}else {
						System.out.println("Le numéro de l'étudiant ?");
						int num = sc.nextInt();
						sc.nextLine();
						etd = null;
						for(Etudiant x: listeEtudiant) {
							if(x.getNumEtudiant()==num) {
								etd = x;
								break;
							}
						}
						if(etd == null)
							System.out.println("Le numéro de l'étudiant est inexistant");
						else {
							Projet proj = new Projet(numProjet, theme, etd);
							listeProjet.add(proj);
						}
					}
					break;
				case 3:
					System.out.println("Numéro de l'étudiant ?");
					numEtudiant=sc.nextInt();
					sc.nextLine();
					System.out.println("Nom ?");
					nom=sc.nextLine();
					System.out.println("Prénom ?");
					prenom=sc.nextLine();
					etudiant = new Etudiant(numEtudiant, nom, prenom);
					listeEtudiant.add(etudiant);
					break;
				case 4:
					for (Section s : listeSection)
	 	    	     {
		    	    	System.out.println("____________________\n");
		    	    	System.out.println("Numéro de la Section :"+ s.getNumSection());
		    	    	System.out.println("Nom de la Section :"+s.getNomSection());
		    	     }
		    	    	System.out.println("____________________");
					break;
				case 5:
					for (Projet p : listeProjet)
	 	    	     {
		    	    	System.out.println("____________________\n");
		    	    	System.out.println("Numéro du Projet :"+ p.getNumProjet());
		    	    	System.out.println("Thème :"+p.getTheme());
		    	     }
		    	    	System.out.println("____________________");
					break;
				case 6:
					for (Etudiant et : listeEtudiant)
	 	    	     {
		    	    	System.out.println("____________________\n");
		    	    	System.out.println("Numéro de l'étudiant :"+ et.getNumEtudiant());
		    	    	System.out.println("Nom de l'étudiant :"+et.getNom());
		    	    	System.out.println("Prénom de l'étudiant :"+et.getPrenom());
		    	     }
		    	    	System.out.println("____________________");
					break;
				case 7:
					for (Section s : listeSection)
	 	    	     {
		    	    	System.out.println("____________________\n");
		    	    	System.out.println("Numéro section :"+ s.getNumSection());
		    	    	System.out.println("Nom section :"+s.getNomSection());
		    	    	if(s.getEtudiant()==null)
		    	    		System.out.println("Il n'y a pas d'étudiants dans cette section");
		    	    	else {
		    	    		System.out.println("Numéro de l'étudiant :"+ s.getEtudiant().getNumEtudiant());
			    	    	System.out.println("Nom de l'étudiant :"+s.getEtudiant().getNom());
			    	    	System.out.println("Prénom de l'étudiant :"+s.getEtudiant().getPrenom());
		    	    	}
		    	     }
		    	    	System.out.println("____________________");					
					
					break;
				case 8:
					for (Projet p : listeProjet)
	 	    	     {
		    	    	System.out.println("____________________\n");
		    	    	System.out.println("Numéro Projet :"+ p.getNumProjet());
		    	    	System.out.println("Nom Projet :"+p.getTheme());
		    	    	if(p.getEtudiant()==null)
		    	    		System.out.println("Il n'y a pas d'étudiants sur ce projet");
		    	    	else {
		    	    		System.out.println("Numéro de l'étudiant :"+ p.getEtudiant().getNumEtudiant());
			    	    	System.out.println("Nom de l'étudiant :"+p.getEtudiant().getNom());
			    	    	System.out.println("Prénom de l'étudiant :"+p.getEtudiant().getPrenom());
		    	    	}
		    	     }
		    	    	System.out.println("____________________");	
					break;
				case 9:
					for (Projet p : listeProjet)
	 	    	     {
		    	    	System.out.println("____________________\n");
		    	    	System.out.println("Numéro Projet :"+ p.getNumProjet());
		    	    	System.out.println("Nom Projet :"+p.getTheme());
		    	    	for (Section s : listeSection) {
		    	    		if(p.getEtudiant()!=s.getEtudiant())
			    	    		System.out.println("Il n'y a pas d'étudiants sur ce projet");
			    	    	else {
			    	    		System.out.println("Numéro de l'étudiant :"+ p.getEtudiant().getNumEtudiant());
				    	    	System.out.println("Nom de l'étudiant :"+p.getEtudiant().getNom());
				    	    	System.out.println("Prénom de l'étudiant :"+p.getEtudiant().getPrenom());
				    	    	if(s.getEtudiant()==null)
				    	    		System.out.println("Cet étudiant n'est dans aucune section");
				    	    	else {
					    	    	System.out.println("Numéro section :"+s.getNumSection());
					    	    	System.out.println("Thème :"+s.getNomSection());
				    	    	}
			    	    	}
		    	    	}
		    	     }
		    	    	System.out.println("____________________");
					break;
				case 10:
					break;
				default:
					System.out.println("!! choix invalide !!");
		    	    break;
			}
		}
		while(choix!=10);
		  System.out.println("Fin du programme");
		

	}

}
