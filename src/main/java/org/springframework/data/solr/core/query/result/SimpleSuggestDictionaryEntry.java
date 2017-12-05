package org.springframework.data.solr.core.query.result;

/**
 * @author navneetgupta
 * @createdOn Dec 5, 2017
 */
public class SimpleSuggestDictionaryEntry extends DictionarySuggestEntry  {

	/**
	 * @param term
	 * @param weight
	 * @param payload
	 */
	public SimpleSuggestDictionaryEntry(String term, long weight, String payload) {
		super(term, weight, payload);
	}
	
	/**
	 * @param term
	 * @param weight
	 * @param payload
	 */
	public SimpleSuggestDictionaryEntry(String dictionaryName, String term, long weight, String payload) {
		super(term, weight, payload);
		setDictionaryName(dictionaryName);
	}
}
