package gestion;
import java.util.Scanner;


public class Personne {
    protected String nom;
    protected String prenom;
    protected int age;

    public Personne() {
    	Scanner s = new Scanner(System.in);
    	System.out.println("Donner le nom : ");
        this.nom = s.nextLine();
    	System.out.println("Donner le prenom : ");
    	this.prenom = s.nextLine();
    	System.out.println("Donner l'age : ");
    	this.age = s.nextInt();
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "\nLe Nom : " + nom + "\nPrénom : " + prenom + "\nAge    : " + age+"ans\n";
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	}

}
