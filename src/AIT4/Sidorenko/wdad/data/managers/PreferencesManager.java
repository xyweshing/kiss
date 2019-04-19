package AIT4.Sidorenko.wdad.data.managers;


import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;

public class PreferencesManager {
    private static PreferencesManager ourInstance = new PreferencesManager();
    private Document doc;
    private String filepath = "src/AIT4/Sidorenko/wdad/resources/configuration/appconfig.xml";

    {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder;
        try {
            builder = factory.newDocumentBuilder();
            doc = builder.parse(new File(filepath));
        }catch (ParserConfigurationException e ) {
            e.printStackTrace();
        }catch (SAXException e) {
        e.printStackTrace();
         }catch (IOException e){
        e.printStackTrace();
    }}

private PreferencesManager()  { }

public static PreferencesManager getInstance() {return ourInstance;}
public Document getDoc() {return  doc;}

public void setCreateregistery (String newValue) {
    Node elem = doc.getElementsByTagName("createregistery").item(0).getFirstChild();
    elem.setNodeValue(newValue);
    Transformer transformer = null;

    try {
        transformer = TransformerFactory.newInstance().newTransformer();
        DOMSource source = new DOMSource(doc);
        StreamResult result = new StreamResult(new File(filepath));
        transformer.transform(source, result);
    } catch (TransformerConfigurationException e) {
        e.printStackTrace();
    } catch (TransformerException e) {
        e.printStackTrace();
    }
    System.out.println("Изменения сохранены");
}
public String getCreaterefistery() {
    Node elem = doc.getElementsByTagName("createregistery").item(0).getFirstChild();
    return elem.getNodeValue();
}



public void setRegistryaddress(String newValue) {
    Node elem = doc.getElementsByTagName("registeryadress").item(0).getFirstChild();
    elem.setNodeValue(newValue);
    Transformer transformer = null;
    try {
        transformer = TransformerFactory.newInstance().newTransformer();
        DOMSource source = new DOMSource(doc);
        StreamResult result = new StreamResult(new File(filepath));
        transformer.transform(source, result);
    } catch (TransformerConfigurationException e) {
        e.printStackTrace();
    } catch (TransformerException e) {
        e.printStackTrace();
    }
    System.out.println("Изменения сохранены");
}
public String getRegisteryaddres() {
    Node elem = doc.getElementsByTagName("registeryaddres").item(0).getFirstChild();
    return elem.getNodeValue();
}


    public void setRegistryport(String newValue) {
        Node elem = doc.getElementsByTagName("registeryport").item(0).getFirstChild();
        elem.setNodeValue(newValue);
        Transformer transformer = null;
        try {
            transformer = TransformerFactory.newInstance().newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File(filepath));
            transformer.transform(source, result);
        } catch (TransformerConfigurationException e) {
            e.printStackTrace();
        } catch (TransformerException e) {
            e.printStackTrace();
        }
        System.out.println("Изменения сохранены");
    }
    public String getRegistryport() {
        Node elem = doc.getElementsByTagName("registeryport").item(0).getFirstChild();
        return elem.getNodeValue();
    }

    public void setPolicypath(String newValue) {
        Node elem = doc.getElementsByTagName("policypath").item(0).getFirstChild();
        elem.setNodeValue(newValue);
        Transformer transformer = null;
        try {
            transformer = TransformerFactory.newInstance().newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File(filepath));
            transformer.transform(source, result);
        } catch (TransformerConfigurationException e) {
            e.printStackTrace();
        } catch (TransformerException e) {
            e.printStackTrace();
        }
        System.out.println("Изменения сохранены");
    }
    public String getPolicypath() {
        Node elem = doc.getElementsByTagName("policypath").item(0).getFirstChild();
        return elem.getNodeValue();
    }


    public void setUsecodebaseonly(String newValue) {
        Node elem = doc.getElementsByTagName("usecodebaseonly").item(0).getFirstChild();
        elem.setNodeValue(newValue);
        Transformer transformer = null;
        try {
            transformer = TransformerFactory.newInstance().newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File(filepath));
            transformer.transform(source, result);
        } catch (TransformerConfigurationException e) {
            e.printStackTrace();
        } catch (TransformerException e) {
            e.printStackTrace();
        }
        System.out.println("Изменения сохранены");
    }
    public String getUsecodebaseonly() {
        Node elem = doc.getElementsByTagName("usecodebaseonly").item(0).getFirstChild();
        return elem.getNodeValue();
    }



    public void setClassprovder(String newValue) {
        Node elem = doc.getElementsByTagName("classprovder").item(0).getFirstChild();
        elem.setNodeValue(newValue);
        Transformer transformer = null;
        try {
            transformer = TransformerFactory.newInstance().newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File(filepath));
            transformer.transform(source, result);
        } catch (TransformerConfigurationException e) {
            e.printStackTrace();
        } catch (TransformerException e) {
            e.printStackTrace();
        }
        System.out.println("Изменения сохранены");
    }
    public String getClassprovder() {
        Node elem = doc.getElementsByTagName("classprovder").item(0).getFirstChild();
        return elem.getNodeValue();
    }
}














