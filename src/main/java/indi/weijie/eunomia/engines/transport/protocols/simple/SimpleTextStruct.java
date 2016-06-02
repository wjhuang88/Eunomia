package indi.weijie.eunomia.engines.transport.protocols.simple;

import indi.weijie.eunomia.engines.transport.protocols.ProtocolStruct;

import java.util.Collections;
import java.util.Map;

/**
 * Created by wjhuang on 2016/6/2.
 */
public class SimpleTextStruct implements ProtocolStruct {

    private String data;

    @Override
    public void setOriginalData(CharSequence data) {
        this.data = data.toString();
    }

    @Override
    public Map<String, Object> getProtocolInfo() {
        return Collections.singletonMap("header", null);
    }

    @Override
    public Object getRealData() {
        return data;
    }
}
