package com.alipay.sofa.impl;

import com.alipay.sofa.facade.SampleService;
import org.springframework.stereotype.Service;

@Service
public class SampleServiceImpl implements SampleService {

    @Override
    public String service() {
        return "A Sample Service";
    }
}
