package org.springframework.data.solr.core;

import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.common.params.CommonParams;
import org.springframework.data.solr.core.query.Field;
import org.springframework.data.solr.core.query.SuggestOptions;
import org.springframework.data.solr.core.query.SuggestQuery;
import org.springframework.util.Assert;
import org.springframework.util.StringUtils;

/**
 * @author navneetgupta
 * @createdOn Dec 5, 2017
 */
public class SuggestQueryParser extends QueryParserBase<SuggestQuery>{
	
	private static final String SUGGEST="suggest";
	private static final String SUGGEST_COUNT="suggest.count";
	private static final String SUGGEST_DICTIONARY="suggest.dictionary";
	private static final String Q="suggest.q";

	@Override
	public SolrQuery doConstructSolrQuery(SuggestQuery query) {
		Assert.notNull(query, "Cannot construct solrQuery from null value.");

		SolrQuery solrQuery = new SolrQuery();
		String queryString = getQueryString(query);
		if (StringUtils.hasText(queryString)) {
			solrQuery.setParam(CommonParams.Q, queryString);
		}
		appendSuggestOptionsToSolrQuery(query.getSuggestOptions(), solrQuery);
		processSuggestDictionary(solrQuery, query);
		appendRequestHandler(solrQuery, query.getRequestHandler());
		return solrQuery;
	}

	/**
	 * @param solrQuery
	 * @param query
	 */
	private void processSuggestDictionary(SolrQuery solrQuery, SuggestQuery query) {
		for (String dictionary : query.getSuggestDictionary()) {
			appendSuggestDictionaryToSolrQuery(dictionary, solrQuery);
		}
	}

	/**
	 * @param suggestOptions
	 * @param solrQuery
	 */
	private void appendSuggestOptionsToSolrQuery(SuggestOptions suggestOptions, SolrQuery solrQuery) {
		solrQuery.setParam(SUGGEST, true);
		solrQuery.setParam(SUGGEST_COUNT, suggestOptions.getCount()+"");
		solrQuery.setParam(Q, suggestOptions.getQ());
	}
	
	protected void appendSuggestDictionaryToSolrQuery(String dictionary, SolrQuery solrQuery) {
		if (dictionary != null && StringUtils.hasText(dictionary)) {
			solrQuery.add(SUGGEST_DICTIONARY, dictionary);
		}
	}

}
