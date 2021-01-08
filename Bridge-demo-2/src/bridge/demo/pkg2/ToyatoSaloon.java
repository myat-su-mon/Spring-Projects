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
public class ToyatoSaloon extends CarSystemBridge{

    public ToyatoSaloon(Audio audio) {
        super(audio);
    }

    @Override
    public void showAudio() {
            audio.show();
    }

    @Override
    public void makeCar() {
        System.out.println("Toyatota");
    }
    
}
