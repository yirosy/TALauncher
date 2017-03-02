package com.github.tamcl.main;

import com.github.tamcl.gui.MainWindow;
import org.to2mbn.jmccc.launch.LaunchException;

import java.io.IOException;

/**
 * Created by I331709 on 2/20/2017.
 * Main class
 */
public class Main {

    private static void init () {

    }

    public static void main (String[] args) throws IOException, LaunchException {
        Main.init();
        MainWindow mainWindow = MainWindow.get();
        mainWindow.setVisible(true);
    }
}
