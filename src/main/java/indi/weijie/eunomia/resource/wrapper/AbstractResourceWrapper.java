package indi.weijie.eunomia.resource.wrapper;

import indi.weijie.eunomia.resource.IResource;

/**
 * Created by wjhuang on 2016/3/19.
 */
public abstract class AbstractResourceWrapper implements IResource {

    private Object object;

    void setResourceObject(Object o) {
        object = o;
    }

    public Class<?> getType() {
        return object.getClass();
    }
}
