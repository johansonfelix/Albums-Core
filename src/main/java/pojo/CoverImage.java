package pojo;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@XmlRootElement
public class CoverImage implements Serializable {

    @XmlElement(name = "base64attachment")
    private String base64attachment;
    @XmlElement(name = "mimeType")
    private String mimeType;

    public CoverImage(){}

    public CoverImage(String base64Attachment, String mimeType) {
        this.base64attachment = base64Attachment;
        this.mimeType = mimeType;
    }

    public String getBase64atatchment() {
        return base64attachment;
    }

    public void setBase64atatchment(String base64atatchment) {
        this.base64attachment = base64atatchment;
    }

    public String getMimeType() {
        return mimeType;
    }

    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    public String toString(){
        return "Base64Attachment: "+base64attachment+ ", " +
                "MIME Type: "+mimeType;
    }
}
