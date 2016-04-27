[To Useful Java links project](https://github.com/Vedenin/useful-java-links) / [To Hello World project](https://github.com/Vedenin/useful-java-links/tree/master/helloworlds)  

## Json Hello World examples

The Json parsers libraries offer 3 main methods for processing JSON and 1 additional:

  1. **Data Binding** converts JSON to and from POJOs based either on property accessor conventions or annotations.
  2. **Tree Model** provides a mutable in-memory tree representation of a JSON document.
  3. **Streaming API** (aka "Incremental parsing/generation") reads and writes JSON content as discrete events.
  4. (additional) **XPath analog** - working with a JSON structure in the same way as XPath expression are used in combination with an XML document.

### 1. Json parsers overview 

**Property** | [Fastjson ](https://github.com/alibaba/fastjson)| [Gson](https://github.com/google/gson) |  [LoganSquare](https://github.com/bluelinelabs/LoganSquare) | [JSON java](https://github.com/stleary/JSON-java) |  [Moshi](https://github.com/square/moshi) | [Ig json parser](https://github.com/Instagram/ig-json-parser) | [Jackson](http://wiki.fasterxml.com/JacksonHome) | [Genson](http://owlike.github.io/genson/) | [JsonPath](https://github.com/jayway/JsonPath) 
 ----------	 | --- | --- |  --- | --- |  --- | --- | --- | --- | --- 
1. Data bind | [Yes](https://github.com/Vedenin/useful-java-links/tree/master/helloworlds/3.8-json/fastjson)| [Yes](https://github.com/Vedenin/useful-java-links/tree/master/helloworlds/3.8-json/gson) | [Yes](https://github.com/Vedenin/useful-java-links/tree/master/helloworlds/3.8-json/logansquare)  | - | [Yes](https://github.com/Vedenin/useful-java-links/tree/master/helloworlds/3.8-json/moshi) | [Yes](https://github.com/Vedenin/useful-java-links/tree/master/helloworlds/3.8-json/ig_json_parser) | [Yes](https://github.com/Vedenin/useful-java-links/tree/master/helloworlds/3.8-json/jackson) | [Yes](https://github.com/Vedenin/useful-java-links/tree/master/helloworlds/3.8-json/genson) | - 
2. Tree Model | - | [Yes](https://github.com/Vedenin/useful-java-links/blob/master/helloworlds/3.8-json/gson/src/main/java/gson/advanced/TreeModel.java)| -  | [Yes](https://github.com/Vedenin/useful-java-links/tree/master/helloworlds/3.8-json/json_java) | - | - | [Yes](https://github.com/Vedenin/useful-java-links/blob/master/helloworlds/3.8-json/jackson/src/main/java/jackson/advanced/TreeModel.java) | - | - 
3. Streaming API | - | [Yes](https://github.com/Vedenin/useful-java-links/blob/master/helloworlds/3.8-json/gson/src/main/java/gson/advanced/StreamingAPI.java)| -  | - | - | - | [Yes](https://github.com/Vedenin/useful-java-links/blob/master/helloworlds/3.8-json/jackson/src/main/java/jackson/advanced/StreamingAPI.java) | - | - 
4. Analog XPath | [Yes](https://github.com/Vedenin/useful-java-links/blob/master/helloworlds/3.8-json/fastjson/src/main/java/fastjson/JsonPathHelloWorld.java) | - | -  | - | - | - | [Yes](https://github.com/Vedenin/useful-java-links/blob/master/helloworlds/3.8-json/jackson/src/main/java/jackson/advanced/JsonPointerHelloWorld.java) | - | [Yes](https://github.com/Vedenin/useful-java-links/tree/master/helloworlds/3.8-json/json_path)
5. Generation classes at compile-time | - | - | [Yes](https://github.com/Vedenin/useful-java-links/tree/master/helloworlds/3.8-json/logansquare)  | - | - | [Yes](https://github.com/Vedenin/useful-java-links/tree/master/helloworlds/3.8-json/ig_json_parser) | - | - | -
6. Github's star | 4851 | 4120 | 2188  | 1937 | 1732 | 921 | 881 | 108 | 849
7. Working with static inner class | [Yes](https://github.com/Vedenin/useful-java-links/tree/master/helloworlds/3.8-json/fastjson) | [Yes](https://github.com/Vedenin/useful-java-links/tree/master/helloworlds/3.8-json/gson) | [No](https://github.com/Vedenin/useful-java-links/tree/master/helloworlds/3.8-json/logansquare) | - | [Yes](https://github.com/Vedenin/useful-java-links/tree/master/helloworlds/3.8-json/moshi) | [No](https://github.com/Vedenin/useful-java-links/tree/master/helloworlds/3.8-json/ig_json_parser) | [Yes](https://github.com/Vedenin/useful-java-links/tree/master/helloworlds/3.8-json/jackson) | [Yes](https://github.com/Vedenin/useful-java-links/tree/master/helloworlds/3.8-json/genson) | -
8. Required annotations | [No](https://github.com/Vedenin/useful-java-links/tree/master/helloworlds/3.8-json/fastjson) | [No](https://github.com/Vedenin/useful-java-links/tree/master/helloworlds/3.8-json/gson)  | [Yes](https://github.com/Vedenin/useful-java-links/tree/master/helloworlds/3.8-json/logansquare) | - | [No](https://github.com/Vedenin/useful-java-links/tree/master/helloworlds/3.8-json/moshi)  | [Yes](https://github.com/Vedenin/useful-java-links/tree/master/helloworlds/3.8-json/ig_json_parser) | [No](https://github.com/Vedenin/useful-java-links/tree/master/helloworlds/3.8-json/jackson)  | [No](https://github.com/Vedenin/useful-java-links/tree/master/helloworlds/3.8-json/genson)  | -

From [useful-java-links](#useful-java-links):

##### JSON Parsers
1.  [Alibaba Fastjson](https://github.com/alibaba/fastjson)  Fast JSON Processor , github's star - 4851. [User guide](https://github.com/alibaba/fastjson) and [Hello World examples](https://github.com/Vedenin/useful-java-links/tree/master/helloworlds/3.8-json/fastjson). License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0). ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
1.  [Gson](https://github.com/google/gson) - Serializes objects to JSON and vice versa. Good performance with on-the-fly usage, github's star - 4120. [User guide](https://github.com/google/gson/blob/master/UserGuide.md) and [Hello World examples](https://github.com/Vedenin/useful-java-links/tree/master/helloworlds/3.8-json/gson)
. License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0). ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
1.  [LoganSquare](https://github.com/bluelinelabs/LoganSquare) - JSON parsing and serializing library based on Jackson's streaming API. Outpeforms GSON & Jackson's library, github's star - 2188. [User guide](https://github.com/bluelinelabs/LoganSquare#usage) and [Hello World examples](https://github.com/Vedenin/useful-java-links/tree/master/helloworlds/3.8-json/logansquare). License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0). ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
1.  [JSON java](https://github.com/stleary/JSON-java) A reference implementation of a JSON package in Java, github's star - 1937. [User guide](https://github.com/stleary/JSON-java) and [Hello World examples](https://github.com/Vedenin/useful-java-links/tree/master/helloworlds/3.8-json/json_java). License: [Crockford's license (MIT License + "Good, not Evil")](https://en.wikipedia.org/wiki/Douglas_Crockford#.22Good.2C_not_Evil.22).
1.  [Square Moshi](https://github.com/square/moshi) A modern JSON library for Android and Java , github's star - 1732. [User guide](https://github.com/square/moshi#moshi) and [Hello World examples](https://github.com/Vedenin/useful-java-links/tree/master/helloworlds/3.8-json/moshi). License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0) ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
1.  [Instagram Ig json parser](https://github.com/Instagram/ig-json-parser) Fast JSON parser for java projects, github's star - 921. [User guide](https://github.com/Instagram/ig-json-parser#getting-started) and [Hello World examples](https://github.com/Vedenin/useful-java-links/tree/master/helloworlds/3.8-json/ig_json_parser). License: [BSD 3](https://en.wikipedia.org/wiki/BSD_licenses#3-clause_license_.28.22Revised_BSD_License.22.2C_.22New_BSD_License.22.2C_or_.22Modified_BSD_License.22.29). ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
1.  [Jackson](http://wiki.fasterxml.com/JacksonHome) - Similar to GSON but has performance gains if you need to instantiate the library more often. Subprojects: [Jackson core](https://github.com/FasterXML/jackson-core) Core part of Jackson, [Jackson databind](https://github.com/FasterXML/jackson-databind) Core part of Jackson that defines Streaming API as well as basic shared abstractions, github's star - 881. [User guide](https://github.com/FasterXML/jackson-docs) and [Hello World examples](https://github.com/Vedenin/useful-java-links/tree/master/helloworlds/3.8-json/jackson). License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0). ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
1.  [Genson](http://owlike.github.io/genson/) -Powerful and easy to use Java to JSON conversion library, github's star - 108. [User guide](http://owlike.github.io/genson/Documentation/UserGuide/) and [Hello World examples](https://github.com/Vedenin/useful-java-links/tree/master/helloworlds/3.8-json/genson). License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0). ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)

##### Analog XPath for JSON
1.  [Jayway JsonPath](https://github.com/jayway/JsonPath) Java JsonPath implementation, github's star - 849.  [User guide](https://github.com/jayway/JsonPath#getting-started) and [Hello World examples](https://github.com/Vedenin/useful-java-links/tree/master/helloworlds/3.8-json/json_path). License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0). ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
1.  [Alibaba Fastjson](https://github.com/alibaba/fastjson)  Fast JSON Processor , github's star - 4851. [User guide](https://github.com/alibaba/fastjson) and [Hello World examples](https://github.com/Vedenin/useful-java-links/tree/master/helloworlds/3.8-json/fastjson). License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0). ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)

##### Generates Java types from JSON or JSON Schema or JSON validation
1.  [Jsonschema2pojo](https://github.com/joelittlejohn/jsonschema2pojo) Generates Java types from JSON Schema (or example JSON) and annotates those types for data-binding with Jackson 1.x or 2.x, Gson, etc. , github's star - 1664. [User guide](https://github.com/joelittlejohn/jsonschema2pojo/wiki/Getting-Started) and [Hello World examples](https://github.com/Vedenin/useful-java-links/tree/master/helloworlds/3.8-json/jsonschema2pojo). License: [Apache 2](http://www.apache.org/licenses/LICENSE-2.0). ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)
1.  [Json schema validator](https://github.com/fge/json-schema-validator) A JSON Schema validation implementation in pure Java, which aims for correctness and performance, in that order, also can generate Java types from JSON Schema or versa versa, github's star - 547. [User guide](https://github.com/fge/json-schema-validator#read-me-first) and [Hello World examples](https://github.com/Vedenin/useful-java-links/tree/master/helloworlds/3.8-json/json_schema_validator). License: [GNU Lesser 3](https://en.wikipedia.org/wiki/GNU_Lesser_General_Public_License)/[Apache 2](http://www.apache.org/licenses/LICENSE-2.0). ![business friendly license](https://github.com/Vedenin/useful-java-links/blob/master/img/business-friendly.png?raw=true)

### 2. Json parsers using Data bind

Methods	 | [Fastjson ](https://github.com/alibaba/fastjson)| [Gson](https://github.com/google/gson) |  [LoganSquare](https://github.com/bluelinelabs/LoganSquare) | [Moshi](https://github.com/square/moshi) | [Ig json parser](https://github.com/Instagram/ig-json-parser) | [Jackson](http://wiki.fasterxml.com/JacksonHome) | [Genson](http://owlike.github.io/genson/) 
 ----------	 | --- | --- |  --- | --- |  --- | --- | --- 
Initialization | --- | `Gson gson = new Gson()` |  --- |`Moshi moshi = new Moshi.`<br>`Builder().build(); JsonAdapter<Human>`<br>`jsonAdapter = moshi.adapter(Human.class)`|  --- | `ObjectMapper mapper = new ObjectMapper()` | `Genson genson = new Genson()` 
Building json | `JSON.toJSONString(human)` | `gson.toJson(human)` |  `LoganSquare.serialize(human)` | `jsonAdapter.toJson(human)` |  `Human__JsonHelper.serializeToJson(human)` | `mapper.writeValueAsString(human)` | `genson.serialize(human)` 
Parsing json | `JSON.parseObject(jsonString, Human.class)` | `gson.fromJson(jsonString, Human.class)` |  `LoganSquare.parse(jsonString, Human.class)` | `jsonAdapter.fromJson(jsonString)` |  `Human__JsonHelper.parseFromJson(jsonString)` | `mapper.readValue(jsonString, Human.class)` | `genson.deserialize(jsonString, Human.class)`

**Arguments for every example (Json and Java classes)**:

**json**:
```javascript
jsonString =
{
  "message": "Hi",
  "place": {
    "name": "World"
  }
}
```

**Java classes** 
```java
    class Human {
        private String message;
        private Place place;

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public Place getPlace() {
            return place;
        }

        public void setPlace(Place place) {
            this.place = place;
        }

        public void say() {
            System.out.println();
            System.out.println(getMessage() + " , " + getPlace().getName() + "!");
        }
    }

    class Place {
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
```
        // init class
        Place place = new Place();
        place.setName("World");

        Human human = new Human();
        human.setMessage("Hi");
        human.setPlace(place);

**Examples**:

**1) Fastjson**:
```java
        // convert to json
        String jsonString = JSON.toJSONString(human);
        System.out.println("json " + jsonString); //  print "json {"message":"Hi","place":{"name":"World"}}"

        // convert from json
        Human newHuman = JSON.parseObject(jsonString, Human.class);
        newHuman.say(); //  print "Hi , World!"
```
[Full example](https://github.com/Vedenin/useful-java-links/blob/master/helloworlds/3.8-json/fastjson/src/main/java/fastjson/FastJsonHelloWorld.java)

**2) Gson**
```java
        // convert to json
        Gson gson = new Gson();
        String jsonString = gson.toJson(human);
        System.out.println("json " + jsonString); //  print   "json {"message":"Hi","place":{"name":"World"}}"

        // convert from json
        Human newHuman = gson.fromJson(jsonString, Human.class);
        newHuman.say(); //  print   "Hi , World!"

```
[Full example](https://github.com/Vedenin/useful-java-links/blob/master/helloworlds/3.8-json/gson/src/main/java/gson/GsonHelloWorld.java)

**3) LoganSquare**
```java
@JsonObject
public class Human {
    @JsonField(name="message")
    public String message;
    @JsonField(name="place")
    public Place place;

       ....

        // convert to json
        String jsonString = LoganSquare.serialize(human);
        System.out.println("json " + jsonString); // print  "json {"place":{"name":"World"},"message":"Hi"}"

        // convert from json
        Human newHuman = LoganSquare.parse(jsonString, Human.class);
        newHuman.say(); // print  "Hi , World!"

```
[Full example](https://github.com/Vedenin/useful-java-links/tree/master/helloworlds/3.8-json/logansquare/src/main/java/logansquare)

**4) Moshi**
```java
        // convert to json
        Moshi moshi = new Moshi.Builder().build();
        JsonAdapter<Human> jsonAdapter = moshi.adapter(Human.class);

        String jsonString = jsonAdapter.toJson(human);
        System.out.println("json " + jsonString); // print   "json {"message":"Hi","place":{"name":"World"}}"

        // convert from json
        Human newHuman = jsonAdapter.fromJson(jsonString);
        newHuman.say(); //  print  "Hi , World!"

```
[Full example](https://github.com/Vedenin/useful-java-links/blob/master/helloworlds/3.8-json/moshi/src/main/java/moshi/MoshiHelloWorld.java)

**5) Ig json parser**
```java
@JsonType
public class Human {
    @JsonField(fieldName="message")
    public String message;
    @JsonField(fieldName="place")
    public Place place;

        ...

        // convert to json
        String jsonString = Human__JsonHelper.serializeToJson(human);
        System.out.println("json " + jsonString); // print   "json {"place":{"name":"World"},"message":"Hi"}"

        // convert from json
        Human newHuman = Human__JsonHelper.parseFromJson(jsonString);
        newHuman.say(); //  print  "Hi , World!"
```
[Full example](https://github.com/Vedenin/useful-java-links/tree/master/helloworlds/3.8-json/ig_json_parser/src/main/java/ig_json_parser)

**5. Jackson**
```java
        // convert to json
        ObjectMapper mapper = new ObjectMapper();
        String jsonString = mapper.writeValueAsString(human);
        System.out.println("json " + jsonString); //  print   "json {"message":"Hi","place":{"name":"World"}}"

        // convert from json
        Human newHuman = mapper.readValue(jsonString, Human.class);
        newHuman.say(); //  print  "Hi , World!"
```
[Full example](https://github.com/Vedenin/useful-java-links/blob/master/helloworlds/3.8-json/jackson/src/main/java/jackson/JacksonHelloWorld.java)

**6. Genson**
```java
        // convert to json
        String jsonString = new Genson().serialize(human);

        System.out.println("json " + jsonString); // print   "json {"message":"Hi","place":{"name":"World"}}"

        // convert from json
        Human newHuman =  new Genson().deserialize(jsonString, Human.class);
        newHuman.say(); //  print   "Hi , World!"
```
[Full example](https://github.com/Vedenin/useful-java-links/blob/master/helloworlds/3.8-json/genson/src/main/java/genson/GensonHelloWorld.java)

### 3. Json parsers using Tree Model

**Parsing json**:

**Methods**	 | [Gson](https://github.com/google/gson) | [Jackson](http://wiki.fasterxml.com/JacksonHome) | [JSON java](https://github.com/stleary/JSON-java)
---------- 	 | --- | --- |  --- 
Initialization | `JsonParser parser = new JsonParser()` |  `new ObjectMapper()` |  - 
Json parsing	 |  `parser.parse(<string>)` | `mapper.readValue(<string>, JsonNode.class)` |  `new JSONObject(<string>)` 
Get main object | `root.getAsJsonObject()` | - |  - 
Get string value | `root.get(<name>).getAsString()` | `root.get(<name>).asText()` |  `root.getString(<name>)` 
Get child object | `root.getAsJsonObject(<name>)` | `root.get(<name>)` |  `root.getJSONObject(<name>)` 

**Building json**:

**Methods**	 | [Gson](https://github.com/google/gson) | [Jackson](http://wiki.fasterxml.com/JacksonHome) | [JSON java](https://github.com/stleary/JSON-java)
---------- 	 | --- | --- |  --- 
Initialization| -  |  `new ObjectMapper()` |  - 
Create main object| `new JsonObject()` |  `mapper.createObjectNode()` |  `new JSONObject()`
Add string field | `root.addProperty(<name>, <string>)` | `root.put(<name>, <string>)` |  `root.put(<name>, <string>)` 
Add child object | `root.add(<name>, <object>);` | `root.putObject(<name>)` |   `root.put(<name>, <object>)` 

**Examples:** 

1) Parsing json using gson
```java
        JsonParser parser = new JsonParser();
        JsonElement jsonElement = parser.parse("{\"message\":\"Hi\",\"place\":{\"name\":\"World!\"}}");

        JsonObject rootObject = jsonElement.getAsJsonObject(); // get main object
        String message = rootObject.get("message").getAsString(); // get field "message" as string
        JsonObject childObject = rootObject.getAsJsonObject("place"); // get Place object 
        String place = childObject.get("name").getAsString(); // get field "name"
        System.out.println(message + " " + place); // pring "Hi World!"*/
```
[Full example](https://github.com/Vedenin/useful-java-links/blob/master/helloworlds/3.8-json/gson/src/main/java/gson/advanced/TreeModel.java)
 
2) Building json using Gson

```java
        JsonObject rootObject = new JsonObject(); // create main object
        rootObject.addProperty("message", "Hi"); 
        JsonObject childObject = new JsonObject(); // create "Place" object
        childObject.addProperty("name", "World!"); 
        rootObject.add("place", childObject); // save child object to "place" field

        Gson gson = new Gson();
        String json = gson.toJson(rootObject); 
        System.out.println(json); // print "{"message":"Hi","place":{"name":"World!"}}"
```
[Full example](https://github.com/Vedenin/useful-java-links/blob/master/helloworlds/3.8-json/gson/src/main/java/gson/advanced/TreeModel.java)
 

3)  Parsing json using  Jackson

```java
        ObjectMapper mapper = new ObjectMapper();
        JsonNode rootNode = mapper.readValue("{\"message\":\"Hi\",\"place\":{\"name\":\"World!\"}}", JsonNode.class); 
        String message = rootNode.get("message").asText(); 
        JsonNode childNode =  rootNode.get("place"); // get "Place" object
        String place = childNode.get("name").asText(); 
        System.out.println(message + " " + place); // print "Hi World!"
```
[Full example](https://github.com/Vedenin/useful-java-links/blob/master/helloworlds/3.8-json/jackson/src/main/java/jackson/advanced/TreeModel.java)
 
4) Building json using Jackson

```java
        OutputStream outputStream = new ByteArrayOutputStream();

        ObjectMapper mapper = new ObjectMapper();
        ObjectNode rootNode = mapper.createObjectNode(); // create main object
        rootNode.put("message", "Hi");
        ObjectNode childNode = rootNode.putObject("place"); // create child object
        childNode.put("name", "World!");
        mapper.writeValue(outputStream, childNode); 

        System.out.println(outputStream.toString()); // print "{"message":"Hi","place":{"name":"World!"}}"
```
[Full example](https://github.com/Vedenin/useful-java-links/blob/master/helloworlds/3.8-json/jackson/src/main/java/jackson/advanced/TreeModel.java)
 

5) Parsing and building json using Json Java

```java
        // convert Java to json
        JSONObject root = new JSONObject(); // create main object
        root.put("message", "Hi");
        JSONObject place = new JSONObject(); // create "Place" object
        place.put("name", "World!");
        root.put("place", place); 
        String json = root.toString();
        System.out.println(json); // print "{"message":"Hi","place":{"name":"World!"}}"

        System.out.println();
        // convert json to Java
        JSONObject jsonObject = new JSONObject(json); 
        String message = jsonObject.getString("message");
        String name = jsonObject.getJSONObject("place").getString("name");
        System.out.println(message + " " + name); // print "Hi World!"
```
[Full example](https://github.com/Vedenin/useful-java-links/tree/master/helloworlds/3.8-json/json_java)
 


### 4 Json parsers using Streaming API

**Parsing json:**

**Methods**	 | [Gson](https://github.com/google/gson) | [Jackson](http://wiki.fasterxml.com/JacksonHome) 
---------- 	 | --- | --- 
Initialization | - |  `new JsonFactory()` 
Parsing json	 |  `reader = new JsonReader((<input_stream>)` | `parser = jsonFactory.createParser(<string>)`
Has next token | `reader.hasNext()` | `parser.hasCurrentToken()` 
Get token type  | `reader.peek()` | `parser.nextToken()` 
Get next token | `reader.nextString()`<br>`reader.beginObject()`<br>`reader.endObject()` and so on | `parser.nextToken()` 
Skip token | `reader.skipValue()` | `parser.nextToken()` 
Get string | `reader.nextString()` | `parser.getText()` 

**Building json:**

**Methods**	 | [Gson](https://github.com/google/gson) | [Jackson](http://wiki.fasterxml.com/JacksonHome) 
---------- 	 | --- | --- 
Initialization | writer = new JsonWriter(<output_stream>)  |  `generator = new JsonFactory().createGenerator(<output_stream>, <code_page>)` 
Start object token | `writer.beginObject()` |  `generator.writeStartObject()` 
End object token | `writer.endObject()` |  `generator.writeEndObject()` 
Name field token | `writer.name(<name>)` |  `generator.writeFieldName(<name>)` 
String value token | `writer.value(<string>)` |  `generator.writeStringField(<name>, <string>)` 

**Examples:**

1) Parsing json using Gson

```java
        String str = "{\"message\":\"Hi\",\"place\":{\"name\":\"World!\"}}";
        InputStream in = new ByteArrayInputStream(str.getBytes(Charset.forName("UTF-8")));
        JsonReader reader = new JsonReader(new InputStreamReader(in, "UTF-8"));
        while (reader.hasNext()) { 
            JsonToken jsonToken = reader.peek(); 
            if(jsonToken == JsonToken.BEGIN_OBJECT) { 
                reader.beginObject();
            } else if(jsonToken == JsonToken.END_OBJECT) { 
                reader.endObject();
            } if(jsonToken == JsonToken.STRING) {  
                System.out.print(reader.nextString() + " "); // print Hi World!
            } else {
                reader.skipValue(); 
            }
        }
        reader.close();
```
[Full example](https://github.com/Vedenin/useful-java-links/blob/master/helloworlds/3.8-json/gson/src/main/java/gson/advanced/StreamingAPI.java)
 

2) Building json using Gson

```java
        OutputStream outputStream = new ByteArrayOutputStream();
        JsonWriter writer = new JsonWriter(new OutputStreamWriter(outputStream, "UTF-8"));
        writer.beginObject(); 
        writer.name("message"); 
        writer.value("Hi");
        writer.name("place"); 
        writer.beginObject(); 
        writer.name("name");
        writer.value("World!");
        writer.endObject(); 
        writer.endObject(); 
        writer.close();
        System.out.println(outputStream.toString()); // print "{"message":"Hi","place":{"name":"World!"}}"
```
[Full example](https://github.com/Vedenin/useful-java-links/blob/master/helloworlds/3.8-json/gson/src/main/java/gson/advanced/StreamingAPI.java)
 

3) Parsing json using Jackson

```java
        JsonFactory jsonFactory = new JsonFactory();
        JsonParser jsonParser = jsonFactory.createParser("{\"message\":\"Hi\",\"place\":{\"name\":\"World!\"}}");
        JsonToken jsonToken = jsonParser.nextToken();
        while(jsonParser.hasCurrentToken()) { 
            if(jsonToken == VALUE_STRING) {  
                System.out.print(jsonParser.getText() + " "); // print "Hi World!"
            }
            jsonToken = jsonParser.nextToken();
        }
```
[Full example](https://github.com/Vedenin/useful-java-links/blob/master/helloworlds/3.8-json/jackson/src/main/java/jackson/advanced/StreamingAPI.java)
 

2) Building json using Jackson

```java
        JsonFactory jsonFactory = new JsonFactory();
        OutputStream outputStream = new ByteArrayOutputStream();
        JsonGenerator jsonGenerator = jsonFactory.createGenerator(outputStream, JsonEncoding.UTF8); 
        jsonGenerator.writeStartObject(); 
        jsonGenerator.writeStringField("message", "Hi"); 
        jsonGenerator.writeFieldName("place");
        jsonGenerator.writeStartObject(); 
        jsonGenerator.writeStringField("name", "World!");
        jsonGenerator.writeEndObject(); 
        jsonGenerator.writeEndObject(); 
        jsonGenerator.close();
        System.out.println(outputStream.toString()); // print "{"message":"Hi","place":{"name":"World!"}}"

```
[Full example](https://github.com/Vedenin/useful-java-links/blob/master/helloworlds/3.8-json/jackson/src/main/java/jackson/advanced/StreamingAPI.java)
 

### 5 XPath analogs for json


**Methods**: | [JsonPath](https://github.com/jayway/JsonPath) | [FastJson](https://github.com/alibaba/fastjson) | [Jackson](http://wiki.fasterxml.com/JacksonHome)
---------- 	 | --- | --- | --- 
Type  	 | [XPath-like](https://github.com/Vedenin/useful-java-links/tree/master/helloworlds/3.8-json/json_path) | [XPath-like](https://github.com/alibaba/fastjson/wiki/JSONPath) | [JSON Pointer-like](https://tools.ietf.org/html/rfc6901)
Initialization | - | - | mapper = new ObjectMapper()
Get value using template | `JsonPath.read(<json>, <template>)`  |  `JSONPath.eval(<java_object>, <template>)` | `mapper.readTree(<json>).at(<template>)`
Get collection using template | `JsonPath.read(<json>, <template>)`  |  `JSONPath.eval(<java_object>, <template>)` | `mapper.readTree(<json>).at(<template>)` 
 

1) Using JsonPath
```java
        String jsonHiWorld = "{\"message\":\"Hi\",\"place\":{\"name\":\"World!\"}}\"";

        String message = JsonPath.read(jsonHiWorld, "$.message");
        String place = JsonPath.read(jsonHiWorld, "$.place.name");
        System.out.println(message + " " + place); // print "Hi World!"

```
[Full example](https://github.com/Vedenin/useful-java-links/tree/master/helloworlds/3.8-json/json_path)
 

2) Using FastJson
```java
        String jsonString = "{\"message\":\"Hi\",\"place\":{\"name\":\"World!\"}}\"";
        Human newHuman = JSON.parseObject(jsonString, Human.class);

        Object message = JSONPath.eval(newHuman, "$.message");
        Object world = JSONPath.eval(newHuman, "$.place.name");
        System.out.println(message + " " + world); // print Hi World

```
[Full example](https://github.com/Vedenin/useful-java-links/blob/master/helloworlds/3.8-json/fastjson/src/main/java/fastjson/JsonPathHelloWorld.java)
 

3) More complex example using JsonPath 

```java
        List<String> authors = JsonPath.read(json, "$.store.book[*].author");
        System.out.println("authors: " + authors); // print ["Nigel Rees","Evelyn Waugh","Herman Melville","J. R. R. Tolkien"]

        List<Map<String, Object>> expensiveBooks = JsonPath
                .using(Configuration.defaultConfiguration())
                .parse(json)
                .read("$.store.book[?(@.price > 22)].title", List.class);

        System.out.println(expensiveBooks); // print ["Hello, Middle-earth! "]     
```
```java
 String json = "{\n" +
            "    \"store\": {\n" +
            "        \"book\": [\n" +
            "            {\n" +
            "                \"category\": \"reference\",\n" +
            "                \"author\": \"Nigel Rees\",\n" +
            "                \"title\": \"Sayings of the Century\",\n" +
            "                \"price\": 8.95\n" +
            "            },\n" +
            "            {\n" +
            "                \"category\": \"fiction\",\n" +
            "                \"author\": \"Evelyn Waugh\",\n" +
            "                \"title\": \"Sword of Honour\",\n" +
            "                \"price\": 12.99\n" +
            "            },\n" +
            "            {\n" +
            "                \"category\": \"fiction\",\n" +
            "                \"author\": \"Herman Melville\",\n" +
            "                \"title\": \"Moby Dick\",\n" +
            "                \"isbn\": \"0-553-21311-3\",\n" +
            "                \"price\": 8.99\n" +
            "            },\n" +
            "            {\n" +
            "                \"category\": \"fiction\",\n" +
            "                \"author\": \"J. R. R. Tolkien\",\n" +
            "                \"title\": \"Hello, Middle-earth! \",\n" +
            "                \"isbn\": \"0-395-19395-8\",\n" +
            "                \"price\": 22.99\n" +
            "            }\n" +
            "        ],\n" +
            "        \"bicycle\": {\n" +
            "            \"color\": \"red\",\n" +
            "            \"price\": 19.95\n" +
            "        }\n" +
            "    },\n" +
            "    \"expensive\": 10\n" +
            "}";
```
 
[Full example](https://github.com/Vedenin/useful-java-links/tree/master/helloworlds/3.8-json/json_path)

4) Using Jackson
```java
        ObjectMapper mapper = new ObjectMapper();
        String jsonHiWorld = "{\"message\":\"Hi\",\"place\":{\"name\":\"World!\"}}\"";
        String message = mapper.readTree(jsonHiWorld).at("/message").asText();
        String place = mapper.readTree(jsonHiWorld).at("/place/name").asText();
        System.out.println(message + " " + place); // print "Hi World!"
```
[Full example](https://github.com/Vedenin/useful-java-links/blob/master/helloworlds/3.8-json/jackson/src/main/java/jackson/advanced/JsonPointerHelloWorld.java)

5) Using Jackson ( More complex example)
```java
        ObjectMapper mapper = new ObjectMapper();
        JsonNode root = mapper.readTree(json);
        String author = root.at("/store/book/3/title").asText();
        System.out.println(author); // print ["Hello, Middle-earth! "]
        ...
        private final static String json = "{\n" +
            "    \"store\": {\n" +
            "        \"book\": [\n" +
            "            {\n" +
            "                \"category\": \"reference\",\n" +
            "                \"author\": \"Nigel Rees\",\n" +
            "                \"title\": \"Sayings of the Century\",\n" +
            "                \"price\": 8.95\n" +
            "            },\n" +
            "            {\n" +
            "                \"category\": \"fiction\",\n" +
            "                \"author\": \"Evelyn Waugh\",\n" +
            "                \"title\": \"Sword of Honour\",\n" +
            "                \"price\": 12.99\n" +
            "            },\n" +
            "            {\n" +
            "                \"category\": \"fiction\",\n" +
            "                \"author\": \"Herman Melville\",\n" +
            "                \"title\": \"Moby Dick\",\n" +
            "                \"isbn\": \"0-553-21311-3\",\n" +
            "                \"price\": 8.99\n" +
            "            },\n" +
            "            {\n" +
            "                \"category\": \"fiction\",\n" +
            "                \"author\": \"J. R. R. Tolkien\",\n" +
            "                \"title\": \"Hello, Middle-earth! \",\n" +
            "                \"isbn\": \"0-395-19395-8\",\n" +
            "                \"price\": 22.99\n" +
            "            }\n" +
            "        ],\n" +
            "        \"bicycle\": {\n" +
            "            \"color\": \"red\",\n" +
            "            \"price\": 19.95\n" +
            "        }\n" +
            "    },\n" +
            "    \"expensive\": 10\n" +
            "}";
```
[Full example](https://github.com/Vedenin/useful-java-links/blob/master/helloworlds/3.8-json/jackson/src/main/java/jackson/advanced/JsonPointerHelloWorld.java)


### 6 Generates Java classes from JSON or JSON Schema and JSON validation

**Online resources**:
  1. [jsonschema2pojo.org](http://www.jsonschema2pojo.org/) - generate Java classes from json or json schema with annotations Jackson 1, Jackson2 and Gson, 
  2. [json-schema-validator.herokuapp.com](http://json-schema-validator.herokuapp.com/) - validation json using json schema, generate json/Java classes from json schema and so on, 

**Examples**:
1) Generation Java classes using jsonschema2pojo from Java code
```java
        // Init json
        String source = "{\n" +
                "  \"type\":\"object\",\n" +
                "  \"properties\": {\n" +
                "    \"messageHiWorld\": {\n" +
                "      \"type\": \"string\"\n" +
                "    },\n" +
                "    \"bar\": {\n" +
                "      \"type\": \"integer\"\n" +
                "    },\n" +
                "    \"baz\": {\n" +
                "      \"type\": \"boolean\"\n" +
                "    }\n" +
                "  }\n" +
                "}";

        // Init config
        JCodeModel codeModel = new JCodeModel();

        GenerationConfig config = new DefaultGenerationConfig() {
            @Override
            public boolean isGenerateBuilders() { // set config option by overriding method
                return true;
            }
        };

        // Generate Java POJO from json
        SchemaMapper mapper = new SchemaMapper(new RuleFactory(config, new Jackson2Annotator(), new SchemaStore()), new SchemaGenerator());
        mapper.generate(codeModel, "HelloWorldClass", "com.github.vedenin", source);

        // Save generated class to file
        File directory = new File("helloworlds/3.8-json/jsonschema2pojo/output");
        directory.mkdirs();
        codeModel.build(directory);

        // Show generated class
        File cls = new File("helloworlds/3.8-json/jsonschema2pojo/output/com/github/vedenin/HelloWorldClass.java");
        String codeHelloWorld = Files.toString(cls, Charsets.UTF_8);
        System.out.println(codeHelloWorld);

```
[Full example](https://github.com/Vedenin/useful-java-links/tree/master/helloworlds/3.8-json/jsonschema2pojo)

2) Validate Json using json schema (using jsonschema2pojo)

```java
        final JsonNode fstabSchema = Utils.loadResource("/fstab.json");
        final JsonNode good = Utils.loadResource("/fstab-good.json");
        final JsonNode bad = Utils.loadResource("/fstab-bad.json");
        final JsonNode bad2 = Utils.loadResource("/fstab-bad2.json");

        final JsonSchemaFactory factory = JsonSchemaFactory.byDefault();

        final JsonSchema schema = factory.getJsonSchema(fstabSchema);

        ProcessingReport report;

        report = schema.validate(good);
        System.out.println(report);

        report = schema.validate(bad);
        System.out.println(report);

        report = schema.validate(bad2);
        System.out.println(report);
```
[Full example](https://github.com/Vedenin/useful-java-links/tree/master/helloworlds/3.8-json/json_schema_validator)

3) Generation Java classes using jsonschema2pojo and maven plugin 

- Using this maven pom.xml, change sourceDirectory and targetPackage
```xml
   <build>
        <plugins>
            <plugin>
                <groupId>org.jsonschema2pojo</groupId>
                <artifactId>jsonschema2pojo-maven-plugin</artifactId>
                <version>0.4.22</version>
                <configuration>
                    <sourceDirectory>${basedir}/src/main/resources</sourceDirectory>
                    <targetPackage>com.github.vedenin</targetPackage>
                </configuration>
                <executions>
                    <execution>
                        <goals>
                            <goal>generate</goal>
                        </goals>
                    </execution>
                </executions>
            </plugin>
        </plugins>
    </build>
```
- Save json shema to sourceDirectory 
- After maven/install Java classes will be generated  

[Full example](https://github.com/Vedenin/useful-java-links/blob/master/helloworlds/3.8-json/jsonschema2pojo/pom.xml)

## 7. Documentations 

**Documentations for every library**:

##### JSON parsers
1.  [Alibaba Fastjson](https://github.com/alibaba/fastjson)
1.  [Gson](https://github.com/google/gson/blob/master/UserGuide.md)
1.  [LoganSquare](https://github.com/bluelinelabs/LoganSquare#usage)
1.  [JSON java](https://github.com/stleary/JSON-java)
1.  [Square Moshi](https://github.com/square/moshi#moshi)
1.  [Instagram Ig json parser](https://github.com/Instagram/ig-json-parser#getting-started)
1.  [Jackson](https://github.com/FasterXML/jackson-docs)
1.  [Genson](http://owlike.github.io/genson/Documentation/UserGuide/)


##### Analog XPath for JSON
1.  [Jayway JsonPath](https://github.com/jayway/JsonPath#getting-started) 
1.  [Alibaba Fastjson](https://github.com/alibaba/fastjson)

##### Generates Java types from JSON or JSON Schema or JSON validation
1.  [Jsonschema2pojo](https://github.com/joelittlejohn/jsonschema2pojo/wiki/Getting-Started)
1.  [Json schema validator](https://github.com/fge/json-schema-validator#read-me-first)

**All examples**: 
  1.  [Alibaba Fastjson](https://github.com/Vedenin/useful-java-links/tree/master/helloworlds/3.8-json/fastjson)
  2.  [Gson](https://github.com/Vedenin/useful-java-links/tree/master/helloworlds/3.8-json/gson)
  3.  [LoganSquare](https://github.com/Vedenin/useful-java-links/tree/master/helloworlds/3.8-json/logansquare)
  4.  [JSON java](https://github.com/Vedenin/useful-java-links/tree/master/helloworlds/3.8-json/json_java)
  5.  [Square Moshi](https://github.com/Vedenin/useful-java-links/tree/master/helloworlds/3.8-json/moshi)
  6.  [Instagram Ig json parser](https://github.com/Vedenin/useful-java-links/tree/master/helloworlds/3.8-json/ig_json_parser)
  7.  [Jackson](https://github.com/Vedenin/useful-java-links/tree/master/helloworlds/3.8-json/jackson)
  8.  [Genson](https://github.com/Vedenin/useful-java-links/tree/master/helloworlds/3.8-json/genson)
  9.  [Jayway JsonPath](https://github.com/Vedenin/useful-java-links/tree/master/helloworlds/3.8-json/json_path)
  10.  [Jsonschema2pojo](https://github.com/Vedenin/useful-java-links/tree/master/helloworlds/3.8-json/jsonschema2pojo)
  11.  [Json schema validator](https://github.com/Vedenin/useful-java-links/tree/master/helloworlds/3.8-json/json_schema_validator)
  

If you want to help this project, see this [guidelines](https://github.com/Vedenin/useful-java-links/blob/master/helloworlds/contributing.md)
