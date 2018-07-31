package com.apache.zsm.flavor.service;

import com.apache.zsm.flavor.domain.People;
import com.apache.zsm.flavor.dao.PeopleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PeopleService {
    @Autowired
    private PeopleMapper peopleDao;

    public People findOne(int id) {
        return peopleDao.findOne(id);
    }

    public List<People> findAll() {
        return peopleDao.findAll();
    }

    public int addOne(People people) {
        return peopleDao.addOne(people);
    }

    public int updateById(People people) {
        return peopleDao.updateById(people);
    }

    public int deleteById(int id) {
        return peopleDao.deleteById(id);
    }
}
