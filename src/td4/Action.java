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
abstract class Action {
    protected String Libelle;
    
    public Action(String l){
        Libelle=l;
    }
    
    public Double getvaleur(Jour j){
        return null;
        
    }
    
    public String get_libelle(){
        return Libelle;
    }
    
}
