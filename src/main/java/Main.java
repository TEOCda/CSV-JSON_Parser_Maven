import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.List;


public class Main {

    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        Json json = new Json();

        String[] columnMapping = {"id", "firstName", "lastName", "country", "age"};
        String fileName = "data.csv";
        List<Employee> list = Json.parseCSV(columnMapping, fileName);
        Json.writeString(Json.listToJson(list), "data.json");
        List<Employee> list2 = Json.parseXML("data.xml");
        Json.writeString(Json.listToJson(list2), "data2.json");
    }


}