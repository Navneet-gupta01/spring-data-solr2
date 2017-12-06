package org.springframework.data.solr.core.query.result;

/**
 * @author navneetgupta
 * @createdOn Dec 5, 2017
 */
public class DictionaryWeightTermEntry extends WeightTermEntry {
	
	private String dictionary;
	private String payLoad;
	
	public DictionaryWeightTermEntry(String term, long weight) {
		super(term, weight);
	}

	public String getDictionary() {
		return dictionary;
	}

	public void setDictionary(String dictionary) {
		this.dictionary = dictionary;
	}
	public void setPayLoad(String payLoad) {
		this.payLoad=payLoad;
	}
	
	public String getPayLoad() {
		return this.payLoad;
	}
}