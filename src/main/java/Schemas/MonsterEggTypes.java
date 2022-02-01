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
 * <p>Java class for MonsterEggTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MonsterEggTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="cobblestone"/>
 *     &lt;enumeration value="stone_brick"/>
 *     &lt;enumeration value="mossy_brick"/>
 *     &lt;enumeration value="cracked_brick"/>
 *     &lt;enumeration value="chiseled_brick"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MonsterEggTypes")
@XmlEnum
public enum MonsterEggTypes {

    @XmlEnumValue("cobblestone")
    COBBLESTONE("cobblestone"),
    @XmlEnumValue("stone_brick")
    STONE_BRICK("stone_brick"),
    @XmlEnumValue("mossy_brick")
    MOSSY_BRICK("mossy_brick"),
    @XmlEnumValue("cracked_brick")
    CRACKED_BRICK("cracked_brick"),
    @XmlEnumValue("chiseled_brick")
    CHISELED_BRICK("chiseled_brick");
    private final String value;

    MonsterEggTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MonsterEggTypes fromValue(String v) {
        for (MonsterEggTypes c: MonsterEggTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
