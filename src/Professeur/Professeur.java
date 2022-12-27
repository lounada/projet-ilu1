
package Professeur;

import gestion.Personne;

public class Professeur extends Personne {
    private int numeroProfesseur;
    private int grade;
    private String spatialite;
    private int numgroup;

    public Professeur() {
        super();
        System.out.print("Donner le numero             : ");
		this.numeroProfesseur = s.nextInt();
		System.out.print("Donner le numero du group    : ");
		this.numgroup=s.nextInt();
		System.out.print("Donner le grade              : ");
		this.grade=s.nextInt();s.nextLine();
		System.out.print("Donner la spatialite         : ");
		this.spatialite = s.nextLine();
	   }

    public int getNumeroGroup() {
        return numgroup;
    }
    @Override
    public int getNum() {
    	return this.numeroProfesseur;
    }

    public void setNumeroGroup(int numgroup) {
        this.numgroup = numgroup;
    }

    @Override
   public String toString() {
        return "\n\t------------------------\nProfesseur numero: " + this.numeroProfesseur+ super.toString() +  "Le grade est     : " + grade + "\nspatialité est   : " + this.spatialite + "\nNumero du groupe : " + this.numgroup;
    }
		
	@Override
	public String getclassname() {
		return "professeur";
	}
	
	public void setNumeroProfesseur(int numeroProfesseur) {
		this.numeroProfesseur = numeroProfesseur;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public String getSpatialite() {
		return spatialite;
	}
	public void setSpatialite(String spatialite) {
		this.spatialite = spatialite;
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Professeur p =new Professeur();
		System.out.println(p.toString());
	}
}
