package org.springframework.data.solr.core.query.result;

/**
 * @author navneetgupta
 * @createdOn Dec 5, 2017
 */
public class SuggestEntry {
	private final String term;
	private final long weight;
	private final String payload;
	
	public SuggestEntry(String term, long weight, String payload) {
		super();
		this.term = term;
		this.weight = weight;
		this.payload = payload;
	}

	public String getTerm() {
		return term;
	}

	public long getWeight() {
		return weight;
	}

	public String getPayload() {
		return payload;
	}
}
