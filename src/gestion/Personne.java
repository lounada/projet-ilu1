package gestion;
import java.util.Scanner;


abstract public  class Personne {
    protected String nom;
    protected String prenom;
    protected int age;
    public static Scanner s=new Scanner(System.in);

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

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }
    public abstract  String getclassname();
    public abstract  int getNum();

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "\nLe Nom           : " + nom + "\nPrénom           : " + prenom + "\nAge              : " + age+" ans\n";
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	}

	public abstract int getNumeroGroup();
	public abstract void setNumeroGroup(int n);

}
