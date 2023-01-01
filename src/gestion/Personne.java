package gestion;
import java.util.Scanner;

//class personne 
abstract public  class Personne {
    protected String nom;
    protected String prenom;
    protected int age;
    public static Scanner s=new Scanner(System.in);
//constructeur 
    public Personne() {
    	try  {
    		s.nextLine();
			System.out.print("Donner le nom                : ");
			this.nom = s.nextLine();
			System.out.print("Donner le prenom             : ");
			this.prenom = s.nextLine();
			System.out.print("Donner l'age                 : ");
			this.age = s.nextInt();
			
		}
    	catch (Exception e) {
    		System.err.print("erreur");
    	}
    }
    //définition des getters et setters
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    //redefinition de la methode tostring pour l'utiliser a l'affichage des instance
    public String toString() {
        return "\nLe Nom           : " + nom + "\nPrénom           : " + prenom + "\nAge              : " + age+" ans\n";
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	}
	//des methodes abstract qui nous a aide dans les fonctionnalité de la collection
	public abstract int getNumeroGroup();
	public abstract void setNumeroGroup(int n);
    public abstract  String getclassname();
    public abstract  int getNum();

}
