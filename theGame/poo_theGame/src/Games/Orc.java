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
public class Orc extends Personnages{

public Orc(){}    
    
 public Orc(String n){
    super(n);
    }


    @Override
    protected void iniAttributs() {
     this.endurance = 20;
        this.force = 30;
        this.pv = 70;  
    }
 }

