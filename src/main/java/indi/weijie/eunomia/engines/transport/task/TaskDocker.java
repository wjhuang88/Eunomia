package indi.weijie.eunomia.engines.transport.task;

import indi.weijie.eunomia.engines.transport.protocols.ProtocolStruct;

/**
 * Created by wjhuang on 2016/6/2.
 */
public interface TaskDocker {

    int dispatch(ProtocolStruct protocolStruct);
}
