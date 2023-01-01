package Etudiant;
import gestion.Personne;
     
//class Etudiant
public class Etudiant extends Personne {
    private int numeroEtudiant;
    private int semestre;
    private String filiere;
    private int numgroup;

    public Etudiant() {
    	//appel au constructeur de la class mere
        super();
		System.out.print("Donner le numero             : ");
		this.numeroEtudiant = s.nextInt();
		System.out.print("Donner le numero du group    : ");
		this.numgroup=s.nextInt();
		System.out.print("Donner le numero du semestre : ");
		this.semestre=s.nextInt();s.nextLine();
		System.out.print("Donner le nom de la filier   : ");
		this.filiere = s.nextLine();
    }
    //redefinition de la methode getNom pour quel il return le numero de l'etudiant 
    @Override
    public int getNum() {
    	return this.numeroEtudiant;
    }
    
    public int getNumeroEtudiant() {
        return numeroEtudiant;
    }

    public void setNumeroEtudiant(int numeroEtudiant) {
        this.numeroEtudiant = numeroEtudiant;
    }
    
    public int getNumeroGroup() {
        return numgroup;
    }

    public void setNumeroGroup(int numgroup) {
        this.numgroup = numgroup;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemester(int semestre) {
        this.semestre = semestre;
    }
    //redefintion de la methode toString
    @Override
    public String toString() {
        return  "\n\t------------------------\nEtudiant numero  : " +this.numeroEtudiant+ super.toString() +  "Semestre         : " + semestre + "\nFiliere numero   : " + this.filiere + "\nNumero du groupe : " + this.numgroup;
    }
	
	public String getFiliere() {
		return filiere;
	}

	public void setFiliere(String filiere) {
		this.filiere = filiere;
	}
	//redefinition de la methode getNom pour quel il return le nom de la class
	@Override
	public String getclassname() {
		// TODO Auto-generated method stub
		return "Etudiant";
	}
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Etudiant p = new Etudiant();
		String s= p.toString();
		System.out.println(s);
	}


 



}
