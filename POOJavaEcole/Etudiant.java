package POOJavaEcole;

public class Etudiant 
{

    private String nom;
    private String prenom;
    private int age;
    private String matiereEtudiee;
    private Boolean diplomeObtenu;


    public Etudiant(String nom, String prenom, int age, String matiereEtudiee, Boolean diplomeObtenu) 
    {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.matiereEtudiee = matiereEtudiee;
        this.diplomeObtenu = diplomeObtenu;
    }


    public void sayHello() 
    {
        System.out.println("Bonjour, je m'appelle " + prenom + " " + nom + ", j'ai " + age + " et j'étudie " + matiereEtudiee);
    }

    public void isGraduated() 
    {
        if (diplomeObtenu) 
        {
            System.out.println("J'ai obtenu mon diplôme");
        } else {
            System.out.println("Je ne suis pas encore diplômé(e)");
        }
    }


    // Getter pour obtenir le pays de l'humain
    public String getNom() 
    {
        return nom;
    }


    // Setter pour modifier le poids de l'humain
    public void getNom(String nom) 
    {
        this.nom = nom;
    }

    public void setNom(String nouveauNom) 
    {
        nom = nouveauNom;
    }

    // Setter pour modifier le poids de l'humain
    public void setDiplomeObtenu(Boolean diplomeObtenu) 
    {
        this.diplomeObtenu = diplomeObtenu;
    }

}

