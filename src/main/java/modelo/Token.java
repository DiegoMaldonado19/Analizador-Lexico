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
public class Token {
    /**
     * Atributos privados de la clase Token
     * Necesitamos un objeto de Tipo de nuestra enumeracion
     * Y un string para almacenar el valor
     */
    private Tipo tipo;
    private String valor;

    /**
     * Metodo para obtener el tipo de token
     * @return 
     */
    public Tipo getTipo() {
        return tipo;
    }

    /**
     * Metodo para setear el tipo de token
     * @param tipo 
     */
    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    /**
     * Metodo para obtener el valor del token
     * @return 
     */
    public String getValor() {
        return valor;
    }

    /**
     * Metodo para setear el valor del token
     * @param valor 
     */
    public void setValor(String valor) {
        this.valor = valor;
    }
}
