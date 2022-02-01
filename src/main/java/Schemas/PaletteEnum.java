//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.10.06 at 08:04:05 PM GMT+04:00 
//


package Schemas;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaletteEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PaletteEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="default"/>
 *     &lt;enumeration value="random"/>
 *     &lt;enumeration value="dungeon"/>
 *     &lt;enumeration value="pyramid"/>
 *     &lt;enumeration value="igloo"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PaletteEnum")
@XmlEnum
public enum PaletteEnum {

    @XmlEnumValue("default")
    DEFAULT("default"),
    @XmlEnumValue("random")
    RANDOM("random"),
    @XmlEnumValue("dungeon")
    DUNGEON("dungeon"),
    @XmlEnumValue("pyramid")
    PYRAMID("pyramid"),
    @XmlEnumValue("igloo")
    IGLOO("igloo");
    private final String value;

    PaletteEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PaletteEnum fromValue(String v) {
        for (PaletteEnum c: PaletteEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
