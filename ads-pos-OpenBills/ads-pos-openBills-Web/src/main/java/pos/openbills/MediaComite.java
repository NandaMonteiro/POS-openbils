
package pos.openbills;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="media_despesa" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="nome_estado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "mediaDespesa",
    "nomeEstado"
})
public class MediaComite {

    @XmlElement(name = "media_despesa")
    protected double mediaDespesa;
    @XmlElement(name = "nome_estado")
    protected String nomeEstado;

    /**
     * Obtém o valor da propriedade mediaDespesa.
     * 
     */
    public double getMediaDespesa() {
        return mediaDespesa;
    }

    /**
     * Define o valor da propriedade mediaDespesa.
     * 
     */
    public void setMediaDespesa(double value) {
        this.mediaDespesa = value;
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
