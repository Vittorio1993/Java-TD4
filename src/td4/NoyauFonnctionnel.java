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
    
    public void afficher_lstporte (){
        for(Map.Entry<Integer,Portefeuille> entry:lstporte.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue().get_libelle());
        }
        
    }
    
    public void set_lstaction(Integer i, Action a){
        lstaction.put(i, a);
        
    }
    
     public void afficher_lstaction (){
        for(Map.Entry<Integer,Action> entry:lstaction.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue().get_libelle());
        }
        
    }
    
    public void acheter(String porte, String action, Integer i){
        Portefeuille p = null;
        Action a = null;
        Integer n;
        for(Map.Entry<Integer,Portefeuille> entry:lstporte.entrySet()){
            if(entry.getValue().get_libelle().equals(porte)){
                p=entry.getValue();
            } 
        }
        for(Map.Entry<Integer,Action> entry:lstaction.entrySet()){
            if(entry.getValue().get_libelle().equals(action)){
                a=entry.getValue();
            } 
        }
        
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
