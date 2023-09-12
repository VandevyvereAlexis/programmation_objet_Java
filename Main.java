// Importation de toutes les classes du package POOJava
import POOJava.*;

// Classe principale du programme
public class Main 
{

    // public static void main = méthode principale du programme ( obligatoire en Java )
    public static void main(String arg[]) 
    {

        // HOMME 1
        Homme homme1 = new Homme("Doe", "Jhon", 25);                             // Créez une instance de la classe Homme en utilisant le constructeur à 3 paramètres
        homme1.sayHello();                                                                      // Appelez la méthode sayHello pour afficher ses informations
        System.out.println("Équipe préférée de homme1 : " + homme1.getEquipePreferee());        // Appelez le getter getEquipePreferee pour afficher son équipe favorite
        homme1.setPoids(65);                                                              // Utilisez le setter setPoids pour modifier le poids du premier homme à 65 kg
        System.out.println("Poids de homme1 après modification : " + homme1.getPoids());


        // HOMME 2
        Homme homme2 = new Homme("Smith", "Bob", 25, 1.80, 75.00, 1998, "France", "Paris");     // Créez une instance de la classe Homme en utilisant le constructeur à 8 paramètres
        homme2.sayHello();                                                                                                                                     // Appelez la méthode sayHello pour afficher ses informations
        System.out.println("Équipe préférée de homme2 : " + homme2.getEquipePreferee());                                                                       // Appelez le getter getEquipePreferee pour afficher son équipe favorite
        double poidsHomme2AvantModification = homme2.getPoids();                                                                                               // Utilisez le getter getPoids pour obtenir le poids actuel de homme2
        System.out.println("Poids de homme2 avant modification : " + poidsHomme2AvantModification);
        homme2.setPoids(poidsHomme2AvantModification + 5);                                                                                                     // Utilisez le setter setPoids pour modifier le poids du second homme de +5 kg
        System.out.println("Poids de homme2 après modification : " + homme2.getPoids());


        // FEMME 1
        Femme femme1 = new Femme("Johnson", "Alice", 30, 1.65, 55.00, 1993, "USA", "Vogue");    // Créez une instance de la classe Femme en utilisant le constructeur à 8 paramètres
        femme1.sayHello();
        System.out.println("Magazine préféré de femme1 : " + femme1.getMagazinePrefere());
        femme1.setMagazinePrefere("Niort Agglo Magazine");                                                                                      // Modifier le magazine préféré de femme1
        System.out.println("Nouveau magazine préféré de femme1 : " + femme1.getMagazinePrefere());                                                              // Afficher à nouveau le magazine préféré de femme1 après modification


        // Crée un tableau d'humains et y ajoute les instances homme1, homme2 et femme1
        Humain[] tableauHumains = {homme1, homme2, femme1};


        // Utilisation des setters pour définir les valeurs manquantes
        homme1.setTaille(175);                                          // Exemple de setter pour la taille
        homme1.setAnneeNaissance(1990);                         // Exemple de setter pour l'année de naissance
        homme1.setPays("USA");                                            // Exemple de setter pour le pays


        // Ce code utilise une boucle "for-each" pour parcourir un tableau d'objets de type Humain.
        for (Humain humain : tableauHumains) 
        {
            humain.sayEverything();                                            // Pour chaque objet Humain dans le tableau, nous appelons la méthode "sayEverything()".                                         
        }


        /* 
        Affichage des informations de base de chaque humain grâce à la méthode sayHello ( méthode plus courte au dessus )
        for (int i = 0; i < tableauHumains.length; i++) 
        {
            tableauHumains[i].sayHello();
        } 
        */

    }

}