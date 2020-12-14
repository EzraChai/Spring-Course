package com.bjpowernode.service;

import com.bjpowernode.handler.MyInvocationHandler;
import com.bjpowernode.service.impl.SomeServiceImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class MyApp {
    public static void main(String[] args) {
        SomeService target = new SomeServiceImpl();
        InvocationHandler invocationHandler = new MyInvocationHandler(target);
        SomeService proxy = (SomeService) Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), invocationHandler);
        proxy.doSome();
        System.out.println("=========================");
        proxy.doOther();
    }
}
