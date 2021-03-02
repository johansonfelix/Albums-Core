package pojo;

import java.sql.Timestamp;

public class LogEntry {

    private Timestamp timestamp;
    public enum type_of_change{CREATE, UPDATE, DELETE}
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
}
