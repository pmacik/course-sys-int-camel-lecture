Java DSL
--------
To generate Maven project:
```sh
mvn archetype:generate -DarchetypeGroupId=org.apache.camel.archetypes -DarchetypeArtifactId=camel-archetype-java -DgroupId=com.redhat.brq.integration -DartifactId=maven-camel-java
```

To run:
```sh
mvn clean compile exec:java
```

Spring DSL
-------------
To generate Maven project:
```sh
mvn archetype:generate -DarchetypeGroupId=org.apache.camel.archetypes -DarchetypeArtifactId=camel-archetype-spring -DgroupId=com.redhat.brq.integration -DartifactId=maven-camel-spring;
```
To run:
```sh
mvn clean camel:run"
```