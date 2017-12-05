package org.springframework.data.solr.core.query;

/**
 * @author navneetgupta
 * @createdOn Dec 1, 2017
 */
public class SpatialSearchOptions {
	private static final int DEFAULT_D=100;
	
	private int distance = DEFAULT_D;
	private String field;
	private String point;
	
	public SpatialSearchOptions() {
		super();
	}
	public SpatialSearchOptions(int distance, String field, String point) {
		super();
		this.distance = distance;
		this.field = field;
		this.point = point;
	}
	
	public int getDistance() {
		return distance;
	}
	public void setDistance(int distance) {
		this.distance = distance;
	}
	public String getField() {
		return field;
	}
	public void setField(String field) {
		this.field = field;
	}
	public String getPoint() {
		return point;
	}
	public void setPoint(String point) {
		this.point = point;
	}
	
}
