package org.springframework.data.solr.core.query;

import org.springframework.data.domain.Pageable;

/**
 * @author navneetgupta
 * @createdOn Dec 1, 2017
 */
public class SimpleSpatialQuery extends SimpleQuery implements SpatialQuery{
	
	private SpatialOptions spatialOptions;
	
	public SimpleSpatialQuery() {
		super();
	}
	
	public SimpleSpatialQuery(Criteria criteria, Pageable pageable) {
		super(criteria,pageable);
	}
	
	public SimpleSpatialQuery(Criteria criteria) {
		super(criteria);
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T extends SolrDataQuery> T setSpatialOptions(SpatialOptions spatialOptions) {
		this.spatialOptions=spatialOptions;
		return (T) this;
	}

	@Override
	public SpatialOptions getSpatialOptions() {
		return this.spatialOptions;
	}

	@Override
	public boolean hasSpatialOptions() {
		return this.spatialOptions != null;
	}

}
