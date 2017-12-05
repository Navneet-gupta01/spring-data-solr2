package org.springframework.data.solr.core.query;

/**
 * @author navneetgupta
 * @createdOn Dec 5, 2017
 */
public class SuggestOptions {
	private boolean suggest=true;
	private String q;
	private long count=10;
	//private String cfq;
	
	public boolean isSuggest() {
		return suggest;
	}
	public void setSuggest(boolean suggest) {
		this.suggest = suggest;
	}
	public String getQ() {
		return q;
	}
	public void setQ(String q) {
		this.q = q;
	}
	public long getCount() {
		return count;
	}
	public void setCount(long count) {
		this.count = count;
	}
}