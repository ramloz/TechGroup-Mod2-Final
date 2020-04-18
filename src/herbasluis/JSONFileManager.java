package herbasluis;

import java.io.FileReader;
import java.io.FileNotFoundException;
import org.json.simple.parser.JSONParser;
import org.json.simple.JSONArray;

public class JSONFileManager implements FileManager{

    private String path;
    private JSONArray jsonArray;

    public JSONFileManager(String path){
        this.path = path;
    }

    public void connect(){
        try {
            JSONParser parser = new JSONParser();
            Object obj = parser.parse(new FileReader(this.path));
            this.jsonArray = (JSONArray) obj;

        } catch (FileNotFoundException e) {
            e.printStackTrace();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Object getData(){

        return this.jsonArray;
    }


}
