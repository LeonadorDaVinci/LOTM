package com.leonadordavinci.utils;


import com.leonadordavinci.MainStorage.MainStorage;

public class BalanceDetermination extends MainStorage {
    public static boolean BalanceDetermination(int MyMoney,int LoseMoney){
        if (MyMoney >= LoseMoney){
            return true;
        }else {
            return false;
        }
    }
}
