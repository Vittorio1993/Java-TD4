/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package td4;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author zhanghuakai
 */
public class Portefeuille {
    private HashMap<Action,Integer> portefeuille;
    
    public Portefeuille(){
        portefeuille=new HashMap();
    }
    
    public void set_portefeuille(Action a,Integer i){
        portefeuille.put(a,i);
    }
    
    public void delete_portefeuille(Action a){
        portefeuille.remove(a);
    }
    
    public HashMap<Action,Integer> get_portefeuille(){
        return portefeuille;
    }
    
    public void afficher(){
        for(Map.Entry<Action,Integer> entry:portefeuille.entrySet()){
            System.out.println(entry.getKey().get_libelle()+" "+entry.getValue());
        }
    }
    
}
