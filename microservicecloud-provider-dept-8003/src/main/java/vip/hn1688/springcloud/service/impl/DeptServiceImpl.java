package vip.hn1688.springcloud.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vip.hn1688.springcloud.dao.DeptDao;
import vip.hn1688.springcloud.entities.Dept;
import vip.hn1688.springcloud.service.DeptService;
@Service
public class DeptServiceImpl implements DeptService {
	@Autowired
	  private DeptDao dao ;
	  
	  @Override
	  public boolean add(Dept dept)
	  {
	   return dao.addDept(dept);
	  }
	 
	  @Override
	  public Dept get(Long id)
	  {
	   return dao.findById(id);
	  }
	 
	  @Override
	  public List<Dept> list()
	  {
	   return dao.findAll();
	  }


}
