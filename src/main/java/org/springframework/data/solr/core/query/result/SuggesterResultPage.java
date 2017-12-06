package org.springframework.data.solr.core.query.result;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.util.Assert;

/**
 * @author navneetgupta
 * @createdOn Dec 5, 2017
 */
public class SuggesterResultPage implements SuggestPage {
	
	private Map<StringPageKey, List<SuggestDictionaryEntry>> termsMap = new LinkedHashMap<StringPageKey, List<SuggestDictionaryEntry>>(
			1);
	
	public final void addSuggestResult(List<SuggestDictionaryEntry> entries, String dictionary) {
		Assert.notNull(dictionary, "Cannot add terms for 'null' field.");
		this.termsMap.put(new StringPageKey(dictionary), entries);
	}
	
	public void addAllSuggestions(Map<String, List<SuggestDictionaryEntry>> pageMap) {
		for (Map.Entry<String, List<SuggestDictionaryEntry>> entry : pageMap.entrySet()) {
			addSuggestResult(entry.getValue(), entry.getKey());
		}
	}
	
	@Override
	public Iterator<SuggestDictionaryEntry> iterator() {
		return getContent().iterator();
	}

	@Override
	public Iterable<SuggestDictionaryEntry> getContent() {
		List<SuggestDictionaryEntry> values = new ArrayList<SuggestDictionaryEntry>();
		for (List<SuggestDictionaryEntry> entries : termsMap.values()) {
			values.addAll(entries);
		}
		return values;
	}

	@Override
	public Iterable<SuggestDictionaryEntry> getSuggestionForDictionary(String dictionary) {
		Iterable<SuggestDictionaryEntry> terms = this.termsMap.get(new StringPageKey(dictionary));
		return terms != null ? terms : Collections.<SuggestDictionaryEntry> emptyList();
	}

	public Iterable<SuggestDictionaryEntry> getTerms(String dictionary) {
		Assert.notNull(dictionary, "Field cannot be null.");
		return getSuggestionForDictionary(dictionary);
	}
	
	
	public Collection<String> getSuggesterDictionaries() {
		if (this.termsMap.isEmpty()) {
			return Collections.emptyList();
		}

		List<String> dictionaires = new ArrayList<String>(this.termsMap.size());
		for (StringPageKey pageKey : this.termsMap.keySet()) {
			dictionaires.add(pageKey.getKey());
		}
		return dictionaires;
	}

	
	@Override
	public boolean hasContent() {
		return !termsMap.isEmpty();
	}
	
}
