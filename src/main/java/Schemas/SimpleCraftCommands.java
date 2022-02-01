//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.10.06 at 08:04:05 PM GMT+04:00 
//


package Schemas;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="ViewToCraft" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ModifierList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://ProjectMalmo.microsoft.com}CommandListModifier">
 *                 &lt;choice maxOccurs="unbounded">
 *                   &lt;element name="command" type="{http://ProjectMalmo.microsoft.com}SimpleCraftCommand" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {

})
@XmlRootElement(name = "SimpleCraftCommands")
public class SimpleCraftCommands {

    @XmlElement(name = "ViewToCraft", defaultValue = "false")
    protected Boolean viewToCraft;
    @XmlElement(name = "ModifierList")
    protected SimpleCraftCommands.ModifierList modifierList;

    /**
     * Gets the value of the viewToCraft property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isViewToCraft() {
        return viewToCraft;
    }

    /**
     * Sets the value of the viewToCraft property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setViewToCraft(Boolean value) {
        this.viewToCraft = value;
    }

    /**
     * Gets the value of the modifierList property.
     * 
     * @return
     *     possible object is
     *     {@link SimpleCraftCommands.ModifierList }
     *     
     */
    public SimpleCraftCommands.ModifierList getModifierList() {
        return modifierList;
    }

    /**
     * Sets the value of the modifierList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleCraftCommands.ModifierList }
     *     
     */
    public void setModifierList(SimpleCraftCommands.ModifierList value) {
        this.modifierList = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://ProjectMalmo.microsoft.com}CommandListModifier">
     *       &lt;choice maxOccurs="unbounded">
     *         &lt;element name="command" type="{http://ProjectMalmo.microsoft.com}SimpleCraftCommand" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ModifierList
        extends CommandListModifier
    {


    }

}
