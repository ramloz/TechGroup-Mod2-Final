package herbasluis;

import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;

public class CSVFileManager implements FileManager {

    private String path;
    private JSONArray jsonArray;

    public void connect(){
        try {
            JSONParser parser = new JSONParser();
            Object obj = parser.parse(new FileReader(this.path));
            this.jsonArray = (JSONArray) obj;


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Object getData(){

        return this.jsonArray;
    }
}
