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
    
    public ClaseJoaquin(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    public int potencia(){
        return x^y;
    }
    
    public int raiz(){
        return x^(1/y);
    }
    
}
