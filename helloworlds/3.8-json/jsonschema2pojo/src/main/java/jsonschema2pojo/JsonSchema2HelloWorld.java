package jsonschema2pojo;

import com.google.common.io.Files;
import com.sun.codemodel.JCodeModel;
import org.apache.commons.io.Charsets;
import org.jsonschema2pojo.*;
import org.jsonschema2pojo.rules.RuleFactory;

import java.io.File;

/**
 *  JsonSchema2 Hello World - generate java class from json fro GSON, Jackson and other lib
 *
  */
public class JsonSchema2HelloWorld {

    public static void main(String[] args) throws Exception {
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
    }
}
