package examples.utils;

import java.io.FileReader;

import java.io.IOException;
import java.util.function.Consumer;

import net.serenitybdd.screenplay.Actor;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;

public class DatosParametrizados {

    public static Consumer<Actor> leerJson() throws IOException, ParseException {
        Object ob = new JSONParser().parse(new FileReader("./src/test/java/examples/data/createData.json"));

        // typecasting ob to JSONObject
        JSONObject js = (JSONObject) ob;

        return null;
    }

}
