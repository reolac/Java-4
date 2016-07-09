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
 *
 * @author Michael Smith
 * @author Huw Price
 */
public class WeatherFeed2 {

    private String result = null;
    private String fileLoc = null;
    private String temp = null;
    private String windDir = null;
    private String windSpd = null;
    private String humidity = null;
    private String pressure = null;
    private String visibility = null;

    /**
     * Initialises DOM, creates a URL by pulling information from the GUI for the location
     * and using GeoName to get the geocode to complete the URL, creates a document
     * which is then queried, the queries return what picture
     * to load and addition weather information for the JTable
     * @param url the geocode of the location called from GeoName
     */
    public void getFeed(String url) {

        try {
            DocumentBuilderFactory factory
                    = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder
                    = factory.newDocumentBuilder();

            Document doc = builder.parse("http://open.live.bbc.co.uk/weather/feeds/en/" + url + "/observations.rss");
            //Document doc = builder.parse("C:\\Users\\Michael\\Documents\\NetBeansProjects\\ICP_2151_Lab_3 - Copy\\src\\main\\resources\\bbcWeatherFeed.xml");

            XPathFactory xpfactory = XPathFactory.newInstance();
            XPath path = xpfactory.newXPath();

            result = path.evaluate("rss/channel/item/title", doc);

            if (!path.evaluate("rss/channel/item/title[contains(text(), 'Sunny')]", doc).isEmpty()) {
                fileLoc = "/sunny.png";
            } else if (!path.evaluate("rss/channel/item/title[contains(text(), 'Light Cloud')]", doc).isEmpty()) {
                fileLoc = "/lightCloud.png";
            } else if (!path.evaluate("rss/channel/item/title[contains(text(), 'Cloud')]", doc).isEmpty()) {
                fileLoc = "/cloudy.png";
            } 
//            else if (!path.evaluate("rss/channel/item/title[contains(text(), 'Thick')]", doc).isEmpty()) {
//                fileLoc = "/cloudy.png";
//            }
            
            else if (!path.evaluate("rss/channel/item/title[contains(text(), 'Heavy Rain')]", doc).isEmpty()) {
                fileLoc = "/heavyRain.png";
            } else if (!path.evaluate("rss/channel/item/title[contains(text(), 'Light Rain')]", doc).isEmpty()) {
                fileLoc = "/lightRain.png";
            } else if (!path.evaluate("rss/channel/item/title[contains(text(), 'Snow')]", doc).isEmpty()) {
                fileLoc = "/snow.png";
            } else if (!path.evaluate("rss/channel/item/title[contains(text(), 'Thunder')]", doc).isEmpty()) {
                fileLoc = "/thunder.png";
            } else if (!path.evaluate("rss/channel/item/title[contains(text(), 'Windy')]", doc).isEmpty()) {
                fileLoc = "/windy.png";
            }

            temp = path.evaluate("substring-before(substring-after(/rss/channel/item/description,'Temperature: '),', Wind Direction')", doc);
            windDir = path.evaluate("substring-before(substring-after(/rss/channel/item/description,'Direction: '),', Wind Speed')", doc);
            windSpd = path.evaluate("substring-before(substring-after(/rss/channel/item/description,'Speed: '),', Humidity')", doc);
            humidity = path.evaluate("substring-before(substring-after(/rss/channel/item/description,'Humidity: '),', Pressure')", doc);
            pressure = path.evaluate("substring-before(substring-after(/rss/channel/item/description,'Pressure: '),', Visibility')", doc);
            visibility = path.evaluate("substring-after(/rss/channel/item/description, 'Visibility: ')", doc);
        } catch (ParserConfigurationException | SAXException | IOException | XPathExpressionException ex) {
            System.out.println("Location not found, enter a valid location");
        }

    }

    /**
     * Returns the result to the GUI which displays the general weather information
     * in the JTextField
     * @return the general weather information from a query
     */
    public String getResult() {
        return result;
    }

    /**
     * Returns the image location
     * @return the image location to the GUI to set appropriate image of the JLabel
     */
    public String getImage() {
        return fileLoc;
    }

    /**
     * Returns the temperature from the query
     * @return the temperature to be used in the JTable
     */
    public String getTemp() {
        return temp;
    }

    /**
     * Returns the humidity from the query
     * @return the humidity to be used in the JTable
     */
    public String getHumidity() {
        return humidity;
    }

    /**
     * Returns the pressure from the query
     * @return the pressure to be used in the JTable
     */
    public String getPressure() {
        return pressure;
    }

    /**
     * Returns the visibility from the query
     * @return the pressure to be used in the JTable
     */
    public String getVisibility() {
        return visibility;
    }

    /**
     * Returns the wind direction from the query
     * @return the wind direction to be used in the JTable
     */
    public String getWindDir() {
        return windDir;
    }

    /**
     * Returns the wind speed from the query
     * @return the wind speed to be used in the JTable
     */
    public String getWindSpeed() {
        return windSpd;
    }
}
