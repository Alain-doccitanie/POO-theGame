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
public abstract class Personnages implements initializable,Interface{
public int force, pv, endurance ;
public String nom ;


public Personnages(){
this.iniAttributs();
}

public Personnages(String n){
this();
this.nom = n;
}
 abstract protected void iniAttributs();
    
    /**
     *
     * @param cible
     */
    @Override
    public void Attaquer(Personnages cible){
    cible.pv = cible.pv - (this.force - cible.endurance);
        if(cible.pv <= 0){
        System.out.println(cible.nom + " est mort !!!");
        }else{
        System.out.println(this.nom + " attaque "+ cible.nom +", il reste "+ cible.pv + " points de vie ! ");
        }
    }
   
}   



