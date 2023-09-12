package POOJava;


// Déclaration de la classe Homme qui hérite de la classe Humain
public class Homme extends Humain 
{

    // Attribut spécifique à la classe Homme
    private String equipePreferee = "aucune";


    // Constructeur avec trois attributs (utilise le constructeur de la classe mère)
    public Homme(String nom, String prenom, int age) 
    {
        super(nom, prenom, age);                                        // Appel du constructeur de la classe mère avec trois attributs
    }


    // Second constructeur avec 8 paramètres
    public Homme(String nom, String prenom, int age, double taille, double poids, int anneeNaissance, String pays, String equipePreferee) 
    {
        super(nom, prenom, age, taille, poids, anneeNaissance, pays);   // Appel du constructeur de la classe mère avec 8 attributs
        this.equipePreferee = equipePreferee;                           // Initialise l'attribut equipePreferee avec la valeur passée en paramètre
    }


    // Redéfinition de la méthode sayHello pour afficher les informations spécifiques à la classe Homme
    @Override
    public void sayHello() 
    {
        // Affiche un message de salutation avec le prénom, le nom, l'âge et une indication que c'est un homme
        System.out.println("Je m'appelle " + prenom + " " + nom + ", je suis un homme et j'ai " + age + " ans.");
    }


    // Getter pour obtenir l'équipe préférée de l'homme
    public String getEquipePreferee() 
    {
        return equipePreferee;                                          // Retourne la valeur de l'attribut equipePreferee
    }






    @Override
    public void sayEverything() 
    {
        super.sayEverything();
        System.out.println("Mon équipe préf est " + equipePreferee);
    }

}


