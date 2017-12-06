package org.springframework.data.solr.core.query.result;

/**
 * @author navneetgupta
 * @createdOn Dec 5, 2017
 */
public class SimpleSuggestDictionaryEntry extends DictionaryWeightTermEntry implements SuggestDictionaryEntry  {

	/**
	 * @param term
	 * @param weight
	 */
	public SimpleSuggestDictionaryEntry(String term, long weight) {
		super(term, weight);
	}

	/**
	 * @param term
	 * @param weight
	 * @param dictionary
	 */
	public SimpleSuggestDictionaryEntry(String term, long weight,String dictionary) {
		super(term, weight);
		setDictionary(dictionary);
	}
}
