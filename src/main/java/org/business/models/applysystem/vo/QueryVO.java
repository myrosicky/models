package org.business.models.applysystem.vo;

public class QueryVO<T> {

	private T model;
	private Integer page;
	private Integer size;
	public T getModel() {
		return model;
	}
	public void setModel(T model) {
		this.model = model;
	}
	public Integer getPage() {
		return page;
	}
	public void setPage(Integer page) {
		this.page = page;
	}
	public Integer getSize() {
		return size;
	}
	public void setSize(Integer size) {
		this.size = size;
	}
	
	
	
}
