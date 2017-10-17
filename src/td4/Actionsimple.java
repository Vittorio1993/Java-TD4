/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package td4;
import java.util.HashMap;
//import java.util.Map;

/**
 *
 * @author zhanghuakai
 */
public class Actionsimple extends Action{
    HashMap<String, Double> map;
   
    public Actionsimple(String l){
        super(l);
        map = new HashMap<>();
    }
    

    public void setvaleur(String j, Double d) {
        map.put(j,d);
        
    }    
  
    @Override
    public Double getvaleur(String j) {
        return map.get(j);
    }

  
    
    
}
