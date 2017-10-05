/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package td4;
import java.util.ArrayList;

/**
 *
 * @author zhanghuakai
 */
public class Actioncompose extends Action {
     ArrayList<Actionsimple> lstas;
    public Actioncompose(String l) {
        super(l);
        lstas=new ArrayList<>();
    }

    @Override
    void getvaleur(Jour j) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
