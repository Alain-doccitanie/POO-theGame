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
public class Elfes extends Personnages {
 
    public Elfes(){}
    public Elfes(String n){
    super(n);
    
    
 
    }

    @Override
    protected void iniAttributs() {
        this.endurance = 10;
        this.force = 20;
        this.pv = 50;
    }
}
