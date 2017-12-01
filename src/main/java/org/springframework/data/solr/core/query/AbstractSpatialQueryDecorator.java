package org.springframework.data.solr.core.query;

/**
 * @author navneetgupta
 * @createdOn Dec 1, 2017
 */
public class AbstractSpatialQueryDecorator extends AbstractQueryDecorator implements SpatialQuery {

	private SpatialQuery query;
	
	public AbstractSpatialQueryDecorator(SpatialQuery query) {
		super(query);
		this.query = query;
	}

	/* (non-Javadoc)
	 * @see org.springframework.data.solr.core.query.SpatialQuery#setSpatialOptions(org.springframework.data.solr.core.query.SpatialOptions)
	 */
	@Override
	public <T extends SolrDataQuery> T setSpatialOptions(SpatialOptions spatialOptions) {
		return query.setSpatialOptions(spatialOptions);
	}

	/* (non-Javadoc)
	 * @see org.springframework.data.solr.core.query.SpatialQuery#getSpatialOptions()
	 */
	@Override
	public SpatialOptions getSpatialOptions() {
		return query.getSpatialOptions();
	}

	/* (non-Javadoc)
	 * @see org.springframework.data.solr.core.query.SpatialQuery#hasSpatialOptions()
	 */
	@Override
	public boolean hasSpatialOptions() {
		return query.hasSpatialOptions();
	}
}
