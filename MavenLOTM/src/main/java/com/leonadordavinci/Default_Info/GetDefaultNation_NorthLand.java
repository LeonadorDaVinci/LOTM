package com.leonadordavinci.Default_Info;


import com.leonadordavinci.Default_Info.Nations.IntisRepublic;
import com.leonadordavinci.Default_Info.Nations.RuneKingdom;
import com.leonadordavinci.MainStorage.MainStorage;

import java.util.Scanner;

public class GetDefaultNation_NorthLand extends MainStorage {
    public static void GetDefaultNation_NorthLand () {
        System.out.println("");
        System.out.println("请选择出生地点-国家");
        System.out.println("选择鲁恩王国请键入「鲁恩」，选择因蒂斯共和国请键入「因蒂斯」，选择弗萨克帝国请键入「弗萨克」，选择费内波特王国请键入「费内波特」，选择伦堡，塞加尔，马锡请键入「小国」（输入其他选项默认鲁恩王国，「」符号不用打）");
        Scanner BasicInfo_DefaultAddress_Nation = new Scanner(System.in);
        MainStorage.DefaultAddress_Nation = BasicInfo_DefaultAddress_Nation.nextLine();

        if (MainStorage.DefaultAddress_Nation.equals("鲁恩")){
            System.out.println("成功选择鲁恩王国");
            RuneKingdom.RuneSelectCity();
        }else if (MainStorage.DefaultAddress_Nation.equals("因蒂斯")){
            System.out.println("成功选择因蒂斯共和国");
            IntisRepublic.IntisSelectCity();
        }else if (MainStorage.DefaultAddress_Nation.equals("弗萨克")){
            System.out.println("成功选择弗萨克帝国");
        }else if (MainStorage.DefaultAddress_Nation.equals("费内波特")){
            System.out.println("成功选择费内波特王国");
        }else if (MainStorage.DefaultAddress_Nation.equals("小国")) {
            System.out.println("成功选择北大陆小国");
        }else {
            MainStorage.DefaultAddress_Nation = "鲁恩";
            System.out.println("接收到其他类型数据，已默认选择鲁恩王国");
            RuneKingdom.RuneSelectCity();
        }
    }
}
