package org.springframework.data.solr.core.query;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.util.StringUtils;

/**
 * @author navneetgupta
 * @createdOn Dec 5, 2017
 */
public class SimpleSuggestQuery extends AbstractQuery implements SuggestQuery {

	public static final String DEFAULT_REQUEST_HANDLER = "/suggest";

	private List<String> dictionaries = new ArrayList<String>(1);
	private SuggestOptions suggestOptions = new SuggestOptions();
	
	public SimpleSuggestQuery() {
		super();
	}
	
	public void addDictionary(String dictionary) {
		this.dictionaries.add(dictionary);
	}
	
	public void addDictionaries(String... dictionaries) {
		for (String dictionary : dictionaries) {
			addDictionary(dictionary);
		}
	}

	@Override
	public List<String> getSuggestDictionary() {
		return Collections.unmodifiableList(this.dictionaries);
	}
	
	@Override
	public String getRequestHandler() {
		return StringUtils.hasText(super.getRequestHandler()) ? super.getRequestHandler() : DEFAULT_REQUEST_HANDLER;
	}
	
	public static Builder queryBuilder() {
		return new Builder();
	}

	public static Builder queryBuilder(String... fieldnames) {
		return new Builder(fieldnames);
	}
	
	public static class Builder {

		private SimpleSuggestQuery query;

		public Builder() {
			this.query = new SimpleSuggestQuery();
		}

		public Builder(String... dictionaries) {
			this.query = new SimpleSuggestQuery();
			this.query.addDictionaries(dictionaries);
		}

		public Builder withCriteria(Criteria criteria) {
			this.query.addCriteria(criteria);
			return this;
		}

		public Builder q(String q) {
			this.query.suggestOptions.setQ(q);
			return this;
		}

		public Builder count(int count) {
			this.query.suggestOptions.setCount(count);
			return this;
		}

		public SimpleSuggestQuery build() {
			return this.query;
		}
	}

	@Override
	public SuggestOptions getSuggestOptions() {
		return this.suggestOptions;
	}

}
