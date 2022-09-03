package com.leonadordavinci;

import com.leonadordavinci.DataQueryerRelated.DataQueryer;
import com.leonadordavinci.Default_Info.GetDefaultContinent;
import com.leonadordavinci.Default_Info.GetDefaultName;
import com.leonadordavinci.Default_Info.Identities.GetIdentity;
import com.leonadordavinci.Disclaimer.disclaimer;
import com.leonadordavinci.Music.MusicThread;




public class Main {


    public static void main (String[] args) {
        System.out.println("————————————————————");
        System.out.println("诡秘之主-控制台模拟游戏");
        System.out.println("————————————————————");

        System.out.println("Lord Of The Mysteries");
        System.out.println("Author LeonadorDaVinci");
        System.out.println("————————————————————");

        disclaimer.disclaimer();//载入免责声明

        MusicThread thread = new MusicThread();
        thread.start();//开启音乐进程

        GetDefaultName.GetDefaultName();//调用获取名字的方法
        GetDefaultContinent.GetDefaultContinent();//调用获取出生大洲，以及出生国家，出生城市的方法（各级地区都被包含在这个方法链中）
        DataQueryer.DataQueryer();//调用方法，获取命令窗口

        GetIdentity.GetIdentity();//调用方法，获取身世设定






    }



}

