
package pos.openbills;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de receitaComiteValor complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="receitaComiteValor">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nome_comite" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valor" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "receitaComiteValor", propOrder = {
    "nomeComite",
    "valor"
})
public class ReceitaComiteValor {

    @XmlElement(name = "nome_comite")
    protected String nomeComite;
    protected double valor;

    /**
     * Obtém o valor da propriedade nomeComite.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeComite() {
        return nomeComite;
    }

    /**
     * Define o valor da propriedade nomeComite.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeComite(String value) {
        this.nomeComite = value;
    }

    /**
     * Obtém o valor da propriedade valor.
     * 
     */
    public double getValor() {
        return valor;
    }

    /**
     * Define o valor da propriedade valor.
     * 
     */
    public void setValor(double value) {
        this.valor = value;
    }

}
