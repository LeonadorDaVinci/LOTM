package com.leonadordavinci.Default_Info.Identities;

import com.leonadordavinci.MainStorage.MainStorage;

import java.util.Scanner;

public class GetIdentity extends MainStorage {
    public static void GetIdentity (){
        MoreInfo = "GetIdentity";
        System.out.println("");
        System.out.println("请选择默认身世（务必慎重选择，可能影响到游戏进程！）");
        System.out.println("选择平民请键入「平民」，选择贵族请键入「贵族」，选择中产请键入「中产」，选择贫民请键入「贫民」" + "/MORE INFORMATION AVAILABLE");
        Scanner BasicInfo_Identity = new Scanner(System.in);
        DefaultIdentity = BasicInfo_Identity.nextLine();

        if (DefaultIdentity.equals("平民")){
            System.out.println("已选择平民身份！");
            IdentityTextsSelectCenter.IdentitySelectCenter();
        } else if (DefaultIdentity.equals("贵族")) {
            System.out.println("已选择贵族身份！");
            IdentityTextsSelectCenter.IdentitySelectCenter();
        }else if (DefaultIdentity.equals("中产")){
            System.out.println("已选择中产身份！");
            IdentityTextsSelectCenter.IdentitySelectCenter();
        }else if (DefaultIdentity.equals("贫民")){
            System.out.println("已选择贫民身份！");
            IdentityTextsSelectCenter.IdentitySelectCenter();
        }else {
            DefaultIdentity = "平民";
            System.out.println("检测到其它非法字符，已自动选择「平民」身份");
            IdentityTextsSelectCenter.IdentitySelectCenter();
        }
        MoreInfo = "null";

    }
}
