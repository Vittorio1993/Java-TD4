/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import td4.Actioncompose;
import td4.Actionsimple;
import td4.Composition;
import td4.Jour;
import td4.NoyauFonnctionnel;
import td4.Portefeuille;

/**
 *
 * @author zhanghuakai
 */
public class Run {
    public static void main(String[] args){
        Actionsimple as1=new Actionsimple("Total");
        Jour j1=new Jour(2107,1);
        as1.setvaleur(j1, 2.3);
        
        Actionsimple as2=new Actionsimple("Airbus");
        as2.setvaleur(j1, 3.2);
        
        Actionsimple as3=new Actionsimple("AirFrance");
        as2.setvaleur(j1, 3.5);
        
        System.out.println(as1.getvaleur(j1));
        System.out.println(as2.getvaleur(j1));
        
        Composition com1=new Composition(0.5,as1);
        Composition com2=new Composition(0.5,as2);
        
        Actioncompose ac1=new Actioncompose("Toulose");
        ac1.addcomposition(com1);
        ac1.addcomposition(com2);
        
        System.out.println(ac1.getvaleur(j1));
        
        Portefeuille p1=new Portefeuille("p1");
        Portefeuille p2=new Portefeuille("p2");
        
        p1.set_portefeuille(ac1,100);
        p1.set_portefeuille(as1, 200);
        p2.set_portefeuille(as1, 50);
        p2.set_portefeuille(as2, 50);
        
        p1.afficher();
        p2.afficher();
        
        System.out.print("\n");
        NoyauFonnctionnel N=new NoyauFonnctionnel();
        N.set_lstaction(1, ac1);
        N.set_lstaction(2, as1);
        N.set_lstaction(3, as2);
        N.set_lstaction(4, as3);
        N.afficher_lstaction();
        
        System.out.print("\n");
        N.set_lstporte(1, p1);
        N.set_lstporte(2, p2);
        N.afficher_lstporte();
        
        System.out.print("\n");
        N.acheter("p1", "Total", 50);
        N.acheter("p2", "AirFrance", 150);
        p2.afficher();
        System.out.print("\n");
        N.vendre(p1, ac1, 50);
        p1.afficher();
        
        
    }
    
}
