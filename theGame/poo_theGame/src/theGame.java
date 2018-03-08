
import Games.Elfes;
import Games.Humain;
import Games.Personnages;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alain
 */

public class theGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Personnages[] domeDuTonerre = new Personnages[2];
        domeDuTonerre[0] = new Humain("loic");
        domeDuTonerre[1] = new  Elfes("yannick");
          
        int fin = 1000;
        
        while(fin > 0){
        double choix = Math.random();
        
        if(choix > 0.5){
        domeDuTonerre[0].Attaquer(domeDuTonerre[1]);
        fin = domeDuTonerre[1].pv;
        }else{
         domeDuTonerre[1].Attaquer(domeDuTonerre[0]);
         fin = domeDuTonerre[0].pv;
        }
        }
       
    }
} // TODO code application logic here
public static void action(Interface object,Personnages cible){

} 
    

