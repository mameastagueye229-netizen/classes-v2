/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package classes.exercice;

/**
 *
 * @author DELL
 */
public class ClassesExercice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         /**
        String marque = "Peugeot";
        String modele = "208";
        int annee = 2021;
        double prix = 14500.0;
        System.out.println(" " + marque + " " + modele + " de " + annee + " au prix de " + prix );
          */
       Voiture v1 = new Voiture();
v1.marque = "Peugeot"; v1.modele = "208"; v1.annee = 2021; v1.prix = 14500;

Voiture v2 = new Voiture();
v2.marque = "Renault"; v2.modele = "Clio"; v2.annee = 2000; v2.prix = 3500;

Voiture v3 = new Voiture();
v3.marque = "Toyota"; v3.modele = "Yaris"; v3.annee = 2015; v3.prix = 9800;
 System.out.println("" + v1.marque + " " + v1.modele + " (" + v1.annee + ") - " + v1.prix );
System.out.println(" " + v2.marque + " " + v2.modele + " (" + v2.annee + ") - " + v2.prix );
System.out.println(" " + v3.marque + " " + v3.modele + " (" + v3.annee + ") - " + v3.prix);
    }

}
