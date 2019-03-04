/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

/**
 *
 * @author gabriel
 */
public class Estancias {
    
    private int m2;
    
    public Estancias(){
        m2=0;
    }
    
    public Estancias(int m2){
        this.m2=m2;
    }
    
    //Getters

    public int getM2() {
        return m2;
    }
    
    //Setters

    public void setM2(int m2) {
        this.m2 = m2;
    }

    @Override
    public String toString() {
        return "Estancias{" + "m2=" + m2 + '}';
    }
    
    
    
}
