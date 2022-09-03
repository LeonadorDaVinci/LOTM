package com.leonadordavinci.DataQueryerRelated.CommandList;

import com.leonadordavinci.DataQueryerRelated.CommandSelectCenter;

import com.leonadordavinci.utils.BalanceAmountConversion;
import com.leonadordavinci.utils.BalanceDetermination;

public class TransferMoney extends CommandSelectCenter {
    public static void TransferMoney_Get() {
        if (CommandContent.equals("get money amount=")) {
            System.out.println("无效的命令！请输入金额！");
            MainCommandArea.setText("get money amount=请输入金额");
        } else {
            if (AtHome == true) {

                boolean isLegalCommand = true;

                String IsLegalCommand = CommandContent.substring(17);

                for (int i = 0; i < IsLegalCommand.length(); i++) { //循环遍历字符串
                    if (Character.isAlphabetic(IsLegalCommand.charAt(i))) { //用char包装类中的判断数字的方法判断每一个字符
                        isLegalCommand = false;
                        break;
                    }
                }

                if (isLegalCommand == true) {
                    int TransferMoneyAmount = Integer.parseInt(CommandContent.substring(17));


                    for (int io = GoldPoundTotal; io >= 1; io--) {
                        GoldPoundTotal--;
                        SilverSoliTotal = SilverSoliTotal + 20;

                    }
                    for (int ko = SilverSoliTotal; ko >= 1; ko--) {
                            SilverSoliTotal--;
                            CopperPenceTotal = CopperPenceTotal + 12;

                    }




                    BalanceAmountConversion.BalanceAmountConversionStart();


                    if (BalanceDetermination.BalanceDetermination(CopperPenceTotal, CopperPenceCarryed + TransferMoneyAmount) == true) {
                            System.out.println(FirstName + "·" + LastName + "从家中取出了" + TransferMoneyAmount + "（铜便士）");
                            CopperPenceCarryed = CopperPenceCarryed + TransferMoneyAmount;
                    } else {
                        System.out.println("剩余储蓄不足！请选择一个更小的数额！");
                        MainCommandArea.setText("get money amount=剩余金额不足！");
                    }


                    for (int uo = CopperPenceTotal; uo >= 12; uo = uo - 12) {
                            CopperPenceTotal = CopperPenceTotal - 12;
                            SilverSoliTotal++;
                            //System.out.println("test");
                            if (CopperPenceTotal < 12) {
                                break;
                            }
                    }

                    for (int ro = SilverSoliTotal; ro >= 20; ro = ro - 20) {
                            SilverSoliTotal = SilverSoliTotal - 20;
                            GoldPoundTotal++;

                        if (SilverSoliTotal < 20) {
                                break;
                        }
                    }




                    BalanceAmountConversion.BalanceAmountConversionEnd();


                    //System.out.println("金额换算完毕");

                }else{
                    System.out.println("请不要在不适宜的位置输入字符");
                    MainCommandArea.setText("get money amount=");
                }

            } else {
                System.out.println("你不在家中！无法使用此命令！");
                MainCommandArea.setText("");
            }
        }
    }

    public static void TransferMoney_Save (){
        if (CommandContent.equals("save money amount=")) {
            System.out.println("无效的命令！请输入金额！");
            MainCommandArea.setText("save money amount=请输入金额");
        } else {
            if (AtHome == true) {

                boolean isLegalCommand = true;

                String IsLegalCommand = CommandContent.substring(18);

                for (int i = 0; i < IsLegalCommand.length(); i++) { //循环遍历字符串
                    if (Character.isAlphabetic(IsLegalCommand.charAt(i))) { //用char包装类中的判断数字的方法判断每一个字符
                        isLegalCommand = false;
                        break;
                    }
                }

                if (isLegalCommand == true) {
                    int TransferMoneyAmount = Integer.parseInt(CommandContent.substring(18));

                    /*
                    for (int io = GoldPoundTotal; io >= 1; io--) {
                        GoldPoundTotal--;
                        SilverSoliTotal = SilverSoliTotal + 20;

                    }
                    for (int ko = SilverSoliTotal; ko >= 1; ko--) {
                        SilverSoliTotal--;
                        CopperPenceTotal = CopperPenceTotal + 12;

                    }

                     */




                    BalanceAmountConversion.BalanceAmountConversionStart();


                    if (BalanceDetermination.BalanceDetermination(CopperPenceCarryed,TransferMoneyAmount) == true) {
                        System.out.println(FirstName + "·" + LastName + "在家中存入了" + TransferMoneyAmount + "（铜便士）");
                        CopperPenceCarryed = CopperPenceCarryed - TransferMoneyAmount;
                    } else {
                        System.out.println("剩余金额不足！请选择一个更小的数额！");
                        MainCommandArea.setText("save money amount=剩余金额不足！");
                    }

                    /*
                    for (int uo = CopperPenceTotal; uo >= 12; uo = uo - 12) {
                        CopperPenceTotal = CopperPenceTotal - 12;
                        SilverSoliTotal++;
                        //System.out.println("test");
                        if (CopperPenceTotal < 12) {
                            break;
                        }
                    }

                    for (int ro = SilverSoliTotal; ro >= 20; ro = ro - 20) {
                        SilverSoliTotal = SilverSoliTotal - 20;
                        GoldPoundTotal++;

                        if (SilverSoliTotal < 20) {
                            break;
                        }
                    }

                     */




                    BalanceAmountConversion.BalanceAmountConversionEnd();


                    //System.out.println("金额换算完毕");

                }else{
                    System.out.println("请不要在不适宜的位置输入字符");
                    MainCommandArea.setText("save money amount=");
                }

            } else {
                System.out.println("你不在家中！无法使用此命令！");
                MainCommandArea.setText("");
            }
        }
    }
}

