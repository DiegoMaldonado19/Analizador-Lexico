/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import javax.swing.JTextArea;
import modelo.Token;
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
        lexema = areaTexto.getText().split("\n");
        /**
         * Retornamos el arreglo
         */
        return lexema;
    }
        
    public void analizadorLexico(String[] lexema, JTextArea areaTexto){
            
    }
}
