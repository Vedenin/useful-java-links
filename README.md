# Useful Java links 
It's fork of [awesome link](https://github.com/akullpp/awesome-java) with new structure and a lot of new links

- [I. General frameworks and libraries](#i-general-frameworks-and-libraries)
    - [1. General frameworks](#1-general-frameworks)
    - [2. General utility libraries](#2-general-utility-libraries)
    - [3. Add new features in Java language and JVM](#3-add-new-features-in-java-language-and-jvm)
    - [4. Web Frameworks](#4-web-frameworks)
    - [5. GUI](#5-gui)
    - [6. Game Development](#6-game-development)
    - [7. Security](#7-security)
    - [8. High Performance](#8-high-performance)
    - [9. Business process frameworks](#9-business-process-frameworks)
    - [10. Serialization and I/O](#10-serialization-and-io)
    - [11. Imagery and Video](#11-imagery-and-video)
    - [12. Logging](#12-logging)
    - [13. Bean Mapping](#13-bean-mapping)
    - [14. Code generation and changing byte code](#14-code-generation-and-bytecode-manipulation)
    - [15. Distributed Applications](#15-distributed-applications)
    - [16. Science](#16-science)
       
- [II. Databases, search engines, big data and machine learning](#ii-databases-search-engines-big-data-and-machine-learning)
    - [1. Databases and storages](#1-databases-and-storages)
    - [2. Data structures](#2-data-structures)
    - [3. Search engines](#3-search-engines)
    - [4. Client and drivers for databases](#4-client-and-drivers-for-databases)
    - [5. ORM](#5-orm)
    - [6. Working with messy data](#6-working-with-messy-data)
    - [7. Big data](#7-big-data)
    - [8. Machine Learning](#8-machine-learning)
    - [9. Natural Language Processing (NLP) (NLP)](#9-natural-language-processing-nlp)
    
- [III. Network and Integration](#iii-network-and-integration)
    - [1. Servers (Web Server and Application Server)](#1-servers-web-server-and-application-server)
    - [2. Network and sockets](#2-networking)
    - [3. Message, message broker and message queue](#3-message-message-broker-and-message-queue)
    - [4. Http and ssh](#4-http-and-ssh)
    - [5. Rest Frameworks](#5-rest-frameworks)
    - [6. Integration frameworks](#6-integration-frameworks)
    - [7. Web Crawling and HTML parsering](#7-web-crawling-and-html-parsering)
    - [8. Json](#8-json)
    - [9. CSV](#9-csv)
    - [10. Integratin with API](#10-integratin-with-api)
    - [11. Bitcoin](#11-bitcoin)
    - [12. Clouds](#12-clouds)
    - [13. Cluster Management](#13-cluster-management)
    - [14. Document Processing (XLS, DOC and PDF)](#14-document-processing-xls-doc-and-pdf)
    - [15. Native](#15-native)

- [IV. Testing](#iv-testing)
    - [1. Testing](#1-testing)
    - [2. Code Coverage](#2-code-coverage)
    - [3. Continuous Integration](#3-continuous-integration)
    - [4. Formal Verification](#4-formal-verification)
    
- [V. Tools for developing](#v-tools-for-developing)
    - [1. IDE](#1-ide)
    - [2. Deploy, config and build](#2-deploy-config-and-build)
    - [3. Perfomance tools](#3-perfomance-tools)
    - [4. Code Analysis](#4-code-analysis)
    - [5. Monitoring](#5-monitoring)
    - [5. Other](#6-other)

- [VI. Program languages and applications, that was written with Java](#vi-program-languages-and-applications-that-was-written-with-java)
    - [1. Program languages, that was written with Java](#1-program-languages-that-was-written-with-java)
    - [2. Other program languages tools, that was written with Java](#2-other-program-languages-tools-that-was-written-with-java)
    - [3. Javascript](#3-javascript)
    - [4. Parser frameworks, comiler for write new program languages](#4-frameworks-that-help-to-create-parsers-interpreters-or-compilers)
    - [5. Applications, that was written with Java](#5-applications-that-was-written-with-java)
    - [6. Games, that was written with Java](#6-games-that-was-written-with-java)
    
- [VII. Other](#vii-other)
    - [1. Source code examples](#1-source-code-examples)
    - [2. Benchmark results](#2-benchmark-results)
    - [3. Working with git and github](#3-working-with-git-and-github)
    - [4. Ancients](#4-ancients)

- [VIII. Resources](#viii-resources)
    - [1. Communities](#1-communities)
    - [2. Influential Books](#2-influential-books)
    - [3. Websites](#3-websites)


## I. General frameworks and libraries
### 1. General frameworks
### 2. General utility libraries

*Libraries which provide general utility functions.*

* [Apache Commons](http://commons.apache.org/) - Provides different general purpose functions like configuration, validation, collections, file upload or XML processing.
* [args4j](http://args4j.kohsuke.org/) - Command line arguments parser.
* [CRaSH](http://www.crashub.org) - Provides a CLI for running processes.
* [Gephi](https://github.com/gephi/gephi/) - Cross-platform for visualizing and manipulating large graph networks.
* [Guava](https://github.com/google/guava) - Collections, caching, primitives support, concurrency libraries, common annotations, string processing, I/O, and so forth.
* [JADE](http://jade.tilab.com/) - Framework and environment for building and to debugging multi-agent systems.
* [javatuples](http://www.javatuples.org/) - Tuples.
* [JCommander](http://jcommander.org/) - Command line arguments parser.
* [Protégé](http://protege.stanford.edu/) - Provides an ontology editor and a framework to build knowledge-based systems.


#### Date and Time

*Libraries related to handling date and time.*

* [Almanac Converter](https://github.com/hypotemoose/almanac-converter) - Simple conversion between different calendar systems.
* [Joda-Time](http://www.joda.org/joda-time/) - De facto standard date/time-library before Java 8.
* [ThreeTenBP](https://github.com/ThreeTen/threetenbp) - Port of JSR 310 (java.time package) by the author of Joda-Time.
* [Time4J](https://github.com/MenoData/Time4J) - Advanced date and time library.

#### Dependency Injection

*Libraries that help to realize the [Inversion of Control](https://en.wikipedia.org/wiki/Inversion_of_control) paradigm.*

* [Apache DeltaSpike](https://deltaspike.apache.org/) - CDI extension framework.
* [Dagger2](http://google.github.io/dagger/) - Compile-time injection framework without reflection.
* [Guice](https://github.com/google/guice) - Lightweight but powerful framework that completes Dagger.
* [HK2](https://hk2.java.net) - Light-weight and dynamic dependency injection framework.

#### Development

*Augmentation of the development process at a fundamental level.*

* [ADT4J](https://github.com/sviperll/adt4j) - JSR-269 code generator for algebraic data types.
* [AspectJ](https://eclipse.org/aspectj/) - Seamless aspect-oriented programming extension.
* [Auto](https://github.com/google/auto) - Collection of source code generators.
* [DCEVM](http://dcevm.github.io/) - Modification of the JVM that allows unlimited redefinition of loaded classes at runtime.
* [HotswapAgent](https://github.com/HotswapProjects/HotswapAgent) - Unlimited runtime class and resource redefinition.
* [Immutables](http://immutables.github.io/) - Scala-like case classes.
* [JHipster](https://github.com/jhipster/generator-jhipster) - Yeoman source code generator to create applications based on Spring Boot and AngularJS.
* [JRebel](http://zeroturnaround.com/software/jrebel/) - Commercial software that instantly reloads code and configuration changes without redeploys.
* [Lombok](https://projectlombok.org/) - Code-generator which aims to reduce the verbosity.
* [Spring Loaded](https://github.com/spring-projects/spring-loaded) - Class reloading agent.
* [vert.x](http://vertx.io/) - Polyglot event-driven application framework.

#### Functional Programming

*Libraries that facilitate functional programming.*

* [Cyclops](https://github.com/aol/cyclops) - Monad and stream utilities, comprehensions, pattern matching, trampolines and much more.
* [derive4j](https://github.com/derive4j/derive4j) - Java 8 annotation processor and framework for deriving algebraic data types constructors, pattern-matching, morphisms.
* [Fugue](https://bitbucket.org/atlassian/fugue) - Functional extensions to Guava.
* [Functional Java](http://www.functionaljava.org) - Implements numerous basic and advanced programming abstractions that assist composition-oriented development.
* [Javaslang](http://javaslang.com) - Functional component library that provides persistent data types and functional control structures.
* [jOOλ](https://github.com/jOOQ/jOOL) - Extension to Java 8 which aims to fix gaps in lambda, providing numerous missing types and a rich set of sequential Stream API additions.

#### Reactive libraries

*Libraries for developing reactive applications.*

* [Reactive Streams](https://github.com/reactive-streams/reactive-streams-jvm/) - Provide a standard for asynchronous stream processing with non-blocking backpressure.
* [Reactor](http://projectreactor.io/) - Library for building reactive fast-data applications.
* [RxJava](https://github.com/ReactiveX/RxJava) - Library for composing asynchronous and event-based programs using observable sequences from the JVM.

### 3. Add new features in Java language and JVM
### 4. Web Frameworks

*Frameworks that handle the communication between the layers of an web application.*

* [Apache Tapestry](http://tapestry.apache.org/) - Component-oriented framework for creating dynamic, robust, highly scalable web applications.
* [Apache Wicket](http://wicket.apache.org/) - Component-based web application framework similar to Tapestry with a stateful GUI.
* [Google Web Toolkit](http://www.gwtproject.org/) - Toolbox which includes a Java-to-JavaScript compiler for client-side code, XML parser, API for RPC, JUnit integration, internationalization support and widgets for the GUI.
* [Grails](https://grails.org/) - Groovy framework with the aim to provide a highly productive environment by favoring convention over configuration, no XML and support for mixins.
* [Ninja](http://www.ninjaframework.org/) - Full stack web framework.
* [Pippo](http://www.pippo.ro/) - Small, highly modularized Sinatra-like framework.
* [Play](https://www.playframework.com/) - Uses convention over configuration, hot code reloading and display of errors in the browser.
* [PrimeFaces](http://primefaces.org/) - JSF framework which has a free and a commercial version with support. Provides several frontend components.
* [Ratpack](http://ratpack.io/) - Set of libraries that facilitate fast, efficient, evolvable and well tested HTTP applications.
* [Spring Boot](http://projects.spring.io/spring-boot/) - Microframework which simplifies the development of new Spring applications.
* [Spring](http://projects.spring.io/spring-framework/) - Provides many packages ranging from dependency injection to aspect-oriented programming to security.
* [Vaadin](https://vaadin.com/) - Event-driven framework build on top of GWT. Uses server-side architecture with Ajax on the client-side.

#### Template Engine

*Tools which substitute expressions in a template.*

* [Apache Velocity](http://velocity.apache.org/) - Templates for HTML pages, emails or source code generation in general.
* [FreeMarker](http://freemarker.incubator.apache.org/) - General templating engine without any heavyweight or opinionated dependencies.
* [Handlebars.java](http://jknack.github.io/handlebars.java/) - Logic-less and semantic Mustache templates.
* [Thymeleaf](http://www.thymeleaf.org/) - Aims to be a substitute for JSP and works for XML files in general.

### 5. GUI

*Libraries to create modern graphical user interfaces.*

* [JavaFX](http://www.oracle.com/technetwork/java/javase/overview/javafx-overview-2158620.html) - The successor of Swing.
* [Scene Builder](http://www.oracle.com/technetwork/java/javase/downloads/javafxscenebuilder-info-2157684.html) - Visual layout tool for JavaFX applications.
* [SWT](http://www.eclipse.org/swt/) - The Standard Widget Toolkit (SWT) is a graphical widget toolkit for use with the Java platform.

### 6. Game Development

*Frameworks that support the development of games.*

* [jMonkeyEngine](http://jmonkeyengine.org/) - Game engine for modern 3D development.
* [libGDX](https://libgdx.badlogicgames.com/) - All-round cross-platform, high-level framework.
* [LWJGL](http://www.lwjgl.org/) - Robust framework that abstracts libraries like OpenGL/CL/AL.

### 7. Security

*Libraries that handle security, authentication, authorization or session management.*

* [Apache Shiro](http://shiro.apache.org/) - Performs authentication, authorization, cryptography and session management.
* [Bouncy Castle](https://www.bouncycastle.org/java.html) - All-purpose cryptographic library. JCA provider, wide range of functions from basic helpers to PGP/SMIME operations.
* [Cryptomator](https://cryptomator.org/) - Multiplatform transparent client-side encryption of files in the cloud.
* [Google Keyczar](https://github.com/google/keyczar) - Easy to use, yet safe encryption framework with key versioning.
* [Keycloak](http://keycloak.jboss.org/) - Integrated SSO and IDM for browser apps and RESTful web services.
* [PicketLink](http://picketlink.org/) - Umbrella project for security and identity management.

### 8. High Performance

*Everything about high performance computation, from collections to specific libraries.*

* [Agrona](https://github.com/real-logic/Agrona) - Data structures and utility methods that are common in high-performance applications.
* [Disruptor](http://lmax-exchange.github.io/disruptor/) - Inter-thread messaging library.
* [fastutil](http://fastutil.di.unimi.it/) - Fast and compact type-specific collections.
* [GS Collections](https://github.com/goldmansachs/gs-collections) - Collection framework inspired by Smalltalk.
* [HPPC](http://labs.carrotsearch.com/hppc.html) - Primitive collections.
* [Javolution](http://javolution.org/) - Library for real-time and embedded systems.
* [JCTools](https://github.com/JCTools/JCTools) - Concurrency tools currently missing from the JDK.
* [Koloboke](https://github.com/OpenHFT/Koloboke) - Hash sets and hash maps.
* [Trove](http://trove.starlight-systems.com/) - Primitive collections.

#### Constraint Satisfaction Problem Solver

*Libraries that help on implementing optimization and satisfiability problems.*

* [Choco](http://choco-solver.org/) - Off-the-shelf constraint satisfaction problem solver, which uses constraint programming techniques.
* [JaCoP](https://github.com/radsz/jacop/) - Includes an interface for the FlatZinc language, enabling it to execute MiniZinc models.
* [OptaPlanner](http://www.optaplanner.org/) - Business planning and resource scheduling optimization solver.
* [Sat4J](http://www.sat4j.org/) - State-of-the-art SAT solver for boolean and optimization problems.

### 9. Business process frameworks
### 10. Serialization and I/O

*Libraries that handle serialization with high efficiency.*

* [FlatBuffers](https://github.com/google/flatbuffers) - Memory efficient serialization library that can access serialized data without unpacking and parsing it.
* [FST](https://github.com/RuedigerMoeller/fast-serialization) - JDK compatible high performance object graph serialization.
* [Kryo](https://github.com/EsotericSoftware/kryo) - Fast and efficient object graph serialization framework.
* [MessagePack](https://github.com/msgpack/msgpack-java) - Efficient binary serialization format.

### 11. Imagery and Video
#### Imagery 

*Libraries that assist with the creation, evaluation or manipulation of graphical images.*

* [Imgscalr](https://github.com/thebuzzmedia/imgscalr) - Simple and efficient hardware-accelerated image-scaling library implemented in pure Java 2D.
* [Picasso](http://square.github.io/picasso/) - Image downloading and caching library for Android.
* [Thumbnailator](https://github.com/coobird/thumbnailator) - Thumbnailator is a high-quality thumbnail generation library for Java.
* [ZXing](https://github.com/zxing/zxing) - Multi-format 1D/2D barcode image processing library.

### 12. Logging

*Libraries that log the behavior of an application.*

* [Apache Log4j 2](http://logging.apache.org/log4j/) - Complete rewrite with a powerful plugin and configuration architecture.
* [graylog](https://www.graylog.org/) - Open-source aggregator suited for extended role and permission management.
* [kibana](https://www.elastic.co/products/kibana) - Analyzes and visualizes log files. Some features require payment.
* [Logback](http://logback.qos.ch/) - Robust logging library with interesting configuration options via Groovy.
* [logstash](https://www.elastic.co/products/logstash) - Tool for managing log files.
* [Metrics](https://github.com/dropwizard/metrics) - Expose metrics via JMX or HTTP and can send them to a database.
* [SLF4J](http://www.slf4j.org/) - Abstraction layer which is to be used with an implementation.
* [tinylog](http://www.tinylog.org/) - Lightweight logging framework with static logger class.

### 13. Bean Mapping
*Frameworks that ease bean mapping.*

* [Dozer](https://github.com/DozerMapper/dozer/) - Mapper that copies data from one object to another, using annotations, API or XML configuration.
* [MapStruct](https://github.com/mapstruct/mapstruct) - Code generator which simplifies mappings between different bean types, based on a convention over configuration approach.
* [ModelMapper](https://github.com/jhalterman/modelmapper) - ModelMapper is an intelligent object mapping library that automatically maps objects to each other.
* [Orika](https://github.com/orika-mapper) - Orika is a Java Bean mapping framework that recursively copies (among other capabilities) data from one object to another.
* [Selma](https://github.com/xebia-france/selma) - Stupid Simple Statically Linked Mapper. Selma is an Annotation Processor Based bean mapper.
 

### 14. Code generation and Bytecode Manipulation
#### Bytecode Manipulation

*Libraries to manipulate bytecode programmatically.*

* [ASM](http://asm.ow2.org/) - All purpose, low level, bytecode manipulation and analysis.
* [Byte Buddy](http://bytebuddy.net/) - Further simplifies bytecode generation with a fluent API.
* [Byteman](http://byteman.jboss.org/) - Manipulate bytecode at runtime via DSL (rules) mainly for testing/troubleshooting.
* [Javassist](http://jboss-javassist.github.io/javassist/) - Tries to simplify the editing of bytecode.

### 15. Distributed Applications

*Libraries and frameworks for writing distributed and fault-tolerant applications.*

* [Akka](http://akka.io) - Toolkit and runtime for building concurrent, distributed, and fault tolerant event-driven applications.
* [Apache Storm](http://storm.apache.org/) - Realtime computation system.
* [Apache ZooKeeper](http://zookeeper.apache.org/) - Coordination service with distributed configuration, synchronization, and naming registry for large distributed systems.
* [Axon Framework](http://www.axonframework.org/) - Framework for creating CQRS applications.
* [Hazelcast](http://hazelcast.org/) - Highly scalable in-memory datagrid.
* [Hystrix](https://github.com/Netflix/Hystrix) - Provides latency and fault tolerance.
* [JGroups](http://www.jgroups.org/) - Toolkit for reliable messaging and creating clusters.
* [Orbit](http://orbit.bioware.com/) - Virtual Actors, adding another level of abstraction to traditional actors.
* [Quasar](http://www.paralleluniverse.co/quasar/) - Lightweight threads and actors for the JVM.

### 16. Science

*Libraries for scientific computing and analysis.*

* [DataMelt](http://jwork.org/dmelt/) - Environment for scientific computation, data analysis and data visualization.
* [JGraphT](https://github.com/jgrapht/jgrapht) - Graph library that provides mathematical graph-theory objects and algorithms.
* [JScience](http://jscience.org/) - Provides a set of classes to work with scientific measurements and units.

## II. Databases, search engines, big data and machine learning
### 1. Databases and storages

*Everything which simplifies interactions with the database.*

* [Apache Hive](https://hive.apache.org/) - Data warehouse infrastructure built on top of Hadoop.
* [Apache Phoenix](http://phoenix.apache.org/) - High performance relational database layer over HBase for low latency applications.
* [Crate](https://crate.io/) - Distributed data store that implements data synchronization, sharding, scaling, and replication. In addition, it provides a SQL-based syntax to execute queries across a cluster.
* [FlexyPool](https://github.com/vladmihalcea/flexy-pool) - Brings metrics and failover strategies to the most common connection pooling solutions.
* [Flyway](http://flywaydb.org/) - Simple database migration tool.
* [H2](http://h2database.com/) - Small SQL Database notable for its in-memory functionality.
* [HikariCP](https://github.com/brettwooldridge/HikariCP) - High performance JDBC connection pool.
* [JDBI](http://jdbi.org/) - Convenient abstraction of JDBC.
* [Jedis](https://github.com/xetorthio/jedis) - A small client for interaction with redis, with methods for commands.
* [jOOQ](http://www.jooq.org/) - Generates typesafe code based on SQL schema.
* [Liquibase](http://www.liquibase.org/) - Database-independent library for tracking, managing and applying database schema changes.
* [MapDB](http://www.mapdb.org/) - Embedded database engine that provides concurrent collections backed on disk or in off-heap memory.
* [Presto](https://github.com/facebook/presto) - Distributed SQL query engine for big data.
* [Querydsl](http://www.querydsl.com/) - Typesafe unified queries.
* [Redisson](https://github.com/mrniko/redisson) - Allows for distributed and scalable data structures on top of a Redis server.
* [Vibur DBCP](http://www.vibur.org/) - JDBC connection pool library which offers advanced performance monitoring capabilities.

#### Distributed Databases

*Databases in a distributed system that appear to applications as a single data source.*

* [Apache Cassandra](http://cassandra.apache.org) - Column-oriented and providing high availability with no single point of failure.
* [Apache HBase](http://hbase.apache.org) - Hadoop database for big data.
* [Druid](http://druid.io) - Real-time and historical OLAP data store that excel at aggregation and approximation queries.
* [Infinispan](http://infinispan.org/) - Highly concurrent key/value datastore used for caching.
* [OpenTSDB](http://opentsdb.net) - Scalable and distributed time series database written on top of Apache HBase.

### 2. Data structures

*Efficient and specific data structures.*

* [Apache Avro](https://avro.apache.org/) - Data interchange format featuring among others: dynamic typing, untagged data, absence of manually assigned IDs.
* [Apache Orc](https://orc.apache.org/) - Fast and efficient columnar storage format for hadoop based workloads.
* [Apache Parquet](http://parquet.apache.org/) - Columnar storage format based on assembly algorithms from the Dremel paper by Google.
* [Apache Thrift](https://thrift.apache.org/) - Data interchange format that originated at Facebook.
* [Persistent Collection](http://pcollections.org/) - Persistent and immutable analogue of the Java Collections Framework.
* [Protobuf](https://github.com/google/protobuf) - Google's data interchange format.
* [SBE](https://github.com/real-logic/simple-binary-encoding) - Simple Binary Encoding, one of the fastest message formats around.
* [Wire](https://github.com/square/wire) - Clean, lightweight protocol buffers.

### 3. Search engines

*Engines which index documents for search and analysis.*

* [Apache Solr](http://lucene.apache.org/solr/) - Enterprise search engine optimized for high volume traffic.
* [Elasticsearch](https://www.elastic.co/) - Distributed, multitenant-capable full-text search engine with a RESTful web interface and schema-free JSON documents.

### 4. Client and drivers for databases
### 5. ORM

*APIs which handle the persistence of objects.*

* [Ebean](http://ebean-orm.github.io/) - Provides simple and fast data access.
* [EclipseLink](https://www.eclipse.org/eclipselink/) - Supports a number of persistence standards: JPA, JAXB, JCA and SDO.
* [Hibernate](http://hibernate.org/orm/) - Robust and widely used with an active community.
* [MyBatis](http://mybatis.org/mybatis-3/) - Couples objects with stored procedures or SQL statements.
* [OrmLite](http://ormlite.com/) - Lightweight package avoiding the complexity and overhead of other ORM products.

### 6. Working with messy data

* [OpenRefine](http://openrefine.org/) - Tool for working with messy data: cleaning, transforming, extending it with web services and linking it to databases.

### 7. Big data
### 8. Machine Learning

*Tools that provide specific statistical algorithms which allow learning from data.*

* [Apache Flink](https://flink.apache.org/) - Fast and reliable large-scale data processing engine.
* [Apache Hadoop](http://hadoop.apache.org/) - Storage and large-scale processing of data-sets on clusters of commodity hardware.
* [Apache Mahout](https://mahout.apache.org/) - Scalable algorithms focused on collaborative filtering, clustering and classification.
* [Apache Spark](http://spark.apache.org/) - Data analytics cluster computing framework.
* [DeepDive](http://deepdive.stanford.edu) - Creates structured information from unstructured data and integrates it into an existing database.
* [Deeplearning4j](http://deeplearning4j.org/) - Distributed and multi-threaded deep learning library.
* [H2O](http://h2o.ai/) - Analytics engine for statistics over big data.
* [JSAT](https://github.com/EdwardRaff/JSAT) - Algorithms for pre-processing, classification, regression, and clustering with support for multi-threaded execution.
* [Weka](http://www.cs.waikato.ac.nz/ml/weka/) - Collection of algorithms for data mining tasks ranging from pre-processing to visualization.

### 9. Natural Language Processing (NLP)

*Libraries that specialize on processing text.*

* [Apache OpenNLP](https://opennlp.apache.org/) - Toolkit for common tasks like tokenization.
* [CoreNLP](http://nlp.stanford.edu/software/corenlp.shtml) - Stanford's CoreNLP provides a set of fundamental tools for tasks like tagging, named entity recognition, sentiment analysis and many more.
* [LingPipe](http://alias-i.com/lingpipe/) - Toolkit for a variety of tasks ranging from POS tagging to sentiment analysis.
* [Mallet](http://mallet.cs.umass.edu/) - Statistical natural language processing, document classification, clustering, topic modeling and more.

## III. Network and Integration
### 1. Servers (Web Server and Application Server)

*Servers which are specifically used to deploy applications.*

* [Apache Tomcat](http://tomcat.apache.org/) - Robust all-round server for Servlet and JSP.
* [Apache TomEE](http://tomee.apache.org/) - Tomcat plus Java EE.
* [Jetty](http://www.eclipse.org/jetty/) - Lightweight, small server, often embedded in projects.
* [WebSphere Liberty](https://developer.ibm.com/wasdev/) - Lightweight, modular server developed by IBM.
* [WildFly](http://www.wildfly.org/) - Formerly known as JBoss and developed by Red Hat with extensive Java EE support.

### 2. Networking

*Libraries for network programming.*

* [Async Http Client](https://github.com/AsyncHttpClient/async-http-client) - Asynchronous HTTP and WebSocket client library.
* [Comsat](https://github.com/puniverse/comsat) - Integrates standard Java web-related APIs with Quasar fibers and actors.
* [Grizzly](https://grizzly.java.net/) - NIO framework. Used as a network layer in Glassfish.
* [Netty](http://netty.io/) - Framework for building high performance network applications.
* [OkHttp](http://square.github.io/okhttp/) - HTTP+SPDY client.
* [Undertow](http://undertow.io/) - Web server providing both blocking and non-blocking API’s based on NIO. Used as a network layer in WildFly.

### 3. Message, message broker and message queue

*Tools that help to send messages between clients in order to ensure protocol independency.*

* [Aeron](https://github.com/real-logic/Aeron) - Efficient reliable unicast and multicast message transport.
* [Apache ActiveMQ](http://activemq.apache.org/) - Message broker that implements JMS and converts synchronous to asynchronous communication.
* [Apache Camel](http://camel.apache.org/) - Glues together different transport APIs via Enterprise Integration Patterns.
* [Apache Kafka](http://kafka.apache.org/) - High-throughput distributed messaging system.
* [Hermes](http://hermes.allegro.tech) - Fast and reliable message broker built on top of Kafka.
* [JBoss HornetQ](http://hornetq.jboss.org/) - Clear, concise, modular and made to be embedded.
* [JeroMQ](https://github.com/zeromq/jeromq) - Implementation of ZeroMQ.
* [Smack](https://github.com/igniterealtime/Smack/) - Cross-platform XMPP client library.

### 4. Http and ssh
### 5. Rest Frameworks

*Frameworks specifically for creating RESTful services.*

* [Dropwizard](https://dropwizard.github.io/dropwizard/) - Opinionated framework for setting up modern web applications with Jetty, Jackson, Jersey and Metrics.
* [Feign](https://github.com/Netflix/feign) - HTTP client binder inspired by Retrofit, JAXRS-2.0, and WebSocket.
* [Jersey](https://jersey.java.net/) - JAX-RS reference implementation.
* [RESTEasy](http://resteasy.jboss.org/) - Fully certified and portable implementation of the JAX-RS specification.
* [RestExpress](https://github.com/RestExpress/RestExpress) - Thin wrapper on the JBOSS Netty HTTP stack to provide scaling and performance.
* [RestX](http://restx.io) - Framework based on annotation processing and compile-time source generation.
* [Retrofit](http://square.github.io/retrofit/) - Type-safe REST client.
* [Spark](http://sparkjava.com/) - Sinatra inspired framework.
* [Swagger](http://swagger.io/) - Swagger is a specification and complete framework implementation for describing, producing, consuming, and visualizing RESTful web services.

### 6. Integration frameworks
### 7. Web Crawling and HTML parsering

*Libraries that analyze the content of websites.*

* [Apache Nutch](http://nutch.apache.org/) - Highly extensible, highly scalable web crawler for production environment.
* [Crawler4j](https://github.com/yasserg/crawler4j) - Simple and lightweight web crawler.
* [JSoup](http://jsoup.org/) - Scrapes, parses, manipulates and cleans HTML.

### 8. Json

*Libraries that simplify JSON processing.*

* [Genson](http://owlike.github.io/genson/) - Powerful and easy to use Java to JSON conversion library.
* [Gson](https://github.com/google/gson) - Serializes objects to JSON and vice versa. Good performance with on-the-fly usage.
* [Jackson](http://wiki.fasterxml.com/JacksonHome) - Similar to GSON but has performance gains if you need to instantiate the library more often.
* [LoganSquare](https://github.com/bluelinelabs/LoganSquare) - JSON parsing and serializing library based on Jackson's streaming API. Outpeforms GSON & Jackson's library.

### 9. CSV

*Frameworks and libraries that simplify reading/writing CSV data.*

* [opencsv](http://opencsv.sourceforge.net) - Simple CSV parser with a commercial-friendly license.
* [Super CSV](http://super-csv.github.io/super-csv/) - Powerful CSV parser with support for Dozer, Joda-Time and Java 8.
* [uniVocity-parsers](https://github.com/uniVocity/univocity-parsers) - One of the fastest and most feature-complete CSV. Also comes with parsers for TSV and fixed width records.

### 10. Integratin with API
### 11. Bitcoin
### 12. Clouds

### 13. Cluster Management
*Frameworks which can dynamically manage applications inside of a cluster.*

* [Apache Aurora](http://aurora.apache.org/) - Apache Aurora is a Mesos framework for long-running services and cron jobs.
* [Singularity](http://getsingularity.com/) - Singularity is a Mesos framework that makes deployment and operations easy. It supports web services, background workers, scheduled jobs, and one-off tasks.
 
### 14. Document Processing (XLS, DOC and PDF)

*Libraries that assist with processing office document formats.*

* [Apache POI](http://poi.apache.org/) - Supports OOXML (XLSX, DOCX, PPTX) as well as OLE2 (XLS, DOC or PPT).
* [documents4j](http://documents4j.com) - API for document format conversion using third-party converters such as MS Word.
* [jOpenDocument](http://www.jopendocument.org/) - Processes the OpenDocument format.

#### PDF

*Everything that helps with the creation of PDF files.*

* [Apache FOP](http://xmlgraphics.apache.org/fop/) - Creates PDF from XSL-FO.
* [Apache PDFBox](http://pdfbox.apache.org/) - Toolbox for creating and manipulating PDF.
* [DynamicReports](http://dynamicreports.org/) - Simplifies JasperReports.
* [flyingsaucer](https://github.com/flyingsaucerproject/flyingsaucer) - XML/XHTML and CSS 2.1 renderer.
* [iText](http://itextpdf.com/) - Creates PDF files programmatically but requires a license for commercial purposes.
* [JasperReports](http://community.jaspersoft.com/project/jasperreports-library) - Complex reporting engine.

### 15. Native
*For working with platform-specific native libraries.*

* [JNA](https://github.com/java-native-access/jna) - Work with native libraries without writing JNI. Also provides interfaces to common system libraries.
* [JNR](https://github.com/jnr/jnr-ffi) - Work with native libraries without writing JNI. Also provides interfaces to common system libraries. Same goals as JNA, but faster, and serves as the basis for the upcoming [Project Panama](http://openjdk.java.net/projects/panama/).


## IV. Testing
### 1. Testing

*Tools that test from model to the view.*

* [Apache JMeter](http://jmeter.apache.org/) - Functional testing and performance measurements.
* [Arquillian](http://arquillian.org/) - Integration and functional testing platform for Java EE containers.
* [AssertJ](http://joel-costigliola.github.io/assertj/) - Fluent assertions that improve readability.
* [Awaitility](https://github.com/jayway/awaitility) - DSL for synchronizing asynchronous operations.
* [Citrus](http://citrusframework.org/) - Integration testing framework with focus on client- and serverside messaging.
* [Cucumber](https://github.com/cucumber/cucumber-jvm) - BDD testing framework.
* [Gatling](http://gatling.io/) - Load testing tool designed for ease of use, maintainability and high performance.
* [GreenMail](http://www.icegreen.com/greenmail/) - In-memory email server for integration testing. Supports SMTP, POP3 and IMAP including SSL.
* [Hamcrest](http://hamcrest.org/JavaHamcrest/) - Matchers that can be combined to create flexible expressions of intent.
* [JGiven](http://jgiven.org) - Developer-friendly BDD testing framework compatible with JUnit and TestNG.
* [JMockit](http://jmockit.org/) - Mocks static, final methods and more.
* [JUnit](http://junit.org/) - Common testing framework.
* [JUnitParams](https://pragmatists.github.io/JUnitParams/) - Creation of readable and maintainable parametrised tests.
* [Mockito](https://github.com/mockito/mockito) - Creation of test double objects in automated unit tests for the purpose of TDD or BDD.
* [Moco](https://github.com/dreamhead/moco) - Concise web services for stubs and mocks, Duke's Choice Award 2013.
* [PIT](http://pitest.org) - Fast mutation-testing framework for evaluating fault-detection abilities of existing JUnit or TestNG test-suites.
* [PowerMock](https://github.com/jayway/powermock) -  Enables mocking of static methods, constructors, final classes and methods, private methods and removal of static initializers.
* [REST Assured](https://github.com/jayway/rest-assured) - Java DSL for easy testing for REST/HTTP services.
* [Selenide](http://selenide.org/) - Concise API around Selenium to write stable and readable UI tests.
* [Selenium](http://docs.seleniumhq.org/) - Portable software testing framework for web applications.
* [Spock](http://docs.spockframework.org/) - JUnit-compatible framework featuring an expressive Groovy-derived specification language.
* [TestNG](http://testng.org/) - Testing framework.
* [Truth](https://github.com/google/truth) - Google's assertion and proposition framework.
* [Unitils](http://www.unitils.org/) - Modular testing library for unit and integration testing.
* [WireMock](http://wiremock.org/) - Stubbs and mocks web services.

### 2. Code Coverage

*Frameworks and tools that enable collection of code coverage metrics for test suites.*

* [JaCoCo](http://eclemma.org/jacoco/) - Framework that enables collection of code coverage metrics, using both offline and runtime bytecode instrumentation; prominently used by EclEmma, the Eclipse code-coverage plugin.
* [Clover](https://www.atlassian.com/software/clover/overview) - Proprietary code coverage tool by Atlassian that relies on source-code instrumentation, instead of bytecode instrumentation.
* [Cobertura](http://cobertura.github.io/cobertura) - Relies on offline (or static) bytecode instrumentation and class loading to collect code coverage metrics; GPLv2 licensed.
* [JCov](https://wiki.openjdk.java.net/display/CodeTools/jcov) - Code coverage tool used in the OpenJDK project's development toolchain.

### 3. Continuous Integration

*Tools which support continuously building, testing and releasing applications.*

* [Bamboo](https://www.atlassian.com/software/bamboo) - Atlassian's solution with good integration of their other products. You can either apply for an open-source license or buy it.
* [CircleCI](https://circleci.com/) - Hosted service with a free trial.
* [Codeship](https://codeship.com/features) - Hosted services with a limited free plan.
* [fabric8](http://fabric8.io/) - Integration platform for containers.
* [Go](https://www.thoughtworks.com/go/) - ThoughtWork's open-source solution.
* [Jenkins](http://jenkins-ci.org/) - Provides server-based deployment services.
* [TeamCity](http://www.jetbrains.com/teamcity/) - JetBrain's CI solution with a free version.
* [Travis](https://travis-ci.org) - Hosted service often used for open-source projects. 

### 4. Formal Verification

*Formal-methods tools: proof assistants, model checking, symbolic execution etc.*

* [CATG](https://github.com/ksen007/janala2) - Concolic unit testing engine. Automatically generates unit tests using formal methods.
* [Checker Framework](http://types.cs.washington.edu/checker-framework/) - Pluggable type systems. Includes nullness types, physical units, immutability types and more.
* [Daikon](http://plse.cs.washington.edu/daikon/) - Daikon detects likely program invariants and can generate JML specs based on those invariats.
* [Java Modeling Language (JML)](http://www.jmlspecs.org) - Behavioral interface specification language that can be used to specify the behavior of code modules. It combines the design by contract approach of Eiffel and the model-based specification approach of the Larch family of interface specification languages, with some elements of the refinement calculus. Used by several other verification tools.
* [Java Path Finder (JPF)](http://babelfish.arc.nasa.gov/trac/jpf) - JVM formal verification tool containing a model checker and more. Created by NASA.
* [jCUTE](https://github.com/osl/jcute) - Concolic unit testing engine that automatically generates unit tests. Concolic execution combines randomized concrete execution with symbolic execution and automatic constraint solving.
* [JMLOK 2.0](http://massoni.computacao.ufcg.edu.br/home/jmlok) - Detects nonconformances between code and JML specification through the feedback-directed random tests generation, and suggests a likely cause for each nonconformance detected.
* [KeY](http://key-project.org/) - The KeY System is a formal software development tool that aims to integrate design, implementation, formal specification, and formal verification of object-oriented software as seamlessly as possible. Uses JML for specification and symbolic execution for verification.
* [OpenJML](http://openjml.github.io/) - Translates JML specifications into SMT-LIB format and passes the proof problems implied by the program to backend solvers.

## V. Tools for developing
### 1. IDE

*Integrated development environments that try to simplify several aspects of development.*

* [Eclipse](http://www.eclipse.org/) - Established, open-souce project with support for lots of plugins and languages.
* [IntelliJ IDEA](http://www.jetbrains.com/idea/) - Supports a lot of JVM languages and provides good options for Android development. The commercial edition targets the enterprise sector.
* [NetBeans](https://netbeans.org/) - Provides integration for several Java SE and EE features from database access to HTML5.

### 2. Deploy, config and build
#### Build

*Tools which handle the build cycle and dependencies of an application.*

* [Apache Maven](http://maven.apache.org/) - Declarative build and dependency management which favors convention over configuration. It might be preferable to Apache Ant which uses a rather procedural approach and can be difficult to maintain.
* [Bazel](http://bazel.io) - Build tool from Google that builds code quickly and reliably.
* [Gradle](http://gradle.org/) - Incremental builds which are programmed via Groovy instead of declaring XML. Works well with Maven's dependency management.

#### Configuration

*Libraries that provide external configuration.*

* [config](https://github.com/typesafehub/config) - Configuration library for JVM languages.
* [owner](https://github.com/lviggiano/owner) - Reduces boilerplate of properties.

#### Distribution

*Tools which handle the distribution of applications in native formats.*

* [Bintray](https://bintray.com/) - Version control for binaries which handles the publishing. Can also be used with Maven or Gradle and has a free plan for open-source software or several business plans.
* [Capsule](http://www.capsule.io/) - Simple and powerful packaging and deployment. A fat JAR on steroids or a "Docker for Java" that supports JVM-optimized containers.
* [Central Repository](http://search.maven.org/) - Largest binary component repository available as a free service to the open-source community. Default used by Apache Maven and available in all other build tools.
* [IzPack](http://izpack.org/) - Setup authoring tool for cross-platform deployments.
* [JitPack](https://jitpack.io/) - Easy to use package repository for GitHub. Builds Maven/Gradle projects on demand and publishes ready-to-use packages.
* [Launch4j](http://launch4j.sourceforge.net/) - Wraps JARs in lightweight and native Windows executables.
* [Nexus](http://www.sonatype.com/nexus) - Binary management with proxy and caching capabilities.
* [packr](https://github.com/libgdx/packr/) - Packs JARs, assets and the JVM for native distribution on Windows, Linux and Mac OS X.

### 3. Perfomance tools

#### Performance analysis

*Tools for performance analysis, profiling and benchmarking.*

* [jHiccup](https://github.com/giltene/jHiccup) - Logs and records platform JVM stalls.
* [JMH](http://openjdk.java.net/projects/code-tools/jmh/) - Microbenchmarking tool for the JVM.
* [JProfiler](https://www.ej-technologies.com/products/jprofiler/overview.html) - Commercial profiler.
* [LatencyUtils](https://github.com/LatencyUtils/LatencyUtils) - Utilities for latency measurement and reporting.
* [VisualVM](http://visualvm.java.net/) - Visual interface for detailed information about running applications.
* [YourKit Java Profiler](https://www.yourkit.com/features/) - Commercial profiler.

### 4. Code Analysis

*Tools that provide metrics and quality measurements.*
* [Checkstyle](https://github.com/checkstyle/checkstyle) - Static analysis of coding conventions and standards.
* [Error Prone](https://github.com/google/error-prone) - Catches common programming mistakes as compile-time errors.
* [FindBugs](http://findbugs.sourceforge.net/) - Static analysis of bytecode to find potential bugs.
* [jQAssistant](http://jqassistant.org/) - Static code analysis with Neo4J-based query language.
* [PMD](https://github.com/pmd/pmd) - Source code analysis for finding bad coding practices.
* [SonarQube](http://www.sonarqube.org/) - Integrates other analysis components via plugins and provides an overview of the metrics over time.

### 5. Monitoring

*Tools that monitor applications in production.*

* [AppDynamics](http://www.appdynamics.com/) - Commercial performance monitor.
* [JavaMelody](https://github.com/javamelody/javamelody) - Performance monitoring and profiling.
* [jmxtrans](https://github.com/jmxtrans/jmxtrans/) - Tool to connect to multiple JVMs and to query them for their attributes via JMX. Its query language is based on JSON, which allows non-Java programmers to access the JVMs attributes. Likewise, this tool supports different output writes, including Graphite, Ganglia, StatsD, among others.
* [Kamon](http://www.kamon.io/) - Tool for monitoring applications running on the JVM.
* [New Relic](http://newrelic.com/) - Commercial performance monitor.
* [SPM](https://sematext.com/spm/) - Commercial performance monitor with distributing transaction tracing for JVM apps.
* [Takipi](https://www.takipi.com/) - Commercial in-production error monitoring and debugging.

### 6. Other

#### JVM and JDK

*Current implementations of the JVM/JDK.*

* [JDK 9](https://jdk9.java.net/) - Early access releases of JDK 9.
* [OpenJDK](http://openjdk.java.net/) - Open-source implementation for Linux.
* [Zulu OpenJDK](http://www.azul.com/downloads/zulu/) - OpenJDK builds for Windows, Linux, and Mac OS X through Java 8.
* [Zulu OpenJDK 9](http://zulu.org/zulu-9-pre-release-downloads/) - Early access OpenJDK 9 builds for Windows, Linux, and Mac OS X.

## VI. Program languages and applications, that was written with Java
### 1. Program languages, that was written with Java
### 2. Other program languages tools, that was written with Java
### 3. Javascript

### 4. Frameworks that help to create parsers, interpreters or compilers
* Frameworks that help to create parsers, interpreters or compilers.*

* [ANTLR](http://www.antlr.org/) - Complex full-featured framework for top-down parsing.
* [JavaCC](https://javacc.java.net/) - More specific and slightly easier to learn. Has syntactic lookahead.


### 5. Applications, that was written with Java
### 6. Games, that was written with Java
    
## VII. Other
### 1. Source code examples

 * [Design Patterns](https://github.com/iluwatar/java-design-patterns) - Implementation and explanation of the most common design patterns.
 * [Modern Java - A Guide to Java 8](https://github.com/winterbe/java8-tutorial) - Popular Java 8 guide.

### 2. Benchmark results
### 3. Working with git and github
### 4. Ancients
*In existence since the beginning of time and which will continue being used long after the hype has waned.*

* [Apache Ant](http://ant.apache.org/) - Build process management with XML.
* [cglib](https://github.com/cglib/cglib) - Bytecode generation library.
* [GlassFish](https://glassfish.java.net/) - Application server and reference implementation for Java EE sponsored by Oracle.
* [Hudson](http://hudson-ci.org/) - Continuous integration server still in active development.
* [JavaServer Faces](https://javaserverfaces.java.net/) - Oracle's open-source implementation of the JSF standard, Mojarra.
* [JavaServer Pages](https://jsp.java.net/) - Common templating for websites with custom tag libraries.






## Miscellaneous

*Everything else.*

* [Jimfs](https://github.com/google/jimfs) - In-memory file system.
* [Lanterna](https://code.google.com/p/lanterna/) - Easy console text GUI library similar to curses.
* [LightAdmin](http://lightadmin.org/) - Pluggable CRUD UI library for rapid application development.


## VIII. Resources

### 1. Communities

*Active discussions.*

* [r/java](https://www.reddit.com/r/java) - Subreddit for the Java community.
* [stackoverflow](http://stackoverflow.com/questions/tagged/java) - Question/answer platform.
* [vJUG](http://virtualjug.com/) - Virtual Java User Group.

### 2. Influential Books

*Books that had a high impact and are still worth reading.*

* [Effective Java (2nd Edition)](http://www.amazon.com/Effective-Java-Edition-Joshua-Bloch/dp/0321356683)
* [Java 8 in Action](http://www.amazon.com/Java-Action-Lambdas-functional-style-programming/dp/1617291994/)
* [Java Concurrency in Practice](http://www.amazon.com/Java-Concurrency-Practice-Brian-Goetz/dp/0321349601)
* [Thinking in Java](http://www.amazon.com/Thinking-Java-Edition-Bruce-Eckel/dp/0131872486)


### 3. Websites

*Sites to read.*

* [Android Arsenal](https://android-arsenal.com)
* [Google Java Style](http://google-styleguide.googlecode.com/svn/trunk/javaguide.html)
* [InfoQ](http://www.infoq.com/)
* [Java, SQL, and jOOQ](http://blog.jooq.org/)
* [Java.net](https://home.java.net/)
* [Javalobby](https://dzone.com/java-jdk-development-tutorials-tools-news)
* [JavaWorld](http://www.javaworld.com/)
* [JAXenter](https://jaxenter.com/)
* [RebelLabs](http://zeroturnaround.com/rebellabs/)
* [The Java Specialist' Newsletter](http://www.javaspecialists.eu/archive/archive.jsp)
* [The Takipi Blog](http://blog.takipi.com/)
* [TheServerSide.com](http://www.theserverside.com/)
* [Thoughts On Java](http://www.thoughts-on-java.org/)
* [Vanilla Java](http://vanillajava.blogspot.ch/)
* [Vlad Mihalcea on Hibernate](http://vladmihalcea.com/)
* [Voxxed](https://www.voxxed.com/)
