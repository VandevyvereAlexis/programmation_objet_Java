package POOJava;


// Déclaration de la classe Femme qui hérite de la classe Humain
public class Femme extends Humain 
{

    // Attribut spécifique à la classe Femme
    private String magazinePrefere = "aucun";


    // Constructeur avec trois attributs (utilise le constructeur de la classe mère)
    public Femme(String nom, String prenom, int age) 
    {
        super(nom, prenom, age);                                        // Appel du constructeur de la classe mère avec trois attributs
    }


    // Second constructeur avec 8 paramètres
    public Femme(String nom, String prenom, int age, double taille, double poids, int anneeNaissance, String pays, String magazinePrefere) 
    {
        super(nom, prenom, age, taille, poids, anneeNaissance, pays);   // Appel du constructeur de la classe mère avec 8 attributs
        this.magazinePrefere = magazinePrefere;                         // Initialise l'attribut magazinePrefere avec la valeur passée en paramètre
    }


    // Redéfinition de la méthode sayHello pour afficher les informations spécifiques à la classe Femme
    @Override
    public void sayHello() 
    {
        // Affiche un message de salutation avec le prénom, le nom, l'âge et une indication que c'est une femme
        System.out.println("Je m'appelle " + prenom + " " + nom + ", je suis une femme et j'ai " + age + " ans.");
    }


     // Getter pour obtenir le magazine préféré de la femme
    public String getMagazinePrefere() 
    {
        return magazinePrefere;                                         // Retourne la valeur de l'attribut magazinePrefere
    }


     // Setter pour modifier le magazine préféré de la femme
    public void setMagazinePrefere(String magazinePrefere) 
    {
        this.magazinePrefere = magazinePrefere;                         // Met à jour la valeur de l'attribut magazinePrefere
    }

}
