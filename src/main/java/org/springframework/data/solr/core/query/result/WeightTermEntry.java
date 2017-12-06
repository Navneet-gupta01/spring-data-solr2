package org.springframework.data.solr.core.query.result;

/**
 * @author navneetgupta
 * @createdOn Dec 5, 2017
 */
public class WeightTermEntry implements WeightEntry {
	
	private final String term;
	private final long weight;
	
	public WeightTermEntry(String term, long weight) {
		this.term = term;
		this.weight = weight;
	}

	@Override
	public long getWeight() {
		return this.weight;
	}

	@Override
	public String getTerm() {
		return this.term;
	}

}
