package org.springframework.data.solr.core.query;

/**
 * @author navneetgupta
 * @createdOn Dec 1, 2017
 */
public interface SpatialQuery extends Query{
	
	
	<T extends SolrDataQuery> T setSpatialOptions(SpatialOptions spatialOptions);

	/**
	 * @return null if not set
	 */
	SpatialOptions getSpatialOptions();

	/**
	 * @return true if options set
	 */
	boolean hasSpatialOptions();
}
