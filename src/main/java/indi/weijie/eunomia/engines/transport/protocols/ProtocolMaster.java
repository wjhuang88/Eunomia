package indi.weijie.eunomia.engines.transport.protocols;

/**
 * Created by wjhuang on 2016/6/2.
 */
public interface ProtocolMaster<D> {

    ProtocolStruct parser(D data);
}
