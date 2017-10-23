/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin3.pkg1;

/**
 *
 * @author ggarciaalvarez
 */
public class Coche {
    private int velocidade;
    public Coche(){
    velocidade=0;
    }
    public int getVelocidade(){
        return velocidade;
    }
    public void acelerar(int aceleracion){
        velocidade= velocidade + aceleracion;
    }
    public void frenar(int frenado){
        velocidade=velocidade-frenado;
        //velocidade -= frenado;    asi posto fai exactamente o mesmo que na anterior
    }
    
}
