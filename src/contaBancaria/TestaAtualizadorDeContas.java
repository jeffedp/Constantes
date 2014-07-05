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
class TestaAtualizadorDeContas {
    public static void main(String[] args){
        Conta c = new Conta();
        ContaCorrente cc = new ContaCorrente();
        ContaPoupanca cp = new ContaPoupanca();
        
        c.deposita(1000);
        cc.deposita(1000);
        cp.deposita(1000);
        
        AtualizadorDeContas adc = new AtualizadorDeContas(0.01);
        
        adc.roda(c);
        adc.roda(cc);
        adc.roda(cp);
        
        System.out.println(String.format("Saldo Total: %s",adc.getSaldoTotal()));
        
        
    }
}
