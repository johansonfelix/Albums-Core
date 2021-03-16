package pojo;

import java.io.Serializable;

public class CoverImage implements Serializable {

    String base64attachment;
    String mimeType;

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
