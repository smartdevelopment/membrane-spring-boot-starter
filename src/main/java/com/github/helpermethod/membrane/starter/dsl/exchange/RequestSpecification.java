package com.github.helpermethod.membrane.starter.dsl.exchange;

import com.predic8.membrane.core.http.Request;

public class RequestSpecification {
    private final Request request;

    public RequestSpecification(Request request) {
        this.request = request;
    }

    public HeaderSpecification headers() {
        return new HeaderSpecification(request.getHeader());
    }

    public Request raw() {
        return request;
    }
}