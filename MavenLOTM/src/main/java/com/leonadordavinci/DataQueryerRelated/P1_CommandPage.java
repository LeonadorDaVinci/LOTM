package com.leonadordavinci.DataQueryerRelated;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static com.leonadordavinci.DataQueryerRelated.DataQueryer.*;

public class P1_CommandPage extends JPanel {
    public P1_CommandPage(){
        setLayout(new FlowLayout());


        add(MainCommandArea);
        MainCommandArea.setText("请在此框中打出命令");
        MainCommandArea.setBounds(100,10,200,25);
        MainCommandArea.setColumns(20);

        JButton Execution = new JButton("执行");
        add(Execution);
        Execution.setBounds(350,10,50,25);

        Execution.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GetCommandContent();
            }
        });

        JButton Settings = new JButton("设置");
        Settings.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
//				这里是点击按钮切换不同的页面
//				cardLayout.show(参数 1，参数2)方法里面也有两个参数，
//				参数1是表示指明你要在哪个容器上显示，
//				参数2是指明要显示哪个卡片，即你要给出对应卡片的名字
                cardLayout.show(root, "p2");
            }
        });
        add(Settings);
        Settings.setBounds(175,200,50,25);

        /*
        JButton btnNewButton_1 = new JButton("页面2");
        btnNewButton_1.setBounds(60,60,30,30);
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
//				同上
                cardLayout.show(root, "p2");
            }
        });
        add(btnNewButton_1);

         */


    }
}
