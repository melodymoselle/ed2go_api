//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.10.10 at 02:34:37 PM PDT 
//


package https.api_ed2go;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Category complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Category"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Name" type="{https://api.ed2go.com/}EncodedValue" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{https://api.ed2go.com/}EncodedValue" minOccurs="0"/&gt;
 *         &lt;element name="CourseCodes" type="{https://api.ed2go.com/}ArrayOfString" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="CategoryID" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Category", propOrder = {
    "name",
    "description",
    "courseCodes"
})
public class Category {

    @XmlElement(name = "Name")
    protected EncodedValue name;
    @XmlElement(name = "Description")
    protected EncodedValue description;
    @XmlElement(name = "CourseCodes")
    protected ArrayOfString courseCodes;
    @XmlAttribute(name = "CategoryID", required = true)
    protected int categoryID;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link EncodedValue }
     *     
     */
    public EncodedValue getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link EncodedValue }
     *     
     */
    public void setName(EncodedValue value) {
        this.name = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link EncodedValue }
     *     
     */
    public EncodedValue getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link EncodedValue }
     *     
     */
    public void setDescription(EncodedValue value) {
        this.description = value;
    }

    /**
     * Gets the value of the courseCodes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getCourseCodes() {
        return courseCodes;
    }

    /**
     * Sets the value of the courseCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setCourseCodes(ArrayOfString value) {
        this.courseCodes = value;
    }

    /**
     * Gets the value of the categoryID property.
     * 
     */
    public int getCategoryID() {
        return categoryID;
    }

    /**
     * Sets the value of the categoryID property.
     * 
     */
    public void setCategoryID(int value) {
        this.categoryID = value;
    }

}
