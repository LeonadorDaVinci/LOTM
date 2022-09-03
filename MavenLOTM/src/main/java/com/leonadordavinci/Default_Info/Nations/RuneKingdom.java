package com.leonadordavinci.Default_Info.Nations;


import com.leonadordavinci.MainStorage.MainStorage;

import java.util.Scanner;

public class RuneKingdom extends MainStorage {
    public static void RuneSelectCity (){
        System.out.println("");
        System.out.println("请选择鲁恩王国境内城市");
        System.out.println("选择廷根请键入「廷根」，选择万都之都-贝克兰德请键入「贝克兰德」，选择慷慨之城-拜亚姆请键入「拜亚姆」（鲁恩王国暂时只有三个城市可供选择）");
        Scanner BasicInfo_DefaultAddress_City = new Scanner(System.in);
        MainStorage.DefaultAddress_City = BasicInfo_DefaultAddress_City.nextLine();

        if (MainStorage.DefaultAddress_City.equals("廷根")){
            System.out.println("已选择廷根！");
            System.out.println(MainStorage.FirstName + "·" + MainStorage.LastName + "的基本出生信息是：" + MainStorage.DefaultAddress_Continent + MainStorage.DefaultAddress_Nation + "王国" + MainStorage.DefaultAddress_City + "市");
        }else if (MainStorage.DefaultAddress_City.equals("贝克兰德")){
            System.out.println("已选择贝克兰德！");
            System.out.println(MainStorage.FirstName + "·" + MainStorage.LastName + "的基本出生信息是：" + MainStorage.DefaultAddress_Continent + MainStorage.DefaultAddress_Nation + "王国" + MainStorage.DefaultAddress_City + "市");
        } else if (MainStorage.DefaultAddress_City.equals("拜亚姆")) {
            System.out.println("已选择拜亚姆！");
            System.out.println(MainStorage.FirstName + "·" + MainStorage.LastName + "的基本出生信息是：" + MainStorage.DefaultAddress_Continent + MainStorage.DefaultAddress_Nation + "王国" + MainStorage.DefaultAddress_City + "市");
        }else {
            MainStorage.DefaultAddress_City = "廷根";
            System.out.println("检测到其它非法字符！");
            System.out.println("已默认选择廷根！");
            System.out.println(MainStorage.FirstName + "·" + MainStorage.LastName + "的基本出生信息是：" + MainStorage.DefaultAddress_Continent + MainStorage.DefaultAddress_Nation + "王国" + MainStorage.DefaultAddress_City + "市");
        }

    }
}
