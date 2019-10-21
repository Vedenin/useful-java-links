# Ссылки на полезные русскоязычные обучающие видео доклады и лекции о Java 

- [1. Оптимизация и производительность](#1-Вопросы-оптимизации-и-производительности)
     - [1.1 Производительность и оптимизация](#11-Производительность-и-оптимизация)
     - [1.2 Высоконагруженные приложения (HighLoad)](#12-Высоконагруженные-приложения-highload)
     - [1.3 Сборка мусора, утечки памяти и работа с памятью](#13-Сборка-мусора-утечки-памяти-и-работа-с-памятью)
- [2. Инструменты и IDE](#2-Инструменты-и-ide)
     - [2.1 IDE и инструменты разработки](#21-ide-и-инструменты-разработки)
     - [2.2 Отладка, профилирование, мониторинг](#22-Отладка-профилирование-мониторинг)
- [3. Особенности разных языков JVM и версий Java](#3-Особенности-разных-языков-jvm-и-версий-java)
     - [3.1 Groovy и Grails](#31-groovy-и-grails)
     - [3.2 Clojure](#32-clojure)
     - [3.3 Kotlin](#33-kotlin)
     - [3.4 Java Embedded и IoT](#34-java-embedded-и-iot)
     - [3.5 Java EE 7](#35-java-ee-7)
     - [3.6 Java 8, лямбды и Stream Api](#36-java-8-лямбды-и-stream-api)
     - [3.7 Java 9+ и будущее Java](#37-java-9-и-будущее-java)
- [4. Фреймворки Java](#4-Фреймворки-java)
     - [4.1 Spring](#41-spring)
     - [4.2 Вебфреймворки (JavaFX, Javascript, AngularJS и т.п.)](#42-Вебфреймворки-javafx-javascript-angularjs-и-тп)
     - [4.3 Прочие фреймворки и популярные библиотеки](#43-Прочие-фреймворки-и-популярные-библиотеки)
- [5. Базы данных, поисковые системы и BigData](#5-Базы-данных-поисковые-системы-и-bigdata)
     - [5.1 NoSql и кеши](#51-nosql-и-кеши)
     - [5.2 Sql базы данных и JPA](#52-sql-базы-данных-и-jpa)
     - [5.3 Поисковые системы](#53-Поисковые-системы)
     - [5.4 BigData, Data Scientist, Машинное обучение](#54-bigdata-data-scientist-Машинное-обучение)
- [6. Особенности языка Java](#6-Особенности-языка-java)
     - [6.1 Cериализации](#61-cериализации)
     - [6.2 Работа с байткодом, java agent'ы, class loader и компиляции на лету](#62-Работа-с-байткодом-java-agentы-class-loader-и-компиляции-на-лету)
     - [6.3 Aсинхронность и многопоточность](#63-aсинхронность-и-многопоточность)
     - [6.4 Интеграция](#64-Интеграция)
     - [6.5 Безопасность, Java Security Model и т.д.](#65-Безопасность-java-security-model-и-тд)
     - [6.6 Виртуальная машина Java и особенности реализации JVM](#66-Виртуальная-машина-java-и-особенности-реализации-jvm)
     - [6.7 Аспектно-ориентированное программирование](#67-Аспектно-ориентированное-программирование)
     - [6.8 Рефлексия и Invokedynamic](#68-Рефлексия-и-invokedynamic)
     - [6.9 Работа с нативными библиотеками и кодом (JNI/JNA)](#69-Работа-с-нативными-библиотеками-и-кодом-jnijna)
     - [6.10 Особенности языка Java](#610-Особенности-языка-java)
     - [6.11 Реактивное программирование на Java](#611-Реактивное-программирование-на-java)
- [7. Качество кода и вопросы архитектуры](#7-Качество-кода-и-вопросы-архитектуры)
     - [7.1 Рефакторинги, качество кода, методики программирования](#71-Рефакторинги-качество-кода-методики-программирования)
     - [7.2 Архитектура, бизнес правила, бизнес модель и примеры приложений](#72-Архитектура-бизнес-правила-бизнес-модель-и-примеры-приложений)
     - [7.3 Тестирование приложений](#73-Тестирование-приложений)
- [8. Прочее](#8-Прочее)
   
## **1\. Вопросы оптимизации и производительности**

### 1.1 Производительность и оптимизация

1.  [Сергей Куксенко - "Квантовые" эффекты производительности](https://www.youtube.com/watch?v=9E6DKrxOLHo),
2.  [Сергей Куксенко - Сессия вопросов-ответов о производительности Java](https://www.youtube.com/watch?v=DNfQHfD-gNg),
3.  [Алексей Шипилёв и Сергей Куксенко, Россия - Методология оптимизации производительности](https://www.youtube.com/watch?v=vF0lNnKCQM8),
4.  [Сергей Куксенко, Oracle — Железные счётчики](https://www.youtube.com/watch?v=8VZU5_Dsqyg)
5.  [Алексей Шипилёв, Oracle — Катехизис java.lang.String](https://www.youtube.com/watch?v=SZFe3m1DV1A) - о реализации строк в Java, способы оптимизации работы со строками и ошибки, которые часто допускают при оптимизации работы со строками,
6.  [Алексей Шипилёв — Java Benchmarking: как два таймстампа прочитать!](https://www.youtube.com/watch?v=8pMfUopQ9Es)
7.  [Алексей Шипилёв — Java Benchmarking: как два таймстампа записать](https://www.youtube.com/watch?v=fzEUyqg3WPU)
8.  [Алексей Шипилёв и Сергей Куксенко — Оптимизация производительности Java-приложений: теория](https://www.youtube.com/watch?v=ulWWSKr0Ce0)
9.  [Алексей Шипилёв и Сергей Куксенко — Оптимизация производительности Java-приложений: детали](https://www.youtube.com/watch?v=cz93lTJW-do)
10.  [Алексей Шипилёв и Сергей Куксенко — Оптимизация производительности Java-приложений: ещё детали](https://www.youtube.com/watch?v=sAtWK22Ho2Q)
11.  [Олег Бунин, Андрей Паньгин, Алексей Рагозин, Олег Анастасьев — Круглый стол. HighLoad](https://www.youtube.com/watch?v=id_iYJ9g_sI)
12.  [Алексей Шипилёв, Oracle — Сжимай меня полностью](https://www.youtube.com/watch?v=hOF7sewi6pk)
13.  [Дмитрий Лазаренко — Оптимизация работы JVM в облаке](https://www.youtube.com/watch?v=vWJIc3ZXsYc)
14.  [Дмитрий Чуйко — Быстрая загрузка ваших классов](https://www.youtube.com/watch?v=5Gr2et-spuk)
15.  [Глеб Смирнов — HotSpot, что ты делаешь?! Ахаха, прекрати!](https://www.youtube.com/watch?v=lq3GkAwyda0)
16.  [Kirill Golodnov — О бесконечно долгой работе дочерних процессов Java-приложения](https://www.youtube.com/watch?v=rq2ohXAsFAQ)
17.  [Андрей Афанасьев — Оптимизация производительности распределенных приложений...](https://www.youtube.com/watch?v=CWuIElUCKZo)
18.  [Руслан Черёмин — Disruptor и прочие фокусы](https://www.youtube.com/watch?v=IsGBA9KEtTM)
19.  [Gleb Smirnov - Side-By-Side Performance Comparisons](https://www.youtube.com/watch?v=mAtyeBOT2vg&list=PLYj3Bx1JM6Y6KJyi0TL3BJLRzgZJ4cWmL&index=22) - что значит "тормозит" и как с этим бороться
20.  [Nikita Salnikov Tarnovski - First steps in GC tuning](https://www.youtube.com/watch?v=4MWJgxLukfI&index=60&list=PLYj3Bx1JM6Y6KJyi0TL3BJLRzgZJ4cWmL) - проблемы, связанные с производительностью из-за сборщика мусора

### 1.2 Высоконагруженные приложения (HighLoad)

1.  [Андрей Паньгин — Особенности разработки высоконагруженного сервера на Java](https://www.youtube.com/watch?v=gIh0X-RkftY)
2.  [Алексей Шевчук — Подходы к решению проблем производительности высоконагруженых сервисов](https://www.youtube.com/watch?v=TnlrHlQzsN4)
3.  [Роман Елизаров — Миллионы котировок в секунду на чистой Java](https://www.youtube.com/watch?v=Q-7y1u9kZV0)
4.  [Олег Анастасьев — За гранью возможного (Keynote)](https://www.youtube.com/watch?v=ERzOp3Z4QM0) - о проблемах при создания Однокласников и решения для высоконагруженных сервисов,
5.  [Андрея Паньгина — Выжимаем из сервера максимум: приемы кеширования и передачи данных на Java](https://www.youtube.com/watch?v=LYs1qUUVZ7w) - описание приемов создания высоконагруженных систем на Odnoklassniki.ru,
6.  [Alexander Oleynikov — Практический опыт построения API высоконагруженных сервисов](https://www.youtube.com/watch?v=K1ozhmRxILE) - описание создания высоконагруженных систем в Yandex'е,
7.  [Valerii Moisieienko - How to Manage 10K request per second in HA manner](https://www.youtube.com/watch?v=Nu1mxR5b-3c&list=PLYj3Bx1JM6Y6KJyi0TL3BJLRzgZJ4cWmL&index=43) - история разработки высоконагруженного приложения на недорогом железе,

### 1.3 Сборка мусора, утечки памяти и работа с памятью

1.  [Алексей Рагозин — Сборка мусора, битва алгоритмов](https://www.youtube.com/watch?v=Sz356YoNHZg)
2.  [Владимир Долженко — GC: друг или враг?](https://www.youtube.com/watch?v=2fVxQJ4cP8I)
3.  [Роман Елизаров — Почему GC съедает все моё CPU?](https://www.youtube.com/watch?v=rZclumzMEGs)
4.  [Никита Сальников-Тарновский, Plumbr — Где моя память, чувак?!](https://www.youtube.com/watch?v=3UP0o2gkeRQ)
5.  [Глеб Смирнов, Plumbr — Тайны — в наших головах, а не в JVM](https://www.youtube.com/watch?v=-nlqr-ikGmQ)
6.  [Никита Сальников-Тарновский — Утечки памяти](https://www.youtube.com/watch?v=sSmQ6W-ovZE)
7.  [Алексей Шипилёв — О чём молчат Heap Dump-ы](https://www.youtube.com/watch?v=r_bnfv-nlcs)
8.  [Владимир Воскресенский — Микрохирургия HotSpot](https://www.youtube.com/watch?v=86FMcZUGSh0)
9.  [Александр Макаров — Исследование возможностей и ограничений JVM по оптимизации памяти](https://www.youtube.com/watch?v=aeKT6uarVOA)
10.  [Андрей Паньгин — Кеширование данных вне Java Heap и работа с разделяемой памятью в Java](https://www.youtube.com/watch?v=h9AICWfaEVQ)
11.  [Владимир Иванов — G1 Garbage Collector](https://www.youtube.com/watch?v=iGRfyhE02lA)
12.  [Иван Крылов — StructuredArray и ObjectLayout](https://www.youtube.com/watch?v=TmhMSlGAZmE) - как JVM представляет объекты и вопросы производительности представления объектов,
13.  [Никита Сальников-Тарновский — Heap, off you go](https://www.youtube.com/watch?v=vJ_uYvxH9pw)
14.  [Nikita Salnikov-Tarnovski - I bet you have a permgen leak in your application](https://www.youtube.com/watch?v=iHTg5QQg2NE) - утечки памяти из-за class load'ов

## **2\. Инструменты и IDE**

### 2.1 IDE и инструменты разработки

1.  [Андрей Зайцев, Дмитрий Нестерук, JetBrains — Инструменты командной разработки](https://www.youtube.com/watch?v=a1TYR_s4o-M)
2.  [Николай Чашников — Поддержка Java 8 в IntelliJ IDEA](https://www.youtube.com/watch?v=V7OPrk1sZnA)
3.  [Андрей Солнцев — Eclipse vs Intellij IDEA](https://www.youtube.com/watch?v=ZS6t7p2gZW8)
4.  [Николай Чашников — IntelliJ IDEA изнутри](https://www.youtube.com/watch?v=NU3DDcsU_Co)
5.  [Дмитрий Найданов — Play Framework 2.0 в IntelliJ IDEA](https://www.youtube.com/watch?v=idCKdGvtt4s)
6.  [Николай Чашников — Компилятор Java и IDE: взаимовыгодное сотрудничество](https://www.youtube.com/watch?v=_sDsmzpVpvs)
7.  [Андрей Чепцов, Барух Садогурский, Антон Архипов — Круглый стол. Инструменты Java-разработчика](https://www.youtube.com/watch?v=Urj4_HBlEgs)
8.  [Александр (Шура) Ильин — Анализ покрытия с помощью JCov](https://www.youtube.com/watch?v=IXbAEazdjM0)
9.  [Антон Архипов — JRebel](https://www.youtube.com/watch?v=7QS8mfuEaFA) - инструмент, который позволяет «на лету» перезагружать классы, измененные с момента развёртывания приложения.,
10.  [Барух Садогурский — Разработка модулярного софта: добро пожаловать в АД!](https://www.youtube.com/watch?v=wuwC4hDvjm4)
11.  [Alexey Alexandrov - All inclusive Jeastic PaaS](https://www.youtube.com/watch?v=cgO739fXSyk&index=4&list=PLlhpyJD4TzMbYWHgSJb2kydmCMnem6YIk) - описание платформы для облачных вычислений
12.  [Baruch Sadogurskii - Managing Modular Software for your NuGet, C++ and Java Development](https://www.youtube.com/watch?v=LhURJOgO61E)
13.  [Philip Torchinsky - Интеграция баг-трекера и сервера CI с IntelliJ IDEA](https://www.youtube.com/watch?v=YEClJ8LKf_s)
14.  [ladimir Kozhaev - How to write IDE for your DSL in one day](https://www.youtube.com/watch?v=fgw_C-mXIA4&index=27&list=PLYj3Bx1JM6Y6KJyi0TL3BJLRzgZJ4cWmL)
15.  [Евгений Борисов — Power of Gradle](https://www.youtube.com/watch?v=NZJTYPLb0iE)
16.  [Sergey Morenets - Gradle 2\. Write once, build everywhere](https://www.youtube.com/watch?v=zxbjAa49y_o) - внимание: видео на **украинском языке**

### 2.2 Отладка, профилирование, мониторинг

1.  [Алексей Рагозин — Непрерывное профилирование Java-приложений в ходе эксплуатации](https://www.youtube.com/watch?v=Y0ggmNzzmI8)
2.  [Андрей Паньгин, Одноклассники — Лучший отладчик — сделанный своими руками](https://www.youtube.com/watch?v=lWEkCOQqzQk)
3.  [Владимир Ситников — Профайлер в каждый дом](https://www.youtube.com/watch?v=gHaz7IxVfPg)
4.  [Владимир Красильщик — Мониторинг Java-приложения с многопроцессной архитектурой](https://www.youtube.com/watch?v=ElvStN7RnRg)
5.  [Виталий Трифанов и Дмитрий Цителов — Динамическое обнаружение гонок в многопоточных Java-программах](https://www.youtube.com/watch?v=KfdsdLqpbw4)
6.  [Андрей Паньгин — Лучший отладчик — сделанный своими руками](https://www.youtube.com/watch?v=pH_NdoKd6Oc)
7.  [Андрей Паньгин — Аварийный дамп — черный ящик упавшей JVM](https://www.youtube.com/watch?v=6qpQjEQ547o)
8.  [Андрей Паньгин — Анализ аварийных дампов JVM, часть 2](https://www.youtube.com/watch?v=MvA-hPCLjRM)
9.  [Андрей Паньгин — Анализ аварийных дампов JVM, часть 1](https://www.youtube.com/watch?v=6SxNUft8Gqw)
10.  [Александр Отенко — О чём молчит профайлер](https://www.youtube.com/watch?v=18mGxXlpLfo)
11.  [Андрей Паньгин — Аварийный дамп — «черный ящик» JVM](https://www.youtube.com/watch?v=CTqwPLUIAsY)
12.  [Алексей Рагозин - Диагностические интерфейсы JVM, или Как сделать профайлер своими руками](https://www.youtube.com/watch?v=UzM4S1hXNtU)
13.  [Владимир Воскресенский — Практическое применение OSS для анализа Java-приложений](https://www.youtube.com/watch?v=1NSweL0sIjs) — Использование Oracle Solaris Studio для анализа высокопроизводительных Java-приложений
14.  [Алексей Шипилёв — (The Art of) (Java) Performance Benchmarking II](https://www.youtube.com/watch?v=Mw0Vimj39cI)

## **3\. Особенности разных языков JVM и версий Java**

### 3.1 Groovy и Grails

1.  [Барух Садогурский, Евгений Борисов — Эпичные Groovy Puzzlers — Месть Скобок](https://www.youtube.com/watch?v=2TTWmoMqPDI)
2.  [Барух Садогурский и Евгений Борисов — Groovy Puzzlers](https://www.youtube.com/watch?v=SBVaXHT5EW0)
3.  [Барух Садогурский и Евгений Борисов — Groovy Puzzlers - Странное, Непонятное и Мамочки-а-это-что-такое?!](https://www.youtube.com/watch?v=aJ-u41Ingug)
4.  [Евгений Борисов — Марлезонский балет по Groovy в трех частях](https://www.youtube.com/watch?v=ZdFwId-P_UQ)
5.  [Барух Садогурский — Метапрограммирование на уровне компилятора в Groovy](https://www.youtube.com/watch?v=fu6z78YIKn0)
6.  [Барух Садогурский — Groovy DSL для plugin-ов: расширения человеческим языком](https://www.youtube.com/watch?v=373g-lGWy-g)
7.  [Барух Садогурский — Транcформации Абстрактного Синтаксического Дерева в Груви. ЩИТО?!](https://www.youtube.com/watch?v=wd-mXqXdfk0)
8.  [Izzet Mustafaiev - Groovy MOPping](https://www.youtube.com/watch?v=h01gHwMRJCU) - принципы построения DSL на groovy
9.  [Baruch Sadogursky - Search for the Holy Grail (and test it once found)](https://www.youtube.com/watch?v=SsK66zf7FOE) - какие решения для поиска существуют в Grail и какие решения для тестирования существуют в Grails

### 3.2 Clojure

1.  [Николай Рыжиков — Clojure: интерактивная разработка для интерактивного веб](https://www.youtube.com/watch?v=m_nlBeNIhZo)
2.  [Maurice Naftalin — Closures and Collections: the World After Eight](https://www.youtube.com/watch?v=YOtFI_AdW7A)
3.  [Dmitriy Morozov - ETL all the things!](https://www.youtube.com/watch?v=bo2yCyC2Rvs&index=19&list=PLYj3Bx1JM6Y6KJyi0TL3BJLRzgZJ4cWmL) - использование ETL (Extract, transform, load) в Clojure, как можно использовать Spark c Clojure,
4.  [Misha Kozik - DSL in Clojure](https://www.youtube.com/watch?v=ZmaiqoDQZmc&index=29&list=PLYj3Bx1JM6Y6KJyi0TL3BJLRzgZJ4cWmL) - использование Clojure для написания DSL,

### 3.3 Kotlin

1.  [Андрей Бреслав — Type-safe Web with Kotlin](https://www.youtube.com/watch?v=6y-4xJWFLl4)
2.  [Андрей Бреслав — Project Kotlin](https://www.youtube.com/watch?v=wjkaPXT_vY4)
3.  [Евгений Геращенко — Kotlin, язык программирования для JVM](https://www.youtube.com/watch?v=mFEys4FSg8M&list=PLfpMTxLIW5TrA9o0rX0ZoS6yPepWD0G4R&index=7)
4.  [— Язык программирования Kotlin](https://www.youtube.com/watch?v=DXY2B6XtzmY&list=PLfpMTxLIW5TrA9o0rX0ZoS6yPepWD0G4R&index=8)

### 3.4 Java Embedded и IoT

1.  [Александр Белокрылов, Александр Мироненко, Oracle — Восстание машин: в энтерпрайз с 256 КБ RAM](https://www.youtube.com/watch?v=2WWBDp-fxqk)
2.  [Белокрылов, Мироненко — Силовая установка c сердцем из Raspberry Pi и мозгом на Java Embedded](https://www.youtube.com/watch?v=ow35RAe-kVY)
3.  [Александр Белокрылов и Александр Мироненко — Java Embedded у вас дома](https://www.youtube.com/watch?v=pTF3VwwaPmk)
4.  [Александр Мироненко и Александр Белокрылов — Java Embedded у вас дома](https://www.youtube.com/watch?v=duphdUhgK5Q)
5.  [Лев Прийма — Java SE Embedded 8](https://www.youtube.com/watch?v=yZu8ByNud5o)
6.  [Александр Белокрылов и Александр Мироненко — Полноценный Java runtime, 256Kb RAM и 5 литров пива](https://www.youtube.com/watch?v=uUeIecjV-6k)
7.  [— Java ME Embedded: проверенные технологии на перспективных рынках](https://www.youtube.com/watch?v=zlwFYfuO9eM&list=PLfpMTxLIW5TrA9o0rX0ZoS6yPepWD0G4R&index=6)
8.  [Yakov Fain - RESTful services and OAUTH protocol in IoT](https://www.youtube.com/watch?v=8CN49EGDJJQ&list=PLYj3Bx1JM6Y6KJyi0TL3BJLRzgZJ4cWmL&index=4)

### 3.5 Java EE 7

1.  [Markus Eisele — 50 Best Features of Java EE 7](https://www.youtube.com/watch?v=PlEgEbAOs1E)

### 3.6 Java 8, лямбды и Stream Api

1.  [Сергей Куксенко — Я, лямбда](https://www.youtube.com/watch?v=8S759EYnjFU&list=PLyKg-WHKJImfpAK2HFIR7pw4iWDLbeK5Q&index=1)
2.  [Сергей Куксенко — JDK 8: Молот лямбд](https://www.youtube.com/watch?v=JjLYhPGH3QA&index=2&list=PLyKg-WHKJImfpAK2HFIR7pw4iWDLbeK5Q)
3.  [Сергей Куксенко и Алексей Шипилёв — Через тернии к лямбдам, часть 1](https://www.youtube.com/watch?v=kxgo7Y4cdA8)
4.  [Владимир Иванов — Java 8 и JVM: что нового в HotSpot](https://www.youtube.com/watch?v=qDC2drI61kA)
5.  [Сергей Куксенко — Java 8: Advanced Stream Techniques](https://www.youtube.com/watch?v=vYvlPZxTPOo)
6.  [Дмитрий Козорез — Java 8 Time API](https://www.youtube.com/watch?v=vBiiU6sNGL0)
7.  [Владимир Иванов — Java 8: что нового в HotSpot JVM?](https://www.youtube.com/watch?v=EMXflWb9Z5w)
8.  [Maurice Naftalin — What's New in Java 8](https://www.youtube.com/watch?v=cOglY060qQY)
9.  [Александр Ильин — Type annotations in Java 8\. И почему это хорошо](https://www.youtube.com/watch?v=F22HWhqWvFA)
10.  [Сергей Куксенко и Алексей Шипилёв — Через тернии к лямбдам, часть 2](https://www.youtube.com/watch?v=JRBWBJ6S4aU)
11.  [Сергей Куксенко и Алексей Шипилёв — Через тернии к лямбдам, часть 1](https://www.youtube.com/watch?v=kxgo7Y4cdA8)
12.  [Сергей Куксенко — Stream API, часть 2](https://www.youtube.com/watch?v=i0Jr2l3jrDA)
13.  [Сергей Куксенко — Stream API, часть 1](https://www.youtube.com/watch?v=O8oN4KSZEXE)
14.  [Сергей Куксенко — JDK8: Stream style](https://www.youtube.com/watch?v=aVv7pb4unNU&list=PLyKg-WHKJImfpAK2HFIR7pw4iWDLbeK5Q&index=15)
15.  [Алексей Фёдоров — Компромиссы в Java 8 с примерами и картинками](https://www.youtube.com/watch?v=zgFKLwYiD0c)
16.  [Александр Белокрылов — Знакомьтесь, Java 8](https://www.youtube.com/watch?v=JSfRvgnX-us)
17.  [Дмитрий Козорез — Долгий путь к Лямбдам](https://www.youtube.com/watch?v=qNNSZNmnUJM)
18.  [Соколов Михаил — Java 8: лямбда выражения и Stream API](https://www.youtube.com/watch?v=uujpE9bR5fM)
19.  [Oleg Tsal-Tsalko - Java 8 Date&Time benefits](https://www.youtube.com/watch?v=vCtuY4MT9XE&index=2&list=PLlhpyJD4TzMbYWHgSJb2kydmCMnem6YIk)
20.  [Oleg Tsal-Tsalko - Java 8 Lambdas Hands-On-Labs](https://www.youtube.com/watch?v=ITGswTpHIos&list=PLlhpyJD4TzMbYWHgSJb2kydmCMnem6YIk&index=9)
21.  [Pavel Grushetzky - Java for hipsters and rocks stars](https://www.youtube.com/watch?v=CPbfSiQds9g&index=14&list=PLlhpyJD4TzMbYWHgSJb2kydmCMnem6YIk)
22.  [Oleg Tsal-Tsalko - 10+ new features you ought to know using Java 8](https://www.youtube.com/watch?v=uweWvwzF_bA)

### 3.7 Java 9+ и будущее Java

1.  [Иван Крылов, Владимир Иванов, Volker Simonis, Никита Липский — Круглый стол. Будущее Java-платформы](https://www.youtube.com/watch?v=eH_kTjpCWI0)
2.  [Владимир Иванов — Future of Java: 9 and beyond](https://www.youtube.com/watch?v=Z0pOOaj3XWk)
3.  [Владимир Иванов — Платформа Java: прошлое и будущее](https://www.youtube.com/watch?v=x4DYFWwnEPo)
4.  [Шура Ильин — Project Jigsaw. Take 2](https://www.youtube.com/watch?v=WDkX1O_BS3c)
5.  [Александр Белокрылов, Oracle — Java: эволюция неизбежна](https://www.youtube.com/watch?v=CeICMXunAM0)
6.  [Аня Барски — Java Life Story](https://www.youtube.com/watch?v=WG9JOL8Imns)
7.  [Olena Syrota, Oleg Tsal-Tsalko - Standard Java JSON binding. When?](https://www.youtube.com/watch?v=dU8KS2q3AQQ) - описание существующих библиотек работы с JSON, их особенностей и проблем, ожидание стандартного JSON'a в Java 9

## **4\. Фреймворки Java**

### 4.1 Spring

1.  [Барух Садогурский, Евгений Борисов — Spring Puzzlers — Начало](https://www.youtube.com/watch?v=6oRQxz3KGbM)
2.  [Евгений Борисов — Spring Data? Да, та!](https://www.youtube.com/watch?v=nwM7A4TwU3M)
3.  [Барух Садогурский, Евгений Борисов, Николай Алименков — Зачем у Spring столько конфигураций?](https://www.youtube.com/watch?v=ek9s7UHzFXc)
4.  [Евгений Борисов — Spring the Ripper](https://www.youtube.com/watch?v=hDpa6m48eC4)
5.  [Евгений Борисов — Spring-потрошитель, часть 2](https://www.youtube.com/watch?v=cou_qomYLNU)
6.  [Евгений Борисов — Spring-потрошитель, часть 1](https://www.youtube.com/watch?v=BmBr5diz8WA)
7.  [Евгений Борисов — Spring 4.0: новое поколение](https://www.youtube.com/watch?v=hRtQFIVJ0ws)
8.  [Владимир Сонькин — Использование Spring 4 и AngularJS для разработки веб-приложений на базе архитектуры REST](https://www.youtube.com/watch?v=nh7eAt5RvZE)
9.  [Меркурьев Евгений — Весна идет, весне - дорогу! Новое в Spring Framework](https://www.youtube.com/watch?v=VdVxvJk_AJk)
10.  [Artem Bilan - Spring and Messaging: The next development generation](https://www.youtube.com/watch?v=C3I0P1NlK1c)
11.  [Vladimir Tsukur - From CRUD to Hypermedia APIs with Spring](https://www.youtube.com/watch?v=iJZwqZqx6BQ)
12.  [Igor Khotin - App infrastructure for microservices with Spring Cloud 1.0.0](https://www.youtube.com/watch?v=20pX41-22Ig&list=PLYj3Bx1JM6Y6KJyi0TL3BJLRzgZJ4cWmL&index=45) - микросервисы, cloud, Spring и DevOps,
13.  [Sergey Morenets - Spring Boot. Boot up your development](https://www.youtube.com/watch?v=uRXRIDy-6UU&index=46&list=PLYj3Bx1JM6Y6KJyi0TL3BJLRzgZJ4cWmL) - описание фреймворка Spring Boot, почему данный фреймворк позволяет создавать приложения намного быстрее,

### 4.2 Вебфреймворки (JavaFX, Javascript, AngularJS и т.п.)

1.  [Сергей Гринёв — JavaFX: FXML и SceneBuilder](https://www.youtube.com/watch?v=wSXl_HlOsSE)
2.  [Артём Ананьев — Неформально о JavaFX](https://www.youtube.com/watch?v=q_jE8F7PBCM)
3.  [Дмитрий Кузовец — FXML и SceneBuilder: отделяем пользовательский интерфейс от логики в JavaFX](https://www.youtube.com/watch?v=ec4o7ssHK6A)
4.  [Павел Нестеренко — Java + JavaScript: переходи на мобильную сторону](https://www.youtube.com/watch?v=MRxxX2LUvoU)
5.  [Евгений Родин — Асинхронная обработка данных в web-приложениях на Java](https://www.youtube.com/watch?v=08Kf6pa4TAY)
6.  [Евгений Родин — Разработка веб-сайтов средствами Java (на примере простого сайта)](https://www.youtube.com/watch?v=Ros_BfBaXIw) - примеры разработки вебсайта с использованием mysql, tomcat и т.п. технологий
7.  [Соколов Дмитрий — Как выбрать библиотеки для современного Web-приложение на Java](https://www.youtube.com/watch?v=lWnfFu3zAJk)
8.  [Владимир Сонькин — Использование AJAX в разработке web-приложений на Java](https://www.youtube.com/watch?v=IkcrQieDQps)
9.  [Александор Дворецкий — Как подготовиться к созданию нагруженных сайтов](https://www.youtube.com/watch?v=qqH2FybPDt8)
10.  [Владимир Сонькин — Использование Spring 4 и AngularJS для разработки веб-приложений на базе архитектуры REST](https://www.youtube.com/watch?v=nh7eAt5RvZE)
11.  [Victor Polischuk - Web-application I have always dreamt of](https://www.youtube.com/watch?v=OZ8NRj9rvC8)
12.  [Nikita Lipsky - Delivering Native User Experience in Client-Side Java Applications](https://www.youtube.com/watch?v=rwRT5-lM3N4&index=26&list=PLYj3Bx1JM6Y6KJyi0TL3BJLRzgZJ4cWmL) - нативные клиенты для работы с вебом вместо браузерного веба (от мобильных до десктопных приложений),
13.  [Olga Semeniuk - Less JS! Web components for back-end developers](https://www.youtube.com/watch?v=aoCzBIGtUj0&list=PLYj3Bx1JM6Y6KJyi0TL3BJLRzgZJ4cWmL&index=48) - введение в веб компоненты для бакенд разработчиков

### 4.3 Прочие фреймворки и популярные библиотеки

1.  [Цытович Павел — Основы разработки приложения на платформе Android](https://www.youtube.com/watch?v=FWy9qYxkmU4)
2.  [Андрей Шевченко — Генерация больших отчетов с использованием Jasper Reports](https://www.youtube.com/watch?v=oghUWUMwgac)
3.  [Владимир Красильщик — Java-mapping для прагматичных программистов](https://www.youtube.com/watch?v=8Rx5gKURmT0) - использования библиотек и фреймворктов для mapping'а (dozer, spring type converter api, nomin, scala dsl, transmorf и т.д.)
4.  [Andrii Golovei - Highly available and scalable application for dummies with Storm](https://www.youtube.com/watch?v=zNI4ISBvtm0) - Storm фреймворк для машинного обучения, высокопроизводительных вычислений

## **5\. Базы данных, поисковые системы и BigData**

### 5.1 NoSql и кеши

1.  [Олег Анастасьев — За гранью NoSQL: NewSQL на Cassandra](https://www.youtube.com/watch?v=qyTj09e-EM0)
2.  [Алексей Зиновьев — Мама, я так хочу Hibernate для NoSQL, ну или что там у вас есть на примете](https://www.youtube.com/watch?v=vv0ewR_oc_U)
3.  [Яков Жданов — In-memory accelerator for MongoDB](https://www.youtube.com/watch?v=FTKDHbIas5s)
4.  [Олег Анастасьев — Класс!ная Cassandra](https://www.youtube.com/watch?v=k2efjgRxMp8)
5.  [Роман Антипин — Франкенштейнизация Voldemort, или Key-Value данные в «Одноклассниках»](https://www.youtube.com/watch?v=X1mn5nabStI)
6.  [Яков Жданов — От дисковой архитектуры к In-Memory](https://www.youtube.com/watch?v=ONoh2Hy2Hw8)
7.  [Алексей Рагозин — Блеск и нищета распределенных кешей](https://www.youtube.com/watch?v=VVhdOWMAilo)
8.  [Alexey Tokar — MongoDB в продакшене - миф или реальность?](https://www.youtube.com/watch?v=wtWJAlrIhR4)
9.  [Artem Orobets - How do you store your data?](https://www.youtube.com/watch?v=V5KUQ2QmFhk&index=5&list=PLlhpyJD4TzMbYWHgSJb2kydmCMnem6YIk)
10.  [Roman Nikitchenko - Big Data: from mammoth to elephant – transforming legacy with Hadoop](https://www.youtube.com/watch?v=bas5rWnghkE&list=PLYj3Bx1JM6Y6KJyi0TL3BJLRzgZJ4cWmL&index=44) - как преобразовать легаси проекты в новые Big Data приложений с современным стеком технологий,

### 5.2 Sql базы данных и JPA

1.  [Николай Алименков — Босиком по граблям Hibernate](https://www.youtube.com/watch?v=YzOTZTt-PR0)
2.  [Яков Сироткин, Sidenis — Миграция с PL/SQL на Java](https://www.youtube.com/watch?v=uAOinr8StoQ)
3.  [Николай Алименков, Игорь Дмитриев — Hibernate, how the magic is really done?](https://www.youtube.com/watch?v=-EpP0Vo63FM)
4.  [Николай Алименков, Игорь Дмитриев — Hibernate performance tuning](https://www.youtube.com/watch?v=V-ljsrVy6pE)

### 5.3 Поисковые системы

1.  [Михаил Хлуднев — В поисках Tommy Hilfiger](https://www.youtube.com/watch?v=Azf4oUL-Dqc) - о Apache Lucene, свободной библиотеки для высокоскоростного полнотекстового поиска, о разных системах поиска,
2.  [Alexey Tokar - To find a needle in a haystack](https://www.youtube.com/watch?v=G2zxxmF2iiA) - о нечетком поиске в словарях от разработчика Яндекса

### 5.4 BigData, Data Scientist, Машинное обучение

1.  [Алексей Зиновьев — Java в качестве основного рабочего инструмента Data Scientist](https://www.youtube.com/watch?v=1TYIhIVAqQo)
2.  [Roman Nikitchenko - Apache HBase: crazy dances on the elephant back](https://www.youtube.com/watch?v=lP6N73G77LM&index=20&list=PLlhpyJD4TzMbYWHgSJb2kydmCMnem6YIk)
3.  [Serhiy Masyutin - Big Data Analysis](https://www.youtube.com/watch?v=4WuI7lxisNI) - внимание на **украинском языке**
4.  [Boris Trofimov - Scalding Big Data: Thorns and Roses,](https://www.youtube.com/watch?v=ElxoxIBnohU)
5.  [Taras Matyashovskyy - Introduction to Real-Time Big Data with Apache Spark](https://www.youtube.com/watch?v=kZSfIfjFB3A&list=PLYj3Bx1JM6Y6KJyi0TL3BJLRzgZJ4cWmL&index=16) - внимание на **украинском языке**
6.  [Serhiy Masyutin - Big Data analysis approaches in Java world](https://www.youtube.com/watch?v=Dh_u-5O6hAI&list=PLYj3Bx1JM6Y6KJyi0TL3BJLRzgZJ4cWmL&index=18) - что такое Big Data, технология Map-Reduce и примеры проектов
7.  [Kyrylo Holodnov - Scaling a solution of an NP-hard problem with Apache ZooKeeper](https://www.youtube.com/watch?v=LOlGftTJJrg&list=PLYj3Bx1JM6Y6KJyi0TL3BJLRzgZJ4cWmL&index=30) - о Apache ZooKeeper, как с работать и решать различные задачи,
8.  [Andrii Golovei - Elastic stack in BigData](https://www.youtube.com/watch?v=1OYH7NNN_ps&list=PLYj3Bx1JM6Y6KJyi0TL3BJLRzgZJ4cWmL&index=55) - использование полнотексового поиска в BigData используя решения компании Elastic (Elastic Search)

## **6\. Особенности языка Java**

### 6.1 Cериализации

1.  [Роман Елизаров — Факты и заблуждения о Java-сериализации](https://www.youtube.com/watch?v=mc9NaoDX5bU)
2.  [Olena Syrota, Oleg Tsal-Tsalko - Standard Java JSON binding. When?](https://www.youtube.com/watch?v=dU8KS2q3AQQ) - описание существующих библиотек работы с JSON, их особенностей и проблем, ожидание стандартного JSON'a в Java 9

### 6.2 Работа с байткодом, java agent'ы, class loader и компиляции на лету

1.  [Антон Архипов, ZeroTurnaround — Javassist на службе у Java-разработчика](https://www.youtube.com/watch?v=46agalRQZjY)
2.  [Никита Липский — Ahead-of-time компиляция](https://www.youtube.com/watch?v=KbbSGg-PK70)
3.  [Антон Архипов — Java-агенты, Instrumentation API и Javassist](https://www.youtube.com/watch?v=GbM3gbS2EfM)
4.  [Антон Архипов — Загрузчики классов в Java: коллекция граблей](https://www.youtube.com/watch?v=RHVzgXff9jg)
5.  [Владимир Иванов — Динамическая (JIT) компиляция в JVM](https://www.youtube.com/watch?v=oYu3HuIYDhI)
6.  [Дмитрий Завалишин — Конвертер байткода JVM для виртуальной машины Фантом](https://www.youtube.com/watch?v=tryheF8COZ0)

### 6.3 Aсинхронность и многопоточность

1.  [Барух Садогурский — Как написать асинхронные многопоточные HTTP приложения](https://www.youtube.com/watch?v=JRx-wYPVaEE)
2.  [Алексей Шипилёв — ForkJoinPool в Java 8](https://www.youtube.com/watch?v=t0dGLFtRR9c)
3.  [Николай Алименков — Прикладная многопоточность](https://www.youtube.com/watch?v=8piqauDj2yo)
4.  [Дмитрий Чуйко, Oracle — CompletableFuture уже здесь](https://www.youtube.com/watch?v=7101uJVoU1g)
5.  [Глеб Смирнов — Расчленяя многопоточность](https://www.youtube.com/watch?v=arGcok_I_DY)
6.  [Алексей Шипилёв — Прагматика Java Memory Model](https://www.youtube.com/watch?v=iB2N8aqwtxc)
7.  [Глеб Смирнов — Многопоточность Java под капотом](https://www.youtube.com/watch?v=3sP4KSPzNOQ)
8.  [Роман Елизаров — Теоретический минимум для понимания Java Memory Model](https://www.youtube.com/watch?v=hxIRyqHRnjE)
9.  [Дмитрий Чуйко — Новинки в java.util.concurrent](https://www.youtube.com/watch?v=aMQJnigGvfY)
10.  [Алексей Шипилёв — Bulletproof Java Concurrency](https://www.youtube.com/watch?v=uZfK-9ixxec)
11.  [Сергей Куксенко — Модель памяти](https://www.youtube.com/watch?v=QBLKJxURdro&list=PLyKg-WHKJImfpAK2HFIR7pw4iWDLbeK5Q&index=10)
12.  [Руслан Черёмин — Модель памяти Java: близкие контакты третьей степени](https://www.youtube.com/watch?v=rAcwfNxv97Q)
13.  [Alexey Fyodorov - Atomics, CAS, and Nonblocking Algorithms](https://www.youtube.com/watch?v=htbPckvO2zQ&list=PLYj3Bx1JM6Y6KJyi0TL3BJLRzgZJ4cWmL&index=3) - вопросы многозадачности, атомики, неблокирующие алгоритмы, CAS и т.п.
14.  [Mikalai Alimenkou - Java Concurrency Applied](https://www.youtube.com/watch?v=am23MMhTOxM&index=9&list=PLYj3Bx1JM6Y6KJyi0TL3BJLRzgZJ4cWmL) - примеры практических решений про многозадачность

### 6.4 Интеграция

1.  [Николай Алименков — Нужен ли нам JMS в мире современных Java-технологий?](https://www.youtube.com/watch?v=ExjPxDxkmFo)
2.  [Яков Файн, Farata Systems — RESTful-сервисы и протокол OAuth в IoT](https://www.youtube.com/watch?v=SLEjztwCbzY)
3.  [Александр Белоцерковский — Windows Azure + Java = Open Integration](https://www.youtube.com/watch?v=adV8J-POQI8)
4.  [Вадим Цесько — Фреймворк Akka и его использование в Яндексе](https://www.youtube.com/watch?v=Cc2QtbjUX60)
5.  [Vladimir Tsukur — Вместе веcело шагать с HATEOAS!](https://www.youtube.com/watch?v=yxdQekc_wGw) - разработка Web Api,
6.  [Максим Юнусов — "Масштабируемое приложение за 15 минут (используем AKKA под Java)](https://www.youtube.com/watch?v=rxkUJM0xqV0)
7.  [Вячеслав Лапин — Слабая связанность Java-сервера и web-интерфейса посредством REST API](https://www.youtube.com/watch?v=xPEgQW_fyxA)

### 6.5 Безопасность, Java Security Model и т.д.

1.  [Михаил Дударев — Побег из песочницы. Уязвимости нулевого дня в Java](https://www.youtube.com/watch?v=KQGFoM318kY)
2.  [Михаил Дударев — USS «Enterprise» - сквозь черные дыры безопасности Java Web-контейнеров](https://www.youtube.com/watch?v=nnOujN3SLY0)
3.  [Михаил Дударев — Опасные типы, или Java Security Model на практике](https://www.youtube.com/watch?v=Zx49MEa7bCg)

### 6.6 Виртуальная машина Java и особенности реализации JVM

1.  [Андрей Паньгин — Java Runtime: повседневные обязанности виртуальной машины Java](https://www.youtube.com/watch?v=Svc0WtfV63k)
2.  [Олег Плисс — Виртуальные машины. Часть 1](https://www.youtube.com/watch?v=f0do1-WXYRc)
3.  [Олег Плисс — Виртуальные машины. Часть 2](https://www.youtube.com/watch?v=sESP5wKV26k)
4.  [Олег Плисс — Виртуальные машины. Часть 3](https://www.youtube.com/watch?v=23O-w5SBYw4)
5.  [Олег Плисс — Виртуальные машины. Часть 4](https://www.youtube.com/watch?v=_WTpw5x726A)
6.  [Артём Ананьев — Проект OpenJDK](https://www.youtube.com/watch?v=_Z934djQtiQ)
7.  [Андрей Бреслав — Компромиссы в разработке языков программирования](https://www.youtube.com/watch?v=HE4yyPpUsy4)
8.  [Андрей Бреслав — Компромиссы, или Как проектируются языки программирования](https://www.youtube.com/watch?v=CX_K1r0Vklg)
9.  [Никита Липский и Павел Павлов — Excelsior JET: внутренняя архитектура](https://www.youtube.com/watch?v=tXDoGWGfZyw)- описание быстрой JVM реализации Excelsior JET с компиляцией в машинный код,
10.  [Никита Липский и Павел Павлов — Excelsior JET: обзор возможностей](https://www.youtube.com/watch?v=G9Oj3e1XCRg)- описание быстрой JVM реализации Excelsior JET с компиляцией в машинный код,
11.  [Nikita Lipsky — AOT компиляция](https://www.youtube.com/watch?v=aw89H-Vv-Zs) - статическая компиляция JVM в Excelsior JET, её преимущества и возможности по сравнению с обычной компиляцией,
12.  [Nikita Lipsky — Java худеет. Уменьшение размера дистрибутива Java приложения без зависимостей](https://www.youtube.com/watch?v=2v3YapNH4ss) - использование статического компилятора Excelsior JET для уменьшения размеров дистрибутивов Java приложений,
13.  [Никита Липский и Миша Быков — Занимательные истории из жизни техподдержки JVM](https://www.youtube.com/watch?v=3lKkZtBekJU) - о техподержке JVM Excelsior JET, о Excelsior JET и об особенностях реализации JVM, различия между JVM и проблемы при переходе между разными JVM,
14.  [Алексей Шипилёв — OpenJDK Frameworks: jmh & jcstress](https://www.youtube.com/watch?v=4p4vL6EhzOk)
15.  [Шура Ильин — OpenJDK Test Base](https://www.youtube.com/watch?v=HywAx9DhMVQ)
16.  [Шура Ильин — JTReg: OpenJDK test harness](https://www.youtube.com/watch?v=1zCQmKOJEKo)
17.  [Шура Ильин — OpenJDK TestFest Intro](https://www.youtube.com/watch?v=1p9eagpKb1M)
18.  [Alexey Fyodorov - JDK: CPU, PSU, LU, FR – WTF???](https://www.youtube.com/watch?v=iQ5DKnS1kG4&list=PLYj3Bx1JM6Y6KJyi0TL3BJLRzgZJ4cWmL) - рассказывается о четырех типах обновлений JDK в компании Oracle (Critical Patch Update (CPU), Patch Set Update (PSU), Limited Update (LU) and Feature Release (FR)). Чем отличаются типы обновления, какие изменения возможны в каждом типе обновлений.

### 6.7 Аспектно-ориентированное программирование

1.  [Николай Гарбузов, Донривер — Аспектно-ориентированное решение классических проблем](https://www.youtube.com/watch?v=uiDKnRvtsiw)
2.  [Игорь Сухоруков. AspectJ Scripting](https://vimeo.com/143683419)

### 6.8 Рефлексия и Invokedynamic

1.  [Владимир Иванов — Invokedynamic: роскошь или необходимость?](https://www.youtube.com/watch?v=oeFejrCcqDI)
2.  [Владимир Иванов — Глубокое погружение в invokedynamic](https://www.youtube.com/watch?v=DgshYDTpS9I)

### 6.9 Работа с нативными библиотеками и кодом (JNI/JNA)

1.  [Петр Кудрявцев — Эффективная разработка Java приложений с использованием JNI/JNA технологий](https://www.youtube.com/watch?v=-ugeWnyox30)

### 6.10 Особенности языка Java

1.  [Владимир Ситников, NetCracker — Выражаемся регулярно](https://www.youtube.com/watch?v=pLKrKFy1t1Y) - описание регулярных выражений, их использования и проблем,
2.  [Алексей Рагозин — Структуры данных в Java, изобретаем заново](https://www.youtube.com/watch?v=mLqjySOrjOw) - описание реализации коллекций в Java и возможные методы их улучшения,
3.  [Светлана Исакова — Простыми словами про вывод типов](https://www.youtube.com/watch?v=8K6sNWvqrW8)

### 6.11 Реактивное программирование на Java

1.  [Кирилл Толкачёв и Егений Борисов — Reactive или не reactive, вот в чем вопрос](https://www.youtube.com/watch?v=mX19FWX2_Hs) - рефакторинг системы в реактивном стиле,
2.  [Олег Докука — Протокол RSocket — будущее реактивных приложений](https://www.youtube.com/watch?v=tSVjUKZ8Eg8) - обзор RSocket — новаторское решение для межсервисных взаимодействий,
3.  [Сергей Егоров — Не будь Гомером Симпсоном для своего Reactor-а!](https://www.youtube.com/watch?v=MU4wjB5CE-c) - обзор фреймворка Project Reactor

## **7\. Качество кода и вопросы архитектуры**

### 7.1 Рефакторинги, качество кода, методики программирования

1.  [Яков Сироткин, Никита Липский, Олег Анастасьев, Филипп Дельгядо — Рефакторинги и технический долг](https://www.youtube.com/watch?v=IENCEQhmwMQ)
2.  [Антон Кекс — Как нам спасти Java? — Часть 1](https://www.youtube.com/watch?v=TSAlj04_tkA) - о проблемах Java, о том как можно сделать Java лучше, какие привычные подходы программирования в Java на самом деле больше вредны, чем полезны,
3.  [Антон Кекс — Как нам спасти Java? — Часть 2](https://www.youtube.com/watch?v=cPXTozVjSHo) - о проблемах Java, о том как можно сделать Java лучше, какие привычные подходы программирования в Java на самом деле больше вредны, чем полезны,
4.  [Николай Чашников — Писать код быстрее, ошибаться реже](https://www.youtube.com/watch?v=tVbSoWwIhHU)
5.  [Николай Чашников — Разработка API в Java-проекте](https://www.youtube.com/watch?v=kPWxDQ27nqM)
6.  [Николай Алименков — Парадигмы ООП](https://www.youtube.com/watch?v=G6LJkWwZGuc)
7.  [Михаил Ершов — Разработка совместимого API](https://www.youtube.com/watch?v=EgOZSr-Uc3w)
8.  [Nikolay Chashnikov - Write code faster with fewer errors: is it possible?](https://www.youtube.com/watch?v=_VhIBu8_4TE&list=PLYj3Bx1JM6Y6KJyi0TL3BJLRzgZJ4cWmL&index=57) - как избегать ошибок при написании кода,
9.  [Тагир Валеев — Атомарный рефакторинг в IntelliJ IDEA: прогибаем IDE под себя](https://www.youtube.com/watch?v=C5eD-K8AO3o)

### 7.2 Архитектура, бизнес правила, бизнес модель и примеры приложений

1.  [Антон Кекс — Архитектура интернет-банка без Enterprise](https://www.youtube.com/watch?v=y96fZdOoeiA)
2.  [Константин Кривопустов — Выбор технологий для корпоративного приложения](https://www.youtube.com/watch?v=1KphwODu1gg)
3.  [Александр Тоболь — Платформа для видео сроком в квартал](https://www.youtube.com/watch?v=2bDZj9_hpuI)
4.  [Антон Кекс — Как я создал desktop-приложение на Java, скачанное 9 миллионов раз](https://www.youtube.com/watch?v=y8yKxmz6iDY)
5.  [Виктор Полищук — JBoss Drools Expert против грязи](https://www.youtube.com/watch?v=GvN9W67Bscs) - описание системы управления бизнес правилами JBoss Drools
6.  [Дмитрий Завалишин и Александр Шлянников — Java-технологии в Digital Zone](https://www.youtube.com/watch?v=J9kme2tcXyU) - примеры реализаций приложений в Digital Zone (использование груви скриптов для гибкой настройки бизнес модели системы приложения такси)
7.  [Яков Сироткин — Почему геномный ассемблер нельзя написать за выходные?](https://www.youtube.com/watch?v=50bjIQ_ECQk) - история разработки геномного ассемблера
8.  [Яков Сироткин — История релизов](https://www.youtube.com/watch?v=xu75nEKrzaU) - продолжение истории разработки геномного ассемблера
9.  [Евгений Борисов — eXtreme Application Platform (XAP)](https://www.youtube.com/watch?v=a-ArgBL5WhA)
10.  [Барух Садогурский — Bintray: Масштабируемый сервис в облаке с нуля](https://www.youtube.com/watch?v=9PulrKvL9Fc)
11.  [Anatoliy Sokolenko - Key Problems of Microservice Architecture](https://www.youtube.com/watch?v=BaOB0iiq0-g&index=16&list=PLlhpyJD4TzMbYWHgSJb2kydmCMnem6YIk) - что такое сервисы и микросервисы, как их реализовать на практике, чем это лучше стандартной архитектуры и какие проблемы возникают при такой архитектуре,
12.  [Izzet Mustafaiev - Fault tolerance – look, it’s possible!](https://www.youtube.com/watch?v=HwIvF1e0Z1o)
13.  [Oleg Tsal-Tsalko - Distributed systems and scalability rules](https://www.youtube.com/watch?v=KRs2URDBZ_A)
14.  [Baruch Sadogursky - Everything you wanted to know about async HTTP apps in Java](https://www.youtube.com/watch?v=onCSPCuH8cw&index=31&list=PLYj3Bx1JM6Y6KJyi0TL3BJLRzgZJ4cWmL) - о написании асинхронного менеджера загрузок с параллельной загрузок файлов, одного файла, прерывания и паузы для программы репозиторий
15.  [Maxim Ivanov - Hey, I’ve seen something like it before!](https://www.youtube.com/watch?v=G34-crfjMHU&list=PLYj3Bx1JM6Y6KJyi0TL3BJLRzgZJ4cWmL&index=47) - подходы к принятию архитектурных решений. Хайп (использования модных базвордов - микросервисов, nosql и т.п. ради базвордов) и его последствия для архитекторов.

### 7.3 Тестирование приложений

1.  [Глеб Смирнов — Мутационное тестирование, или О чём молчит Code Coverage](https://www.youtube.com/watch?v=gGZ-5uHYAi4) - описание почему 100% Code Coverage у Unit тестов не гарантирует правильную работу кода, что такое мутационное тестирование и как оно помогает улучшить Unit тесты, описание мутационной системы pitest (http://pitest.org/)
2.  [Алексей Рагозин — Как и зачем эмулировать распределённый кластер в JVM](https://www.youtube.com/watch?v=F9uAJ4o5zls) - описание библиотеки, которая позволяет для задач Unit тестирования эмулировать распределённый кластер на одной ноде
3.  [Алексей Рагозин — Сеть — это большая JVM](https://www.youtube.com/watch?v=EcoJrYJczqc) - часть 2 лекции " Как и зачем эмулировать распределённый кластер в JVM "
4.  [Mikalai Alimenkou - "TDD for database related code, how is it possible?"](https://www.youtube.com/watch?v=RanIHsirGFg) - описание TDD методологии
5.  [Katya Kameneva - How I lost my QA job](https://www.youtube.com/watch?v=hTxfgGdy83Q&index=12&list=PLlhpyJD4TzMbYWHgSJb2kydmCMnem6YIk) - о внедрении TDD технологий
6.  [Dmytro Chyzhykov - Testing Web Apps with Spring Framework](https://www.youtube.com/watch?v=bu9WKVSF9uo&list=PLlhpyJD4TzMbYWHgSJb2kydmCMnem6YIk&index=15) - тестирование Spring MVC приложений
7.  [Андрей Солнцев — Пацан накодил — пацан протестил!](https://www.youtube.com/watch?v=8u6_hctdhqI)

## 8\. Прочее

1.  [Алексей Вишенцев и Илья Агошков — Advanced Deployment](https://www.youtube.com/watch?v=RPxbUdpz6N0)
2.  [Дмитрий Черепанов — Self-contained Application](https://www.youtube.com/watch?v=kecOwGe48Sk)
3.  [Сергей Куксенко — Quantum Performance Effects](https://www.youtube.com/watch?v=OLeli93LM7A)
4.  [Кузьма Деретюк — UrsaJ HTTP File Storage](https://www.youtube.com/watch?v=KYNhmkT7zYE)
5.  [Дмитрий Чуйко — Java Mission Control](https://www.youtube.com/watch?v=rKuhLvukOhs)
6.  [Igor Khotin - The Craft of Metaprogramming on JVM](https://www.youtube.com/watch?v=W05JqPJIHTU) - о метапрограммировании в Java
