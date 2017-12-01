package org.springframework.data.solr.repository;

/**
 * @author navneetgupta
 * @createdOn Dec 1, 2017
 */
public @interface Spatial {

	int d() default 10;
	
	String pt() default "";
	
	String sField() default "";
}
