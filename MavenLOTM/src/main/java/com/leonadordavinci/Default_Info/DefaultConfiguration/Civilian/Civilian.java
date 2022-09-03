package com.leonadordavinci.Default_Info.DefaultConfiguration.Civilian;

import com.leonadordavinci.Event.EventStorage.RebornInTingen;
import com.leonadordavinci.Texts.IdentityTexts.IdentitesTexts;

public class Civilian extends IdentitesTexts {
    public static void Civilian_1 (){
        CurrentAddress_City = DefaultAddress_City;
        CurrentAddress_Nation = DefaultAddress_Nation;
        CurrentAddress_Continent = DefaultAddress_Continent;
        GoldPoundTotal = 1;
        SilverSoliTotal = 10;
        CopperPenceTotal = 1;
        AtHome = true;
        Days = 1;
        Religion = "黑夜教会";
        ReligiousStatus = "信众";
        SqueueLevel = 10;
        PlotTree = "原书剧情";
        System.out.println("初始财产：1金镑，10银苏勒，1铜便士");
        System.out.println("当前所处位置:家中");
        System.out.println("当前天数:1");
        RebornInTingen.AwakeFromSuicide();
    }

    public static void Civilian_2 (){
        CurrentAddress_City = DefaultAddress_City;
        CurrentAddress_Nation = DefaultAddress_Nation;
        CurrentAddress_Continent = DefaultAddress_Continent;
        SilverSoliCarryed = 3;
        GoldPoundTotal = 2;
        SilverSoliTotal = 0;
        CopperPenceTotal = 0;
        AtHome = false;
        Days = 1;
        Religion = "蒸汽教会";
        ReligiousStatus="信众";
        SqueueLevel = 10;
        PlotTree ="亚伯拉罕";
        System.out.println("初始财产：2金镑，0银苏勒，0铜便士");
        System.out.println("当前所处位置:马戏团中");
        System.out.println("当前天数:1");
    }

    public static void Civilian_3(){
        CurrentAddress_City = DefaultAddress_City;
        CurrentAddress_Nation = DefaultAddress_Nation;
        CurrentAddress_Continent = DefaultAddress_Continent;
        GoldPoundTotal = 10;
        SilverSoliTotal = 6;
        CopperPenceTotal = 3;
        AtHome = true;
        Days = 1;
        Religion = "风暴教会";
        ReligiousStatus="信众";
        SqueueLevel = 10;
        PlotTree = "朴素警官";
        System.out.println("初始财产：10金镑，6银苏勒，3铜便士");
        System.out.println("当前所处位置:家中");
        System.out.println("当前天数:1");
    }

    public static void Civilian_4 (){
        CurrentAddress_City = DefaultAddress_City;
        CurrentAddress_Nation = DefaultAddress_Nation;
        CurrentAddress_Continent = DefaultAddress_Continent;
        GoldPoundTotal = 8;
        SilverSoliTotal = 19;
        CopperPenceTotal = 11;
        GoldPoundCarryed = 8;
        SilverSoliCarryed = 19;
        CopperPenceCarryed =11;
        AtHome = false;
        Days = 1;
        Religion = "风暴教会";
        ReligiousStatus="信众";
        SqueueLevel = 10;
        PlotTree = "年轻水手";
        System.out.println("初始财产：10金镑，6银苏勒，3铜便士");
        System.out.println("当前所处位置:" + DefaultAddress_City + "市火车站");
        System.out.println("当前天数:1");
    }
}
