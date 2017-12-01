package org.springframework.data.solr.core.query;

/**
 * @author navneetgupta
 * @createdOn Dec 1, 2017
 */
public class AbstractSpatialAndHighLightQueryDecorator extends AbstractQueryDecorator implements SpatialQuery,HighlightQuery{
	private HighLightAndSpatialQuery query;
	
	public AbstractSpatialAndHighLightQueryDecorator(HighLightAndSpatialQuery query) {
		super(query);
		this.query = query;
	}

	/* (non-Javadoc)
	 * @see org.springframework.data.solr.core.query.HighlightQuery#setHighlightOptions(org.springframework.data.solr.core.query.HighlightOptions)
	 */
	@Override
	public <T extends SolrDataQuery> T setHighlightOptions(HighlightOptions highlightOptions) {
		return query.setHighlightOptions(highlightOptions);
	}

	/* (non-Javadoc)
	 * @see org.springframework.data.solr.core.query.HighlightQuery#getHighlightOptions()
	 */
	@Override
	public HighlightOptions getHighlightOptions() {
		return query.getHighlightOptions();
	}

	/* (non-Javadoc)
	 * @see org.springframework.data.solr.core.query.HighlightQuery#hasHighlightOptions()
	 */
	@Override
	public boolean hasHighlightOptions() {
		return query.hasHighlightOptions();
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
