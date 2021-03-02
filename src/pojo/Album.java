package pojo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@XmlRootElement(name = "album")
@XmlAccessorType(XmlAccessType.FIELD)
public class Album implements Serializable {
    @XmlElement
    private String ISRC;
    @XmlElement
    private String title;
    @XmlElement
    private String description;
    @XmlElement
    private String releaseYear;
    @XmlElement
    private Artist artist;

    private byte[] cover_img;


    public Album(){

    }
    public String getISRC() {
        return ISRC;
    }

    public void setISRC(String ISRC) {
        this.ISRC = ISRC;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(String releaseYear) {
        this.releaseYear = releaseYear;
    }


    public String toString(){
        return "ISRC: " + ISRC +", " +
                "Title: " + title + ", " +
                "Description: " + description + ", " +
                "Release year: " + releaseYear + ", " +
                "Artist: " + artist;
    }
}
