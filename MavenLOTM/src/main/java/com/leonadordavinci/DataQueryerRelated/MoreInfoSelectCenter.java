package com.leonadordavinci.DataQueryerRelated;

import com.leonadordavinci.Texts.MoreInfo.MoreInfo_GetIdentity;


public class MoreInfoSelectCenter extends CommandSelectCenter {
    public static void MoreInfoSelectCenter (){
        if (MoreInfo.equals("null")){
            System.out.println("未检测到更多信息");
        }else if (MoreInfo.equals("GetIdentity")){
            MoreInfo_GetIdentity.texts();
        }else {
            System.err.println("Error !Please send a feedback to LeonadorDaVinci@outlook.com !");
        }
    }
}
