package pojo;

import java.sql.Timestamp;
enum type_of_change{CREATE, UPDATE, DELETE;}

public class LogEntry {

    private int id;
    private Timestamp timestamp;
    private type_of_change t;
    private String ISRC;

    public LogEntry(){}

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
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
        str += "Timestamp: " + timestamp.toString() + "\n";
        str += "Type of change: " + typeOfChangeToString(t) + "\n";
        str += "ISRC: " + ISRC + "\n";
        return str;
    }

}
