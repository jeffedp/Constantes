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
public class Cliente {
    
    private String nome;
    private TipoCliente tipoCliente;

    public String getNome() {
        return nome;
    }

    public TipoCliente getTipo() {
        return tipoCliente;
    }
    
    public Cliente(String Nome, TipoCliente tipoCliente){
    
        this.nome = nome;
        this.tipoCliente = TipoCliente.Corporativo;
       
    }
    
}
