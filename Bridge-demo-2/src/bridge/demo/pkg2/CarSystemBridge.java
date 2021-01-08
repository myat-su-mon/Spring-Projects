/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bridge.demo.pkg2;

/**
 *
 * @author kyawkyawlwin
 */
//Bridge Class
public abstract class CarSystemBridge {
    protected Audio audio;

    public CarSystemBridge(Audio audio) {
        this.audio = audio;
    }
    //audio methods
    public abstract void showAudio();
    
    //car methods
    public abstract void makeCar();
    
   // public abstract void test();
}
