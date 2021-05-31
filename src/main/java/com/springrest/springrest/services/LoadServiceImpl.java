package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.LoadDao;
import com.springrest.springrest.entities.Load;

@Service
public class LoadServiceImpl implements LoadService {
	
	@Autowired
	private LoadDao loadDao;
	
	
	
	@Override
	public List<Load> getLoads() {
		
		return loadDao.findAll();
	}

	@Override
	public Load getLoad(long loadId) {

		return loadDao.getOne(loadId);
	}

	@Override
	public Load addLoad(Load load) {

	
		 loadDao.save(load);
		 return load;
	}
	public Load updateLoad(Load load,long loadId) {

		loadDao.save(load);
		return load;
	}
public void deleteLoad(long parseLong) {

	Load entity= loadDao.getOne(parseLong);
	loadDao.delete(entity);
}


}
