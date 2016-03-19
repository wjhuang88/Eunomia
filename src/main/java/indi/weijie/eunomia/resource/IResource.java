package indi.weijie.eunomia.resource;

import indi.weijie.eunomia.handler.IHandler;

import java.util.List;

/**
 * Created by wjhuang on 2016/3/19.
 */
public interface IResource {

    List<Object> option(IHandler... handlers);

    Object get(IHandler... handlers);

    void put(IHandler... handlers);

    void post(IHandler... handlers);

    void delete(IHandler... handlers);

    String getResourceName();

    Class<?> getType();
}
