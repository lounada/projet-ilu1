package Etudiant;
import gestion.Personne;

public class Etudiant extends Personne {
    private String numeroEtudiant;
    private String programmeEtude;

    public Etudiant() {
        super();
        //this.numeroEtudiant = numeroEtudiant;
        //this.programmeEtude = programmeEtude;
    }

    public String getNumeroEtudiant() {
        return numeroEtudiant;
    }

    public void setNumeroEtudiant(String numeroEtudiant) {
        this.numeroEtudiant = numeroEtudiant;
    }

    public String getProgrammeEtude() {
        return programmeEtude;
    }

    public void setProgrammeEtude(String programmeEtude) {
        this.programmeEtude = programmeEtude;
    }

    @Override
    public String toString() {
        return super.toString() + ", Numéro étudiant : " + numeroEtudiant + ", Programme d'étude : " + programmeEtude;
    }

	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Personne p = new Personne();
		String s= p.toString();
		System.out.println(s);
	}

}
