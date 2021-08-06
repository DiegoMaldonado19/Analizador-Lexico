/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import javax.swing.JTextArea;
import modelo.Tipo;

/**
 *
 * @author DIEGO MALDONADO
 */
public class Controlador {
        
    /**
     * Metodo para separar el texto ingresado en el text area
     * @param areaTexto JTextArea que almacena todo el texto ingresado por el usuario
     * @return 
     */
    public String[] separacionTextoInicial(JTextArea areaTexto){
        /**
         * Nos ayudamos del metodo split para poder almacenar cada linea del lexema
         */
        String[] lexema = new String[areaTexto.getColumns()];
        lexema = areaTexto.getText().split(" ");
        /**
         * Retornamos el arreglo
         */
        return lexema;
    }
    
    /**
     * Metodo para analizar el lexema que enviamos en cada posicion del arreglo string
     * @param lexema arreglo de cadenas, que ingresa el usuario
     * @param areaTexto JTextArea para escribir los resultados del analisis
     */
    public void analizadorLexico(String[] lexema, JTextArea areaTexto){
       int contadorLetras=0, contadorNumeros=0, contadorCaracteres=0, contadorDecimal=0;
       char[] caracter;
       for(int i=0; i<lexema.length; i++){
           contadorLetras=0;
           contadorNumeros=0;
           contadorCaracteres=0; 
           contadorDecimal=0;
           caracter = lexema[i].toCharArray();
           for(int j=0; j<caracter.length; j++){
               if(caracter[j]=='A' || caracter[j]=='B' || caracter[j]=='C' || caracter[j]=='D' || caracter[j]=='E'
                       || caracter[j]=='F' || caracter[j]=='G' || caracter[j]=='H' || caracter[j]=='I' || caracter[j]=='J'
                       || caracter[j]=='K' || caracter[j]=='L' || caracter[j]=='M' || caracter[j]=='N' || caracter[j]=='Ñ'
                       || caracter[j]=='O' || caracter[j]=='P' || caracter[j]=='Q' || caracter[j]=='R' || caracter[j]=='S'
                       || caracter[j]=='T' || caracter[j]=='U' || caracter[j]=='V' || caracter[j]=='W' || caracter[j]=='X'
                       || caracter[j]=='Y' || caracter[j]=='Z' || caracter[j]=='a' || caracter[j]=='b' || caracter[j]=='c' 
                       || caracter[j]=='d' || caracter[j]=='e' || caracter[j]=='f' || caracter[j]=='g' || caracter[j]=='h' 
                       || caracter[j]=='i' || caracter[j]=='j' || caracter[j]=='k' || caracter[j]=='l' || caracter[j]=='m' 
                       || caracter[j]=='n' || caracter[j]=='ñ' || caracter[j]=='o' || caracter[j]=='p' || caracter[j]=='q' 
                       || caracter[j]=='r' || caracter[j]=='s' || caracter[j]=='t' || caracter[j]=='u' || caracter[j]=='v' 
                       || caracter[j]=='w' || caracter[j]=='x' || caracter[j]=='y' || caracter[j]=='z') {
                   contadorLetras++;
               }
               else if(caracter[j]=='0' || caracter[j]=='1'  || caracter[j]=='2'  || caracter[j]=='3'  || caracter[j]=='4'
                        || caracter[j]=='5'  || caracter[j]=='6'  || caracter[j]=='7'  || caracter[j]=='8'  || caracter[j]=='9'){
                   contadorNumeros++;
               }
               else if(caracter[j]=='@'  || caracter[j]=='$' || caracter[j]=='%' || caracter[j]=='&'  || caracter[j]=='~'
                        || caracter[j]=='['  || caracter[j]==']'  || caracter[j]=='{'  || caracter[j]=='}'
                        || caracter[j]=='?'  || caracter[j]=='¿'  || caracter[j]=='='  || caracter[j]=='*'
                        || caracter[j]=='/'  || caracter[j]=='"'  || caracter[j]=='#'  || caracter[j]=='!'
                        || caracter[j]=='<'  || caracter[j]=='>'  || caracter[j]=='¡'){
                   contadorCaracteres++;
               }
               else if(caracter[j]=='.' || caracter[j]==','){
                   contadorDecimal++;
               }
           }
        if(contadorNumeros==caracter.length){
            areaTexto.append(String.valueOf(Tipo.NUMERO)+": "+lexema[i]);
            areaTexto.append(System.getProperty("line.separator")); 
        }
        else if(contadorCaracteres==caracter.length){
            areaTexto.append(String.valueOf(Tipo.CARACTER)+": "+lexema[i]);
            areaTexto.append(System.getProperty("line.separator")); 
        }
        else if(contadorLetras==caracter.length){
            areaTexto.append(String.valueOf(Tipo.IDENTIFICADOR)+": "+lexema[i]);
            areaTexto.append(System.getProperty("line.separator")); 
        }
        else if(contadorDecimal>0 && contadorNumeros>1){
            areaTexto.append(String.valueOf(Tipo.NUMERO_DECIMAL)+": "+lexema[i]);
            areaTexto.append(System.getProperty("line.separator")); 
        }
        }
    }
}
