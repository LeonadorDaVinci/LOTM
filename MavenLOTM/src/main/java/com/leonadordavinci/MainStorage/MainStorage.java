package com.leonadordavinci.MainStorage;

public class MainStorage {

    public static int Days;//总天数
    public static String LastName;//姓氏

    public static String FirstName;//名字

    public static String WholeName;

    //出生地址
    public static String DefaultAddress_Continent;//出生大洲
    public static String DefaultAddress_Nation;//出生国家
    public static String DefaultAddress_City;//出生城市

    public static String DefaultIdentity;//出生信息，身世

    //随机函数，获取身份详情
    public static int RandomIdentity_Civilian;
    public static int RandomIdentity_Noble;
    public static int RandomIdentity_Middle;
    public static int RandomIdentity_Poor;

    //当前地址
    public static String CurrentAddress_Continent;
    public static String CurrentAddress_Nation;
    public static String CurrentAddress_City;

    public static boolean AtHome;//是否在家

    //总储蓄
    public static int CopperPenceTotal;
    public static int SilverSoliTotal;
    public static int GoldPoundTotal;

    //随身携带的金钱
    public static int CopperPenceCarryed;
    public static int SilverSoliCarryed;
    public static int GoldPoundCarryed;

    public static String Religion;//信仰教会

    public static String ReligiousStatus;//教会内部地位

    public static String NobleSystem;

    public static int TaskLevel;//任务进度

    public static String Squeue;

    public static int SqueueLevel;

    public static String PlotTree;

    public static String CommandContent;//命令内容

    public static String MoreInfo;//更多信息

    public static String RealPath = null;
}
