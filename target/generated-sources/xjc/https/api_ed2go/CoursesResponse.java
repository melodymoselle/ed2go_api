//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.10.10 at 02:34:37 PM PDT 
//


package https.api_ed2go;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CoursesResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CoursesResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Result" type="{https://api.ed2go.com/}Result" minOccurs="0"/&gt;
 *         &lt;element name="Courses" type="{https://api.ed2go.com/}ArrayOfCourse" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CoursesResponse", propOrder = {
    "result",
    "courses"
})
public class CoursesResponse {

    @XmlElement(name = "Result")
    protected Result result;
    @XmlElement(name = "Courses")
    protected ArrayOfCourse courses;

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link Result }
     *     
     */
    public Result getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link Result }
     *     
     */
    public void setResult(Result value) {
        this.result = value;
    }

    /**
     * Gets the value of the courses property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCourse }
     *     
     */
    public ArrayOfCourse getCourses() {
        return courses;
    }

    /**
     * Sets the value of the courses property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCourse }
     *     
     */
    public void setCourses(ArrayOfCourse value) {
        this.courses = value;
    }

}
