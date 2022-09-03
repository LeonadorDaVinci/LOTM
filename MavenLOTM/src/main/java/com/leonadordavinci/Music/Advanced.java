
package com.leonadordavinci.Music;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.advanced.AdvancedPlayer;

import java.io.InputStream;

public class Advanced extends AdvancedPlayer {
    public Advanced(InputStream arg0) throws JavaLayerException {
        super(arg0);
    }
    public void FrameWorker(){
        try {
            decodeFrame();// 播放一帧
        } catch (JavaLayerException e) {
            e.printStackTrace();
        }
    }
}



