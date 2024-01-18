package examples.tasks;

import examples.utils.DatosParametrizados;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import java.io.IOException;

public class NavegationAPI {

    public static Performable createJSON() throws IOException, ParseException {
        return Task.where("{0} crea jsonl",
                DatosParametrizados.leerJson());
    }
}
