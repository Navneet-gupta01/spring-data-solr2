package org.springframework.data.solr.core.query;

/**
 * @author navneetgupta
 * @createdOn Nov 29, 2017
 */
public interface ReReankQuery extends Query {

	<T extends SolrDataQuery> T setReReankOptions(ReRankOptions highlightOptions);
}
