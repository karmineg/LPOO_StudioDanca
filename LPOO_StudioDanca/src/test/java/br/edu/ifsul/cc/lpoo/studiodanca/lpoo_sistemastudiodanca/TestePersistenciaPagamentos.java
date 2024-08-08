/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.cc.lpoo.studiodanca.lpoo_sistemastudiodanca;
import br.edu.ifsul.cc.lpoo.studiodanca.lpoo_sistemastudiodanca.dao.PersistenciaJPA;
import br.edu.ifsul.cc.lpoo.studiodanca.lpoo_sistemastudiodanca.model.Pagamentos;
import br.edu.ifsul.cc.lpoo.studiodanca.lpoo_sistemastudiodanca.model.Contratos;
import org.junit.*;
import static org.junit.Assert.*;
import java.util.*;

/**
 *
 * @author 20221PF.CC0033
 */
public class TestePersistenciaPagamentos {
    PersistenciaJPA jpa = new PersistenciaJPA();
    
    public TestePersistenciaPagamentos() {
    }
    
    @Before
    public void setUp() {
        jpa.conexaoAberta();
    }
    
    @After
    public void tearDown() {
        jpa.fecharConexao();
    }
    
    //@Test
    public void testePersistenciaPagamentos() throws Exception {
        Contratos contrato = (Contratos) jpa.find(Contratos.class, 1);
        
        if (contrato != null) {
        
            Pagamentos p = new Pagamentos();
            p.setDataVcto(Calendar.getInstance());
            p.setValor(100.00);
            p.setDataPgto(Calendar.getInstance());
            p.setValorPgto(100.00);
            p.setContratos(contrato);

            jpa.persist(p);

            Pagamentos persistidoPagamentos = (Pagamentos) jpa.find(Pagamentos.class, p.getId());

            assertNotNull(persistidoPagamentos);
            assertEquals(p.getValor(), persistidoPagamentos.getValor());
            assertEquals(p.getValorPgto(), persistidoPagamentos.getValorPgto());
        } else {
            System.out.println("> Professor não encontrado!");
        }
    }
}
