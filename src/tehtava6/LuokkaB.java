/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tehtava6;

/**
 *
 * @author Tomi
 */
public class LuokkaB {
    private String tervehdittava;

    public LuokkaB(String tervehdittava) {
        this.tervehdittava = tervehdittava;
    }
    
    public LuokkaB() {
        this.tervehdittava = "maailma";
    }
    
    
    public void terve(){
        System.out.print("Terve ");
        kelle();
    }
    
    private void kelle(){
        System.out.println(this.tervehdittava);
    }
    
}
