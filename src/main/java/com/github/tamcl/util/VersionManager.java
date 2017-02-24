package com.github.tamcl.util;

import org.to2mbn.jmccc.option.MinecraftDirectory;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by I331709 on 2/22/2017.
 */
public class VersionManager {

    MinecraftDirectory directory;
    List<String> versionList;

    public VersionManager (File directory) {
        this (directory.getAbsolutePath());
    }

    public VersionManager (String directory) {
        this (new MinecraftDirectory(directory));
    }

    public VersionManager (MinecraftDirectory directory) {
        this.directory= directory;
        if (directory.getRoot().exists())
            this.refreshVersionList();
        else
            this.versionList = new ArrayList<>();
    }

    public void refreshVersionList () {
        for (File file: directory.getVersions().listFiles()
                ) {
            if (!file.isDirectory()) continue;

            this.versionList = new ArrayList<>();
            String version = file.getName();
            if (new File(file.getPath() + "\\" + version + ".json").exists() &&
                    new File(file.getPath() + "\\" + version + ".jar").exists()) {
                this.versionList.add(version);
                System.out.println("Find game version " + version + ".");
            }
        }
    }

    public List<String> getVersionList () {
        return versionList;
    }
}
