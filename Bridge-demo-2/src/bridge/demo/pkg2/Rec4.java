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
public class Rec4 extends CarSystemBridge{

    public Rec4(Audio audio) {
        super(audio);
    }
    
    @Override
    public void showAudio() {
        audio.show();
    }

    @Override
    public void makeCar() {
        System.out.println("Rec 4");
    }
    
}
