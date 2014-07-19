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
public class ContaPoupanca extends Conta{
    
    public static final int VALOR_PADRAO_MULTIPLICACAO = 3;
    public static final double VALOR_DEPOSITO_DEPOSITO = 0.10;
    
    public void atualiza(double taxa){
        this.saldo += this.saldo * taxa * VALOR_PADRAO_MULTIPLICACAO;
    }
    
}
