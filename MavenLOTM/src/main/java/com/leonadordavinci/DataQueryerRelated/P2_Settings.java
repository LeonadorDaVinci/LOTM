package com.leonadordavinci.DataQueryerRelated;

import com.leonadordavinci.Music.MusicThread;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static com.leonadordavinci.DataQueryerRelated.DataQueryer.cardLayout;
import static com.leonadordavinci.DataQueryerRelated.DataQueryer.root;

public class P2_Settings extends JPanel {

    JCheckBox Music = new JCheckBox("背景音乐");
    public P2_Settings(){

        setLayout(new FlowLayout(FlowLayout.CENTER));

        JLabel description = new JLabel("游戏基础设置");
        add(description);

        add(Music);

        Music.setSelected(true);

        Music.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Music.isSelected()){
                    if (MusicThread.Repeat == false){
                        MusicThread.Repeat = true;
                        MusicThread thread = new MusicThread();
                        thread.start();//开启音乐进程
                        description.setText("音乐已开启！");
                    }
                }else {
                    MusicThread.Repeat = false;
                    description.setText("音乐已关闭！");
                }
            }
        });


        JButton btnNewButton_1 = new JButton("返回主页");

        btnNewButton_1.setBounds(175,300,90,25);

        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                description.setText("游戏基础设置");
                cardLayout.show(root, "p1");
            }
        });
        add(btnNewButton_1);

    }
}
