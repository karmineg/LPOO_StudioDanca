/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.cc.lpoo.studiodanca.lpoo_sistemastudiodanca;
import br.edu.ifsul.cc.lpoo.studiodanca.lpoo_sistemastudiodanca.dao.PersistenciaJPA;
import br.edu.ifsul.cc.lpoo.studiodanca.lpoo_sistemastudiodanca.model.Contratos;
import br.edu.ifsul.cc.lpoo.studiodanca.lpoo_sistemastudiodanca.model.FormaPgto;
import br.edu.ifsul.cc.lpoo.studiodanca.lpoo_sistemastudiodanca.model.Alunos;
import org.junit.*;
import static org.junit.Assert.*;
import java.util.*;

/**
 *
 * @author 20221PF.CC0033
 */
public class TestePersistenciaContratos {
    PersistenciaJPA jpa = new PersistenciaJPA();
    
    public TestePersistenciaContratos() {
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
    public void TestePersistenciaContratos() throws Exception {
        Alunos aluno = (Alunos) jpa.find(Alunos.class, 1);

        if (aluno != null) {
            Contratos c = new Contratos();

            c.setDataInicio(Calendar.getInstance());
            c.setValorDesconto(50.00); 
            c.setFormapgto(FormaPgto.PIX); 
            c.setAluno(aluno);

            jpa.persist(c);
            
            Contratos persistidoContratos = (Contratos)jpa.find(Contratos.class, c.getId());
        
            assertEquals(FormaPgto.PIX, persistidoContratos.getFormapgto());
        } else {
            System.out.println("> Aluno não encontrado!");
        }

    } 
}
