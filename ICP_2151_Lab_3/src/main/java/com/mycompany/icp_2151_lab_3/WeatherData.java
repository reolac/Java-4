package com.mycompany.icp_2151_lab_3;

/**
 * WeatherData Object used to list all of the searches in XML
 * @author Michael Smith
 * @author Huw Price
 */
public class WeatherData {

    private String date = null;
    private String term = null;
    private final boolean found;
    private String id = null;

    

    /**
     * Constructs a WeatherData Object which contains the information we need to
     * write into the XML
     * @param date the date that the data was searched
     * @param term the search query
     * @param found if the query was valid and geo data was found
     * @param id the geographical identifier
     */
    public WeatherData(String date, String term, boolean found, String id) {
        this.date = date;
        this.term = term;
        this.found = found;
        this.id = id;
    }

    /**
     * Gets the date of the object
     * @return the date to the calling XML parser
     */
    public String getDate() {
        return date;
    }

    /**
     * Gets the search query of the object
     * @return the search query to the calling XML parser
     */
    public String getTerm() {
        return term;
    }

    /**
     * Gets if status of the query being valid or invalid
     * @return the status to the calling XML parser
     */
    public boolean getFound() {
        return found;
    }

    /**
     * Gets the geographical identifier
     * @return the status to the calling XML parser
     */
    public String getID() {
        return id;
    }
}
