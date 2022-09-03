package com.leonadordavinci.Texts.IdentityTexts;



import com.leonadordavinci.Default_Info.DefaultConfiguration.Civilian.Civilian;
import com.leonadordavinci.Default_Info.DefaultConfiguration.Middle.Middle;
import com.leonadordavinci.MainStorage.MainStorage;



public class IdentitesTexts extends MainStorage {
    public static void Identity_Civilian_Texts_1 () {//适合廷根
        System.out.println("身世设定：");
        System.out.println(FirstName + "·" + LastName + "，" + DefaultAddress_Continent + DefaultAddress_Nation + "人");
        System.out.println("全家都是是黑夜女神教会的信徒。父亲是鲁恩王国的一名普通士兵，母亲是一位家庭主妇，哥哥与妹妹都是学生。他本有一个幸福的家庭，在平民中算得上是体面人。但命运无常，父亲在一次战役中战死在南大陆，尸体由战友运回并下葬。母亲从此一蹶不振，很快便在抑郁寡欢中痛苦地死去。");
        System.out.println("这个普通家庭至此来到最困难的时期。因为经济拮据，他们不得不放弃原本的公寓，去治安还算良好的区域租一间平民房。同时，剩下的储蓄不够他们三人完成学业，所以哥哥被迫离开学生阶段，去银行找了一份工作，周薪只有1金榜。虽然这算不算什么丰厚的薪水，但也足够维持另外两人的学业与三人的生活。");
        System.out.println("隐忍终会带来机遇。" + FirstName + "·" + LastName + "作为弟弟，家中第二年长的人，即将从大学毕业。他决定不离开这个他生活多年的城市和学校，去应聘本专业的教师。而接受面试的日子就在一周之后。");
        Civilian.Civilian_1();//获取初始配置
    }

    public static void Identity_Civilian_Texts_2 () {//适合全部城市
        System.out.println("身世设定：");
        System.out.println(FirstName + "·" + LastName + "，" + DefaultAddress_Continent + DefaultAddress_Nation + "人");
        System.out.println("蒸汽教会的忠实信徒。");
        System.out.println("在" + DefaultAddress_City + "，他无亲无故。作为一个马戏团的主要演职人员，他的收入足够在维持生活的前提之下有额外娱乐的活动。关于住址，正常的平民都不会在下区这种治安极差的地方购置房屋，他也不例外，所以选择了一个每周需支付6银苏勒作为租赁费用的小房子。");
        System.out.println("多年来，每隔一段时间，在睡梦中，总会有一种诡异的力量给他灵感，让他感觉到在遥远的地方，他有一位亲戚，但这位亲戚已经很久没有见过他了。");
        Civilian.Civilian_2();
    }

    public static void  Identity_Civilian_Texts_3() {//适合廷根和贝克兰德
        System.out.println("身世设定：");
        System.out.println(FirstName + "·" + LastName + "，" + DefaultAddress_Continent + DefaultAddress_Nation + "人");
        System.out.println("风暴之主的信徒，正式警察，隶属于"+ DefaultAddress_City + "警察厅，肩章上带有三条V形标志。");
        System.out.println("他处理过多起案件，并在一起大案中起到重要辅助作用，属于资深警官。公司给他开的薪水很丰厚，超过平民的平均水平。在多年的积蓄下，他有一小笔财产，价值达70镑。");
        System.out.println("好景不长，在一次与凶恶歹徒的战斗中，他受了伤。即使有警察厅的补助，他也花了很多钱才保住一条命。自此之后，他的资产大幅度缩水，以至于仅剩10镑不足。");
        System.out.println("尽管如此，他的生活水准还是比一般平民高很多。");
        Civilian.Civilian_3();
    }

    public static void Identity_Civilian_Texts_4 (){//适合内陆城市
        System.out.println("身世设定：");
        System.out.println(FirstName + "·" + LastName + "，" + DefaultAddress_Continent + DefaultAddress_Nation + "人");
        System.out.println("风暴之主信徒，朝气蓬勃的年轻人，志向远大，心向大海。");
        System.out.println("生在内陆城市，却有一颗水手的心。在成年之后，他立刻开始着手准备前往港口，出海远航。");
        System.out.println("他已经做了周密的计划。卖掉在" + DefaultAddress_City + "的不适合海上的资产，携带全部，独身一人前往罗思德群岛，成为大海之上的冒险家。");
        Civilian.Civilian_4();
    }

    public static void Identity_Middle_Texts_1() {//适合蒸汽与机械之神势力范围内城市
        System.out.println("身世设定：");
        System.out.println(FirstName + "·" + LastName + "，" + DefaultAddress_Continent + DefaultAddress_Nation + "人");
        System.out.println("蒸汽信徒，商人。为蒸汽教会在" + DefaultAddress_City + "的教堂贡献很大一部分捐款。");
        System.out.println("平时热爱研究罗塞尔·古斯塔夫的秘密笔记，以及他生前的各类发明成就等。同时，他与机械之心的某位队长曾在一次超凡案件中相识，略微知道一点行业内幕，但是不知道需要服食魔药才能成为非凡者。");
        Middle.Middle_1();
    }

    public static void Identity_Middle_Texts_2 (){
        System.out.println("身世设定：");
        System.out.println(FirstName + "·" + LastName + "，" + DefaultAddress_Continent + DefaultAddress_Nation + "人");
        System.out.println("黑夜女神教会信徒，工厂主管。");
        System.out.println("在" + DefaultAddress_City + "有多套房产，财富可观。");
        System.out.println("就是这样一个普通的中产阶级，人生顺风顺水，没有大起也没有大落。");
        Middle.Middle_2();
    }
}
