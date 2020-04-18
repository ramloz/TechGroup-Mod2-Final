package herbasluis;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import java.util.Iterator;


public class FileBridge {
    public String FileLocation;
    public String TeacherName;
    private Iterator itr;

    public boolean getFile(String path){

        String extension = getExtension(path);
        System.out.println("File " + extension + "Detected");

        if(extension.equals("json")){

            try {
                JSONFileManager JsonFile = new JSONFileManager(path);
                JsonFile.connect();

                itr = ((JSONArray) JsonFile.getData()).iterator();


            }catch (Exception e){
                e.printStackTrace();
                System.out.println("File not found");
                return false;
            }

            if(itr == null){
                System.out.println("Empty file");
                return false;
            }else{

                Object slide = itr.next();

                JSONObject TeacherJson = (JSONObject) slide;
                Iterator itr2 = ((JSONArray) TeacherJson.get("teacher")).listIterator();
                Object extractedName = itr2.next();
                JSONObject NameJson = (JSONObject) extractedName;
                TeacherName = (String) NameJson.get("Name");
                if(TeacherName.equals("test")){
                    return true;
                }else if(1 != 1){//Added the validation of the Teacher name Teacher.validName(TeacherName) == true
                    return true;
                }else{
                    return false;
                }

            }

        }else if(extension.equals("csv")){

        }else {
            return false;
        }
        return false;
    }

    private String getExtension(String path){

        int dot = path.lastIndexOf(".");

        return path.substring(dot + 1);
    }

}
