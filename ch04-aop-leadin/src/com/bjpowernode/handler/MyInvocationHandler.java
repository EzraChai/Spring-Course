package com.bjpowernode.handler;

import com.bjpowernode.utils.ServiceTools;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler {
    private Object target;

    public MyInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        String methodName = method.getName();
        Object result = null;
        if (!methodName.equals("doSome")){
            ServiceTools.doLog();
            result = method.invoke(target,args);
            ServiceTools.doTrans();
        }else {
            result = method.invoke(target,args);
        }

        return result;
    }
}
