# Useful Java links 
It's fork of [awesome link](https://github.com/akullpp/awesome-java) with new structure and a lot of new links

# Useful java links

- [I. Development](#i-development)
    - [1. Common frameworks and libraries](#1-common-frameworks-and-libraries)
    - [2. Web Frameworks](#2-web-frameworks)
    - [3. GUI](#3-gui)
    - [4. Business](#4-business)
    - [5. Game Development](#5-game-development)
    - [6. Usefull libraries](#6-usefull-libraries)
        - [Collections](#collections)
        - [Date and Time](#date-and-time)
        - [Dependency Injection and AOP](#dependency-injection-and-aop-frameworks)
        - [Console and Command line](#console-and-command-line)
        - [Functional Programming](#functional-programming)
        - [Reactive Programming](#reactive-programming)
        - [Security and Authentication](#security-and-authentication)
        - [High Performance](#high-performance)
        - [Serialization and I/O](#serialization-and-io)
        - [Logging](#logging)
        - [Bean Mapping](#bean-mapping)
    - [7. Imagery and Video](#7-imagery-and-video)
    - [8. Code generation and changing byte code](#8-code-generation-and-changing-byte-code)
    - [9. Distributed Applications](#9-distributed-applications)
    - [10. Science](#10-science)   
    
- [II. Databases, search engines, big data and machine learning](#ii-databases-search-engines-big-data-and-machine-learning)
    - [1. Databases and storages](#1-databases-and-storages)
          - [Distributed Databases](#distributed-databases)
    - [2. Data structures](#2-data-structures)     
    - [3. Search engines](#3-search-engines)     
    - [4. Client and drivers for databases](#4-client-and-drivers-for-databases)
    - [5. ORM](#5-orm)
    - [6. Working with messy data](#6-working-with-messy-data)
    - [7. Big data](#7-big-data)
    - [8. Machine Learning](#8-machine-learning)
          - [Constraint Satisfaction Problem Solver](#constraint-satisfaction-problem-solver)
    - [9. Natural Language Processing (NLP)](#9-natural-language-processing-nlp)
    
- [III. Network and Integration](#iii-network-and-integration)
    - [1. Servers (Web Server and Application Server))](#1-servers-web-server-and-application-server)
    - [2. Networking](#2-networking)
    - [3. Message, message broker and message queue](#3-message-message-broker-and-message-queue)
    - [4. Http and ssh](#4-http-and-ssh)
    - [5. Rest Frameworks](#5-rest-frameworks)
    - [6. Integration frameworks](#6-integration-frameworks)
    - [7. Web Crawling and HTML parsering](7-web-crawling-and-html-parsering)
    - [8. Json](#8--json)
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
         - [Build](#build)
         - [Configuration](#configuration)
         - [Distribution](#distribution)
    - [3. Perfomance tools](#3-perfomance-tools)
    - [4. Code Analysis](#4-code-analysis)
    - [5. Monitoring](#5-monitoring)
    - [6. Redefinition of classes at runtime](#)
    - [7. Other](#7-Прочее)

- [VI. Program languages and applications, that was written with Java](#vi-program-languages-and-applications-that-was-written-with-java)
    - [1. Program languages, that was written with Java](#1--program-languages-that-was-written-with-java)
    - [2. Other program languages tools, that was written with Java](#2-other-program-languages-tools-that-was-written-with-java)
    - [3. Javascript](#3-javascript)
    - [4. Frameworks that help to create parsers, interpreters or compilers](#4-frameworks-that-help-to-create-parsers-interpreters-or-compilers)
    - [5. Applications, that was written with Java](#5-applications-that-was-written-with-java)
    - [6. Games, that was written with Java](#6-games-that-was-written-with-java)
    
- [VII. Other](#vii-other)
    - [1. Source code examples](#1-source-code-examples)
    - [2. Benchmark results](#2-benchmark-results)
    - [3. Working with git and github](#3-working-with-git-and-github)

- [VIII. Resources](#viii-resources)
    - [1. Communities](#1-communities)
    - [2. Influential Books](#2-influential-books)
    - [3. Websites](#3-websites)
    
## I. Development

### 1. Common frameworks and libraries
[Up](#useful-java-links)

1.  [Spring framework](https://github.com/spring-projects/spring-framework) The Spring Framework provides a comprehensive programming and configuration model for modern Java-based enterprise applications -- on any kind of deployment platform. A key element of Spring is infrastructural support at the application level: Spring focuses on the "plumbing" of enterprise applications so that teams can focus on application-level business logic, without unnecessary ties to specific deployment environments. License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0) , github's star - 5921, на stackoverflow - more [100 000 questions](http://stackoverflow.com/questions/tagged/spring). ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
2.  [Google Guava](https://github.com/google/guava) The Guava project contains several of Google's core libraries that we rely on in our Java-based projects: collections, caching, primitives support, concurrency libraries, common annotations, string processing, I/O, and so forth.Requires JDK 1.6 or higher (as of 12.0). License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0) , github's star - 3813. ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
3.  [Apache Commons](http://commons.apache.org/) - Apache Commons is an Apache project focused on all aspects of reusable Java components.Commons Proper is dedicated to one principal goal: creating and maintaining reusable Java components. License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0)![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
4.  [Spring Boot](https://github.com/spring-projects/spring-boot) — Spring Boot makes it easy to create Spring-powered, production-grade applications and services with absolute minimum fuss. It takes an opinionated view of the Spring platform so that new and existing users can quickly get to the bits they need. License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0) , github's star - 2386. ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
5.  [Lombok](https://github.com/rzwitserloot/lombok) Very spicy additions to the Java programming language. Project Lombok makes java a spicier language by adding 'handlers' that know how to build and compile simple, boilerplate-free, not-quite-java code. License: [MIT](https://opensource.org/licenses/MIT) , github's star - 1540. ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
6.  [Puniverse Quasar](https://github.com/puniverse/quasar) Fibers, Channels and Actors for the JVM. License: Eclipse Public v1.0/[GNU Lesser 3](https://en.wikipedia.org/wiki/GNU_Lesser_General_Public_License), github's star - 1091. ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
7.  [Cucumber jvm](https://github.com/cucumber/cucumber-jvm) Cucumber-JVM is a pure Java implementation of Cucumber that supports the most popular programming languages for the JVM. License: [MIT](https://opensource.org/licenses/MIT) , github's star - 1047. ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
8.  [Rootbeer GPU Compiler](https://github.com/pcpratts/rootbeer1)The Rootbeer GPU Compiler lets you use GPUs from within Java. License: [MIT](https://opensource.org/licenses/MIT) , github's star - 972. ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
9.  [Oblac Jodd](https://github.com/oblac/jodd) Jodd is set of open-source Java micro frameworks and tools; floppy size! Jodd = tools + ioc + mvc + db + aop + tx + json + html < 1.5 Mb. License: [BSD 2](https://en.wikipedia.org/wiki/BSD_licenses#2-clause_license_.28.22Simplified_BSD_License.22_or_.22FreeBSD_License.22.29), github's star - 912. ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
10.  [Google Jimfs](https://github.com/google/jimfs) An in-memory file system for Java 7+. License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0) , github's star - 752. ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
11.  [Spring batch](https://github.com/spring-projects/spring-batch) Spring Batch is a framework for writing offline and batch applications using Spring and Java. License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0) , github's star - 448. ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
12.  [Greenrobot common](https://github.com/greenrobot/greenrobot-common) General purpose utilities and hash functions for Android and Java (aka java-common). License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0) , github's star - 419. ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
13.  [Kilim](https://github.com/kilim/kilim) Lightweight threads for Java, with message passing, nio, http and scheduling support. License: [MIT](https://opensource.org/licenses/MIT) , github's star - 517. ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)



### 2. Web Frameworks
[Up](#useful-java-links)

1.  [Play Framework](https://github.com/playframework/playframework) The Play Framework combines productivity and performance making it easy to build scalable web applications with Java and Scala. https://www.playframework.com/ . License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0) , github's star - 6771. ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
2.  [Spark](https://github.com/perwendel/spark) Spark - a Sinatra inspired web framework. License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0) , github's star - 2596. ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
3.  [Atmosphere](https://github.com/Atmosphere/atmosphere) - Realtime Client Server Framework for the JVM, supporting WebSockets with Cross-Browser Fallbacks. License: CDDL1 / [Apache 2](http://www.apache.org/licenses/LICENSE-2.0) , github's star - 2235. ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
4.  [Tobie ua-parser](https://github.com/tobie/ua-parser) A multi-language port of Browserscope's user agent parser. License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0)/[MIT](https://opensource.org/licenses/MIT)/Perl, github's star - 1497. ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
5.  [Grails](https://github.com/grails/grails-core) - Grails is a framework used to build web applications with the Groovy programming language. The core framework is very extensible and there are numerous plugins available that provide easy integration of add-on features. https://grails.org/ License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0) , github's star - 1386. ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
6.  [Ghost Driver](https://github.com/detro/ghostdriver) Ghost Driver is an implementation of the Remote WebDriver Wire protocol, using PhantomJS as back-end. License: [BSD 2](https://en.wikipedia.org/wiki/BSD_licenses#2-clause_license_.28.22Simplified_BSD_License.22_or_.22FreeBSD_License.22.29), github's star - 1179. ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
7.  [Ninja](https://github.com/ninjaframework/ninja) Ninja is a full stack web framework for Java. Rock solid, fast and super productive. .http://www.ninjaframework.org. License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0) , github's star - 894. ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
8.  [Electronicarts Orbit](https://github.com/electronicarts/orbit) — Orbit - Virtual actor framework for building distributed systems. License: [BSD 3](https://en.wikipedia.org/wiki/BSD_licenses#3-clause_license_.28.22Revised_BSD_License.22.2C_.22New_BSD_License.22.2C_or_.22Modified_BSD_License.22.29), github's star - 741. ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
9.  [Mustache.java](https://github.com/spullara/mustache.java) - Implementation of mustache.js (web application templating system) for Java. License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0) , github's star - 733. ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
10.  [Ratpack](https://github.com/ratpack/ratpack) Ratpack is a simple, capable, toolkit for creating high performance web applications. Ratpack is built on Java and the Netty event-driven networking engine. The API is optimized for Groovy and Java 8.. http://ratpack.io/ License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0) , github's star - 662. ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
11.  [B3log Solo](https://github.com/b3log/solo) - A blogging system written in Java, feel free to create your or your team own blog. License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0) , github's star - 519. ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
12.  [Baasbox](https://github.com/baasbox/baasbox) BaasBox is an Open Source project that aims to provide a backend for mobile and web apps. License: ?, github's star - 499.
13.  [Kolorobot Spring MVC 4 Quickstart Maven Archetype](https://github.com/kolorobot/spring-mvc-quickstart-archetype) — The project is a Maven archetype for Spring MVC 4 web application. License: ?, github's star - 480.
14.  [Gargl](https://github.com/jodoglevy/gargl) - Record web requests as they happen and turn them into reusable code in any programming language. Gargl - Generic API Recorder and Generator Lite. Pronounced "Gargle." Automate any website. Record web requests as they happen and turn them into reusable code in any programming language. License: [MIT](https://opensource.org/licenses/MIT) , github's star - 462. ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
15.  [Handlebars.java](https://github.com/jknack/handlebars.java) Logic-less and semantic Mustache templates with Java. License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0) , github's star - 451. ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
16.  [Liferay plugins](https://github.com/liferay/liferay-plugins) - The liferay-plugins repository is part of the Liferay Portal project. Liferay Portal is an open source enterprise web platform for building business solutions that deliver immediate results and long-term value.  License: [GNU Lesser 2.1](https://en.wikipedia.org/wiki/GNU_Lesser_General_Public_License), github's star - 444. ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
17.  [Netflix Ribbon](https://github.com/Netflix/ribbon) Ribbon is a Inter Process Communication (remote procedure calls) library with built in software load balancers. The primary usage model involves REST calls with various serialization scheme support. License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0) , github's star - 410. ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
18.  [Gwt bootstrap](https://github.com/gwtbootstrap/gwt-bootstrap) A GWT Library that provides the widgets of Bootstrap, from Twitter. License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0) , github's star - 409. ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
19.  [Netflix Zuul](https://github.com/Netflix/zuul) Zuul is an edge service that provides dynamic routing, monitoring, resiliency, security, and more. License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0) , github's star - 407. ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
20.  [Vaadin](https://github.com/vaadin/vaadin) — Vaadin is a Java framework for building modern web applications that look great, perform well and make you and your users happy.https://vaadin.com/ License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0) , github's star - 398. ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
21.  [ZK framework](https://github.com/zkoss/zk)  ZK is a highly productive Java framework for building amazing enterprise web and mobile applications. License: [GNU Lesser](https://en.wikipedia.org/wiki/GNU_Lesser_General_Public_License), github's star - 161. ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
22. [Apache Tapestry](http://tapestry.apache.org/) - A component-oriented framework for creating highly scalable web applications in Java. License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0). ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
23. [Apache Wicket](http://wicket.apache.org/) - К Open Source Java web framework that powers thousands of web applications and web sites for governments, stores, universities, cities, banks, email providers, and more. License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0). ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
24. [Google Web Toolkit](http://www.gwtproject.org/) - GWT is used by many products at Google, including Google AdWords and Google Wallet. It's open source, completely free, and used by thousands of enthusiastic developers around the world. License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0). ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
25. [Pippo](http://www.pippo.ro/) - It's an open source micro web framework in Java, with minimal dependencies and a quick learning curve.The goal of this project is to create a micro web framework in Java that should be easy to use and hack.
Pippo can be used in small and medium applications and also in applications based on micro services architecture. License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0). ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
26. [PrimeFaces](http://primefaces.org/) - PrimeUI is a pure CSS-JS library designed to work with any server side and client side technology featuring 50+ jQuery Widgets, Web Components, Premium Layouts-Themes and more. PrimeUI is an offspring project of the mighty PrimeFaces. License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0). ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
27. [Spring Boot](http://projects.spring.io/spring-boot/) - Spring Boot makes it easy to create Spring-powered, production-grade applications and services with absolute minimum fuss. It takes an opinionated view of the Spring platform so that new and existing users can quickly get to the bits they need. License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0). ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
28. [Spring MVC](http://projects.spring.io/spring-framework/) - Spring MVC web application and RESTful web service framework. License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0). ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
29.  [CSSEmbed](https://github.com/nzakas/cssembed) A tool for embedding data URIs in CSS files. License: [MIT](https://opensource.org/licenses/MIT) , github's star - 407. ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
30.  [Athou commafeed](https://github.com/Athou/commafeed) Google Reader inspired self-hosted RSS reader. License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0) , github's star - 1226. ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
31. [JavaServer Faces](https://javaserverfaces.java.net/) - JavaServer™ Faces technology simplifies building user interfaces for JavaServer applications. License: [GNU 2](https://en.wikipedia.org/wiki/GNU_General_Public_License) или [CDDL 1.0](http://opensource.org/licenses/CDDL-1.0) ![impossible proprietary code linking license](https://github.com/Vedenin/useful-java-links/blob/master/img/impossible-proprietary-code-linking.png?raw=true)
32. [JavaServer Pages](https://jsp.java.net/) - This project provides a container independent implementation of JSP 2.1. License: [GNU 2](https://en.wikipedia.org/wiki/GNU_General_Public_License) или [CDDL 1.0](http://opensource.org/licenses/CDDL-1.0) ![impossible proprietary code linking license](https://github.com/Vedenin/useful-java-links/blob/master/img/impossible-proprietary-code-linking.png?raw=true)

#### Template Engine

1. [Apache Velocity](http://velocity.apache.org/) - Velocity is a project of the Apache Software Foundation, charged with the creation and maintenance of open-source software related to the Apache Velocity Engine (templating engine). License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0). ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
2. [Apache FreeMarker](http://freemarker.incubator.apache.org/) - Apache FreeMarker is a template engine: a Java library to generate text output (HTML web pages, e-mails, configuration files, source code, etc.) based on templates and changing data. License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0). ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
3. [Handlebars.java](http://jknack.github.io/handlebars.java/) - Logic-less and semantic templates with Java. License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0). ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
4. [Thymeleaf](http://www.thymeleaf.org/) -  It is a template engine capable of processing and generating HTML, XML, JavaScript, CSS and text, and can work both in web and non-web environments. It is better suited for serving the view layer of web applications, but it can process files in many formats, even in offline environments. License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0). ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)

### 3. GUI

1. [JavaFX](http://www.oracle.com/technetwork/java/javase/overview/javafx-overview-2158620.html) - JavaFX is the next step in the evolution of Java as a rich client platform. It is designed to provide a lightweight, hardware-accelerated Java UI platform for enterprise business applications.  License: [Oracle, proprietary](http://www.oracle.com/technetwork/java/javase/terms/license/index.html). ![proprietary license](https://github.com/Vedenin/useful-java-links/blob/master/img/proprietary-license.png?raw=true)
2. [Scene Builder](http://www.oracle.com/technetwork/java/javase/downloads/javafxscenebuilder-info-2157684.html) - JavaFX Scene Builder is a visual layout tool that lets users quickly design JavaFX application user interfaces, without coding. Users can drag and drop UI components to a work area, modify their properties, apply style sheets, and the FXML code for the layout that they are creating is automatically generated in the background. The result is an FXML file that can then be combined with a Java project by binding the UI to the application’s logic.  License: [Oracle, proprietary](http://www.oracle.com/technetwork/java/javase/terms/license/index.html). ![proprietary license](https://github.com/Vedenin/useful-java-links/blob/master/img/proprietary-license.png?raw=true)
3. [SWT](http://www.eclipse.org/swt/) -SWT is an open source widget toolkit for Java designed to provide efficient, portable access to the user-interface facilities of the operating systems on which it is implemented. License: [Eclipse Public License v1.0](https://en.wikipedia.org/wiki/Eclipse_Public_License). ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
4. [Lanterna](https://code.google.com/p/lanterna/) - Lanterna is a Java library allowing you to write easy semi-graphical user interfaces in a text-only environment, very similar to the C library curses but with more functionality.  License: [LGPL 2.1](https://en.wikipedia.org/wiki/GNU_Lesser_General_Public_License). ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
5. [Gephi](https://github.com/gephi/gephi/) - Gephi is an award-winning open-source platform for visualizing and manipulating large graphs. It runs on Windows, Mac OS X and Linux. Localization is available in French, Spanish, Japanese, Russian, Brazilian Portuguese, Chinese and Czech. License: [GNU 3](https://en.wikipedia.org/wiki/GNU_General_Public_License) или [CDDL 1.0](http://opensource.org/licenses/CDDL-1.0)![impossible proprietary code linking license](https://github.com/Vedenin/useful-java-links/blob/master/img/impossible-proprietary-code-linking.png?raw=true)

### 4. Business
[Up](#useful-java-links)

1.  [Codecademy EventHub](https://github.com/Codecademy/EventHub) — An open source event analytics platform. License: [MIT](https://opensource.org/licenses/MIT) , github's star - 1043. ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
2.  [Killbill](https://github.com/killbill/killbill) - Open-Source Subscription Billing & Payment Platform . License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0) , github's star - 902. ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
3.  [Activiti](https://github.com/Activiti/Activiti) Activiti is a light-weight workflow and Business Process Management (BPM) Platform targeted at business people, developers and system admins. Its core is a super-fast and rock-solid BPMN 2 process engine for Java. License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0) , github's star - 861. ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
4.  [Liferay Portal](https://github.com/liferay/liferay-portal) Liferay Portal is an open source enterprise web platform for building business solutions that deliver immediate results and long-term value. Liferay Portal started out as a personal development project in 2000 and was open sourced in 2001. License: [GNU Lesser 2.1](https://en.wikipedia.org/wiki/GNU_Lesser_General_Public_License), github's star - 739. ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
5.  [Broadleaf Commerce](https://github.com/BroadleafCommerce/BroadleafCommerce) - Broadleaf Commerce - Enterprise eCommerce framework based on Spring. License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0) , github's star - 518. ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
6.  [Droolsjbpm Drools](https://github.com/droolsjbpm/drools) Drools Expert is the rule engine and Drools Fusion does complex event processing (CEP). License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0) , github's star - 421. ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
7.  [Spring Roo](https://github.com/spring-projects/spring-roo) — Spring Roo is a next-generation rapid application development tool for Java developers. It focuses on higher productivity, stock-standard Java APIs, high usability, avoiding engineering trade-offs and facilitating easy Roo removal. License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0) , github's star - 399. ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)

### 5. Game Development
[Up](#useful-java-links)

1.  [libgdx](https://github.com/libgdx/libgdx) Desktop/Android/HTML5/iOS Java game development framework. License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0) , github's star - 6579. ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
2.  [Disunity](https://github.com/ata4/disunity) An experimental toolset for Unity asset and asset bundle files. License: [unlicense.org](http://unlicense.org), github's star - 828.
 ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
3.  [LibGDX/LWJGL](https://github.com/mattdesl/lwjgl-basics) LibGDX/LWJGL tutorials and examples. License: ?, github's star - 656.
4.  [jMonkeyEngine](https://github.com/jMonkeyEngine/jmonkeyengine) A complete 3D game development suite written purely in Java.. http://jmonkeyengine.org License: [BSD 3](https://en.wikipedia.org/wiki/BSD_licenses#3-clause_license_.28.22Revised_BSD_License.22.2C_.22New_BSD_License.22.2C_or_.22Modified_BSD_License.22.29), github's star - 624. ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
5.  [Jetserver](https://github.com/menacher/java-game-server) Jetserver is a high speed nio socket based multiplayer java game server written using Netty and Mike Rettig's Jetlang.It is specifically tuned for network based multiplayer games and supports TCP and UDP network protocols. License: [MIT](https://opensource.org/licenses/MIT) , github's star - 484. ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
6.  [LWJGL 2.X](https://github.com/LWJGL/lwjgl) LWJGL 2.X - The Lightweight Java Game Library. http://www.lwjgl.org/ License: [BSD 3](https://en.wikipedia.org/wiki/BSD_licenses#3-clause_license_.28.22Revised_BSD_License.22.2C_.22New_BSD_License.22.2C_or_.22Modified_BSD_License.22.29), github's star - 394. ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)

### 6. Usefull libraries
[Up](#useful-java-links)

#### Collections
1.  [Google Guava](https://github.com/google/guava) The Guava project contains several of Google's core libraries that we rely on in our Java-based projects: collections, caching, primitives support, concurrency libraries, common annotations, string processing, I/O, and so forth.Requires JDK 1.6 or higher (as of 12.0). License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0) , github's star - 3813. ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
2.  [Apache Commons Collections](http://commons.apache.org/proper/commons-collections/) - Commons-Collections seek to build upon the JDK classes by providing new interfaces, implementations and utilities. License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0)![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
4.  [Gs collections](https://github.com/goldmansachs/gs-collections) A supplement or replacement for the Java Collections Framework. License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0) , github's star - 1201. ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
5.  [Eclipse Collections](https://projects.eclipse.org/proposals/eclipse-collections) Eclipse Collections is a collections framework for Java. It has JDK-compatible List, Set and Map implementations with a rich API, additional types not found in the JDK like Bags, Multimaps and set of utility classes that work with any JDK compatible Collections, Arrays, Maps or Strings. The iteration protocol was inspired by the Smalltalk collection framework.Eclipse Collections started off as an open source project on GitHub called GS Collections.  GS Collections has been presented at the JVM Language Summit in 2012 and JavaOne in 2014. License: Лицензия: [Eclipse Public 1.0](https://www.eclipse.org/legal/epl-v10.html). , github's star - 1201. ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
6. [javatuples](http://www.javatuples.org/) - javatuples is one of the simplest java libraries ever made. Its aim is to provide a set of java classes that allow you to work with tuples.A tuple is just a sequence of objects that do not necessarily relate to each other in any way. For example: [23, "Saturn", java.sql.Connection@li734s] can be considered a tuple of three elements (a triplet) containing an Integer, a String, and a JDBC Connection object. License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0)![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
7. [Immutables](http://immutables.github.io/) - Java annotation processors to generate simple, safe and consistent value objects. Do not repeat yourself, try Immutables, the most comprehensive tool in this field. License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0)![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
8.  [OpenHFT Chronicle Queue](https://github.com/OpenHFT/Chronicle-Queue) Micro second messaging that stores everything to disk. License: [GNU Lesser 3](https://en.wikipedia.org/wiki/GNU_Lesser_General_Public_License).0, github's star - 440. ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
9. [fastutil](http://fastutil.di.unimi.it/) - fastutil extends the Java™ Collections Framework by providing type-specific maps, sets, lists and queues with a small memory footprint and fast access and insertion; provides also big (64-bit) arrays, sets and lists, and fast, practical I/O classes for binary and text files. It requires Java 7 or newer. License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0). ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
10. [HPPC](http://labs.carrotsearch.com/hppc.html) - HPPC provides template-generated implementations of typical collections, such as lists, sets and maps, for all Java primitive types. The primary driving force behind HPPC is optimization for highest performance and memory efficiency. License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0). ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
11. [Koloboke](https://github.com/OpenHFT/Koloboke) - Java Collections till the last breadcrumb of memory and performance . This library is a carefully designed and efficient extension of the Java Collections Framework with primitive specializations and more. Java 6+. License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0). ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
12. [Trove](http://trove.starlight-systems.com/) - The Trove library provides high speed regular and primitive collections for Java.  License: [GNU Lesser 2.1](https://en.wikipedia.org/wiki/GNU_Lesser_General_Public_License). ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)

#### Date and Time

1. [Almanac Converter](https://github.com/hypotemoose/almanac-converter) - An easy-to-use Java-based calendar converter - able to convert between various known calendars. License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0)![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
2. [Joda-Time](http://www.joda.org/joda-time/) - Joda-Time provides a quality replacement for the Java date and time classes. License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0), github's star - 1442. ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
3. [ThreeTenBP](https://github.com/ThreeTen/threetenbp) - Backport of functionality based on JSR-310 to Java SE 6 and 7. This is NOT an implementation of JSR-310. License: [BSD 3](https://en.wikipedia.org/wiki/BSD_licenses#3-clause_license_.28.22Revised_BSD_License.22.2C_.22New_BSD_License.22.2C_or_.22Modified_BSD_License.22.29)![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
4. [Time4J](https://github.com/MenoData/Time4J) - Advanced date, time and interval library for Java. License: [GNU Lesser 2.1](https://en.wikipedia.org/wiki/GNU_Lesser_General_Public_License)![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
5.  [Ocpsoft Prettytime](https://github.com/ocpsoft/prettytime) Social Style Date and Time Formatting for Java.PrettyTime is an OpenSource time formatting library. Completely customizable, it creates human readable, relative timestamps like those seen on Digg, Twitter, and Facebook. Get started “right now!” and in over 30 languages! License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0) , github's star - 394. ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)

#### Dependency Injection and AOP frameworks

1.  [Spring Framework](https://github.com/spring-projects/spring-framework) The Spring Framework provides a comprehensive programming and configuration model for modern Java-based enterprise applications -- on any kind of deployment platform. A key element of Spring is infrastructural support at the application level: Spring focuses on the "plumbing" of enterprise applications so that teams can focus on application-level business logic, without unnecessary ties to specific deployment environments. License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0) , github's star - 5921. ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
2.  [Dagger и Dagger2](https://github.com/square/dagger) A fast dependency injector for Android and Java. License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0) , github's star - 3607, на stackoverflow - [800 вопросов](http://stackoverflow.com/questions/tagged/dagger). ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true) 
3. [Google Guice](https://github.com/google/guice) -  Guice (pronounced 'juice') is a lightweight dependency injection framework for Java 6 and above, brought to you by Google. License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0), github's star - 1881. ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
4. [Apache DeltaSpike](https://deltaspike.apache.org/) - DeltaSpike consists of a number of portable CDI extensions that provide useful features for Java application developers. We will also ensure true portability! We are testing DeltaSpike on different CDI implementations like Apache OpenWebBeans and JBoss Weld, and also on different Java EE servers like Apache Tomcat and TomEE, JBoss AS7, WildFly 8.x and 9.x, Oracle GlassFish 3.1+ and 4.x+, IBM WebSphere 8.x, Oracle WebLogic Server 12c, Jetty, and others. License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0) ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
5. [HK2](https://hk2.java.net) - A light-weight and dynamic dependency injection framework. [GNU 2](https://en.wikipedia.org/wiki/GNU_General_Public_License)/ [CDDL 1.0](http://opensource.org/licenses/CDDL-1.0)![impossible proprietary code linking license](https://github.com/Vedenin/useful-java-links/blob/master/img/impossible-proprietary-code-linking.png?raw=true)
6. [Eclipse AspectJ](https://eclipse.org/aspectj/) - AspectJ is a seamless aspect-oriented extension to the Java programming language, Java platform compatible, easy to learn and use. License: [Eclipse Public 1.0](https://www.eclipse.org/legal/epl-v10.html)![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)

#### Console and Command line 
1.  [jcommander](https://github.com/cbeust/jcommander) Command line parsing framework for Java. http://jcommander.org/ License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0) , github's star - 445. ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
2.  [Jline](https://github.com/jline/jline2) JLine is a Java library for handling console input. It is similar in functionality to BSD editline and GNU readline. People familiar with the readline/editline capabilities for modern shells (such as bash and tcsh) will find most of the command editing features of JLine to be familiar. License: [BSD 4](https://en.wikipedia.org/wiki/BSD_licenses#4-clause_license_.28original_.22BSD_License.22.29), github's star - 396. ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
3. [args4j](http://args4j.kohsuke.org/) - Пargs4j is a small Java class library that makes it easy to parse command line options/arguments in your CUI application. License: [MIT](https://opensource.org/licenses/MIT) ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
4. [CRaSH](http://www.crashub.org) - The shell for the Java Platform Open source and open minde. License: [GNU Lesser 2.1](https://en.wikipedia.org/wiki/GNU_Lesser_General_Public_License) ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)

#### Functional Programming
*Libraries that facilitate functional programming.*

1. [Cyclops react](https://github.com/aol/cyclops-react) - A comprehensive functional reactive platform for JDK8. Future & functional based programming via JDK compatible extensions for Java 8 and above. License: [MIT](https://opensource.org/licenses/MIT) ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
2. [derive4j](https://github.com/derive4j/derive4j) - Java 8 annotation processor and framework for deriving algebraic data types constructors, pattern-matching, morphisms, (near future: optics and typeclasses). License: [GNU 3](https://en.wikipedia.org/wiki/GNU_General_Public_License)![impossible proprietary code linking license](https://github.com/Vedenin/useful-java-links/blob/master/img/impossible-proprietary-code-linking.png?raw=true)
3. [Fugue](https://bitbucket.org/atlassian/fugue) -Java 8 has standardised some of the basic function interfaces, but does not include quite a few more tools that a functional programmer may expect to be available. This library attempts to fill in some of the gaps when using Java 8. In particular it provides Option and Either types as well as a Pair. There also additional helper classes for common Function, Supplier, and Iterable operations. License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0). ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
4. [Functional Java](http://www.functionaljava.org) - Functional Java is an open source library facilitating functional programming in Java. The library implements numerous basic and advanced programming abstractions that assist composition oriented development. Functional Java also serves as a platform for learning functional programming concepts by introducing these concepts using a familiar language. License: [BSD 3](https://en.wikipedia.org/wiki/BSD_licenses#3-clause_license_.28.22Revised_BSD_License.22.2C_.22New_BSD_License.22.2C_or_.22Modified_BSD_License.22.29), github's star - 478. ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
5. [Javaslang](http://javaslang.com) - Javaslang core is a functional library for Java 8+. It helps to reduce the amount of code and to increase the robustness. A first step towards functional programming is to start thinking in immutable values. Javaslang provides immutable collections and the necessary functions and control structures to operate on these values. License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0). ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
6. [jOOλ](https://github.com/jOOQ/jOOL) - jOOλ - The Missing Parts in Java 8 jOOλ improves the JDK libraries in areas where the Expert Group's focus was elsewhere. It adds tuple support, function support, and a lot of additional functionality around sequential Streams. License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0). ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
7. [Retrolambda](https://github.com/orfjackal/retrolambda) Backport of Java 8's lambda expressions to Java 7, 6 and 5. License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0) , github's star - 1059. ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
8. [TotallyLazy](https://github.com/bodar/totallylazy/) Another functional library for Java , License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0), github's star - 76. ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)

#### Reactive Programming
*Libraries for developing reactive applications.*

1.  [ReactiveX RxJava](https://github.com/ReactiveX/RxJava) RxJava – Reactive Extensions for the JVM – a library for composing asynchronous and event-based programs using observable sequences for the Java VM. License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0) , github's star - 6279, на stackoverflow - [1814 вопросов](http://stackoverflow.com/search?q=RxJava). ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
2. [Eclipse Vert.x](https://github.com/eclipse/vert.x) Vert.x is a tool-kit for building reactive applications on the JVM . License:  Eclipse Public 1 / [Apache 2](http://www.apache.org/licenses/LICENSE-2.0) , github's star - 3743, на stackoverflow - [728 вопросов](http://stackoverflow.com/search?q=Vert.x). ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
3. [Reactive Streams](https://github.com/reactive-streams/reactive-streams-jvm/) - The purpose of Reactive Streams is to provide a standard for asynchronous stream processing with non-blocking backpressure. License: [Public Domain (CC0)](https://en.wikipedia.org/wiki/%D0%9B%D0%B8%D1%86%D0%B5%D0%BD%D0%B7%D0%B8%D0%B8_%D0%B8_%D0%B8%D0%BD%D1%81%D1%82%D1%80%D1%83%D0%BC%D0%B5%D0%BD%D1%82%D1%8B_Creative_Commons#CC0), github's star - 769. ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
4. [Reactor](http://projectreactor.io/) - Reactor is a second-generation Reactive library for building non-blocking applications on the JVM based on the Reactive Streams Specification. License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0). ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)


#### Security and Authentication
*Libraries that handle security, authentication, authorization or session management.*
[Up](#useful-java-links)

1.  [Scribe Java](https://github.com/fernandezpablo85/scribe-java) - Simple OAuth library for Java. License: [MIT](https://opensource.org/licenses/MIT) , github's star - 2731. ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
2.  [Spring security oauth](https://github.com/spring-projects/spring-security-oauth) - Support for adding OAuth1(a) and OAuth2 features (consumer and provider) for Spring web applications. License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0) , github's star - 916. ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
3.  [Jasig CAS (Central Authentication Service)](https://github.com/Jasig/cas) - Apereo CAS - Single Sign On for the Web.The Central Authentication Service (CAS) is the standard mechanism by which web applications should authenticate users. License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0) , github's star - 740. ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
4.  [Spring security](https://github.com/spring-projects/spring-security) — Spring Security provides security services for the Spring IO Platform. Spring Security 3.1 requires Spring 3.0.3 as a minimum and also requires Java 5. License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0) , github's star - 732. ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
5.  [Play Authenticate](https://github.com/joscha/play-authenticate) - An authentication plugin for Play Framework 2.x (Java). License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0) , github's star - 646. ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
6. [Apache Shiro](http://shiro.apache.org/) - Apache Shiro is a powerful and easy-to-use Java security framework that performs authentication, authorization, cryptography, and session management. With Shiro’s easy-to-understand API, you can quickly and easily secure any application – from the smallest mobile applications to the largest web and enterprise applications. License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0). ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
7. [Bouncy Castle](https://www.bouncycastle.org/java.html) - Legion of the Bouncy Castle Java cryptography APIs.A lightweight cryptography API. License: [MIT](https://opensource.org/licenses/MIT). ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
8. [Cryptomator](https://cryptomator.org/) - Free client-side encryption for your cloud files.
Open source software: No backdoors, no registration. License: [MIT](https://opensource.org/licenses/MIT). ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
9. [Google Keyczar](https://github.com/google/keyczar) - Easy-to-use crypto toolkit. License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0). ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
10. [Keycloak](http://keycloak.jboss.org/) - Integrated SSO and IDM for browser apps and RESTful web services.  Built on top of the OAuth 2.0, Open ID Connect, JSON Web Token (JWT) and SAML 2.0 specifications.  Keycloak has tight integration with a variety of platforms and has a HTTP security proxy service where we don't have tight integration.  Options are to deploy it with an existing app server, as a black-box appliance, or as an Openshift cloud service and/or cartridge. License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0). ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
11. [PicketLink](http://picketlink.org/) - Simplified Security and Identity management for Java Applications
PicketLink is an umbrella project for security and identity management for Java Applications. It is licensed under a friendly Apache v2 license. License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0). ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)

#### High Performance
*Everything about high performance computation, from collections to specific libraries.*
[Up](#useful-java-links)

1. [Agrona](https://github.com/real-logic/Agrona) - High Performance data structures and utility methods for Java and C++, License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0). ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
2. [Disruptor](http://lmax-exchange.github.io/disruptor/) -  Inter-thread messaging library. License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0). ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
3. [fastutil](http://fastutil.di.unimi.it/) - fastutil extends the Java Collections Framework by providing type-specific maps, sets, lists and queues with a small memory footprint and fast access and insertion; provides also big (64-bit) arrays, sets and lists, and fast, practical I/O classes for binary and text files. License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0). ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
4. [Eclipse Collections (older GS Collections)](https://github.com/goldmansachs/gs-collections) - Eclipse Collections is a collections framework for Java. It has JDK-compatible List, Set and Map implementations with a rich API and set of utility classes that work with any JDK compatible Collections, Arrays, Maps or Strings. The iteration protocol was inspired by the Smalltalk collection framework. The library modules in GS Collections are compatible with Java 5. License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0). ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
5. [HPPC](http://labs.carrotsearch.com/hppc.html) -HPPC provides template-generated implementations of typical collections, such as lists, sets and maps, for all Java primitive types. The primary driving force behind HPPC is optimization for highest performance and memory efficiency. License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0). ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
6. [Javolution](http://javolution.org/) - ibrary for real-time and embedded systems. License: [BSD 2](https://en.wikipedia.org/wiki/BSD_licenses#2-clause_license_.28.22Simplified_BSD_License.22_or_.22FreeBSD_License.22.29). ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
7. [JCTools](https://github.com/JCTools/JCTools) - Concurrency tools currently missing from the JDK. License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0). ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
8. [Koloboke](https://github.com/OpenHFT/Koloboke) - Hash sets and hash maps. License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0). ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
9. [Trove](http://trove.starlight-systems.com/) - Primitive collections. License: [GNU Lesser 2.1](https://en.wikipedia.org/wiki/GNU_Lesser_General_Public_License). ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)


#### Serialization and I/O
*Libraries that handle serialization with high efficiency.*
[Up](#useful-java-links)

1.  [Square Okio](https://github.com/square/okio) A modern I/O API for Java. License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0) , github's star - 1243. ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
2.  [Square type](https://github.com/square/tape) A lightning fast, transactional, file-based FIFO for Android and Java. License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0) , github's star - 1073. ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
3.  [Simple Binary Encoding (SBE)](https://github.com/real-logic/simple-binary-encoding) Simple Binary Encoding (SBE) - High Performance Message Codec. License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0) , github's star - 612. ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
4.  [MessagePack](https://github.com/msgpack/msgpack-java) - MessagePack serializer implementation for Java. License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0) , github's star - 448. ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
5. [FlatBuffers](https://github.com/google/flatbuffers) - Memory efficient serialization library that can access serialized data without unpacking and parsing it. License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0). ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
6. [FST](https://github.com/RuedigerMoeller/fast-serialization) - JDK compatible high performance object graph serialization. License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0). ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
7. [Kryo](https://github.com/EsotericSoftware/kryo) - Fast and efficient object graph serialization framework. License: [BSD 3](https://en.wikipedia.org/wiki/BSD_licenses#3-clause_license_.28.22Revised_BSD_License.22.2C_.22New_BSD_License.22.2C_or_.22Modified_BSD_License.22.29). ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
8. [MessagePack](https://github.com/msgpack/msgpack-java) - Efficient binary serialization format. License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0). ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)

#### Logging
*Libraries that log the behavior of an application.*
[Up](#useful-java-links)


1.  [Graylog2 server](https://github.com/Graylog2/graylog2-server) Free and open source log management. License: [GNU 3](https://en.wikipedia.org/wiki/GNU_General_Public_License), github's star - 1308. ![impossible proprietary code linking license](https://github.com/Vedenin/useful-java-links/blob/master/img/impossible-proprietary-code-linking.png?raw=true)
2.  [logback](https://github.com/qos-ch/logback) The reliable, generic, fast and flexible logging framework for Java.. http://logback.qos.ch/. License: [Eclipse Public 1.0](https://www.eclipse.org/legal/epl-v10.html)/[GNU Lesser 2.1](https://en.wikipedia.org/wiki/GNU_Lesser_General_Public_License), github's star - 497. ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
3.  [slf4j](https://github.com/qos-ch/slf4j) Abstraction layer which is to be used with an implementation. http://www.slf4j.org/ License: [MIT](https://opensource.org/licenses/MIT) , github's star - 384. ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
4. [Apache Log4j 2](http://logging.apache.org/log4j/) - Apache Log4j 2 is an upgrade to Log4j that provides significant improvements over its predecessor. License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0). ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
5. [graylog](https://www.graylog.org/) -  Open-source aggregator suited for extended role and permission management. License: [GNU 3](https://en.wikipedia.org/wiki/GNU_General_Public_License). ![impossible proprietary code linking license](https://github.com/Vedenin/useful-java-links/blob/master/img/impossible-proprietary-code-linking.png?raw=true)
6. [Elastic Kibana](https://www.elastic.co/products/kibana) - Analyzes and visualizes log files. Some features require payment. License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0). ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
7. [Elastic Logstash](https://www.elastic.co/products/logstash) - Tool for managing log files. License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0). ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
8. [Metrics](https://github.com/dropwizard/metrics) - Expose metrics via JMX or HTTP and can send them to a database. License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0). ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
9. [tinylog](http://www.tinylog.org/) -  Lightweight logging framework with static logger class. License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0). ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)


#### Bean Mapping 
*Frameworks that ease bean mapping.*
[Up](#useful-java-links)

1. [Dozer](https://github.com/DozerMapper/dozer/) - Dozer is a Java Bean to Java Bean mapper that recursively copies data from one object to another. License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0), github's star - 421. ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
2. [MapStruct](https://github.com/mapstruct/mapstruct) - An annotation processor for generating type-safe bean mappers. License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0). ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
3. [ModelMapper](https://github.com/jhalterman/modelmapper) -Simple, Intelligent, Object Mapping. License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0). ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
4. [Orika](https://github.com/orika-mapper) - Simpler, better and faster Java bean mapping framework. License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0). ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
5. [Selma](https://github.com/xebia-france/selma) - Stupid Simple Statically Linked Mapper. Selma Java bean mapping that compiles. License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0). ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)


### 7. Imagery and Video
*Libraries that assist with the creation, evaluation or manipulation of graphical images or video.*
[Up](#useful-java-links)

1.  [Facebook Rebound](https://github.com/facebook/rebound) A Java library that models spring dynamics and adds real world physics to your app. License: [BSD](https://en.wikipedia.org/wiki/BSD_licenses), github's star - 2219. ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
2.  [Processing](https://github.com/processing/processing) Source code for the Processing Development Environment (PDE) . License: [GNU 2](https://en.wikipedia.org/wiki/GNU_General_Public_License), github's star - 1896. ![impossible proprietary code linking license](https://github.com/Vedenin/useful-java-links/blob/master/img/impossible-proprietary-code-linking.png?raw=true)
3.  [JavaCV](https://github.com/bytedeco/javacv) JavaCV uses wrappers from the JavaCPP Presets of commonly used libraries by researchers in the field of computer vision (OpenCV, FFmpeg, libdc1394, PGR FlyCapture, OpenKinect, videoInput, ARToolKitPlus, and flandmark), and provides utility classes to make their functionality easier to use on the Java platform, including Android. License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0) , github's star - 503. ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
4.  [imgscalr](https://github.com/thebuzzmedia/imgscalr) ПSimple Java image-scaling library implementing Chris Campbell's incremental scaling algorithm as well as Java2D's "best-practices" image-scaling techniques. License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0) , github's star - 451. ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
5.  [webcam-capture](https://github.com/sarxos/webcam-capture) Project goal is to give users possibility to access build-in or connected via USB webcams or remote IP / network cameras directly from Java code. Using provided libraries user is able to read camera images and detect motion. License: [MIT](https://opensource.org/licenses/MIT) , github's star - 437. ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
6. [Thumbnailator](https://github.com/coobird/thumbnailator) - Thumbnailator's fluent interface can be used to perform fairly complicated thumbnail processing task in one simple step.
7.  [zxing](https://github.com/zxing/zxing) ZXing ("zebra crossing") is an open-source, multi-format 1D/2D barcode image processing library implemented in Java, with ports to other languages. License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0) , github's star - 5314. ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)


### 8. Code generation and changing byte code
*Libraries to manipulate bytecode programmatically.*
[Up](#useful-java-links)

1.  [Google Auto](https://github.com/google/auto) - A collection of source code generators for Java. License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0) , github's star - 1442. ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
2.  [Square Javapoet](https://github.com/square/javapoet) - JavaPoet is a Java API for generating .java source files. License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0) , github's star - 1057. ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
3.  [Byte buddy](https://github.com/raphw/byte-buddy) - Runtime code generation for the Java virtual machine. http://bytebuddy.net/ License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0) , github's star - 473. ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
4.  [ASM](http://asm.ow2.org/) - ASM is an all purpose Java bytecode manipulation and analysis framework. It can be used to modify existing classes or dynamically generate classes, directly in binary form. Provided common transformations and analysis algorithms allow to easily assemble custom complex transformations and code analysis tools. License: [BSD 3](https://en.wikipedia.org/wiki/BSD_licenses#3-clause_license_.28.22Revised_BSD_License.22.2C_.22New_BSD_License.22.2C_or_.22Modified_BSD_License.22.29) / License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0). ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
5.  [Byteman](http://byteman.jboss.org/) - Byteman is a tool which makes it easy to trace, monitor and test the behaviour of Java application and JDK runtime code. It injects Java code into your application methods or into Java runtime methods without the need for you to recompile, repackage or even redeploy your application. License: [LGPL 2.1](http://www.gnu.org/licenses/old-licenses/lgpl-2.1.ru.html). ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
6.  [Javassist](http://jboss-javassist.github.io/javassist/) -Javassist (Java Programming Assistant) makes Java bytecode manipulation simple. It is a class library for editing bytecodes in Java; it enables Java programs to define a new class at runtime and to modify a class file when the JVM loads it. License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0) or [LGPL or later 2.1](http://www.gnu.org/licenses/old-licenses/lgpl-2.1.ru.html) or [Mozilla Public License 1.1.](https://en.wikipedia.org/wiki/Mozilla_Public_License)![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
7. [ADT4J](https://github.com/sviperll/adt4j) - This library implements Algebraic Data Types for Java. ADT4J provides annotation processor for @GenerateValueClassForVisitor annotation. ADT4J generates new class for each @GenerateValueClassForVisitor annotation. License: [BSD 3](https://en.wikipedia.org/wiki/BSD_licenses#3-clause_license_.28.22Revised_BSD_License.22.2C_.22New_BSD_License.22.2C_or_.22Modified_BSD_License.22.29)![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
8. [Auto](https://github.com/google/auto) - A collection of source code generators for Java. License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0)![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
9. [JHipster](https://github.com/jhipster/generator-jhipster) - Hipster stack for Java developers. Spring Boot + AngularJS in one handy generator.  License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0)![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
10. [cglib](https://github.com/cglib/cglib) - cglib - Byte Code Generation Library is high level API to generate and transform Java byte code. It is used by AOP, testing, data access frameworks to generate dynamic proxy objects and intercept field access. License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0). ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)

### 9. Distributed Applications
*Libraries and frameworks for writing distributed and fault-tolerant applications.*
[Up](#useful-java-links)

1. [Akka](http://akka.io) - Akka is a toolkit and runtime for building highly concurrent, distributed, and resilient message-driven applications on the JVM. License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0). ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
2. [Apache Storm](http://storm.apache.org/) - Apache Storm is a free and open source distributed realtime computation system. Storm makes it easy to reliably process unbounded streams of data, doing for realtime processing what Hadoop did for batch processing. Storm is simple, can be used with any programming language, and is a lot of fun to use! License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0). ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
3. [Apache ZooKeeper](http://zookeeper.apache.org/) - ZooKeeper is a centralized service for maintaining configuration information, naming, providing distributed synchronization, and providing group services. All of these kinds of services are used in some form or another by distributed applications. License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0). ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
4.  [Alibaba Dubbo](https://github.com/alibaba/dubbo) Dubbo is a distributed service framework empowers applications with service import/export capability with high performance RPC. License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0) , github's star - 1917. ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
5.  [Netflix Curator](https://github.com/Netflix/curator) ZooKeeper client wrapper and rich ZooKeeper framework. License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0) , github's star - 1158. ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
6. [Axon Framework](http://www.axonframework.org/) - The axon framework is focussed on making life easier for developers that want to create a java application based on the CQRS principles. The framework is used in a lot of environments. License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0). ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
7. [Hazelcast](http://hazelcast.org/) - The Leading Open Source In-Memory Data Grid:
Distributed Computing, Simplified. License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0). ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
8. [Netflix Hystrix](https://github.com/Netflix/Hystrix) - Hystrix is a latency and fault tolerance library designed to isolate points of access to remote systems, services and 3rd party libraries, stop cascading failure and enable resilience in complex distributed systems where failure is inevitable, github's star - 3571. License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0). ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
9. [JGroups](http://www.jgroups.org/) - JGroups is a toolkit for reliable messaging. It can be used to create clusters whose nodes can send messages to each other.  License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0). ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
10. [Orbit](http://orbit.bioware.com/) - Orbit is a modern framework for JVM languages that makes it easier to build and maintain distributed and scalable online services. It was developed by BioWare, a division of Electronic Arts.  License: [BSD 3](https://en.wikipedia.org/wiki/BSD_licenses#3-clause_license_.28.22Revised_BSD_License.22.2C_.22New_BSD_License.22.2C_or_.22Modified_BSD_License.22.29). ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
11. [Quasar](http://www.paralleluniverse.co/quasar/) - Quasar is an open source JVM library that greatly simplifies the creation of highly concurrent software that is very easy to write and reason about, performant, and fault tolerant. License: [Eclipse Public License v1.0](https://en.wikipedia.org/wiki/Eclipse_Public_License) или [LGPL 3.0](https://en.wikipedia.org/wiki/GNU_Lesser_General_Public_License). ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
12.  [Storm contrib](https://github.com/nathanmarz/storm-contrib) A collection of spouts, bolts, serializers, DSLs, and other goodies to use with Storm. License: [Eclipse Public 1.0](https://www.eclipse.org/legal/epl-v10.html), github's star - 504. ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
13. [JADE](http://jade.tilab.com/) - JADE (Java Agent DEvelopment Framework) is a software Framework fully implemented in the Java language. It simplifies the implementation of multi-agent systems through a middle-ware that complies with the FIPA specifications and through a set of graphical tools that support the debugging and deployment phases. License: [GNU Lesser 2.0](https://en.wikipedia.org/wiki/GNU_Lesser_General_Public_License)![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)

### 10. Science
*Libraries for scientific computing and analysis.*
[Up](#useful-java-links)

1. [DataMelt](http://jwork.org/dmelt/) - DataMelt is a free mathematics software for scientists, engineers and students. It can be used for numeric computation, statistics, symbolic calculations, data analysis and data visualization. License: [GNU 3](https://en.wikipedia.org/wiki/GNU_General_Public_License). ![impossible proprietary code linking license](https://github.com/Vedenin/useful-java-links/blob/master/img/impossible-proprietary-code-linking.png?raw=true)
2. [JGraphT](https://github.com/jgrapht/jgrapht) - JGraphT is a free Java class library that provides mathematical graph-theory objects and algorithms. It runs on Java 2 Platform (requires JDK 1.7 or later). License: [Eclipse Public License](https://en.wikipedia.org/wiki/Eclipse_Public_License) или [LGPL 2.1](https://en.wikipedia.org/wiki/GNU_Lesser_General_Public_License)![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
3. [JScience](http://jscience.org/) - Provides a set of classes to work with scientific measurements and units. License: [BSD 2](https://en.wikipedia.org/wiki/BSD_licenses). ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)

## II. Databases, search engines, big data and machine learning

### 1. Databases and storages
*Everything which simplifies interactions with the database.*
[Up](#useful-java-links)

1.  [Thinkaurelius Titan](https://github.com/thinkaurelius/titan) - Titan is a highly scalable graph database optimized for storing and querying large graphs with billions of vertices and edges distributed across a multi-machine cluster. Titan is a transactional database that can support thousands of concurrent users, complex traversals, and analytic graph queries. License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0) , github's star - 2846. ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
2.  [Apache Cassandra](https://github.com/apache/cassandra) - Cassandra is a partitioned row store. Rows are organized into tables with a required primary key. License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0) , github's star - 2155. ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
3.  [Orientdb](https://github.com/orientechnologies/orientdb) OrientDB is the first Multi-Model DBMS with Document & Graph engine. OrientDB can run distributed (Multi-Master), supports SQL, ACID Transactions, Full-Text indexing, Reactive Queries and has a small memory footprint. OrientDB is licensed with Apache 2 license and the development is driven by OrientDB LTD and a worldwide Open Source community. License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0)/CDDL 1/Eclipse Distribution 1.0, github's star - 1880. ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
4.  [Neo4j](https://github.com/neo4j/neo4j) — Neo4j is the world’s leading Graph Database. It is a high performance graph store with all the features expected of a mature and robust database, like a friendly query language and ACID transactions. License: [GNU 3](https://en.wikipedia.org/wiki/GNU_General_Public_License)/ [GNU AGPLv3](http://www.gnu.org/licenses/agpl-3.0.en.html), github's star - 1787. ![impossible proprietary code linking license](https://github.com/Vedenin/useful-java-links/blob/master/img/impossible-proprietary-code-linking.png?raw=true)
5.  [Mapdb](https://github.com/jankotek/mapdb) MapDB provides concurrent Maps, Sets and Queues backed by disk storage or off-heap-memory. It is a fast and easy to use embedded Java database engine. Это быстрый и простой способ создать embedded Java базу данных. http://www.mapdb.org/. License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0) , github's star - 1484. ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
6.  [Voldemort](https://github.com/voldemort/voldemort) An open source clone of Amazon's Dynamo. Voldemort is a distributed key-value storage system. License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0) , github's star - 1480. ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
7.  [Alluxio (formerly Tachyon)](https://github.com/amplab/tachyon) Memory-Speed Virtual Distributed Storage System. License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0) , github's star - 1459. ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
8.  [Opentsdb](https://github.com/OpenTSDB/opentsdb) A scalable, distributed Time Series Database. License: [GNU 3](https://en.wikipedia.org/wiki/GNU_General_Public_License), github's star - 1336. ![impossible proprietary code linking license](https://github.com/Vedenin/useful-java-links/blob/master/img/impossible-proprietary-code-linking.png?raw=true)
9.  [Hazelcast](https://github.com/hazelcast/hazelcast) Open Source In-Memory Data Grid. License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0) , github's star - 1167. ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
10.  [Tinkerpop Blueprints](https://github.com/tinkerpop/blueprints) A Property Graph Model Interface. It provides implementations, test suites, and supporting extensions. Graph databases and frameworks that implement the Blueprints interfaces automatically support Blueprints-enabled applications. Likewise, Blueprints-enabled applications can plug-and-play different Blueprints-enabled graph backends. License: [BSD 3](https://en.wikipedia.org/wiki/BSD_licenses#3-clause_license_.28.22Revised_BSD_License.22.2C_.22New_BSD_License.22.2C_or_.22Modified_BSD_License.22.29), github's star - 1083. ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
11.  [Apache Lucene solr](https://github.com/apache/lucene-solr) Apache Lucene/Solr. Lucene is a search engine library
Solr is a search engine server that uses lucene. License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0) , github's star - 1069. ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
12.  [Java Chronicle](https://github.com/peter-lawrey/Java-Chronicle) Java Indexed Record Chronicle — This library is an ultra low latency, high throughput, persisted, messaging and event driven in memory database. License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0) , github's star - 970. ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
13.  [Torodb](https://github.com/torodb/torodb) ToroDB - Open source NoSQL database that runs on top of a RDBMS. Compatible with MongoDB protocol and APIs, but with support for native SQL, atomic operations and reliable and durable backends like PostgreSQL. License: [GNU AGPLv3](http://www.gnu.org/licenses/agpl-3.0.en.html), github's star - 951. ![impossible proprietary code linking license](https://github.com/Vedenin/useful-java-links/blob/master/img/impossible-proprietary-code-linking.png?raw=true)
14.  [Crate](https://github.com/crate/crate) Crate.IO: The fast, scalable, easy to use SQL database with native full text search. https://crate.io/ .License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0) , github's star - 925. ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
15.  [Linkedin Pinot](https://github.com/linkedin/pinot) A realtime distributed OLAP datastore. Pinot is a realtime distributed OLAP datastore, which is used at LinkedIn to deliver scalable real time analytics with low latency. License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0) , github's star - 854. ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
16.  [Solandra](https://github.com/tjake/Solandra) Solandra is a real-time distributed search engine built on Apache Solr and Apache Cassandra. License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0) , github's star - 808. ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
17.  [Voltdb](https://github.com/VoltDB/voltdb) VoltDB is a horizontally-scalable, in-memory SQL RDBMS designed for applications that have extremely high read and write throughput requirements. License: [GNU AGPLv3](http://www.gnu.org/licenses/agpl-3.0.en.html), github's star - 586. ![impossible proprietary code linking license](https://github.com/Vedenin/useful-java-links/blob/master/img/impossible-proprietary-code-linking.png?raw=true)
18.  [Leveldb](https://github.com/dain/leveldb) This is a rewrite (port) of LevelDB in Java. This goal is to have a feature complete implementation that is within 10% of the performance of the C++ original and produces byte-for-byte exact copies of the C++ code.. License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0) , github's star - 525. ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
19.  [Kairosdb](https://github.com/kairosdb/kairosdb) KairosDB is a fast distributed scalable time series database written on top of Cassandra. License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0) , github's star - 485. ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
20.  [Linkedin Sensei](https://github.com/linkedin/sensei) Sensei is a distributed, elastic realtime searchable database. License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0) , github's star - 464. ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
21.  [Elephantdb](https://github.com/nathanmarz/elephantdb) Distributed database specialized in exporting key/value data from Hadoop. License: [BSD 3](https://en.wikipedia.org/wiki/BSD_licenses#3-clause_license_.28.22Revised_BSD_License.22.2C_.22New_BSD_License.22.2C_or_.22Modified_BSD_License.22.29), github's star - 464. ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
22.  [Apache Drill](https://github.com/apache/drill) Apache Drill is a distributed MPP query layer that supports SQL and alternative query languages against NoSQL and Hadoop data storage systems. License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0) , github's star - 448. ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
23.  [Tinkerpop Rexster](https://github.com/tinkerpop/rexster) Rexster is a graph server that exposes any Blueprints graph through HTTP/REST and a binary protocol called RexPro. Extensions support standard traversal goals such as search, score, rank, and, in concert, recommendation. License: [BSD 3](https://en.wikipedia.org/wiki/BSD_licenses#3-clause_license_.28.22Revised_BSD_License.22.2C_.22New_BSD_License.22.2C_or_.22Modified_BSD_License.22.29), github's star - 402. ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
24.  [Tomcat redis session manager](https://github.com/jcoleman/tomcat-redis-session-manager) Redis-backed non-sticky session store for Apache Tomcat. License: [MIT](https://opensource.org/licenses/MIT) , github's star - 396. ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
25.  [Embulk](https://github.com/embulk/embulk) Embulk is a parallel bulk data loader that helps data transfer between various storages, databases, NoSQL and cloud services. License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0) , github's star - 394. ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
26.  [H2](http://h2database.com/) - Welcome to H2, the Java SQL database. The main features of H2 are: Very fast, open source, JDBC API,  Embedded and server modes; in-memory databases, Browser based Console application,Small footprint: around 1.5 MB jar file size License: [Mozilla Public License 1.1.](https://en.wikipedia.org/wiki/Mozilla_Public_License) и [Eclipse Public License v1.0](https://en.wikipedia.org/wiki/Eclipse_Public_License). ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)

#### **Distributed Databases.**
*Databases in a distributed system that appear to applications as a single data source.*

1. [Apache Cassandra](https://github.com/apache/cassandra) - The Apache Cassandra database is the right choice when you need scalability and high availability without compromising performance. License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0) , github's star - 2155. ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
2. [Apache HBase](http://hbase.apache.org) -  Apache HBase is an open-source, distributed, versioned, non-relational database modeled after Google's Bigtable: A Distributed Storage System for Structured Data by Chang et al. License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0). ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
3. [Druid](http://druid.io) - Druid is a fast column-oriented distributed data store. License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0), github's star - 1846. ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
4. [Infinispan](http://infinispan.org/) - Infinispan is a distributed in-memory key/value data store with optional schema. It can be used both as an embedded Java library and as a language-independent service accessed remotely over a variety of protocols (HotRod, REST, Memcached and WebSockets). License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0). ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
5. [OpenTSDB](http://opentsdb.net) - The Scalable Time Series Database Store and serve massive amounts of time series data without losing granularity.License: [GNU 3](https://en.wikipedia.org/wiki/GNU_General_Public_License), github's star - 1336. ![impossible proprietary code linking license](https://github.com/Vedenin/useful-java-links/blob/master/img/impossible-proprietary-code-linking.png?raw=true)

### 2. Data structures
*Efficient and specific data structures.*

1. [Apache Avro](https://avro.apache.org/) - Apache Avro is a data serialization system. License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0). ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
2. [Apache Orc](https://orc.apache.org/) - The smallest, fastest columnar storage for Hadoop workloads. License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0). ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
3. [Apache Parquet](http://parquet.apache.org/) - Apache Parquet is a columnar storage format available to any project in the Hadoop ecosystem, regardless of the choice of data processing framework, data model or programming language. License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0). ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
4. [Apache Thrift](https://thrift.apache.org/) -The Apache Thrift software framework, for scalable cross-language services development, combines a software stack with a code generation engine to build services that work efficiently and seamlessly between C++, Java, Python, PHP, Ruby, Erlang, Perl, Haskell, C#, Cocoa, JavaScript, Node.js, Smalltalk, OCaml and Delphi and other languages. License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0). ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
5. [Persistent Collection](http://pcollections.org/) - PCollections serves as a persistent and immutable analogue of the Java Collections Framework. License: [MIT](https://opensource.org/licenses/MIT). ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
6. [Protobuf](https://github.com/google/protobuf) - Protocol Buffers (a.k.a., protobuf) are Google's language-neutral, platform-neutral, extensible mechanism for serializing structured data. License: [BSD 3](https://en.wikipedia.org/wiki/BSD_licenses). ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
7. [SBE](https://github.com/real-logic/simple-binary-encoding) - Simple Binary Encoding (SBE) - High Performance Message Codec, License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0). ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
8. [Wire](https://github.com/square/wire) - Clean, lightweight protocol buffers for Android and Java. License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0). ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)

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
