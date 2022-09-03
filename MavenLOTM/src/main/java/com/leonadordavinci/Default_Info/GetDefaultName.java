package com.leonadordavinci.Default_Info;


import com.leonadordavinci.MainStorage.MainStorage;

import java.util.Scanner;

public class GetDefaultName extends MainStorage {

    public static void GetDefaultName (){
        System.out.println("请输入姓氏（为了整体美观请键入一个具有西式风格的姓氏）");
        //监听姓氏
        Scanner BasicInfo_LastName = new Scanner(System.in);
        MainStorage.LastName = BasicInfo_LastName.nextLine();
        System.out.println("接收数据成功，姓氏为：" + MainStorage.LastName);

        System.out.println("");

        System.out.println("请输入名字（为了整体美观请键入一个具有西式风格的名字）");
        //监听名字
        Scanner BasicInfo_FirstName = new Scanner(System.in);
        MainStorage.FirstName = BasicInfo_FirstName.nextLine();
        System.out.println("接收数据成功，名字为：" + MainStorage.FirstName);
        WholeName = FirstName + "·" + LastName;
        System.out.println("你的全名为：" + MainStorage.FirstName + "·" + MainStorage.LastName);
        System.out.println("你的全名为：" + WholeName);

        System.out.println("");
    }
}


