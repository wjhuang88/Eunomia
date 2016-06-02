package indi.weijie.eunomia.engines.transport.watchdogs;

import indi.weijie.eunomia.engines.transport.protocols.ProtocolMaster;
import indi.weijie.eunomia.engines.transport.protocols.simple.SimpleTextMaster;
import indi.weijie.eunomia.engines.transport.task.SimpleOutputTaskDocker;
import indi.weijie.eunomia.engines.transport.task.TaskDocker;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by wjhuang on 2016/6/2.
 */
public class SimpleWatchDog implements WatchDog {

    private String content;

    @Override
    public void startWatch() throws IOException {

        System.out.println("Watch dog is running...");

        for (;;) {

            System.out.print("type some words: ");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            content = reader.readLine();
            ProtocolMaster<String> protocolMaster = new SimpleTextMaster();
            TaskDocker taskDocker = new SimpleOutputTaskDocker();
            int status = taskDocker.dispatch(protocolMaster.parser(content));
            if (status == -1) {
                break;
            }
        }

        System.out.println("Server stopped..");
    }
}
