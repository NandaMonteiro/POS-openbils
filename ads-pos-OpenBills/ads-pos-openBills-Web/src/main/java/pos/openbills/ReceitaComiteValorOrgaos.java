
package pos.openbills;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for receitaComiteValorOrgaos complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="receitaComiteValorOrgaos">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="estado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="quantidade_orgaos" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="valor_receita_estado" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "receitaComiteValorOrgaos", propOrder = {
    "estado",
    "quantidadeOrgaos",
    "valorReceitaEstado"
})
public class ReceitaComiteValorOrgaos {

    protected String estado;
    @XmlElement(name = "quantidade_orgaos")
    protected BigInteger quantidadeOrgaos;
    @XmlElement(name = "valor_receita_estado")
    protected double valorReceitaEstado;

    /**
     * Gets the value of the estado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Sets the value of the estado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstado(String value) {
        this.estado = value;
    }

    /**
     * Gets the value of the quantidadeOrgaos property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQuantidadeOrgaos() {
        return quantidadeOrgaos;
    }

    /**
     * Sets the value of the quantidadeOrgaos property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQuantidadeOrgaos(BigInteger value) {
        this.quantidadeOrgaos = value;
    }

    /**
     * Gets the value of the valorReceitaEstado property.
     * 
     */
    public double getValorReceitaEstado() {
        return valorReceitaEstado;
    }

    /**
     * Sets the value of the valorReceitaEstado property.
     * 
     */
    public void setValorReceitaEstado(double value) {
        this.valorReceitaEstado = value;
    }

}
