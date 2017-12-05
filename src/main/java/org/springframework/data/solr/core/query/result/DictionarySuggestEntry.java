package org.springframework.data.solr.core.query.result;

/**
 * @author navneetgupta
 * @createdOn Dec 5, 2017
 */
public class DictionarySuggestEntry extends SuggestEntry {

	private String dictionaryName;
	
	public DictionarySuggestEntry(String term, long weight, String payload) {
		super(term, weight, payload);
	}

	public DictionarySuggestEntry(String term, long weight, String payload, String dictionaryName) {
		super(term, weight, payload);
		this.dictionaryName = dictionaryName;
	}

	public String getDictionaryName() {
		return dictionaryName;
	}

	public void setDictionaryName(String dictionaryName) {
		this.dictionaryName = dictionaryName;
	}
}
