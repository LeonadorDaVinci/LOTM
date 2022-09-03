package com.leonadordavinci.Event.EventStorage;

import com.leonadordavinci.MainStorage.MainStorage;

import java.util.Scanner;

public class RebornInTingen extends MainStorage {
    public static void AwakeFromSuicide () {
        System.out.println("");
        System.out.println(WholeName + "从死寂中醒来。此刻的他站在自己的房间中。");
        System.out.println("面前是一张原木色泽的书桌，正中央放着一本摊开的笔记，纸张粗糙而泛黄，封面用奇怪的字母文字书写着一句话语，墨迹深黑，醒目欲滴。");
        System.out.println("「所有人都会死，包括我。」");
        System.out.println("就着轻纱般的绯红月光，他侧过脑袋，查看额角的情况。清晰倒映的镜子如实呈现，一个狰狞的伤口盘踞在他的太阳穴位置，边缘是烧灼的痕迹，周围沾满了血污，而内里有灰白色的脑浆在缓缓蠕动。创口血肉以肉眼可辨的速度快速生长，伤口似乎即将愈合。");
        System.out.println(WholeName + "被眼前的景象吓得连退了几步，似乎穿衣镜中的不是自己，而是一具干尸。他握着左轮手枪的手不自觉地松开，咣当一声，枪砸落在地。");
        System.out.println("如此大的动静引来了妹妹的注意力，她敲了敲房门，然后说「发生了什么？」");
        System.out.println("1 - 直接开门");
        System.out.println("2 - 说「没什么。我刚才不小心把架子弄倒了。」");
        System.out.println("3 - 把枪和奇怪的笔记藏起来，然后开门");
        System.out.println("请选择（1/2/3）");
        Scanner branch_1 = new Scanner(System.in);
        int Branch_1 = branch_1.nextInt();
        if (Branch_1 == 1) {
            System.out.println("听到妹妹的询问" + WholeName + "毫不犹豫地开了门。");
            System.out.println("");
        }
    }
}
