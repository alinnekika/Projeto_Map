package br.com.av.agenda.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Contato.class)
public abstract class Contato_ {

	public static volatile SingularAttribute<Contato, String> numero;
	public static volatile SingularAttribute<Contato, String> nome;
	public static volatile SingularAttribute<Contato, Long> id;
	public static volatile SingularAttribute<Contato, Boolean> removido;
	public static volatile SingularAttribute<Contato, String> email;

}

