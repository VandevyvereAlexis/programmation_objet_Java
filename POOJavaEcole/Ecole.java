
package POOJavaEcole;

import POOJava.Humain;

public class Ecole 
{

    private String nom;
    private String[] matieresEnseignees;
    private String ville;
    private Etudiant[] etudiants;


    public Ecole(String nom, String[] matieresEnseignees, String ville, Etudiant[] etudiants) 
    {
        this.nom = nom;
        this.matieresEnseignees = matieresEnseignees;
        this.ville = ville;
        this.etudiants = etudiants;
    }


    public void showInformations() 
    {
        System.out.println("Bienvenue à l'école " + nom + ", située à  " + ville + "et proposant ");

         // Ce code utilise une boucle "for-each" pour parcourir un tableau d'objets de type Humain.
        for (String matiere:matieresEnseignees) 
        {   
            System.out.println(matiere);
        }
    }


    // Getter pour obtenir le pays de l'humain
    public String getNom() 
    {
        return nom;
    }

    // Getter pour obtenir le pays de l'humain
    public Etudiant[] getEtudiants() 
    {
        return etudiants;
    }


    // Setter pour modifier le poids de l'humain
    public void getNom(String nom) 
    {
        this.nom = nom;
    }

}
