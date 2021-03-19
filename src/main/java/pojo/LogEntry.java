package pojo;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.sql.Timestamp;
enum type_of_change{CREATE, UPDATE, DELETE;}

@XmlRootElement
public class LogEntry implements Serializable {
//    @XmlElement(name = "id")
    private int id;
//    @XmlElement(name = "typeOfChange")
    private type_of_change t;
//    @XmlElement(name = "timestamp")
    private String timestampString;
//    @XmlElement(name = "ISRC")
    private String ISRC;

    public LogEntry(){

    }
    public String getTimestampString(){return timestampString;}
    public void setTimestampString(String timestampString){
        this.timestampString = timestampString;
    }
    public String getISRC() {
        return ISRC;
    }

    public void setISRC(String ISRC) {
        this.ISRC = ISRC;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public type_of_change getT() {
        return t;
    }

    public void setT(type_of_change t) {
        this.t = t;
    }
    public static String typeOfChangeToString(type_of_change type){
        switch(type){
            case CREATE:
                return "CREATE";
            case DELETE:
                return "DELETE";
            case UPDATE:
                return "UPDATE";
            default:
                return "Unknown type of change";

        }
    }
    public static type_of_change stringToTypeOfChange(String type){
        switch(type){
            case "CREATE":
                return type_of_change.CREATE;
            case "UPDATE":
                return type_of_change.UPDATE;
            case "DELETE":
                return type_of_change.DELETE;
            default:
                return null;
        }
    }
    public String toString(){
        String str = "";
        str += "ID: " + Integer.toString(id) + "\n";
        str += "Timestamp: " + timestampString + "\n";
        str += "Type of change: " + typeOfChangeToString(t) + "\n";
        str += "ISRC: " + ISRC + "\n";
        return str;
    }

}
