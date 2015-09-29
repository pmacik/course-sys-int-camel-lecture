package com.redhat.brq.integration;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.converter.jaxb.JaxbDataFormat;

/**
 * A Camel Java DSL Router
 */
public class MyRouteBuilder extends RouteBuilder {

   /**
    * Let's configure the Camel routing rules using Java code...
    */
   public void configure() {


      JaxbDataFormat jaxb = new JaxbDataFormat("com.redhat.brq.integration");
      from("file:src/data?noop=true")
            .unmarshal(jaxb)
            .bean(new MyBean(), "process");
   }

}
