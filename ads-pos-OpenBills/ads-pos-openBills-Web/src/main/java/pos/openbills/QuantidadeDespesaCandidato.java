
package pos.openbills;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de quantidadeDespesaCandidato complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="quantidadeDespesaCandidato">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sigla_partido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "quantidadeDespesaCandidato", propOrder = {
    "siglaPartido"
})
public class QuantidadeDespesaCandidato {

    @XmlElement(name = "sigla_partido")
    protected String siglaPartido;

    /**
     * Obtém o valor da propriedade siglaPartido.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSiglaPartido() {
        return siglaPartido;
    }

    /**
     * Define o valor da propriedade siglaPartido.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiglaPartido(String value) {
        this.siglaPartido = value;
    }

}
