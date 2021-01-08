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
public class Crown extends CarSystemBridge{

    public Crown(Audio audio) {
        super(audio);
    }

    @Override
    public void showAudio() {
        audio.show();
    }

    @Override
    public void makeCar() {
        System.out.println("Crown");
    }
    
}
