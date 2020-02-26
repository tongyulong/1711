package com.bw.movie.vo;

import com.bw.movie.domain.Movie;

public class MovieVO extends Movie{

	private Double p1;
	
	private Double p2;
	
	private Integer l1;
	
	private Integer l2;
	
	private String t1;
	
	private String t2;

	private String orderName;//��������
	
	private String orderMethod;//����ʽ
	
	public String getOrderName() {
		return orderName;
	}

	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}

	public String getOrderMethod() {
		return orderMethod;
	}

	public void setOrderMethod(String orderMethod) {
		this.orderMethod = orderMethod;
	}

	public Double getP1() {
		return p1;
	}

	public void setP1(Double p1) {
		this.p1 = p1;
	}

	public Double getP2() {
		return p2;
	}

	public void setP2(Double p2) {
		this.p2 = p2;
	}

	public Integer getL1() {
		return l1;
	}

	public void setL1(Integer l1) {
		this.l1 = l1;
	}

	public Integer getL2() {
		return l2;
	}

	public void setL2(Integer l2) {
		this.l2 = l2;
	}

	public String getT1() {
		return t1;
	}

	public void setT1(String t1) {
		this.t1 = t1;
	}

	public String getT2() {
		return t2;
	}

	public void setT2(String t2) {
		this.t2 = t2;
	}

	@Override
	public String toString() {
		return "MovieVO [p1=" + p1 + ", p2=" + p2 + ", l1=" + l1 + ", l2=" + l2 + ", t1=" + t1 + ", t2=" + t2 + "]";
	}

	public MovieVO(Double p1, Double p2, Integer l1, Integer l2, String t1, String t2) {
		super();
		this.p1 = p1;
		this.p2 = p2;
		this.l1 = l1;
		this.l2 = l2;
		this.t1 = t1;
		this.t2 = t2;
	}

	public MovieVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
