package com.leonadordavinci.DataQueryerRelated;

import com.leonadordavinci.MainStorage.MainStorage;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DataQueryer extends MainStorage {
    public static JTextField MainCommandArea = new JTextField(20);
    public static void DataQueryer (){

        JFrame DataQuerverWindow = new JFrame("命令执行窗(请勿关闭)");

        DataQuerverWindow.setSize(400,400);

        JPanel root = new JPanel();
        DataQuerverWindow.setContentPane(root);


        root.add(MainCommandArea);
        MainCommandArea.setText("请在此框中打出命令");

        JButton Execution = new JButton("执行");
        root.add(Execution);

        Execution.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GetCommandContent();
            }
        });


        DataQuerverWindow.setVisible(true);

    }

    public static void GetCommandContent(){
        CommandContent = MainCommandArea.getText();
        //System.out.println(CommandContent);
        CommandSelectCenter.CommandSelectCenter();
    }

}
