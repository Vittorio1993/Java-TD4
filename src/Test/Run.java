/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;


import td4.NoyauFonnctionnel;


/**
 *
 * @author zhanghuakai
 */
public class Run {
    public static void main(String[] args){
       NoyauFonnctionnel N=new NoyauFonnctionnel();
        System.out.println("Cette système concerne des actions : ");
        N.afficher_lstaction();
        System.out.println("\n");
        System.out.println("Cette système concerne des portefeuilles : ");
        N.afficher_lstporte();
        
        System.out.println("\n");
        String j1="01012017";
        N.getvaleur(j1);
        
        System.out.println("\n");
        N.afficher();
        N.acheter("p1", "Total", 50);
        N.acheter("p2", "AirFrance", 150);
        N.vendre("p1", "Toulouse", 50);
        
        System.out.println("\n"+"Après des opérations");
        N.afficher();
        
        
        
    }
    
}
