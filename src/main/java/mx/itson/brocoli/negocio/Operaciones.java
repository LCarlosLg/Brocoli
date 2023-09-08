/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.brocoli.negocio;

/**
 * Contiene métodos para trabajar con tipos de dato string.
 * @author Luis Carlos
 */
public class Operaciones {
 
    /**
     * Seprara una cadena de texto a partir de la expresión gion medio.
     * @param valor Cadena de texto que será separada a partir de la expresión dada.
     * @return Array de string en donde cada posición representada
     */
    
 public String[] separar (String valor){
  String[] elementos = valor.split("-");
     return elementos;
     
     
 }
}
