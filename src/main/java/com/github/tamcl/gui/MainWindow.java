package com.github.tamcl.gui;

import javax.swing.*;

/**
 * Created by I331709 on 2/22/2017.
 */
public class MainWindow extends JFrame{
    public MainWindow () {
        initWindow();
    }

    private void initWindow () {
        this.setTitle("test");
        this.setBounds(50, 50, 200, 200);
        this.setLayout(null);
        this.setUndecorated(true);
    }

}
