package com.github.tamcl.gui.box;

import com.github.tamcl.util.VersionManager;

import javax.swing.*;


/**
 * Created by I331709 on 2/22/2017.
 * Version ComboBox
 */
public class VersionComboBox extends JComboBox<String> {

    private VersionManager versionManager;

    private VersionComboBox() {super();}

    public VersionComboBox (VersionManager versionManager) {
        this();
        this.versionManager = versionManager;
        this.refreshItems();
    }

    public void refresh () {
        this.versionManager.refreshVersionList();
        this.refreshItems();
    }

    private void refreshItems () {
        versionManager.getVersionList().forEach(this::addItem);
    }
}
