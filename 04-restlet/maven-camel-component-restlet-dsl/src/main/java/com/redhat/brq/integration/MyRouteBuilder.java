package com.redhat.brq.integration;

import org.apache.camel.builder.RouteBuilder;

public class MyRouteBuilder extends RouteBuilder {

   public void configure() {
      restConfiguration().component("restlet").host("localhost").port(8080);
      rest("/rest-end").consumes("text/plain").produces("text/plain")
            .post().to("direct:post");
      from("direct:post").log("POST: ${body}");
   }
}
