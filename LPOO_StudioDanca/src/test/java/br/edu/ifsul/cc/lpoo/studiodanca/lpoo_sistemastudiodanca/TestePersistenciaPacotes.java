/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.cc.lpoo.studiodanca.lpoo_sistemastudiodanca;
import br.edu.ifsul.cc.lpoo.studiodanca.lpoo_sistemastudiodanca.dao.PersistenciaJPA;
import br.edu.ifsul.cc.lpoo.studiodanca.lpoo_sistemastudiodanca.model.Pacotes;
import br.edu.ifsul.cc.lpoo.studiodanca.lpoo_sistemastudiodanca.model.Modalidade;
import org.junit.*;

/**
 *
 * @author 20221PF.CC0033
 */
public class TestePersistenciaPacotes {
    PersistenciaJPA jpa = new PersistenciaJPA();
    
    public TestePersistenciaPacotes() {
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
    public void TestePersistenciaPacotes() throws Exception {
        Modalidade modalidade = (Modalidade) jpa.find(Modalidade.class, 1); 

        if (modalidade != null) {
            Pacotes p = new Pacotes();
            p.setDescricao("Always");
            p.setValor(100.00);
            p.setModalidade(modalidade); 

            jpa.persist(p);

            Pacotes persistidoPacotes = (Pacotes) jpa.find(Pacotes.class, p.getId());

            Assert.assertEquals(p.getDescricao(), persistidoPacotes.getDescricao());
            Assert.assertEquals(p.getValor(), persistidoPacotes.getValor());
            Assert.assertEquals(p.getModalidade().getId(), persistidoPacotes.getModalidade().getId());
        } else {
            System.out.println("> Modalidade não encontrada!");
        }

    }
}
