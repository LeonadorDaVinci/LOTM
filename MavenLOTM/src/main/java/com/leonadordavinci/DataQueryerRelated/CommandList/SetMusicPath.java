package com.leonadordavinci.DataQueryerRelated.CommandList;

import com.leonadordavinci.DataQueryerRelated.CommandSelectCenter;

public class SetMusicPath extends CommandSelectCenter {
    public static void SetMusicPath(){
        RealPath = CommandContent.substring(15);
        System.out.println("音乐路径已设置为："+RealPath);
    }
}

