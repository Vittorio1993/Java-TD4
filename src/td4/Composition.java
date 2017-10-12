/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package td4;

/**
 *
 * @author zhanghuakai
 */
public class Composition {
    private Double pourcentage;
    private Actionsimple as;
  
    public Composition(Double p, Actionsimple actions ){
        pourcentage=p;  
        as=actions;
    }
    
    public Double get_pourcentage(){
        return pourcentage;
    }
    
    public Actionsimple get_as(){
        return as;
    }
}
