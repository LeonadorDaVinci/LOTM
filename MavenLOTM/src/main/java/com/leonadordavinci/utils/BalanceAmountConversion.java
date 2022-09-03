package com.leonadordavinci.utils;

import com.leonadordavinci.MainStorage.MainStorage;

public class BalanceAmountConversion extends MainStorage {
    public static void BalanceAmountConversionStart (){
        for (int i = GoldPoundCarryed;i>=1;i--){
            GoldPoundCarryed--;
            SilverSoliCarryed = SilverSoliCarryed + 20;

        }
        for (int k = SilverSoliCarryed;k>=1;k--){
            SilverSoliCarryed--;
            CopperPenceCarryed = CopperPenceCarryed + 12;

        }
    }

    public static void BalanceAmountConversionEnd (){
        for (int u = CopperPenceCarryed; u>=12; u = u -12){
            CopperPenceCarryed = CopperPenceCarryed-12;
            SilverSoliCarryed ++;

        }
        for (int r = SilverSoliCarryed;r>=20;r = r -20){
            SilverSoliCarryed = SilverSoliCarryed-20;
            GoldPoundCarryed++;
        }
    }

}


