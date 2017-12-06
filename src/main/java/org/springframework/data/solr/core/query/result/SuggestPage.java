package org.springframework.data.solr.core.query.result;

import java.util.List;

import org.springframework.data.domain.Page;

/**
 * @author navneetgupta
 * @createdOn Dec 5, 2017
 */
public interface SuggestPage extends Iterable<SuggestDictionaryEntry> {
	/**
	 * Returns the page content as {@link List}.
	 * 
	 * @return
	 */
	Iterable<SuggestDictionaryEntry> getContent();

	/**
	 * 
	 * @param fieldname
	 * @return
	 */
	Iterable<SuggestDictionaryEntry> getSuggestionForDictionary(String dictionary);

	/**
	 * Returns whether the {@link Page} has content at all.
	 * 
	 * @return
	 */
	boolean hasContent();
}
