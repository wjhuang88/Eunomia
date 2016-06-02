package indi.weijie.eunomia.engines.transport.protocols;

import java.util.Map;

/**
 * Created by wjhuang on 2016/6/2.
 */
public interface ProtocolStruct {
    void setOriginalData(CharSequence data);

    Map<String, Object> getProtocolInfo();

    Object getRealData();

}
