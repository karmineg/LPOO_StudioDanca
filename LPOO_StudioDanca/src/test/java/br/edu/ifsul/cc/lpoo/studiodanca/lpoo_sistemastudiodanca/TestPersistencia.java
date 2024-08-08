/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.cc.lpoo.studiodanca.lpoo_sistemastudiodanca;
import br.edu.ifsul.cc.lpoo.studiodanca.lpoo_sistemastudiodanca.dao.PersistenciaJPA;
import org.junit.Test;

/**
 *
 * @author 20221PF.CC0033
 */
public class TestPersistencia {
    
    @Test
    public void testeConexao(){
        PersistenciaJPA jpa = new PersistenciaJPA();
        if(jpa.conexaoAberta()){
            System.out.println("Conexao realizada com sucesso");
        } else {
            System.out.println("Falha ao conectar no Banco");
        }
    }
}
