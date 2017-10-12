/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package td4;
import java.util.HashMap;
/**
 *
 * @author zhanghuakai
 */
public class NoyauFonnctionnel {
    private HashMap<Integer,Portefeuille> lstporte;
    private HashMap<Integer,Action> lstaction;
    
    public NoyauFonnctionnel(){
        lstporte=new HashMap();
        lstaction=new HashMap<>();
    }
    
    public void set_lstporte(Integer i, Portefeuille p){
        lstporte.put(i, p);
    }
    
    public void set_lstaction(Integer i, Action a){
        lstaction.put(i, a);
        
    }
    
    public void achter(Portefeuille p, Action a, Integer i){
        Integer n;
        if (p.get_portefeuille().containsKey(a)){
            n=p.get_portefeuille().get(a)+i;
            p.set_portefeuille(a,n);
        }else{
            p.set_portefeuille(a,i);
        }
    }
    
    public void vendre(Portefeuille p, Action a, Integer i){
        Integer n;
         if (p.get_portefeuille().containsKey(a)){
            n=p.get_portefeuille().get(a)-i;
            if(n!=0){
                p.set_portefeuille(a,n);
            }else{
                p.delete_portefeuille(a);            
            }        
        }else{
             System.out.println("Il n'y a pas de cet action");
         }
    }
     
    
    
}
