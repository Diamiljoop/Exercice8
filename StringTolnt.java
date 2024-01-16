// pour utiliser Scanner
import java.util.*;
// pour utilier les methodes character et Integer source: javadoc
import java.lang.*;

public class StringTolnt{
    // declaration d'attribut
    String s;
    // declaration d'une methode pour gener l'affichage d'une chaine 
    public void Affichechaine(){
        System.out.println(s);
    }


    public static void main(String[] args) {
        /*variable  vef permet de respecter la  comparaison avec Character.isDigit(c)
        qui a un comportement boolean */
        boolean vef=true;
        // cette variable parmet de stocker ce nombre apres conversion string -> int
        int nombre_obtenu=0;
        //creaion d'objet 
        StringTolnt chaine= new StringTolnt();
        Scanner sc=null;
        sc=new Scanner(System.in);
        System.out.println("Donner votre chaine");
        // pour recuperer la chaine saisie
        chaine.s=sc.nextLine();
        // nombre_element permet de calcule le nombre d'element du chaine
        int nombre_elemnt=chaine.s.length();
        System.out.println("il y a "+nombre_elemnt+" caractere dans cette chaine");
        // variable somme ->  comptage de nombre dans une chaine
        int somme=0;
        for(int i=0;i< nombre_elemnt;i++){
           char c= chaine.s.charAt(i);
            if(Character.isDigit(c)==vef){
                somme=somme+1;
                if(somme==nombre_elemnt){
                    /*  utilisation de Integer.parseInt methode defini qui permet
                    de convertir  une chaine de caractere specifique (chaine de nombre) en int */
                    nombre_obtenu=Integer.parseInt(chaine.s);
                    System.out.println("n="+nombre_obtenu);

                }
            }
            else{
                System.out.println("l'element a la position "+i+" n'est pas un entier");
                break;
            }

        }
        

        
        
    }

    
}