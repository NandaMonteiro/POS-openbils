
package pos.openbills;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for quantidadeDespesaCandidato complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="quantidadeDespesaCandidato">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="qtdeCandidato" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="siglaPartido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "qtdeCandidato",
    "siglaPartido"
})
public class QuantidadeDespesaCandidato {

    protected BigInteger qtdeCandidato;
    protected String siglaPartido;

    /**
     * Gets the value of the qtdeCandidato property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQtdeCandidato() {
        return qtdeCandidato;
    }

    /**
     * Sets the value of the qtdeCandidato property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQtdeCandidato(BigInteger value) {
        this.qtdeCandidato = value;
    }

    /**
     * Gets the value of the siglaPartido property.
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
     * Sets the value of the siglaPartido property.
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
