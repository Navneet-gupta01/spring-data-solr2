package org.springframework.data.solr.core.query;

import org.springframework.data.domain.Pageable;

/**
 * @author navneetgupta
 * @createdOn Dec 1, 2017
 */
public class SimpleHighLightSpatialQuery extends SimpleQuery implements HighLightAndSpatialQuery {
	
	private HighlightOptions highlightOptions;
	private SpatialOptions spatialOptions;
	
	public SimpleHighLightSpatialQuery() {
		super();
	}
	
	public SimpleHighLightSpatialQuery(Criteria criteria, Pageable pageable) {
		super(criteria,pageable);
	}
	
	public SimpleHighLightSpatialQuery(Criteria criteria) {
		super(criteria);
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T extends SolrDataQuery> T setHighlightOptions(HighlightOptions highlightOptions) {
		this.highlightOptions = highlightOptions;
		return (T) this;
	}

	@Override
	public HighlightOptions getHighlightOptions() {
		return this.highlightOptions;
	}

	@Override
	public boolean hasHighlightOptions() {
		return this.highlightOptions != null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T extends SolrDataQuery> T setSpatialOptions(SpatialOptions spatialOptions) {
		this.spatialOptions = spatialOptions;
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
