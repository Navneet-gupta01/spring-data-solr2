package org.springframework.data.solr.core.query;

/**
 * @author navneetgupta
 * @createdOn Dec 1, 2017
 */
public class SpatialOptions {
	private static final int DEFAULT_D = 10;
	
	private String sField;
	private String pt;
	private int d=DEFAULT_D;
	
	public SpatialOptions() {}
	
	/**
	 * @param sField
	 * @param pt
	 */
	public SpatialOptions(String sField, String pt) {
		super();
		this.sField = sField;
		this.pt = pt;
	}
	public String getsField() {
		return sField;
	}
	public void setsField(String sField) {
		this.sField = sField;
	}
	public String getPt() {
		return pt;
	}
	public void setPt(String pt) {
		this.pt = pt;
	}

	public int getD() {
		return d;
	}

	public void setD(int d) {
		this.d = d;
	}

	/**
	 * @param sField
	 * @param pt
	 * @param d
	 */
	public SpatialOptions(String sField, String pt, int d) {
		super();
		this.sField = sField;
		this.pt = pt;
		this.d = d;
	}
	
}
