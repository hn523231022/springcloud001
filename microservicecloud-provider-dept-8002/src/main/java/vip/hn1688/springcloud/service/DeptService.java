package vip.hn1688.springcloud.service;

import java.util.List;

import vip.hn1688.springcloud.entities.Dept;

public interface DeptService {
	public boolean add(Dept dept);
	  public Dept    get(Long id);
	  public List<Dept> list();
}
