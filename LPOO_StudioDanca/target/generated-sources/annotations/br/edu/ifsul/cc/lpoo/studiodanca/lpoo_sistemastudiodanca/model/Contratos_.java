package br.edu.ifsul.cc.lpoo.studiodanca.lpoo_sistemastudiodanca.model;

import br.edu.ifsul.cc.lpoo.studiodanca.lpoo_sistemastudiodanca.model.Alunos;
import br.edu.ifsul.cc.lpoo.studiodanca.lpoo_sistemastudiodanca.model.FormaPgto;
import java.util.Calendar;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-08-08T13:40:48", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Contratos.class)
public class Contratos_ { 

    public static volatile SingularAttribute<Contratos, Alunos> aluno;
    public static volatile SingularAttribute<Contratos, Double> valorDesconto;
    public static volatile SingularAttribute<Contratos, FormaPgto> formapgto;
    public static volatile SingularAttribute<Contratos, Integer> id;
    public static volatile SingularAttribute<Contratos, Calendar> dataInicio;

}