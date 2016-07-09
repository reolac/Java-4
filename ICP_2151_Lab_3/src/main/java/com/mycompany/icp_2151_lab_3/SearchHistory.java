package com.mycompany.icp_2151_lab_3;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;

/**
 * Produces an XML document which stores search information for that session of
 * the program
 *
 * @author Michael Smith
 * @author Huw Price
 */
public class SearchHistory {

    private final List<WeatherData> searchList = new ArrayList<>();

    /**
     * Gets information from the GUI and prepares to write it into the XML
     *
     * @param query the search query entered into the GUI
     * @param geoName the geoName of the query if valid
     */
    public void getWeather(String query, String geoName) {
        String fileName = "C:\\Users\\Michael\\Dropbox\\Work\\Advanced Java Programming\\"
                + "Assignments\\ICP_2151_Lab_3\\src\\main\\resources\\weatherSearches.xml";
        SearchHistory xmlStreamWriter = new SearchHistory();

        String date = new SimpleDateFormat("dd-MM-yyyy").format(new Date());
        boolean found = !geoName.isEmpty();

        searchList.add(new WeatherData(date, query, found, geoName));

        xmlStreamWriter.writeXML(fileName, searchList);

    }

    /**
     * Gets the location of the file and a list of data to write to the file
     * Then writes the information in XML
     *
     * @param fileName the location of the file
     * @param searchList a list of all of the search history elements to be
     * written
     */
    private void writeXML(String fileName, List<WeatherData> searchList) {
        XMLOutputFactory xmlOutputFactory = XMLOutputFactory.newInstance();
        try {
            XMLStreamWriter xmlStreamWriter = xmlOutputFactory.createXMLStreamWriter(new FileOutputStream(fileName), "UTF-8");
            xmlStreamWriter.writeStartDocument("UTF-8", "1.0");
            xmlStreamWriter.writeCharacters("\n");
            xmlStreamWriter.writeStartElement("weatherSearches");

            for (WeatherData search : searchList) {
                xmlStreamWriter.writeCharacters("\n\t");
                xmlStreamWriter.writeStartElement("search date");
                xmlStreamWriter.writeAttribute("", search.getDate());

                xmlStreamWriter.writeCharacters("\n\t\t");
                xmlStreamWriter.writeStartElement("term");
                xmlStreamWriter.writeCharacters(search.getTerm());
                xmlStreamWriter.writeEndElement();

                xmlStreamWriter.writeCharacters("\n\t\t");
                xmlStreamWriter.writeStartElement("found");
                xmlStreamWriter.writeCharacters("" + search.getFound());
                xmlStreamWriter.writeEndElement();

                xmlStreamWriter.writeCharacters("\n\t\t");
                xmlStreamWriter.writeStartElement("geoNameID");
                xmlStreamWriter.writeCharacters(search.getID());
                xmlStreamWriter.writeEndElement();

                xmlStreamWriter.writeCharacters("\n\t");
                xmlStreamWriter.writeEndElement();
                xmlStreamWriter.writeCharacters("\n");
            }
            xmlStreamWriter.writeEndElement();
            xmlStreamWriter.writeEndDocument();

            xmlStreamWriter.flush();
            xmlStreamWriter.close();

        } catch (XMLStreamException | FileNotFoundException e) {
        }
    }

}
