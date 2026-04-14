package classes.exercice;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class Voiture {
    String marque;
    String modele;
    int annee;
    double prix;
 
    public Voiture(String marque, String modele, int annee, double prix) {
        this.marque = marque;
        this.modele = modele;
        this.annee = annee;
        this.prix = prix;
       
        }
    public void afficherDescription() {
        System.out.println("Marque : " + marque);
        System.out.println("Modele : " + modele);
       System.out.println("age    : " + calculAge() + " ans");
        System.out.println("Prix : " + prix + " €");
       


}
    public void appliquerReduction(double pourcentage) {
  
    this.prix = prix - (prix * 10 / 100);
    
}
    public void appliquerReduction() {
  
    this.prix = prix - (prix * 20/ 100);
    
}
 
    public int calculAge() {
    // On calcule l'âge par rapport à l'année actuelle (2026 dans l'exercice)
    int age = 2026 - this.annee; 
    return age; // On renvoie la valeur pour qu'elle soit réutilisable ailleurs [cite: 150, 151]
}
}
