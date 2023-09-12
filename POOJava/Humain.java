package POOJava;


// Déclaration de la classe Humain comme "abstract", ce qui signifie qu'elle ne peut pas être instanciée directement.
public abstract class Humain 
{

    // Attributs de la classe Humain
    protected String nom;                           // Nom de l'humain
    protected String prenom;                        // Prénom de l'humain
    protected String pays;                          // Pays de l'humain
    protected double taille;                        // Taille de l'humain
    protected double poids;                         // Poids de l'humain
    protected int age;                              // Âge de l'humain
    protected int anneeNaissance;                   // Année de naissance de l'humain


    // Constructeur avec trois attributs
    public Humain(String nom, String prenom, int age) 
    {
        this.nom = nom;                             // Initialise le nom de l'humain avec la valeur passée en paramètre
        this.prenom = prenom;                       // Initialise le prénom de l'humain avec la valeur passée en paramètre
        this.age = age;                             // Initialise l'âge de l'humain avec la valeur passée en paramètre
    }


    // Second constructeur avec 7 attributs
    public Humain(String nom, String prenom, int age, double taille, double poids, int anneeNaissance, String pays) 
    {
        this.nom = nom;                             // Initialise le nom de l'humain avec la valeur passée en paramètre
        this.prenom = prenom;                       // Initialise le prénom de l'humain avec la valeur passée en paramètre
        this.age = age;                             // Initialise l'âge de l'humain avec la valeur passée en paramètre
        this.taille = taille;                       // Initialise la taille de l'humain avec la valeur passée en paramètre
        this.poids = poids;                         // Initialise le poids de l'humain avec la valeur passée en paramètre
        this.anneeNaissance = anneeNaissance;       // Initialise l'année de naissance de l'humain avec la valeur passée en paramètre
        this.pays = pays;                           // Initialise le pays de l'humain avec la valeur passée en paramètre
    }


    // Méthode sayHello qui affiche un message de salutation avec le prénom et le nom de l'humain
    public void sayHello() 
    {
        System.out.println("Bonjour, je m'appelle " + prenom + " " + nom + ".");
    }


    // Getter pour obtenir le pays de l'humain
    public String getPays() 
    {
        return pays;
    }


    // Setter pour modifier le poids de l'humain
    public void setPoids(double poids) 
    {
        this.poids = poids;
    }


    // Getter pour obtenir le pays de l'humain
    public double getPoids() 
    {
        return poids;
    }


    // Déclaration de la méthode sayEverything() qui ne renvoie rien (void).
    public void sayEverything() 
    {
        System.out.println("Bonjour, je m'appelle " + prenom + " " + nom + ", j'ai " + age + " ans, je pèse " + poids + " kg, je mesure " + taille + " cm, je suis né en " + anneeNaissance + " et je viens de " + pays + ".");
        // Cette ligne utilise System.out.println() pour afficher une chaîne de caractères dans la console.
        // La chaîne de caractères à afficher commence par "Bonjour, je m'appelle " et se termine par ".".
        // Entre les guillemets doubles ("..."), il y a des parties de texte fixe (comme "Bonjour, je m'appelle "), et il y a des variables qui sont insérées à l'aide de l'opérateur de concaténation +.
        // Le résultat final est une phrase complète qui combine le texte fixe et les valeurs des variables, et cette phrase est affichée dans la console.
        // Cette ligne termine la définition de la méthode sayEverything().
    }


    // Déclaration de la méthode setTaille() qui prend un double en argument.
    public void setTaille(double taille) 
    {
        this.taille = taille;
        // Cette ligne affecte la valeur du paramètre 'taille' passé à la variable membre 'taille' de l'objet courant (représenté par 'this').
        // En d'autres termes, cette méthode permet de modifier la valeur de la propriété 'taille' de l'objet en lui attribuant la nouvelle valeur passée en argument.
        // Cette ligne termine la définition de la méthode setTaille().
    }
    

    // Déclaration de la méthode setAnneeNaissance() qui prend un entier (int) en argument.
    public void setAnneeNaissance(int anneeNaissance) 
    {
        this.anneeNaissance = anneeNaissance;
        // Cette ligne affecte la valeur du paramètre 'anneeNaissance' passé à la variable membre 'anneeNaissance' de l'objet courant (représenté par 'this').
        // De cette manière, cette méthode permet de modifier la valeur de la propriété 'anneeNaissance' de l'objet en lui attribuant la nouvelle valeur passée en argument.
        // Cette ligne termine la définition de la méthode setAnneeNaissance().
    }
    

    // Déclaration de la méthode setPays() qui prend une chaîne de caractères (String) en argument.
    public void setPays(String pays) 
    {
        this.pays = pays;
        // Cette ligne affecte la valeur du paramètre 'pays' passé à la variable membre 'pays' de l'objet courant (représenté par 'this').
        // Ainsi, cette méthode permet de modifier la valeur de la propriété 'pays' de l'objet en lui attribuant la nouvelle valeur passée en argument.
        // Cette ligne termine la définition de la méthode setPays().
    }
}

