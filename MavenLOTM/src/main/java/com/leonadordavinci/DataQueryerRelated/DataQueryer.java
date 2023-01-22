package com.leonadordavinci.DataQueryerRelated;

import com.leonadordavinci.MainStorage.MainStorage;

import javax.swing.*;
import java.awt.*;

public class DataQueryer extends MainStorage {
    public static JTextField MainCommandArea = new JTextField(20);

    public static CardLayout cardLayout = new CardLayout();

    public static JPanel root = new JPanel();
    public static void DataQueryer (){

        JFrame DataQuerverWindow = new JFrame("命令执行窗(请勿关闭)");

        DataQuerverWindow.setSize(400,400);

        DataQuerverWindow.setContentPane(root);
        root.setLayout(cardLayout);


        P1_CommandPage p1 = new P1_CommandPage();
//		将面板添加到住面板中，注意:add()方法里有两个参数，第一个是要添加的对象，第二个给这个对象所放置的卡片
//		起个名字，后面调用显示的时候要用到这个名字
        root.add(p1,"p1");

        P2_Settings p2 = new P2_Settings();

        root.add(p2,"p2");


        DataQuerverWindow.setVisible(true);

        DataQuerverWindow.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

    }

    public static void GetCommandContent(){
        CommandContent = MainCommandArea.getText();
        //System.out.println(CommandContent);
        CommandSelectCenter.CommandSelectCenter();
    }

}
