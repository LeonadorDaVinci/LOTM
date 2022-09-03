package com.leonadordavinci.DataQueryerRelated;


import com.leonadordavinci.DataQueryerRelated.CommandList.SetMusicPath;
import com.leonadordavinci.DataQueryerRelated.CommandList.TransferMoney;
import com.leonadordavinci.MainStorage.MainStorage;
import com.leonadordavinci.Music.MusicThread;


public class CommandSelectCenter extends DataQueryer {

    /*String[] begin = MainStorage.CommandContent.split("Amount=");
    int PayAmount = begin[2].split("")[0]

     */


    public static void CommandSelectCenter (){

        //检查命令内容
        boolean CheckGetMoneyCommand = MainStorage.CommandContent.contains("get money amount=");

        boolean CheckSaveMoneyCommand = MainStorage.CommandContent.contains("save money amount=");

        boolean CheckSetPathCommand = MainStorage.CommandContent.contains("set music path=");

        if (MainStorage.CommandContent.equals("default name")){
            System.out.println(MainStorage.FirstName + "·" + MainStorage.LastName);
            MainCommandArea.setText("");
            //获取姓名
        }else if (MainStorage.CommandContent.equals("default address")){
            System.out.println(DefaultAddress_Continent);
            System.out.println(DefaultAddress_Nation);
            System.out.println(DefaultAddress_City);
            MainCommandArea.setText("");
            //获取默认地址
        } else if (CommandContent.equals("current address")){
            System.out.println(CurrentAddress_Continent);
            System.out.println(CurrentAddress_Nation);
            System.out.println(CurrentAddress_City);
            MainCommandArea.setText("");
            //获取当前地址
        } else if (MainStorage.CommandContent.equals("")){
            System.out.println("未侦测到任何命令！");
            MainCommandArea.setText("请在此输入命令！");
            //空值时返回
        }else if (MainStorage.CommandContent.equals("more info")) {
            MoreInfoSelectCenter.MoreInfoSelectCenter();
            MainCommandArea.setText("");
            //获取更多信息
        } else if (CommandContent.equals("total money")) {
            System.out.println("金镑：" + GoldPoundTotal);
            System.out.println("银苏勒：" + SilverSoliTotal);
            System.out.println("铜便士：" + CopperPenceTotal);//获取总金额
            MainCommandArea.setText("");
        } else if (CommandContent.equals("current money")) {
            System.out.println("金镑：" + GoldPoundCarryed);
            System.out.println("银苏勒：" + SilverSoliCarryed);
            System.out.println("铜便士：" + CopperPenceCarryed);//获取随身携带的金额
            MainCommandArea.setText("");
        } else if (CheckGetMoneyCommand == true){
            TransferMoney.TransferMoney_Get();
            //调用转换钱财的方法
        } else if (CheckSaveMoneyCommand == true) {
            TransferMoney.TransferMoney_Save();
            //存钱
        } else if (CommandContent.equals("music shut down")) {
            MusicThread.Repeat = false;
            System.out.println("音乐进程已停止！");
            MainCommandArea.setText("");
            //强制关闭音乐
        } else if (CommandContent.equals("music restart")) {
            MusicThread.Repeat = true;
            MusicThread thread = new MusicThread();
            thread.start();//开启音乐进程
            System.out.println("音乐进程已重启！");
        } else if (CheckSetPathCommand == true) {
            SetMusicPath.SetMusicPath();
        } else if (CommandContent.equals("home")){
            if (AtHome == true){
                System.out.println(FirstName + "·" + LastName + "目前在家中");
            }else {
                System.out.println(FirstName + "·" + LastName + "目前不在家中");
            }
            MainCommandArea.setText("");
        }

        else {
            System.out.println("无效的命令！");
            MainCommandArea.setText("无效的命令！");
            //无效命令返回
        }
    }
}
