/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package contaBancaria;

/**
 *
 * @author i03
 */
public enum TipoCliente {
    Chinelo(1),
    Universitario(2),
    Corporativo(3),
    Exclusivo(4);
    
    private int fatorMultiplicacao;

    private TipoCliente(int fatorMultiplicacao) {
        this.fatorMultiplicacao = fatorMultiplicacao;
    }

    public int getFatorMultiplicacao() {
        return fatorMultiplicacao;
    }
    
    
}
