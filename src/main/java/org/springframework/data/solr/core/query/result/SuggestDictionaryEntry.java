package org.springframework.data.solr.core.query.result;

/**
 * @author navneetgupta
 * @createdOn Dec 5, 2017
 */
public interface SuggestDictionaryEntry extends SuggestEntry {
	String getDictionary();
	
	@Override
	String getPayLoad();
}
