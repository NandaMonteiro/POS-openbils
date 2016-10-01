
package pos.openbills;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mediaComite complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mediaComite">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mediaDespesaComite" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="nomeEstado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mediaComite", propOrder = {
    "mediaDespesaComite",
    "nomeEstado"
})
public class MediaComite {

    protected double mediaDespesaComite;
    protected String nomeEstado;

    /**
     * Gets the value of the mediaDespesaComite property.
     * 
     */
    public double getMediaDespesaComite() {
        return mediaDespesaComite;
    }

    /**
     * Sets the value of the mediaDespesaComite property.
     * 
     */
    public void setMediaDespesaComite(double value) {
        this.mediaDespesaComite = value;
    }

    /**
     * Gets the value of the nomeEstado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeEstado() {
        return nomeEstado;
    }

    /**
     * Sets the value of the nomeEstado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeEstado(String value) {
        this.nomeEstado = value;
    }

}
