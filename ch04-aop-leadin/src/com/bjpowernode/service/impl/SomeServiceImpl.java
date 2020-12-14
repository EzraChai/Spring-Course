package com.bjpowernode.service.impl;

import com.bjpowernode.service.SomeService;
import com.bjpowernode.utils.ServiceTools;


public class SomeServiceImpl implements SomeService {
    @Override
    public void doSome() {
        System.out.println("do Some Method is running");
    }

    @Override
    public void doOther() {
        System.out.println("do Other Method is running");
    }
}
