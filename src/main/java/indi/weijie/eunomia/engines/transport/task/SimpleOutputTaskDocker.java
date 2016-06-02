package indi.weijie.eunomia.engines.transport.task;

import indi.weijie.eunomia.engines.transport.protocols.ProtocolStruct;

/**
 * Created by wjhuang on 2016/6/2.
 */
public class SimpleOutputTaskDocker implements TaskDocker {

    @Override
    public int dispatch(ProtocolStruct protocolStruct) {
        String data = protocolStruct.getRealData().toString();
        if (data.equals("exit")) {
            return -1;
        }
        System.out.println("server output: " + data);
        return 0;
    }
}
