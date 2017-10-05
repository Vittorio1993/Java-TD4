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
    HashMap<Jour, Double> map;
   
    public Actionsimple(String l){
        super(l);
        map = new HashMap<>();
    }

    Double setvaleur(Jour j) {
        return map.get(j);
    }
      
    @Override
    void getvaleur(Jour j) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
