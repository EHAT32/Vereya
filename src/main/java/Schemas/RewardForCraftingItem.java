//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.10.06 at 08:04:05 PM GMT+04:00 
//


package Schemas;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
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
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element name="Item" type="{http://ProjectMalmo.microsoft.com}BlockOrItemSpecWithReward"/>
 *       &lt;/choice>
 *       &lt;attGroup ref="{http://ProjectMalmo.microsoft.com}RewardProducerAttributes"/>
 *       &lt;attribute name="Sparse" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "item"
})
@XmlRootElement(name = "RewardForCraftingItem")
public class RewardForCraftingItem {

    @XmlElement(name = "Item")
    protected List<BlockOrItemSpecWithReward> item;
    @XmlAttribute(name = "Sparse")
    protected Boolean sparse;
    @XmlAttribute(name = "dimension")
    protected Integer dimension;

    /**
     * Gets the value of the item property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the item property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BlockOrItemSpecWithReward }
     * 
     * 
     */
    public List<BlockOrItemSpecWithReward> getItem() {
        if (item == null) {
            item = new ArrayList<BlockOrItemSpecWithReward>();
        }
        return this.item;
    }

    /**
     * Gets the value of the sparse property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isSparse() {
        if (sparse == null) {
            return true;
        } else {
            return sparse;
        }
    }

    /**
     * Sets the value of the sparse property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSparse(Boolean value) {
        this.sparse = value;
    }

    /**
     * Gets the value of the dimension property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getDimension() {
        if (dimension == null) {
            return  0;
        } else {
            return dimension;
        }
    }

    /**
     * Sets the value of the dimension property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDimension(Integer value) {
        this.dimension = value;
    }

}
