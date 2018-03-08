/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Games;

/**
 *
 * @author alain
 */
public class Humain extends Personnages{
    
    public Humain(String n){
    super(n);
    }
       
         
        @Override
        public void iniAttributs(){
    
        this.endurance = 10;
        this.force = 10;
        this.pv = 25;
        }
    
}

