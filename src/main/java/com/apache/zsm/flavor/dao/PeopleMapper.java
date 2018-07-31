package com.apache.zsm.flavor.dao;

import com.apache.zsm.flavor.domain.People;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface PeopleMapper {
    @Select("select * from people")
    List<People> findAll();

    @Select("select * from people where id=#{id}")
    People findOne(int id);

    @Insert("insert into people value(null,#{name},#{interest},#{age})")
    int addOne(People people);

    @Update("update people set name=#{name},interest=#{interest},age=#{age} where id=#{id}")
    int updateById(People people);

    @Delete("delete from people where id=#{id}")
    int deleteById(int id);
}
