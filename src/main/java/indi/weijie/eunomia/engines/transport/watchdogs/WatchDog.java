package indi.weijie.eunomia.engines.transport.watchdogs;

import indi.weijie.eunomia.gears.Configurer;

import java.io.IOException;

/**
 * Created by wjhuang on 2016/6/2.
 */
public interface WatchDog {

    void startWatch() throws IOException;
}
