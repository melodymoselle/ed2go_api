//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.10.09 at 03:49:51 PM PDT 
//


package com.vegaspbs.types.ed2go;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="APIKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CoursesFilter" type="{https://api.ed2go.com/}CoursesFilter"/&gt;
 *         &lt;element name="IncludeFields" type="{https://api.ed2go.com/}ArrayOfCourseIncludeField" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "apiKey",
    "coursesFilter",
    "includeFields"
})
@XmlRootElement(name = "GetCourses")
public class GetCourses {

    @XmlElement(name = "APIKey")
    protected String apiKey;
    @XmlElement(name = "CoursesFilter", required = true, nillable = true)
    protected CoursesFilter coursesFilter;
    @XmlElement(name = "IncludeFields")
    protected ArrayOfCourseIncludeField includeFields;

    /**
     * Gets the value of the apiKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPIKey() {
        return apiKey;
    }

    /**
     * Sets the value of the apiKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPIKey(String value) {
        this.apiKey = value;
    }

    /**
     * Gets the value of the coursesFilter property.
     * 
     * @return
     *     possible object is
     *     {@link CoursesFilter }
     *     
     */
    public CoursesFilter getCoursesFilter() {
        return coursesFilter;
    }

    /**
     * Sets the value of the coursesFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link CoursesFilter }
     *     
     */
    public void setCoursesFilter(CoursesFilter value) {
        this.coursesFilter = value;
    }

    /**
     * Gets the value of the includeFields property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCourseIncludeField }
     *     
     */
    public ArrayOfCourseIncludeField getIncludeFields() {
        return includeFields;
    }

    /**
     * Sets the value of the includeFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCourseIncludeField }
     *     
     */
    public void setIncludeFields(ArrayOfCourseIncludeField value) {
        this.includeFields = value;
    }

}