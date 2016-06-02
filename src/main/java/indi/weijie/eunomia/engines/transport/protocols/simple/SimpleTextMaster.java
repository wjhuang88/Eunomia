package indi.weijie.eunomia.engines.transport.protocols.simple;

import indi.weijie.eunomia.engines.transport.protocols.ProtocolMaster;
import indi.weijie.eunomia.engines.transport.protocols.ProtocolStruct;

/**
 * Created by wjhuang on 2016/6/2.
 */
public class SimpleTextMaster implements ProtocolMaster<String> {

    @Override
    public ProtocolStruct parser(String data) {
        ProtocolStruct struct = new SimpleTextStruct();
        struct.setOriginalData(data);
        return struct;
    }
}
