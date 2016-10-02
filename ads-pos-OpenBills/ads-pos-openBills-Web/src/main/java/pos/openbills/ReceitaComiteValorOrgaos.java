
package pos.openbills;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de receitaComiteValorOrgaos complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
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
     * Obtém o valor da propriedade estado.
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
     * Define o valor da propriedade estado.
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
     * Obtém o valor da propriedade quantidadeOrgaos.
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
     * Define o valor da propriedade quantidadeOrgaos.
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
     * Obtém o valor da propriedade valorReceitaEstado.
     * 
     */
    public double getValorReceitaEstado() {
        return valorReceitaEstado;
    }

    /**
     * Define o valor da propriedade valorReceitaEstado.
     * 
     */
    public void setValorReceitaEstado(double value) {
        this.valorReceitaEstado = value;
    }

}
