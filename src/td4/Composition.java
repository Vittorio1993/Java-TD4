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
public class Composition {
    private Double pourcentage;
    private ArrayList<Composition> lstcomposition;
    
    
    public Composition(Double p ){
        lstcomposition=new ArrayList<>();
        pourcentage=p;    
    }
    
}
