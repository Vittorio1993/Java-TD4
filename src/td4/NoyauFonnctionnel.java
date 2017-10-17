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
        Actionsimple as1=new Actionsimple("Total");
        String j1="01012017";
        
        as1.setvaleur(j1, 2.3);
        
        Actionsimple as2=new Actionsimple("Airbus");
        as2.setvaleur(j1, 3.2);
        
        Actionsimple as3=new Actionsimple("AirFrance");
        as3.setvaleur(j1, 3.5);

        
        Composition com1=new Composition(0.5,as1);
        Composition com2=new Composition(0.5,as2);
        
        Actioncompose ac1=new Actioncompose("Toulouse");
        ac1.addcomposition(com1);
        ac1.addcomposition(com2);
        
       
        
        Portefeuille p1=new Portefeuille("p1");
        Portefeuille p2=new Portefeuille("p2");
        
        p1.set_portefeuille(ac1,100);
        p1.set_portefeuille(as1, 200);
        p2.set_portefeuille(as1, 50);
        p2.set_portefeuille(as2, 50);
        

        lstaction.put(1, ac1);
        lstaction.put(2, as1);
        lstaction.put(3, as2);
        lstaction.put(4, as3);
        
        
       
        lstporte.put(1, p1);
        lstporte.put(2, p2);
        
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
        Portefeuille p=new Portefeuille("") ;
        Action a=new Action("") {
            @Override
            public Double getvaleur(String j) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        } ;
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
    
    public void vendre(String porte, String action, Integer i){
        Portefeuille p=new Portefeuille("") ;
        Action a=new Action("") {
            @Override
            public Double getvaleur(String j) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        }  ;
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
    
    public void getvaleur(String j){
        System.out.println("Pour le jour "+j);
        for(Map.Entry<Integer,Action> entry:lstaction.entrySet()){
            System.out.println("L'action "+entry.getValue().get_libelle()+", la valeur est : "+entry.getValue().getvaleur(j));
        }
        
    }
    
    public void afficher(){
         for(Map.Entry<Integer,Portefeuille> entry:lstporte.entrySet()){
             System.out.println("Pour le Portefeuille : "+entry.getValue().get_libelle());
             entry.getValue().afficher();
         }
    }
    
}
