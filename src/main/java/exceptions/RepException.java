package exceptions;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.ws.WebFault;
import java.io.Serializable;

@WebFault(name = "RepException")
public class RepException extends Exception{


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
