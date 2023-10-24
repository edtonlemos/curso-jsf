package testeXML;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import javax.swing.text.Document;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

public class App {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		// TODO Auto-generated method stub
		
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		dbf.setFeature("http://apache.org/xml/features/disallow-doctype-decl", true);
		
		DocumentBuilder docBuilder = dbf.newDocumentBuilder();
		String documento = "Meu texto";
		ByteArrayInputStream bais = new ByteArrayInputStream(documento.getBytes());
		Document document = (Document) docBuilder.parse(bais);
		
		System.out.println(document.toString());
		
		

	}

}
