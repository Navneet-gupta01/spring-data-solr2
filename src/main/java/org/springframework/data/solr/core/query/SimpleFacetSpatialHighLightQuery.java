package org.springframework.data.solr.core.query;

import org.springframework.data.domain.Pageable;

/**
 * @author navneetgupta
 * @createdOn Dec 1, 2017
 */
public class SimpleFacetSpatialHighLightQuery extends SimpleQuery implements FacetSpatialAndHighLightQuery {

	private HighlightOptions highlightOptions;
	private SpatialOptions spatialOptions;
	private FacetOptions facetOptions;
	
	public SimpleFacetSpatialHighLightQuery() {
		super();
	}
	
	public SimpleFacetSpatialHighLightQuery(Criteria criteria, Pageable pageable) {
		super(criteria,pageable);
	}
	
	public SimpleFacetSpatialHighLightQuery(Criteria criteria) {
		super(criteria);
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

	@SuppressWarnings("unchecked")
	@Override
	public <T extends SolrDataQuery> T setFacetOptions(FacetOptions facetOptions) {
		this.facetOptions = facetOptions;
		return (T) this;
	}

	@Override
	public FacetOptions getFacetOptions() {
		return this.facetOptions;
	}

	@Override
	public boolean hasFacetOptions() {
		return this.facetOptions != null;
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

}
