/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.insset.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import java.util.HashMap;
import java.util.Map;
import org.insset.client.service.RomanConverterService;


/**
 *
 * @author user
 */
@SuppressWarnings("serial")
public class RomanConverterServiceImpl extends RemoteServiceServlet implements
        RomanConverterService {

    @Override
    public String convertDateYears(String nbr) throws IllegalArgumentException {
        //Implement your code
        
        String[] parties ;        
        String erreur="";        
        if (nbr.split("/").length>2){           
            parties = nbr.split("/");            
            int jour = Integer.parseInt(parties[0]);            
            int mois = Integer.parseInt(parties[1]);            
            int annee = Integer.parseInt(parties[2]);            
            switch(mois){               
                case 1: 
                case 3: 
                case 5: 
                case 7: 
                case 8: 
                case 10: 
                case 12 :                  
                    if (jour<1||jour>31){erreur+=" Ce jour n'est pas possible. ";}     
                    break;                
                case 2:                  
                    if(jour<1||jour>29){erreur+=" Ce jour n'est pas possible. ";}                
                    break;                case 4: case 6: case 9: case 11:                  
                        if(jour<1||jour>30){erreur+=" Ce jour n'est pas possible. ";}               
                        break;                
                    default: erreur +=" Ce mois n'est pas possible";           
                    break;           
            }            
            if(annee<0||annee>2020){erreur+=" Cette année n'est pas possible. ";}           
            if(erreur.equals("")){return convertArabeToRoman(jour)+"/"+convertArabeToRoman(mois)+"/"+convertArabeToRoman(annee);}            
            else{return erreur;}                    
        }        
        else if(nbr.split("-").length>2){           
            parties = nbr.split("-");           
            int jour = Integer.parseInt(parties[0]);           
            int mois = Integer.parseInt(parties[1]);           
            int annee = Integer.parseInt(parties[2]);           
            switch(mois)            
            {                
                case 1: 
                case 3: 
                case 5: 
                case 7: 
                case 8: 
                case 10: 
                case 12 :                  
                    if (jour<1||jour>31){erreur+=" Ce jour n'est pas possible. ";}                 
                    break;                
                case 2:                  
                    if(jour<1||jour>29){erreur+=" Ce jour n'est pas possible. ";}               
                    break;                
                case 4: case 6: case 9: case 11:                  
                    if(jour<1||jour>30){erreur+=" Ce jour n'est pas possible. ";}                
                    break;                
                default :                    erreur +=" Ce mois n'est pas possible";                
                break;            
            }           
            if(annee<0||annee>2020){erreur+=" Cette année n'est pas possible. ";}            
            if(erreur.equals("")){return convertArabeToRoman(jour)+"-"+convertArabeToRoman(mois)+"-"+convertArabeToRoman(annee);}            
            else{return erreur;}         
        }else{            
            return "La date doit répondre au format jj-mm-aaaa ou jj/mm/aaaa";        
        }    
    }

    @Override
    public Integer convertRomanToArabe(String nbr) throws IllegalArgumentException {
        //Implement your code
        
        String nbrb = nbr.toUpperCase();
            
        Map<String, Integer> romain =  new HashMap<String, Integer>();
        romain.put("I",1);
        romain.put("V",5);
        romain.put("X",10);
        romain.put("L",50);
        romain.put("C",100);
        romain.put("D",500);
        romain.put("M",1000);
       
        String tabP[] = {"I","X","C"};
        int somme = 0;
        int nb;
        int nbSuivant;
        for(int i = 0 ; i < nbrb.length()-1; i++){
         
            // le caracter de la chaine chiffreROmain
            String cara = Character.toString(nbrb.charAt(i));


            // le caracter suivant de chiffre Romain
            String caraSuivant = Character.toString(nbrb.charAt(i+1));

            // la valeur correspondant au caractére
            nb = romain.get(cara);
            // lavaleur correspondant au caractére suivant
            nbSuivant = romain.get(caraSuivant);

            // si le caractére de chiffre rommain correspond au caractére de la tabP
            // je vérifi si la valeur du caractére de chiffreRomain est plus petit quela valeur du caractére suivant
            // si oui je rend la valeur négatif sinon je la laisse positif
            for(int j = 0; j < tabP.length;j++){
                if(cara.equals(tabP[j])){
                    if( nb < nbSuivant ){
                         nb = -(nb);

                    }
                    else{
                       nb = nb;

                    }
                }
            }





           somme = somme + nb;
        }
        int nbDernier =romain.get(Character.toString(nbrb.charAt(nbr.length()-1)));
        return (somme+nbDernier);
       
    }
        //return 3;
    

    @Override
    @SuppressWarnings("empty-statement")
    public String convertArabeToRoman(Integer nbr) throws IllegalArgumentException {
        String tabUnite [] = {"","I","II","III","IV","V","VI","VII","VIII","IX"};
        String tabDizaine [] = {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        String tabCentaine[] = {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
        String tabMille[] = {"","M","MM",};
        
        String nbUtilisateur = nbr.toString();
       
        int taille = nbUtilisateur.length();
        switch(taille){
            case 1 : return tabUnite[nbr]; 
            case 2 : return tabDizaine[(nbr/10)%10] + tabUnite[(nbr/1)%10]; 
            case 3 : return tabCentaine [(nbr/100)%10] + tabDizaine[(nbr/10)%10] + tabUnite[(nbr/1)%10] ;
            case 4 : return tabMille[(nbr/1000)%10] + tabCentaine [(nbr/100)%10] + tabDizaine[(nbr/10)%10] + tabUnite[(nbr/1)%10] ;  
            default :return  "mauvais chiffre";
                
        }
        //return new String("XVXX");
    }

}
