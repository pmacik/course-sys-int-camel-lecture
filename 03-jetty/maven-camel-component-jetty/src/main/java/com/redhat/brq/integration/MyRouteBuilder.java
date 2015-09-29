package com.redhat.brq.integration;

import org.apache.camel.builder.RouteBuilder;
public class MyRouteBuilder extends RouteBuilder {
    public void configure() {
        from("jetty:http://localhost:8123/path")
                    .to("file:target/messages");
    }
}
