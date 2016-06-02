package indi.weijie.eunomia;

import indi.weijie.eunomia.engines.transport.watchdogs.SimpleWatchDog;
import indi.weijie.eunomia.engines.transport.watchdogs.WatchDog;

import java.io.IOException;

/**
 * Created by wjhuang on 2016/6/2.
 */
public class Runner {
    public static void main(String[] args) throws IOException {
        WatchDog watchDog = new SimpleWatchDog();
        watchDog.startWatch();
    }
}
