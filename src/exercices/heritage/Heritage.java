/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercices.heritage;
import exercice.heritage.Tripoteur;
import exercices.core.Application;
import exercices.heritage.animaux.entities.Animal;
import exercices.heritage.animaux.entities.impl.Chat;
import exercices.heritage.animaux.entities.impl.Chien;
import exercices.heritage.meubles.entities.Meuble;
import exercices.heritage.meubles.entities.impl.Table;
/**
 *
 * @author alexandre-brunet
 */
public class Heritage extends Application {
    @Override
    public void start() {
        Animal chien = new Chien();
        Animal chat = new Chat();
        chien.emettreSon();
        chat.emettreSon();
        Meuble table = new Table();
        table.getNom();
        table.emettreSon();
        
        
        chat.emettreSon();
        chien.emettreSon();
        Tripoteur Francois = new Tripoteur();
        Francois.tripote(chat);
        chat.emettreSon();
        Francois.tripote(table);
        table.emettreSon();
    }
    @Override
    public void create() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}