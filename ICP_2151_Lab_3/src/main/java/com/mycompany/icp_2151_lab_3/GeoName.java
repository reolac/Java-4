package com.mycompany.icp_2151_lab_3;

import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

/**
 * Uses the GeoName API to get convert the location name into a geocode
 * @author Michael Smith
 * @author Huw Price
 */
public class GeoName {

    private String url = null;
    private String geoName = null;

    /**
     * Takes in the name of the location and runs the query to produce XML which
     * contains the geocode
     * @param loc the actual geographical location
     */
    public void getLoc(String loc) {
        try {
            DocumentBuilderFactory factory
                    = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder
                    = factory.newDocumentBuilder();

            url = "http://api.geonames.org/search?q=" + loc + "&maxRows=1&lang=en&username=reolac";

            Document doc = builder.parse(url);

            XPathFactory xpfactory = XPathFactory.newInstance();
            XPath path = xpfactory.newXPath();

            geoName = path.evaluate("geonames/geoname/geonameId", doc);
            

        } catch (ParserConfigurationException | SAXException | IOException | XPathExpressionException ex) {
            
        }

    }

    /**
     * Used to retrieve the geocode for the one particular location
     * @return returns the geocode to the calling class
     */
    public String getGeoName() {
        return geoName;
    }
}

