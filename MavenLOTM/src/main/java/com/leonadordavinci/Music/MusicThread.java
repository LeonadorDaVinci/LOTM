package com.leonadordavinci.Music;

import com.leonadordavinci.MainStorage.MainStorage;
import javazoom.jl.decoder.Decoder;
import javazoom.jl.decoder.FrameDecoder;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;
import javazoom.jl.player.advanced.AdvancedPlayer;

import java.io.*;

import static com.leonadordavinci.MainStorage.MainStorage.RealPath;


public class MusicThread extends Thread {

    public static boolean Repeat = true;

    @Override
    public void run() {
/*
        String path = Thread.currentThread().getContextClassLoader().getResource("lotr.mp3").getPath();//获取绝对路径



        System.out.println("Jar包内路径："+path);

        String IsLegalPath = path;

        if (RealPath == null){
            for (int i = 0; i < IsLegalPath.length(); i++) { //循环遍历字符串
                if (path.substring(i,i+1).equals("*")){
                    RealPath = path.substring(5,i+6) + "/lotr.mp3";
                    break;
                }
            }
        }

        //RealPath = path.substring(5);

        System.out.println("真实路径："+RealPath);

 */

        //File file = new File(RealPath);
        //AdvancedPlayer player = null;
        InputStream bgm = this.getClass().getClassLoader().getResourceAsStream("lotr.mp3");
        //BufferedReader br = new BufferedReader(new InputStreamReader(bgm));
        /*
        String s = "";
        while(true) {
            try {
                if (!((s=br.readLine())!=null)) break;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            System.out.println(s);
        }

         */



        try {
            Advanced player = new Advanced(bgm);
            while(Repeat == true){
                player.FrameWorker();
                if (Repeat ==false){
                    break;
                }
            }
        } catch (JavaLayerException e) {
            throw new RuntimeException(e);
        }
    }
}
/*
class Advanced extends AdvancedPlayer {
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


 */






