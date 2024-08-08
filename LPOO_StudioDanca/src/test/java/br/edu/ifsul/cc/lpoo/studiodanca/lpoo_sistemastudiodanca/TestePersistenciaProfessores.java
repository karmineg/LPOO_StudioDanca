/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.cc.lpoo.studiodanca.lpoo_sistemastudiodanca;
import br.edu.ifsul.cc.lpoo.studiodanca.lpoo_sistemastudiodanca.dao.PersistenciaJPA;
import br.edu.ifsul.cc.lpoo.studiodanca.lpoo_sistemastudiodanca.model.Professores;
import org.junit.*;
import java.util.*;

/**
 *
 * @author kurum
 */
public class TestePersistenciaProfessores {
    PersistenciaJPA jpa = new PersistenciaJPA();
    
    public TestePersistenciaProfessores() {
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
    public void TestePersistenciaProfessores() throws Exception {
        Professores p = new Professores();
        p.setNome("Alan Rickman");
        p.setFone("99999-9999");
        p.setDataAniver(Calendar.getInstance());
        p.setEmail("alanlindo@gmail.com");
        p.setEndereco("Hogwarts, 934");

        p.setDataAdmissao(Calendar.getInstance());
        
        jpa.persist(p);
       
    }
}