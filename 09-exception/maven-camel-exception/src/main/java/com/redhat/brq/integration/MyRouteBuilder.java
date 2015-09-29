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

      onException(MyException.class).to("file:target/exceptions");
      MyBean bean = new MyBean();
      from("file:src/data?noop=true").bean(bean);
   }

}
