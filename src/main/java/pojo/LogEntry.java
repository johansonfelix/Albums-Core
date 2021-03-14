package pojo;

import java.sql.Timestamp;

enum TypeOfChange{
    CREATE, UPDATE, DELETE
}

public class LogEntry {

    Timestamp timestamp;
    TypeOfChange change;
    String ISRC;

    LogEntry(){

    }

    public LogEntry(Timestamp timestamp, String change, String ISRC) {
        this.timestamp = timestamp;
        setChange(change);
        this.ISRC = ISRC;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    public TypeOfChange getChange() {
        return change;
    }


    public void setChange(String change) {

        switch (change) {
            case "CREATE" -> this.change = TypeOfChange.CREATE;
            case "UPDATE" -> this.change = TypeOfChange.UPDATE;
            case "DELETE" -> this.change = TypeOfChange.DELETE;
            default -> this.change = null;
        }

    }

    public String getISRC() {
        return ISRC;
    }

    public void setISRC(String ISRC) {
        this.ISRC = ISRC;
    }
}
