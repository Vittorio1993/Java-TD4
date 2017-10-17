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
    ArrayList<Composition> lstcom;
    public Actioncompose(String l) {
        super(l);
        lstcom=new ArrayList<>();
    }
    
    public void addcomposition(Composition com){
        lstcom.add(com);
        
    }

    @Override
    public Double getvaleur(String j) {
        Double totalpour=0.0;
        Double courcompose=0.0;
        for(int i=0;i<lstcom.size();i++){
                totalpour=totalpour+lstcom.get(i).get_pourcentage();
                //System.out.println();
                }
        if(totalpour==1.0){
            for(int k=0;k<lstcom.size();k++){
                courcompose=courcompose+lstcom.get(k).get_as().getvaleur(j)*lstcom.get(k).get_pourcentage();
            }
        }
        else{
            System.out.println("Le total de pourcentage n'est pas 100%");
        }
         return courcompose;   
    }
    
}
