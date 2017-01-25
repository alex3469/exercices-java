/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercice.heritage;
import exercices.heritage.animaux.entities.Animal;
import exercices.heritage.meubles.entities.Meuble;
/**
 *
 * @author alexandre-brunet
 */
public class Tripoteur {
    
    public String prenom = "";
    public void tripote(Animal animal){
        this.prenom = "Francois";
        System.out.println(this.getClass().getDeclaredMethods()
        [0].getName() + " " + animal.getClass().getSimpleName());
        animal.emettreSon();
        System.out.println(prenom + " Force "
        + animal.getClass().getSimpleName());
        animal.son = "hurle";
    }
    public void tripote(Meuble meuble){
        this.prenom = "Francois";
        System.out.println(this.getClass().getDeclaredMethods()
        [0].getName() + " " + meuble.getClass().getSimpleName());
        meuble.emettreSon();
        System.out.println(prenom + " Force "
        + meuble.getClass().getSimpleName());
        meuble.son = "craque";
    }
}