package com.redhat.brq.integration;

import org.apache.camel.builder.RouteBuilder;

/**
 * A Camel Java DSL Router
 */
public class MyRouteBuilder extends RouteBuilder {

   /**
    * Let's configure the Camel routing rules using Java code...
    */
   public void configure() {

      // here is a sample which processes the input files
      // (leaving them in place - see the 'noop' flag)
      // then performs content based routing on the message using XPath
      from("file:src/data?noop=true")
            .multicast().to("file:target/a").to("file:target/b").to("file:target/c");
   }

}
