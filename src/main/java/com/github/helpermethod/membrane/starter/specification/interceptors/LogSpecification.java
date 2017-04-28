package com.github.helpermethod.membrane.starter.specification.interceptors;

import com.predic8.membrane.core.interceptor.LogInterceptor;

public class LogSpecification {
    private final LogInterceptor log;

    public LogSpecification(LogInterceptor log) {
        this.log = log;
    }

    public LogSpecification level(LogInterceptor.Level level) {
        log.setLevel(level);

        return this;
    }

    public LogSpecification category(String category) {
        log.setCategory(category);

        return this;
    }
}