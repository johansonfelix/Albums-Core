package exceptions;

import java.io.IOException;
import java.io.Serializable;

public class RepException extends Exception implements Serializable {
    String message;

    public RepException(String message){
        super(message);
        this.message = message;
    }

    public RepException(){}

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
