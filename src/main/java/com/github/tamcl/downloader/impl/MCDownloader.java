package com.github.tamcl.downloader.impl;

import com.github.tamcl.downloader.Downloader;
import org.to2mbn.jmccc.mcdownloader.MinecraftDownloader;
import org.to2mbn.jmccc.mcdownloader.MinecraftDownloaderBuilder;
import org.to2mbn.jmccc.mcdownloader.RemoteVersion;
import org.to2mbn.jmccc.mcdownloader.RemoteVersionList;
import org.to2mbn.jmccc.mcdownloader.download.DownloadCallback;
import org.to2mbn.jmccc.mcdownloader.download.DownloadTask;
import org.to2mbn.jmccc.mcdownloader.download.concurrent.CallbackAdapter;
import org.to2mbn.jmccc.option.MinecraftDirectory;
import org.to2mbn.jmccc.version.Version;

import java.util.Map;

/**
 * Created by I331709 on 2/22/2017.
 */
public class MCDownloader implements Downloader {
    @Override
    public void getRemoteVersionList() {
        MinecraftDownloader minecraftDownloader = MinecraftDownloaderBuilder.create().build();
        minecraftDownloader.fetchRemoteVersionList(new CallbackAdapter<RemoteVersionList>() {
            @Override
            public void done(RemoteVersionList result) {
                minecraftDownloader.shutdown();
                for (Map.Entry<String, RemoteVersion> e : result.getVersions().entrySet()
                     ) {
                    System.out.println(e);
                }
            }
        });
    }

    @Override
    public void downloadFile() {
        MinecraftDownloader minecraftDownloader = MinecraftDownloaderBuilder.create().build();
        minecraftDownloader.downloadIncrementally(new MinecraftDirectory(".minecraft"), "1.11", new CallbackAdapter<Version>() {
            @Override
            public void done(Version result) {
                minecraftDownloader.shutdown();
                super.done(result);
            }

            @Override
            public void failed(Throwable e) {
                super.failed(e);
            }

            @Override
            public void cancelled() {
                super.cancelled();
            }

            @Override
            public void updateProgress(long done, long total) {
                super.updateProgress(done, total);
            }

            @Override
            public void retry(Throwable e, int current, int max) {
                super.retry(e, current, max);
            }

            @Override
            public <R> DownloadCallback<R> taskStart(DownloadTask<R> task) {
                return super.taskStart(task);
            }
        });
    }
}
