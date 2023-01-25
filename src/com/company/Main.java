package com.company;

import javax.swing.*;
import javax.swing.border.MatteBorder;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Hard Something Something");
        frame.setLayout(new GridLayout(2,1));
        JPanel Jp2 = new JPanel(new GridLayout(1,2));
        JPanel Jp1 = new JPanel(new GridLayout(3,3));
        Jp2.add(Jp1,0,0);
        JPanel Jp3 = new JPanel(new GridLayout(2,1));
        Jp2.add(Jp3,0,1);
        Jp3.add(new JLabel("Top Right"),0,0);
        Jp3.add(new JButton("1"),0,1);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if ((i*3+j) % 2 == 0) {
                    JLabel l = new JLabel(Integer.toString(i * 3 + j));
                    l.setHorizontalAlignment(SwingConstants.CENTER);
                    Jp1.add(l, i, j);
                }
                else{
                    JButton jButton = new JButton(Integer.toString(i * 3 + j));
                    Jp1.add(jButton, i,j);
                }
            }
        }
        JPanel Jp4 = new JPanel(new BorderLayout());
        Jp4.add(new TextField(), BorderLayout.CENTER);
        JPanel Jp5 = new JPanel(new GridLayout(1,9));
        for (int i = 0; i < 9; i++) {
            if (i % 2 == 0) {
                JLabel l = new JLabel(Integer.toString(i));
                l.setHorizontalAlignment(SwingConstants.CENTER);
                Jp5.add(l,0,i);
            }
            else{
                JButton jButton = new JButton(Integer.toString(i));
                Jp5.add(jButton, 0,i);
            }
        }
        Jp4.add(Jp5, BorderLayout.SOUTH);
        frame.add(Jp2);
        frame.add(Jp4);
        frame.setSize(500,500);
        frame.pack();
        frame.setVisible(true);
        frame.requestFocus();
    }
}
