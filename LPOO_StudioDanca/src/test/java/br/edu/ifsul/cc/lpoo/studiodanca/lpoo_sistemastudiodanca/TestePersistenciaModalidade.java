/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package br.edu.ifsul.cc.lpoo.studiodanca.lpoo_sistemastudiodanca;
import br.edu.ifsul.cc.lpoo.studiodanca.lpoo_sistemastudiodanca.dao.PersistenciaJPA;
import br.edu.ifsul.cc.lpoo.studiodanca.lpoo_sistemastudiodanca.model.Modalidade;
import br.edu.ifsul.cc.lpoo.studiodanca.lpoo_sistemastudiodanca.model.Professores;
import org.junit.*;

/**
 *
 * @author 20221PF.CC0033
 */
public class TestePersistenciaModalidade {
    PersistenciaJPA jpa = new PersistenciaJPA();
    
    public TestePersistenciaModalidade() {
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
    public void testePersistenciaModalidade() throws Exception {
        Professores professores = (Professores) jpa.find(Professores.class, 1); 
        
        if (professores != null) {
            Modalidade m = new Modalidade();
            m.setDescricao("Jiu-jitsu"); 
            m.setProfessor(professores); 

            jpa.persist(m);
        

            Modalidade persistidoModalidade = (Modalidade) jpa.find(Modalidade.class, m.getId());

            Assert.assertEquals(m.getDescricao(), persistidoModalidade.getDescricao());
            Assert.assertEquals(m.getProfessor().getId(), persistidoModalidade.getProfessor().getId());
        } else {
            System.out.println("> Modalidade não encontrada!");
        }
    }
}
