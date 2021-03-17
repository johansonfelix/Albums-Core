package pojo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.Base64;

@XmlRootElement
public class Album implements Serializable {
    @XmlElement(name = "ISRC")
    private String ISRC;
    @XmlElement(name = "title")
    private String title;
    @XmlElement(name = "description")
    private String description;
    @XmlElement(name = "releaseYear")
    private String releaseYear;
    @XmlElement(name = "artistFirstName")
    private String artistFirstName;
    @XmlElement(name = "artistLastName")
    private String artistLastName;
    @XmlElement(name = "coverImage")
    private CoverImage coverImage;

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
    public String getArtistFirstName() {
        return artistFirstName;
    }

    public void setArtistFirstName(String artistFirstName) {
        this.artistFirstName = artistFirstName;
    }

    public String getArtistLastName() {
        return artistLastName;
    }

    public void setArtistLastName(String artistLastName) {
        this.artistLastName = artistLastName;
    }

    public CoverImage getCoverImage() {
        return coverImage;
    }

    public void setCoverImage(CoverImage coverImage) {
        this.coverImage = coverImage;
    }

    public String toString(){
        return "ISRC: " + ISRC +", " +
                "Title: " + title + ", " +
                "Description: " + description + ", " +
                "Release year: " + releaseYear + ", " +
                "Cover Image : ["+ coverImage.toString()+"], " +
                "Artist first name: " + artistFirstName + ", " +
                "Artist last name: " + artistLastName;
    }
}
