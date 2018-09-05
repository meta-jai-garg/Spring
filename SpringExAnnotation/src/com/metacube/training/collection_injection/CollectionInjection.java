package com.metacube.training.collection_injection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionInjection {
	private List listCollection;
	private Set setCollection;
	private Map mapCollection;

	public List getListCollection() {
		System.out.println("List Collection: " + listCollection);
		return listCollection;
	}

	public void setListCollection(List listCollection) {
		this.listCollection = listCollection;
	}

	public Set getSetCollection() {
		System.out.println("Set Collection: " + setCollection);
		return setCollection;
	}

	public void setSetCollection(Set setCollection) {
		this.setCollection = setCollection;
	}

	public Map getMapCollection() {
		System.out.println("Map Collection: " + mapCollection);
		return mapCollection;
	}

	public void setMapCollection(Map mapCollection) {
		this.mapCollection = mapCollection;
	}
}