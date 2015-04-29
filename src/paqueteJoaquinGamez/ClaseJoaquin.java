/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteJoaquinGamez;

/**
 *
 * @author Joaquín Gámez
 */
public class ClaseJoaquin {
    int x;
    int y;
    
    public ClaseJoaquin(){
        this.x = 4;
        this.y = 2;
    }
    
    public int potencia(){
        return x^y;
    }
    
    public int raiz(){
        return x^(1/y);
    }
    
}
