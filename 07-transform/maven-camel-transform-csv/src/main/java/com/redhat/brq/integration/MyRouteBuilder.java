package com.redhat.brq.integration;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.dataformat.bindy.csv.BindyCsvDataFormat;

/**
 * A Camel Java DSL Router
 */
public class MyRouteBuilder extends RouteBuilder {

   /**
    * Let's configure the Camel routing rules using Java code...
    */
   public void configure() {

      BindyCsvDataFormat bindy = new BindyCsvDataFormat("com.redhat.brq.integration");
      from("file:src/data?noop=true")
            .unmarshal(bindy).log("${body}");
   }

}
