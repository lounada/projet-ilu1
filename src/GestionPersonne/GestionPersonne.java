package GestionPersonne;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import gestion.Personne;
import Etudiant.Etudiant;
import Professeur.Professeur;

public class GestionPersonne {
	private List<Personne> personnes;

    public GestionPersonne() {
        personnes = new ArrayList<>();
    }

    public void SuppPersonne() {
    	Scanner s=new Scanner(System.in);
    	int e,n;
    	System.out.print("Si tu veux supprimer un etudiant donne 1 et si tu veux suprimmer un professeur donner 2 : ");
		e = s.nextInt();
		if (e==1) {
			System.out.print("Donne le numero de l'etudiant : ");
			n = s.nextInt();
			for (Personne p : personnes) {
				if(p.getclassname()=="Etudiant" && p.getNum()==n) {
					personnes.remove(p);System.out.println("\nl'etudiant est bien supprimer!!!");return;
				}
			}
			System.out.println("\nl'etudiant n'existe pas!!!!!");
		}
		else if(e==2) {
			System.out.print("Donne le numero du professeur : ");
			n = s.nextInt();
			for (Personne p : personnes) {
				if(p.getclassname()=="professeur" && p.getNum()==n) {
					personnes.remove(p);System.out.println("\nprofesseur est bien supprimer!!!");return;
				}
			}
			System.out.println("\nle professeur n'existe pas!!!!!");
			
		}
		else {
			System.out.println("\nchoix incorrect");
		}

    }
    
    public void ajouterPersonne() {
    	int n;
    	Scanner s=new Scanner(System.in);
    	System.out.print("\nSi tu veut ajouter un professeur donner 1 et si tu veux ajouter un etudiant donne 2 : ");
    	n = s.nextInt();
    	if(n == 1) {
    		Personne p = new Professeur();
    		personnes.add(p);
    	}else if(n == 2) {
    		Personne p = new Etudiant();
    		personnes.add(p);
    	}else {
			System.out.println("\nchoix incorrect"); 
    	}
    }

    public void modifiePersonne() {
    	int nb,n,ng,ver=0;
    	Scanner s=new Scanner(System.in);
    	System.out.print("\nSi tu veut modifie un professeur donner 1 et si tu veux modifie un etudiant donne 2 : ");
    	n = s.nextInt();
    	if(n == 1) {
			System.out.print("\nDonne le numero du professeur : ");
			nb = s.nextInt();
			System.out.print("\nDonne le nouvelle numero du group : ");
			ng = s.nextInt();
    		for (Personne p : personnes) {
				if(p.getclassname()=="professeur" && p.getNum()==nb) {
					ver = 1;
					p.setNumeroGroup(ng);
					return;
				}
			}
    		if(ver == 0) {
    			System.out.println("\nProfesseur n'existe pas!!!!!!"); 
    			
    		}
    		
    	}else if(n == 2) {
			System.out.print("\nDonne le numero de l'etudiant : ");
			nb = s.nextInt();
			System.out.print("\nDonne le nouvelle numero du group : ");
			ng = s.nextInt();
    		for (Personne p : personnes) {
				if(p.getclassname()=="Etudiant" && p.getNum()==nb) {
					ver = 1;
					p.setNumeroGroup(ng);
					return;
				}
			}
    		if(ver == 0) {
    			System.out.println("\nEtudiant n'existe pas!!!!!!"); 
    			
    		}
    	}else{
			System.out.println("\nchoix incorrect"); 
    	}
    	
    	
    }
    public void recherchPersonne() {
    	int n,nb,ver=0;
    	Scanner s=new Scanner(System.in);
    	System.out.print("Si tu veut recherche un professeur donner 1 et si tu veux recherche un etudiant donne 2 et si tu veut recherche un group d'etudiant donne 3 :");
    	n = s.nextInt();
    	if(n == 1) {
			System.out.print("\nDonne le numero du professeur : ");
			nb = s.nextInt();
    		for (Personne p : personnes) {
				if(p.getclassname()=="professeur" && p.getNum()==nb) {
					ver = 1;
					System.out.println("\nprofesseur ::" + p.toString());return;
				}
			}
    		if(ver == 0) {
    			System.out.println("\nProfesseur n'existe pas!!!!!!"); 
    			
    		}
    		
    	}else if(n == 2) {
			System.out.print("\nDonne le numero de l'etudiant : ");
			nb = s.nextInt();
    		for (Personne p : personnes) {
				if(p.getclassname()=="Etudiant" && p.getNum()==nb) {
					ver = 1;
					System.out.println("\nEtudiant ::" + p.toString());return;
				}
			}
    		if(ver == 0) {
    			System.out.println("\nEtudiant n'existe pas!!!!!!"); 
    			
    		}
    	}else if(n == 3){
			System.out.print("\nDonne le numero du group : ");
			nb = s.nextInt();
			System.out.println("\n\t------------GRP "+nb+" ------------\n");
			for (Personne p : personnes) {
				
				if(p.getclassname()=="Etudiant" && p.getNumeroGroup()==nb) {
					ver = 1;
					System.out.println(p.toString());
				}
			}
			System.out.println("\n\t------------------------\n");
			if(ver == 0) {
				System.out.println("\nGroup n'existe pas!!!!!!");
			}
    	}else{
			System.out.println("\nchoix incorrect"); 
    	}
    }
    public void afficherPersonnes() {
        for (Personne p : personnes) {
            System.out.println(p.toString());
        }
    }
    
    
    public static void main(String[] args) {
        GestionPersonne gestion = new GestionPersonne();
        Scanner s =Personne.s;
        int choix;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Ajouter une personne");
            System.out.println("2. Modifier une personne");
            System.out.println("3. Supprimer une personne");
            System.out.println("4. Rechercher une personne");
            System.out.println("5. Afficher ");
            System.out.println("6. Quitter");
            System.out.print("\nFaites votre choix: ");
            choix = s.nextInt();

            switch (choix) {
                case 1:
                    gestion.ajouterPersonne();
                    break;
                case 2:
                    gestion.modifiePersonne();
                    break;
                case 3:
                    gestion.SuppPersonne();
                    break;
                case 4:
                    gestion.recherchPersonne();
                    break;
                case 5:
                	gestion.afficherPersonnes();
                	break;
                case 6:
                    break;
                default:
                    System.out.println("Choix incorrect");
                    break;
            }
        } while (choix != 6);
    }
    
}