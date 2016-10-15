/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.peramtakehomeexam;

import java.util.Date;

/**
 *
 * @author Vinod Kumar Reddy Peram
 */
public class Song {
    /*
    instance variables
    */  

    private int sno;
    private String genre;
    private int criticscore;
    private String albumname;
    private String artist;
    private Date releasedate;

 /*
    No-arg construcotr
 */
    public Song() {
    }

 /**
 * Multiple Argument Constructor
 * @param sno Defines the serial number
 * @param genre Defines the Bonus salary of the Employee for that year
 * @param criticscore Percentage of Insurance Employee pays 
 * @param albumname Tax Percentage Employee Pays per Year
 * @param artist Tax Percentage Employee Pays per Year
 * @param releasedate Tax Percentage Employee Pays per Year
 * 
 */
    public Song(int sno, String genre, int criticscore, String albumname, String artist, Date releasedate) {
        this.sno = sno;
        this.genre = genre;
        this.criticscore = criticscore;
        this.albumname = albumname;
        this.artist = artist;
        this.releasedate = releasedate;
    }
     
/**
 * Method to access Sno  
 * @return sno
 */
    public int getSno() {
        return sno;
    }

/**
 * Sets the value of Sno
 * @param sno Sets Sno
 */
    public void setSno(int sno) {
        this.sno = sno;
    }
/*
 * Method to access Genre  
 * @return genre
 */
    public String getGenre() {
        return genre;
    }

 /**
 * Sets the value of Genre
 * @param genre Sets Genre
 */
    public void setGenre(String genre) {
        this.genre = genre;
    }

 /*
 * Method to access Criticscore  
 * @return criticscore
 */
    public int getCriticscore() {
        return criticscore;
    }
/*
 * Sets the value of Critic score
 * @param criticscore Sets Critic score
 */
    public void setCriticscore(int criticscore) {
        this.criticscore = criticscore;
    }
/*
 * Method to access Albumname  
 * @return albumname
 */
    public String getAlbumname() {
        return albumname;
    }

 /*
 * Sets the value of Album name
 * @param albumname Sets Album name
 */
    public void setAlbumname(String albumname) {
        this.albumname = albumname;
    }
/*
 * Method to access Artist  
 * @return artist
 */
    public String getArtist() {
        return artist;
    }
 /*
 * Sets the value of Artist
 * @param artist Sets artist
 */
    public void setArtist(String artist) {
        this.artist = artist;
    }

 /*
 * Method to access Releasedate  
 * @return releasedate 
 */
    public Date getReleasedate() {
        return releasedate;
    }
/*
 * Sets the value of Release date
 * @param releasedate Sets Releasedate
 */
    public void setReleasedate(Date releasedate) {
        this.releasedate = releasedate;
    }
    
 
 
}
