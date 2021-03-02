package pojo;

import java.sql.Timestamp;
enum type_of_change{CREATE, UPDATE, DELETE;}

public class LogEntry {

    private Timestamp timestamp;
    type_of_change t;

    String ISRC;

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


    public type_of_change getT() {
        return t;
    }

    public void setT(type_of_change t) {
        this.t = t;
    }

}
