package org.springframework.data.solr.core.query;

import java.util.List;

/**
 * @author navneetgupta
 * @createdOn Dec 5, 2017
 */
public interface SuggestQuery extends SolrDataQuery  {

	/**
	 * @return null if not set
	 */
	SuggestOptions getSuggestOptions();
	
	/**
	 * @return fields included
	 */
	List<String> getSuggestDictionary();

	/**
	 * Returns the request handler.
	 */
	String getRequestHandler();

	/**
	 * Sets the request handler.
	 */
	void setRequestHandler(String requestHandler);
}
