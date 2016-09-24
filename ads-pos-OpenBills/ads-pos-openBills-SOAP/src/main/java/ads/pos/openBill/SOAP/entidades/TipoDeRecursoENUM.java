/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ads.pos.openBill.SOAP.entidades;

/**
 *
 * @author Luciana
 */
public enum TipoDeRecursoENUM {
ESPECIE("Espécie"), CHEQUE("Cheque"), ESTIMADO("Estimado"), NAINFORMADO("Não informado");

private String Tipo;

    private TipoDeRecursoENUM(String Tipo) {
        this.Tipo = Tipo;
    }

    public String getTipo() {
        return Tipo;
    }


}
