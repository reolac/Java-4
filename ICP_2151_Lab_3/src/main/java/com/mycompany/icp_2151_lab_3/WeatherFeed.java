package com.mycompany.icp_2151_lab_3;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

/**
 * Uses DOM to consume a WeatherFeed and print out the weather information
 * @author Michael Smith
 * @author Huw Price
 */
public class WeatherFeed {

    /**
     * Initialises DOM and brings in a URL to parse into a document
     * Then queries the created document 
     * @param args command line arguments
     */
    public static void main(String[] args){
        try {
            DocumentBuilderFactory factory
                    = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder
                    = factory.newDocumentBuilder();
            
            Document doc = builder.parse("http://open.live.bbc.co.uk/weather/feeds/en/2656397/observations.rss");
            
            XPathFactory xpfactory = XPathFactory.newInstance();
            XPath path = xpfactory.newXPath();
            
            String description = path.evaluate("rss/channel/item/title", doc);
            
            System.out.println(description);
        } catch (ParserConfigurationException | SAXException | IOException | XPathExpressionException ex) {
            Logger.getLogger(WeatherFeed.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
