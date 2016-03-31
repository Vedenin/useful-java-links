# Useful java links

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
    




## V. Tools for developing
### 1. IDE
*Integrated development environments that try to simplify several aspects of development.*
[Up](#useful-java-links)

1.  [JetBrains Intellij Сommunity](https://github.com/JetBrains/intellij-community) Supports a lot of JVM languages and provides good options for Android development. The commercial edition targets the enterprise sector. http://www.jetbrains.com/idea/ License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0) , github's star - 2068. ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
2.  [JetBrains Ideavim](https://github.com/JetBrains/ideavim) Плагин, эмулирующий Vim для IDE, основанных на IntelliJ платформе. License: [GNU 2](https://en.wikipedia.org/wiki/GNU_General_Public_License), github's star - 1199. ![impossible proprietary code linking license](https://github.com/Vedenin/useful-java-links/blob/master/img/impossible-proprietary-code-linking.png?raw=true)
3.  [Rstudio](https://github.com/rstudio/rstudio) RStudio это IDE для языка R. License: [GNU AGPLv3](http://www.gnu.org/licenses/agpl-3.0.en.html), github's star - 1048. ![impossible proprietary code linking license](https://github.com/Vedenin/useful-java-links/blob/master/img/impossible-proprietary-code-linking.png?raw=true)
4.  [Vrapper](https://github.com/vrapper/vrapper) Плагин по добавлению Vim-подобного редактора в Eclipse. License: [GNU 3](https://en.wikipedia.org/wiki/GNU_General_Public_License).0, github's star - 669. ![impossible proprietary code linking license](https://github.com/Vedenin/useful-java-links/blob/master/img/impossible-proprietary-code-linking.png?raw=true)
5.  [Eclipse themes](https://github.com/jeeeyul/eclipse-themes) Jeeeyul's Eclipse Themes (прошлое имя Eclipse Chrome Theme) это возможность настроить каждую деталь Eclipse'а. License: [Eclipse Public 1.0](https://www.eclipse.org/legal/epl-v10.html), github's star - 623. ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
6.  [Eclipse color theme](https://github.com/eclipse-color-theme/eclipse-color-theme) Eclipse Color Theme позволяет легко импортировать и удобно менять цветовые темы без побочных эфектов. License: [Eclipse Public 1.0](https://www.eclipse.org/legal/epl-v10.html), github's star - 614. ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
7.  [Eclim](https://github.com/ervandew/eclim) Добавление в редактор Vim возможностей Eclipse IDE. License: [GNU 3](https://en.wikipedia.org/wiki/GNU_General_Public_License), github's star - 590. ![impossible proprietary code linking license](https://github.com/Vedenin/useful-java-links/blob/master/img/impossible-proprietary-code-linking.png?raw=true)
8.  [JetBrains MPS](https://github.com/JetBrains/MPS) JetBrains MPS (Meta programming System) служит для быстрой разработки DSL (Domain Specific Language) для любого окружения и с возможностью скомпилировать DSL в множество языков, таких как Java, C, XML и другие. License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0) , github's star - 525. ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
9.  [Idea markdown](https://github.com/nicoulaj/idea-markdown) Поддержка языка разметки Markdown в IntelliJ IDEA.. License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0) , github's star - 405. ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
10. [Eclipse](http://www.eclipse.org/) - Established, open-souce project with support for lots of plugins and languages. License: [Eclipse Public License v1.0](https://en.wikipedia.org/wiki/Eclipse_Public_License). ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
11. [NetBeans](https://netbeans.org/) - Provides integration for several Java SE and EE features from database access to HTML5. License: [GNU 2](https://en.wikipedia.org/wiki/GNU_General_Public_License) или [CDDL 1.0](http://opensource.org/licenses/CDDL-1.0)![impossible proprietary code linking license](https://github.com/Vedenin/useful-java-links/blob/master/img/impossible-proprietary-code-linking.png?raw=true)

### 2. Deploy, config and build
[Up](#useful-java-links)

#### Build
*Tools which handle the build cycle and dependencies of an application.*

1. [Apache Maven](http://maven.apache.org/) - Declarative build and dependency management which favors convention over configuration. It might be preferable to Apache Ant which uses a rather procedural approach and can be difficult to maintain. License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0) , github's star - 614. ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
2. [Google Bazel](http://bazel.io) -  Build tool from Google that builds code quickly and reliably. License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0) , github's star - 2809. ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
3. [Gradle](http://gradle.org/) - Incremental builds which are programmed via Groovy instead of declaring XML. Works well with Maven's dependency management. License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0) , github's star - 2465. ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
4. [Apache Ant](http://ant.apache.org/) - Инструмент для сборки проиложений, использующий XML для конфигурационных файлов, раньше был очень популярен, сейчас используется довольно редко. Подпроекты: [Apache AntUnit](https://projects.apache.org/project.html?ant-antunit) - система тестирования файлов ant'a, [Apache Compress Ant Library](https://projects.apache.org/project.html?ant-compress) - дополнительные форматы архивов и сжатия, [Apache Ivy](https://projects.apache.org/project.html?ant-ivy) - работа с зависимостями, [Apache IvyDE](https://projects.apache.org/project.html?ant-ivyde) - плагин Ivy для Eclipse. License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0). ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
5.  [Facebook Buck](https://github.com/facebook/buck) - система сборки, упрощающая создание небольших, повторно используемых модулей. License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0) , github's star - 1449. ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)

#### Configuration
*Libraries that provide external configuration.*
[Up](#useful-java-links)

1. [config](https://github.com/typesafehub/config) - Configuration library for JVM languages. License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0) , github's star - 614. ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
2. [owner](https://github.com/lviggiano/owner) - Reduces boilerplate of properties. License: [BSD 3](https://en.wikipedia.org/wiki/BSD_licenses). ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
3.  [Netflix Archaius](https://github.com/Netflix/archaius) - библиотека, реализующая API для управления конфигурациями, используется Netflix. License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0) , github's star - 614. ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
4. [LightAdmin](http://lightadmin.org/) - Легко настраиваемя CRUD UI библиотека для быстрой разработки приложений, License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0). ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)

#### Distribution
*Tools which handle the distribution of applications in native formats.*
[Up](#useful-java-links)

1. [Bintray](https://bintray.com/) - Version control for binaries which handles the publishing. Can also be used with Maven or Gradle and has a free plan for open-source software or several business plans. **License: proprietary** ![proprietary license](https://github.com/Vedenin/useful-java-links/blob/master/img/proprietary-license.png?raw=true)
2. [Capsule](http://www.capsule.io/) - Simple and powerful packaging and deployment. A fat JAR on steroids or a "Docker for Java" that supports JVM-optimized containers. github's star - 576. License: [Eclipse Public License v1.0](https://en.wikipedia.org/wiki/Eclipse_Public_License). ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
3. [Central Repository](http://search.maven.org/) - Largest binary component repository available as a free service to the open-source community. Default used by Apache Maven and available in all other build tools. **License: proprietary** ![proprietary license](https://github.com/Vedenin/useful-java-links/blob/master/img/proprietary-license.png?raw=true)
4. [IzPack](http://izpack.org/) - Setup authoring tool for cross-platform deployments. License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0) , github's star - 614. ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
5. [JitPack](https://jitpack.io/) - Easy to use package repository for GitHub. Builds Maven/Gradle projects on demand and publishes ready-to-use packages.  License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0) , github's star - 614. ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
6. [Launch4j](http://launch4j.sourceforge.net/) - Wraps JARs in lightweight and native Windows executables. License: [BSD 3](https://en.wikipedia.org/wiki/BSD_licenses) и [MIT](https://opensource.org/licenses/MIT). ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
7. [Nexus](http://www.sonatype.com/nexus) - Binary management with proxy and caching capabilities. **License: proprietary** ![proprietary license](https://github.com/Vedenin/useful-java-links/blob/master/img/proprietary-license.png?raw=true)
8. [packr](https://github.com/libgdx/packr/) - Packs JARs, assets and the JVM for native distribution on Windows, Linux and Mac OS X. License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0). ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
9.  [Spotify Helios](https://github.com/spotify/helios) это Docker orchestration платформа для развертывания и управления контейнерами с помощью HTTP API или командной строки. License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0) , github's star - 952. ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)

### 3. Perfomance tools
*Tools for performance analysis, profiling and benchmarking.*
[Up](#useful-java-links)

1.  [Square Leakcanary](https://github.com/square/leakcanary) утилита для поиска ошибок из-за которых происходит memory leak для Android и Java. License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0) , github's star - 4168. ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
2.  [Dropwizard Metrics](https://github.com/dropwizard/metrics) - библиотека для замера различных метрик в Java приложении для простого понимания что и как код делает во время продакшена.  . License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0) , github's star - 3188. ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
3.  [GCViewer](https://github.com/chewiebug/GCViewer) Форк Tagtraum GCViewer — небольшой инструмент для подробной визуализации GC (garbage collector) логов (включая G1 collector). License: [GNU Lesser 2.1](https://en.wikipedia.org/wiki/GNU_Lesser_General_Public_License), github's star - 990. ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
4.  [AdoptOpenJDK Jitwatch](https://github.com/AdoptOpenJDK/jitwatch) Анализатор логов Java HotSpot JIT компилятора, показывающий результаты используя JavaFX интерфейс. License: [BSD 2](https://en.wikipedia.org/wiki/BSD_licenses#2-clause_license_.28.22Simplified_BSD_License.22_or_.22FreeBSD_License.22.29), github's star - 547. ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
5.  [Naver Pinpoint](https://github.com/naver/pinpoint) это APM (Application Performance Management) инструмент мониторинга производительности крупномасштабных распределенных систем, написанных на Java. Создан на основе Google's Dapper paper.. License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0) , github's star - 486. ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
6. [Choco](http://choco-solver.org/) - Полностью готовая "с полки" система по решению задачи удовлетворения ограничений (УО) (constraint satisfaction problem), используя constraint programming технологии, License: [BSD](https://en.wikipedia.org/wiki/BSD_licenses#3-clause_license_.28.22Revised_BSD_License.22.2C_.22New_BSD_License.22.2C_or_.22Modified_BSD_License.22.29). ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
7. [JaCoP](https://github.com/radsz/jacop/) - Включает в себя интерфейс для языка FlatZinc, что позволяет ему выполнять модели MiniZinc, **License: неизвестна**
8. [OptaPlanner](http://www.optaplanner.org/) - Решает задачи бизнес планирования и оптимизации ресурсов, License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0). ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
9. [Sat4J](http://www.sat4j.org/) - Наиболее продвинутый SAT решатель для логических (? boolean) и оптимизационых проблем, License: [GNU Lesser 3](https://en.wikipedia.org/wiki/GNU_Lesser_General_Public_License) и [Eclipse Public 1.0](https://www.eclipse.org/legal/epl-v10.html). ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
10. [jHiccup](https://github.com/giltene/jHiccup) - Logs and records platform JVM stalls. License: [BSD 2](https://en.wikipedia.org/wiki/BSD_licenses#2-clause_license_.28.22Simplified_BSD_License.22_or_.22FreeBSD_License.22.29). ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
11. [JMH](http://openjdk.java.net/projects/code-tools/jmh/) - Microbenchmarking tool for the JVM. License: [GNU 2](https://en.wikipedia.org/wiki/GNU_General_Public_License). ![impossible proprietary code linking license](https://github.com/Vedenin/useful-java-links/blob/master/img/impossible-proprietary-code-linking.png?raw=true)
12. [JProfiler](https://www.ej-technologies.com/products/jprofiler/overview.html) -  Commercial profiler.  **License: proprietary**![proprietary license](https://github.com/Vedenin/useful-java-links/blob/master/img/proprietary-license.png?raw=true)
13. [LatencyUtils](https://github.com/LatencyUtils/LatencyUtils) - Utilities for latency measurement and reporting. License: [BSD 2](https://en.wikipedia.org/wiki/BSD_licenses#2-clause_license_.28.22Simplified_BSD_License.22_or_.22FreeBSD_License.22.29). ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
14. [VisualVM](http://visualvm.java.net/) - Visual interface for detailed information about running applications. License: [GNU 2 with the Classpath Exception](https://en.wikipedia.org/wiki/GNU_General_Public_License).
15. [YourKit Java Profiler](https://www.yourkit.com/features/) - Commercial profiler.   **License: proprietary**![proprietary license](https://github.com/Vedenin/useful-java-links/blob/master/img/proprietary-license.png?raw=true)

### 4. Code Analysis
*Tools that provide metrics and quality measurements.*
[Up](#useful-java-links)

1.  [SonarQube](https://github.com/SonarSource/sonarqube) Integrates other analysis components via plugins and provides an overview of the metrics over time. http://www.sonarqube.org License: [GNU Lesser 3](https://en.wikipedia.org/wiki/GNU_Lesser_General_Public_License), github's star - 655. ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
2.  [Google Error prone](https://github.com/google/error-prone) - Catches common programming mistakes as compile-time errors. License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0) , github's star - 590. ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
3.  [OpenGrok](https://github.com/OpenGrok/OpenGrok) Это быстрый и полезные поиск в исходном коде проекта, поиск кросс-ссылок в классах и навигации по дереву исходного кода, он поддерживает разные системы управления кодов, такие как SCCS, RCS, CVS, Subversion, Mercurial и т.п.c.. License: [CDDL 1.0](http://opensource.org/licenses/CDDL-1.0), github's star - 570.
4. [Checkstyle](https://github.com/checkstyle/checkstyle) - Static analysis of coding conventions and standards. License: [GNU Lesser 2.1](https://en.wikipedia.org/wiki/GNU_Lesser_General_Public_License). ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
5. [FindBugs](http://findbugs.sourceforge.net/) - Static analysis of bytecode to find potential bugs. License: [GNU Lesser](https://en.wikipedia.org/wiki/GNU_Lesser_General_Public_License). ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
6. [jQAssistant](http://jqassistant.org/) - Static code analysis with Neo4J-based query language. License: [GNU 3](https://en.wikipedia.org/wiki/GNU_General_Public_License). ![impossible proprietary code linking license](https://github.com/Vedenin/useful-java-links/blob/master/img/impossible-proprietary-code-linking.png?raw=true)
7. [PMD](https://github.com/pmd/pmd) - Source code analysis for finding bad coding practices. License: [BSD 4](https://en.wikipedia.org/wiki/BSD_licenses#2-clause_license_.28.22Simplified_BSD_License.22_or_.22FreeBSD_License.22.29). ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)

### 5. Monitoring
*Tools that monitor applications in production.*
[Up](#useful-java-links)

1. [AppDynamics](http://www.appdynamics.com/) - Commercial performance monitor.  **License: proprietary**![proprietary license](https://github.com/Vedenin/useful-java-links/blob/master/img/proprietary-license.png?raw=true)
2. [JavaMelody](https://github.com/javamelody/javamelody) - Performance monitoring and profiling. License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0). ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
3. [jmxtrans](https://github.com/jmxtrans/jmxtrans/) - Tool to connect to multiple JVMs and to query them for their attributes via JMX. Its query language is based on JSON, which allows non-Java programmers to access the JVMs attributes. Likewise, this tool supports different output writes, including Graphite, Ganglia, StatsD, among others. License: [MIT](https://opensource.org/licenses/MIT). ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
4. [Kamon](http://www.kamon.io/) - Tool for monitoring applications running on the JVM. License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0). ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
5. [New Relic](http://newrelic.com/) - Commercial performance monitor. **License: proprietary** ![proprietary license](https://github.com/Vedenin/useful-java-links/blob/master/img/proprietary-license.png?raw=true)
6. [SPM](https://sematext.com/spm/) - Commercial performance monitor with distributing transaction tracing for JVM apps.  **License: proprietary**![proprietary license](https://github.com/Vedenin/useful-java-links/blob/master/img/proprietary-license.png?raw=true)
7. [Takipi](https://www.takipi.com/) - Commercial in-production error monitoring and debugging.  **License: proprietary** ![proprietary license](https://github.com/Vedenin/useful-java-links/blob/master/img/proprietary-license.png?raw=true)

#### 6. Redefinition of classes at runtime
[Up](#useful-java-links)

1. [DCEVM](http://dcevm.github.io/) - Модификация JVM, которая позволяет неограниченное переопределение загруженных классов во время выполнения, License: [GNU 2](https://en.wikipedia.org/wiki/GNU_General_Public_License)![impossible proprietary code linking license](https://github.com/Vedenin/useful-java-links/blob/master/img/impossible-proprietary-code-linking.png?raw=true)
2. [HotswapAgent](https://github.com/HotswapProjects/HotswapAgent) - Неограниченное переопределение классов и ресурсов во время выполнения, License: [GNU 2](https://en.wikipedia.org/wiki/GNU_General_Public_License)![impossible proprietary code linking license](https://github.com/Vedenin/useful-java-links/blob/master/img/impossible-proprietary-code-linking.png?raw=true)
3. [JRebel](http://zeroturnaround.com/software/jrebel/) - Коммерческое программное обеспечение, которое позволяет неограниченно перезагружает код и изменять конфигурацию без перезагрузки сервера, *License: Проприетарная, платное ПО,*![proprietary license](https://github.com/Vedenin/useful-java-links/blob/master/img/proprietary-license.png?raw=true)
4. [Spring Loaded](https://github.com/spring-projects/spring-loaded) - Агент для повторой перезагруки классов, License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0)![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)

### 7. Other
[Up](#useful-java-links)

1.  [Google J2ObjC:](https://github.com/google/j2objc) Java to Objective-C Translator and Runtime — конвертация языка Java (включая Android) в Objective-C.. License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0) , github's star - 2940. ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
2.  [Bytecode viewer](https://github.com/Konloch/bytecode-viewer) Система для реверс-инженеринга Java и Android (декомпилятор, редактор, отладчик и т. д.). License: [GNU 3](https://en.wikipedia.org/wiki/GNU_General_Public_License), github's star - 617. ![impossible proprietary code linking license](https://github.com/Vedenin/useful-java-links/blob/master/img/impossible-proprietary-code-linking.png?raw=true)
3.  [Reflections](https://github.com/ronmamo/reflections) сканирует ваш classpath, индексирует метаданные и позволяет строить запросы во время выполнения к метаданным, может сохранять информацию о метаданных вашего проекта. License: [WTFPL](https://en.wikipedia.org/wiki/WTFPL), github's star - 514. ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true) 

*Current implementations of the JVM/JDK.*

1. [JDK 9](https://jdk9.java.net/) - Early access releases of JDK 9. License: [GNU 2](https://en.wikipedia.org/wiki/GNU_General_Public_License). ![impossible proprietary code linking license](https://github.com/Vedenin/useful-java-links/blob/master/img/impossible-proprietary-code-linking.png?raw=true)
2. [OpenJDK](http://openjdk.java.net/) - Open-source implementation for Linux. License: [GNU 2](https://en.wikipedia.org/wiki/GNU_General_Public_License). ![impossible proprietary code linking license](https://github.com/Vedenin/useful-java-links/blob/master/img/impossible-proprietary-code-linking.png?raw=true)
3. [Zulu OpenJDK](http://www.azul.com/downloads/zulu/) - OpenJDK builds for Windows, Linux, and Mac OS X through Java 8. License: [GNU 2](https://en.wikipedia.org/wiki/GNU_General_Public_License). ![impossible proprietary code linking license](https://github.com/Vedenin/useful-java-links/blob/master/img/impossible-proprietary-code-linking.png?raw=true)
4. [Zulu OpenJDK 9](http://zulu.org/zulu-9-pre-release-downloads/) - Early access OpenJDK 9 builds for Windows, Linux, and Mac OS X. License: [GNU 2](https://en.wikipedia.org/wiki/GNU_General_Public_License). ![impossible proprietary code linking license](https://github.com/Vedenin/useful-java-links/blob/master/img/impossible-proprietary-code-linking.png?raw=true)

## VI. Program languages and applications, that was written with Java
### 1.  Program languages, that was written with Java
[Up](#useful-java-links)

1.  [Clojure](https://github.com/clojure/clojure) Язык программирования Clojure.  . License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0) , github's star - 4332. ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
2.  [JetBrains Kotlin](https://github.com/JetBrains/kotlin) Язык программирования Kotlin. License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0) , github's star - 1621. ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
3.  [Gocd](https://github.com/gocd/gocd) Основной репозиторий для сборки Go программ . License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0) , github's star - 1602. ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
4.  [Groovy core](https://github.com/groovy/groovy-core) Язык программирования Groovy. License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0) , github's star - 1327. ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
5.  [Jphp compiler Jphp](https://github.com/jphp-compiler/jphp) Альтернативный вариант Zend PHP для JVM, такой же как JRuby и Jython но только для PHP. License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0) , github's star - 969. ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
6.  [Trifork Erjang](https://github.com/trifork/erjang) Виртуальная JVM машина для языка Erlang . License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0) , github's star - 484. ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
7.  [Apache Incubator groovy](https://github.com/apache/incubator-groovy) Зеркало для Apache Groovy — исходного кода языка программирования Groovy. License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0) , github's star - 464. ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)

### 2. Other program languages tools, that was written with Java
[Up](#useful-java-links)

1.  [Go lang idea plugin](https://github.com/go-lang-plugin-org/go-lang-idea-plugin) IDE для языка программирования Goole Go, созданная на основе IntelliJ Platform. License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0) , github's star - 1717. ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
2.  [Processing js](https://github.com/jeresig/processing-js) Портирование Processing библиотеку для работы с видео и изображениями в JavaScript.. License: [MIT](https://opensource.org/licenses/MIT) , github's star - 1696. ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
3.  [Pysonar2](https://github.com/yinwang0/pysonar2) PySonar2 это система индексирования и получения типов в Python, которая проводить сложный анализ с помощью Sourcegraph сотен тысяч открытых Python репозиториев. License: [GNU](http://www.gnu.org/licenses/agpl-3.0.en.html) [GNU AGPLv3](http://www.gnu.org/licenses/agpl-3.0.en.html), github's star - 1654. ![impossible proprietary code linking license](https://github.com/Vedenin/useful-java-links/blob/master/img/impossible-proprietary-code-linking.png?raw=true)

### 3. Javascript 
[Up](#useful-java-links)

1.  [Yuicompressor](https://github.com/yui/yuicompressor) YUI Compressor — это система сжатия JavaScript и CSS файлов, которая удаляет лишние пробелы, безопасно обфуцирует локальные переменные до минимального возможного имени и т. д.. License: [BSD](https://en.wikipedia.org/wiki/BSD_licenses), github's star - 1840. ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
2.  [Google Closure compiler](https://github.com/google/closure-compiler) Библиотека проверки JavaScript кода и его оптимизации. License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0) , github's star - 1442. ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
3.  [Frontend maven plugin](https://github.com/eirslett/frontend-maven-plugin) Maven плагин который скачивает и устанавливает Node и NPM локально и запускает NPM install, Grunt, Gulp и/или Karma. License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0) , github's star - 586. ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
4.  [Dynjs](https://github.com/dynjs/dynjs) Среда выполнения ECMAScript для JVM. License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0) , github's star - 533. ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)

### 4. Frameworks that help to create parsers, interpreters or compilers
*Frameworks that help to create parsers, interpreters or compilers.*
[Up](#useful-java-links)

1. [ANTLR](http://www.antlr.org/) - Complex full-featured framework for top-down parsing. License: [BSD 2](https://en.wikipedia.org/wiki/BSD_licenses). ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
2. [JavaCC](https://javacc.java.net/) -More specific and slightly easier to learn. Has syntactic lookahead. License: [BSD ](https://en.wikipedia.org/wiki/BSD_licenses). ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)


### 5. Applications, that was written with Java
[Up](#useful-java-links)

1.  [Square Keywhiz](https://github.com/square/keywhiz) - cистема для хранения и управления секретными данными (TLS сертификаты, GPG ключи, API токены, данные доступа к базам данным) . License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0) , github's star - 979. ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
2.  [Rundeck](https://github.com/rundeck/rundeck) это автоматический сервис-планировщик по управлению заданиями, job'aми с вебконсолью, инструментами командной строки и WebAPI. . License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0) , github's star - 853. ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
3.  [KeyBox](https://github.com/skavanagh/KeyBox) это SSH вебконсоль, которая используется для административного доступа в систему. License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0) , github's star - 792. ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
4.  [OpenTripPlanner](https://github.com/opentripplanner/OpenTripPlanner) это свободный планировщик поездок, поддерживает открытые стандартные форматы файлов (GTFS и OpenStreetMap), также включает REST API для планирования путишествий, как и Javascript клиент . License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0) , github's star - 704. ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
5.  [Netflix Servo](https://github.com/Netflix/servo) обеспечивает простой интерфейс для получения и публикации параметров приложений Netflix . License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0) , github's star - 681. ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
6.  [Jitsi](https://github.com/jitsi/jitsi) программа, обеспечивающее текстовую, голосовую и видеосвязь с разными протоколами SIP, XMPP/Jabber, AIM/ICQ, IRC, Yahoo! и много других возможностей. License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0) , github's star - 676. ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
7.  [Netflix Exhibitor](https://github.com/Netflix/exhibitor) это система для ZooKeeper, обеспечивающая мониторинг, архивирование и восстановление, очистку и визуализацию. License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0) , github's star - 610. ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
8.  [Glyptodon Guacamole client](https://github.com/glyptodon/guacamole-client) - клиент, который позволяет работать с удаленным рабочим столом через браузер без установки какого-либо программного обеспечение. Использует HTML5, JavaScript и Java . License: [MIT](https://opensource.org/licenses/MIT) , github's star - 556. ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
9.  [Bateman](https://github.com/fearofcode/bateman) - простая система торговли акциями, которая оптимизирует свои параметры, используя particle swarm оптимизацию. License: [MIT](https://opensource.org/licenses/MIT) , github's star - 543. ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
10.  [Java repl](https://github.com/albertlatacz/java-repl) - реализация Read Eval Print Loop (простой интерактивной среды программирования, которая сразу вычисляет введенные пользователем выражения) для Java. License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0) , github's star - 536. ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
11.  [Seyren](https://github.com/scobal/seyren) это оболочка для управления предупреждениями (alert) для Graphite, поддерживает много каналов нотификации: Email, Flowdock, HipChat, HTTP, Hubot, IRCcat, PagerDuty, Pushover, SLF4J, Slack, SNMP, Twilio. License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0) , github's star - 527. ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
12.  [Graphhopper](https://github.com/graphhopper/graphhopper) это быстрая и эффективно использующий память программа определения лучшего дорожного маршрута на Java. По умолчанию использует данный OpenStreetMap, но существует импорт и из других источников. License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0) , github's star - 506. ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
13.  [Ttorrent](https://github.com/mpetazzoni/ttorrent) это Java реализация BitTorrent протокола, BitTorrent tracker и BitTorrent клиента . License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0) , github's star - 460. ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
14.  [Geoserver](https://github.com/geoserver/geoserver) это приложение, написанное на Java, которое используется для обмена и редактирования geo данных. License: [GNU 2](https://en.wikipedia.org/wiki/GNU_General_Public_License).0, github's star - 435. ![impossible proprietary code linking license](https://github.com/Vedenin/useful-java-links/blob/master/img/impossible-proprietary-code-linking.png?raw=true)
15.  [Languagetool](https://github.com/languagetool-org/languagetool) - система стилистической и грамматической проверки текста более чем на 25 разных языках (английский, франц узкий, немецкий, русский, польский и т. д.). License: [GNU Lesser 2.1](https://en.wikipedia.org/wiki/GNU_Lesser_General_Public_License), github's star - 416. ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)

### 6. Games, that was written with Java
[Up](#useful-java-links)

1.  [Bukkit](https://github.com/Bukkit/Bukkit) Мод для Minecraft API. License: [GNU 2](https://en.wikipedia.org/wiki/GNU_General_Public_License), github's star - 1600. ![impossible proprietary code linking license](https://github.com/Vedenin/useful-java-links/blob/master/img/impossible-proprietary-code-linking.png?raw=true)
2.  [MovingBlocks Terasology](https://github.com/MovingBlocks/Terasology) Terasology это расширение для игры Minecraft . License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0) , github's star - 1070. ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
3.  [MinecraftForge](https://github.com/MinecraftForge/MinecraftForge) Модификации для Minecraft . License: [GNU AGPLv2.1](http://www.gnu.org/licenses/old-licenses/lgpl-2.1.en.html), github's star - 981. ![impossible proprietary code linking license](https://github.com/Vedenin/useful-java-links/blob/master/img/impossible-proprietary-code-linking.png?raw=true)
4.  [SpongePowered Sponge](https://github.com/SpongePowered/Sponge) Forge мод для Minecraft реализующий SpongeAPI. License: [MIT](https://opensource.org/licenses/MIT) , github's star - 803. ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
5.  [BuildCraft](https://github.com/BuildCraft/BuildCraft) BuildCraft — расширение для Minecraft. License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0) , github's star - 799. ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
6.  [Equivalent Exchange 3](https://github.com/pahimar/Equivalent-Exchange-3) pahimar Equivalent-Exchange-3\. Моды для Minecraft. License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0) , github's star - 783.
7.  [SpongePowered SpongeAPI](https://github.com/SpongePowered/SpongeAPI) Minecraft плагин API. License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0) , github's star - 775. ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
8.  [WorldEdit](https://github.com/sk89q/WorldEdit) Редактор игровых карт для Minecraft. License: [GNU Lesser 3](https://en.wikipedia.org/wiki/GNU_Lesser_General_Public_License), github's star - 715. ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
9.  [Essentials](https://github.com/essentials/Essentials) Essentials - Minecraft серверный командный мод — добавлени более 100 команд для использования в игре . License: [GNU 3](https://en.wikipedia.org/wiki/GNU_General_Public_License), github's star - 423. ![impossible proprietary code linking license](https://github.com/Vedenin/useful-java-links/blob/master/img/impossible-proprietary-code-linking.png?raw=true)
10.  [GlowstoneMC Glowstone](https://github.com/GlowstoneMC/Glowstone) Сервер для Bukkit Minecraft. License: [MIT](https://opensource.org/licenses/MIT) , github's star - 421. ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)





