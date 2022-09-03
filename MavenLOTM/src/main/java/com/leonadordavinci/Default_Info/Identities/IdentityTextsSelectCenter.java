package com.leonadordavinci.Default_Info.Identities;

import com.leonadordavinci.Texts.IdentityTexts.IdentitesTexts;

import java.util.Random;

public class IdentityTextsSelectCenter extends GetIdentity {
    //也可以继承MainStorage

    static Random RandomIdentity_civilian = new Random();
    static Random RandomIdentity_noble = new Random();
    static Random RandomIdentity_middle = new Random();
    static Random RandomIdentity_poor = new Random();

    public static void IdentitySelectCenter (){

        RandomIdentity_Civilian = RandomIdentity_civilian.nextInt(5) + 1;
        RandomIdentity_Noble = RandomIdentity_noble.nextInt(5) + 1;
        RandomIdentity_Middle = RandomIdentity_middle.nextInt(5) + 1;
        RandomIdentity_Poor = RandomIdentity_poor.nextInt(5) + 1;

        if (DefaultAddress_City.equals("廷根")){
            if (DefaultIdentity.equals("平民")){
                if (RandomIdentity_Civilian == 1){

                    IdentitesTexts.Identity_Civilian_Texts_1();

                }else if (RandomIdentity_Civilian == 2){

                    IdentitesTexts.Identity_Civilian_Texts_2();

                }else if (RandomIdentity_Civilian == 3){

                    IdentitesTexts.Identity_Civilian_Texts_3();

                }else if (RandomIdentity_Civilian == 4){

                    IdentitesTexts.Identity_Civilian_Texts_4();

                }else {
                    IdentitesTexts.Identity_Civilian_Texts_1();
                }
            } else if (DefaultIdentity.equals("贵族")) {
                if (RandomIdentity_Noble == 1){

                    System.out.println("");

                }
            } else if (DefaultIdentity.equals("中产")) {
                if (RandomIdentity_Middle == 1){
                    IdentitesTexts.Identity_Middle_Texts_1();
                }else if (RandomIdentity_Middle == 2) {
                    IdentitesTexts.Identity_Middle_Texts_2();
                } else if (RandomIdentity_Middle == 3){
                    IdentitesTexts.Identity_Civilian_Texts_1();
                }else {
                    IdentitesTexts.Identity_Civilian_Texts_2();
                }
            }
        }
    }
 }

