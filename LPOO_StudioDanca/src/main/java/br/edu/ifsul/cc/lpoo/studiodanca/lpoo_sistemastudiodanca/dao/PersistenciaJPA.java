/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.cc.lpoo.studiodanca.lpoo_sistemastudiodanca.dao;

import br.edu.ifsul.cc.lpoo.studiodanca.lpoo_sistemastudiodanca.dao.InterfacePersistencia;
import br.edu.ifsul.cc.lpoo.studiodanca.lpoo_sistemastudiodanca.model.Modalidade;
import br.edu.ifsul.cc.lpoo.studiodanca.lpoo_sistemastudiodanca.model.Professores;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author 20221PF.CC0033
 */
public class PersistenciaJPA implements InterfacePersistencia {

    EntityManager entity;
    EntityManagerFactory factory;

    public PersistenciaJPA() {
        factory = Persistence.createEntityManagerFactory("pu_sistema_studiodanca");
        entity = factory.createEntityManager();
    }

    @Override
    public Boolean conexaoAberta() {
        return entity.isOpen();
    }

    @Override
    public void fecharConexao() {
        entity.close();
    }

    @Override
    public Object find(Class c, Object id) throws Exception {
        return entity.find(c, id);
    }

    @Override
    public void persist(Object o) throws Exception {
        entity.getTransaction().begin();
        entity.persist(o);
        entity.getTransaction().commit();
    }

    @Override
    public void remover(Object o) throws Exception {
        entity.getTransaction().begin();
        entity.remove(o);
        entity.getTransaction().commit();
    }

    public List<Modalidade> getModalidades() {
        TypedQuery<Modalidade> query = entity.createQuery("SELECT m FROM Modalidade m", Modalidade.class);
        return query.getResultList();
    }

    public List<Professores> getProfessores() {
        TypedQuery<Professores> query = entity.createQuery("SELECT p FROM Professores p", Professores.class);
        return query.getResultList();
    }

}
