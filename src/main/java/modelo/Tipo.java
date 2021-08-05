/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author DIEGO MALDONADO
 */
public enum Tipo {
    NUMERO ("[0-9]+"),
    ID ("[a-z][A-Z]+"),
    NUMERO_DECIMAL ("[0-9]+[.][0-9]+");
    
    public final String patron;
    
    Tipo(String s){
        this.patron = s;
    }  
}
