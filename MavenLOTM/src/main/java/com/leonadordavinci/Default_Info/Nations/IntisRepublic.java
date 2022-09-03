package com.leonadordavinci.Default_Info.Nations;


import com.leonadordavinci.MainStorage.MainStorage;

import java.util.Scanner;

public class IntisRepublic extends MainStorage {
    public static void IntisSelectCity (){
        System.out.println("请选择因蒂斯共和国境内城市");
        System.out.println("选择首都-特里尔请键入「特里尔」");
        Scanner BasicInfo_DefaultAddress_City = new Scanner(System.in);
        MainStorage.DefaultAddress_City = BasicInfo_DefaultAddress_City.nextLine();
        if (MainStorage.DefaultAddress_City.equals("特里尔")){
            System.out.println("已选择特里尔！");
        }else {
            DefaultAddress_City = "特里尔";
            System.out.println("侦测到其它非法字符，已默认选择特里尔！");
        }
    }
}
