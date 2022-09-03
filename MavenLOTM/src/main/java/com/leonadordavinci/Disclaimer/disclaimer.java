package com.leonadordavinci.Disclaimer;

import java.util.Scanner;

public class disclaimer {
    public static void disclaimer() {
        System.out.println("▶"+"请确认已阅读说明书！输入(yes/no)" +"◀");
        Scanner Disclaimer = new Scanner(System.in);
        String DisClaimer = Disclaimer.nextLine();
        if (DisClaimer.equals("yes")) {
            System.out.println("通过验证，欢迎");
        } else if (DisClaimer.equals("no")) {
            System.out.println("请确保阅读说明书后再进行游戏！");
            System.out.println("程序已中止");
            System.exit(0);
        } else {
            System.out.println("检测到其它字符，已自动判断为no");
            System.out.println("请确保阅读说明书后再进行游戏！");
            System.out.println("程序已中止");
            System.exit(0);
        }
    }
}

