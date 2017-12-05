package org.fbz.microframework;

import org.fbz.microframework.helper.BeanHelper;
import org.fbz.microframework.helper.ClassHelper;
import org.fbz.microframework.helper.ControllerHelper;
import org.fbz.microframework.helper.IocHelper;
import org.fbz.microframework.util.ClassUtil;

public final class HelperLoader {
    public static void init(){
        Class<?>[] classList = {
                ClassHelper.class,
                BeanHelper.class,
                IocHelper.class,
                ControllerHelper.class
        };
        
        for (Class<?> cls : classList) {
            ClassUtil.loadClass(cls.getName());
        }
    }
}
