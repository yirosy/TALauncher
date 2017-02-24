package com.github.tamcl.main;

import com.github.tamcl.gui.BackgroundPane;
import com.github.tamcl.gui.MainWindow;
import org.to2mbn.jmccc.launch.LaunchException;

import java.awt.*;
import java.io.File;
import java.io.IOException;

/**
 * Created by I331709 on 2/20/2017.
 */
public class Main {

    private static void init () {

    }

    public static void main (String[] args) throws IOException, LaunchException {
        Main.init();
        MainWindow mainWindow = new MainWindow();
        //mainWindow.add(new VersionComboBox(new VersionManager(".minecraft")));
        //mainWindow.add(new BackgroundPane());
        mainWindow.add(new BackgroundPane());
        mainWindow.getContentPane().setBackground(Color.black);
        System.out.println(mainWindow.getLayeredPane().getClass());
        System.out.println(mainWindow.getBackground());
        mainWindow.setVisible(true);

        //new BackgroundPane().setVisible(true);
    }
}
