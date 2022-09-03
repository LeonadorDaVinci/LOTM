package com.leonadordavinci.Default_Info;


import com.leonadordavinci.MainStorage.MainStorage;

import java.util.Scanner;

public class GetDefaultContinent extends MainStorage {
    public static void GetDefaultContinent() {
        System.out.println("请选择出生地点-大陆");
        System.out.println("选择北大陆请键入「北大陆」，选择南大陆请键入「南大陆」（输入其他默认选择北大陆，「」符号不用打）");
        //监听南北大陆选项
        //同时载入主仓库中存储的数据
        Scanner BasicInfo_DefaultAddress_Continent = new Scanner(System.in);
        MainStorage.DefaultAddress_Continent = BasicInfo_DefaultAddress_Continent.nextLine();
        if (MainStorage.DefaultAddress_Continent.equals("北大陆")) {
            System.out.println("接收数据成功，" + MainStorage.FirstName + "·" + MainStorage.LastName + "出生在" + MainStorage.DefaultAddress_Continent);
            //MoreInfo_GetIdentity.GetDefaultNation_North_Pretext();
            GetDefaultNation_NorthLand.GetDefaultNation_NorthLand();

        } else if (MainStorage.DefaultAddress_Continent.equals("南大陆")) {
            System.out.println("接收数据成功，" + MainStorage.FirstName + "·" + MainStorage.LastName + "出生在" + MainStorage.DefaultAddress_Continent);
            System.out.println("南大陆模块尚未构建完成，请选择北大陆");
            MainStorage.DefaultAddress_Continent = "北大陆";
            //MoreInfo_GetIdentity.GetDefaultNation_North_Pretext();
            GetDefaultNation_NorthLand.GetDefaultNation_NorthLand();



        } else {
            MainStorage.DefaultAddress_Continent = "北大陆";
            System.out.println("接收到其他数据，已默认选择北大陆");
            //MoreInfo_GetIdentity.GetDefaultNation_North_Pretext();
            GetDefaultNation_NorthLand.GetDefaultNation_NorthLand();

        }
    }
}