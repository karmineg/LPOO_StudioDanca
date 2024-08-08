package br.edu.ifsul.cc.lpoo.studiodanca.lpoo_sistemastudiodanca.model;

import br.edu.ifsul.cc.lpoo.studiodanca.lpoo_sistemastudiodanca.model.Contratos;
import java.util.Calendar;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-08-08T13:40:48", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Pagamentos.class)
public class Pagamentos_ { 

    public static volatile SingularAttribute<Pagamentos, Calendar> dataVcto;
    public static volatile SingularAttribute<Pagamentos, Double> valorPgto;
    public static volatile SingularAttribute<Pagamentos, Double> valor;
    public static volatile SingularAttribute<Pagamentos, Contratos> contratos;
    public static volatile SingularAttribute<Pagamentos, Integer> id;
    public static volatile SingularAttribute<Pagamentos, Calendar> dataPgto;

}