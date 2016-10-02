
package pos.openbills;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de mediaComite complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
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
     * Obtém o valor da propriedade mediaDespesaComite.
     * 
     */
    public double getMediaDespesaComite() {
        return mediaDespesaComite;
    }

    /**
     * Define o valor da propriedade mediaDespesaComite.
     * 
     */
    public void setMediaDespesaComite(double value) {
        this.mediaDespesaComite = value;
    }

    /**
     * Obtém o valor da propriedade nomeEstado.
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
     * Define o valor da propriedade nomeEstado.
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
