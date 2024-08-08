/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.cc.lpoo.studiodanca.lpoo_sistemastudiodanca;
import br.edu.ifsul.cc.lpoo.studiodanca.lpoo_sistemastudiodanca.dao.PersistenciaJPA;
import br.edu.ifsul.cc.lpoo.studiodanca.lpoo_sistemastudiodanca.model.Alunos;
import org.junit.*;
import static org.junit.Assert.*;
import java.util.*;

/**
 *
 * @author kurum
 */
public class TestePersistenciaAlunos {
    PersistenciaJPA jpa = new PersistenciaJPA();
    
    public TestePersistenciaAlunos() {
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
    public void TestePersistenciaAlunos() throws Exception {
        Alunos a = new Alunos();
        a.setNome("Tom Riddle");
        a.setFone("09866-1234");
        a.setDataAniver(Calendar.getInstance());
        a.setEmail("cobrinhas@gmail.com");
        a.setEndereco("Porão");

        a.setDataInicio(Calendar.getInstance());
        a.setDataPgto(5);
        
        jpa.persist(a);
        

    }
}
