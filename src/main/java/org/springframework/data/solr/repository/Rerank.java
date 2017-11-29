package org.springframework.data.solr.repository;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author navneetgupta
 * @createdOn Nov 28, 2017
 */

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Documented
public @interface Rerank {

	String value() default "";
	
	int reRankWt() default 3;
	
	int reRankDocs() default 1000;
	
}
