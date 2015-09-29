package com.redhat.brq.integration;

import org.apache.camel.builder.RouteBuilder;

public class MyRouteBuilder extends RouteBuilder {

   public void configure() {
      from("restlet:http://localhost:8080/rest-end?restletMethods=POST").log("POST: ${body}");
   }

}
