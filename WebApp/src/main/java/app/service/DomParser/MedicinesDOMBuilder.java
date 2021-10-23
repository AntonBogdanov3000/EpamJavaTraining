package app.service.DomParser;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashSet;
import java.util.Set;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import app.entities.Medicines;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class MedicinesDOMBuilder {
    private final Set<Medicines> medicines;
    private DocumentBuilder documentBuilder;

    public MedicinesDOMBuilder() {
        this.medicines = new HashSet<>();
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        try {
            documentBuilder = factory.newDocumentBuilder();
        } catch (ParserConfigurationException e) {
            System.out.println(e.getMessage());
        }
    }

    public Set<Medicines> getMedicines() {
        return medicines;
    }

    public void buildSetMedicines(File fileName) {
        try {
            Document document = documentBuilder.parse(fileName);
            Element root = document.getDocumentElement();
            NodeList medicinesList = root.getElementsByTagName("medicins");
            for (int i = 0; i < medicinesList.getLength(); i++) {
                Element medicineElement = (Element) medicinesList.item(i);
                Medicines medicine = buildMedicine(medicineElement);
                medicines.add(medicine);
            }
        } catch (IOException | SAXException | ParseException e) {
            e.printStackTrace();
        }
    }

    private Medicines buildMedicine(Element medElement) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        Medicines medicine = new Medicines();
        medicine.setName(medElement.getElementsByTagName("name").item(0).getTextContent());
        medicine.setPharm(medElement.getElementsByTagName("pharm").item(0).getTextContent());
        medicine.setGroup(medElement.getElementsByTagName("group").item(0).getTextContent());
        medicine.setAnalog(medElement.getElementsByTagName("analogs").item(0).getTextContent());
        medicine.setVersion(medElement.getElementsByTagName("versions").item(0).getTextContent());

        Medicines.Certificate certificate = new Medicines.Certificate();
        Element certificateElement = (Element) medElement.getElementsByTagName("certificate").item(0);
        certificate.setNumber(Long.parseLong(certificateElement.getElementsByTagName("number").item(0).getTextContent()));
        certificate.setDate_of_issue(formatter.parse(certificateElement.getElementsByTagName("date_of_issue").item(0).getTextContent()));
        certificate.setExpiry_date(formatter.parse(certificateElement.getElementsByTagName("expiry_date").item(0).getTextContent()));
        certificate.setOrganization(certificateElement.getElementsByTagName("organization").item(0).getTextContent());
        medicine.setCertificate(certificate);

        Medicines.Package pack = new Medicines.Package();
        Element packElement = (Element) medElement.getElementsByTagName("package").item(0);
        pack.setType(packElement.getElementsByTagName("package_type").item(0).getTextContent());
        pack.setCount(Integer.parseInt(packElement.getElementsByTagName("count").item(0).getTextContent()));
        pack.setPrice(Double.parseDouble(packElement.getElementsByTagName("price").item(0).getTextContent()));
        medicine.setPack(pack);

        Medicines.Dosage dose = new Medicines.Dosage();
        Element doseElement = (Element) medElement.getElementsByTagName("dosage").item(0);
        dose.setDose(Double.parseDouble(doseElement.getElementsByTagName("dose").item(0).getTextContent()));
        dose.setUse(doseElement.getElementsByTagName("use").item(0).getTextContent());
        medicine.setDosage(dose);
        return medicine;
    }

}
