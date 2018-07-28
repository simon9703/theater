package com.apache.zsm.flavor.repository;

import com.apache.zsm.flavor.domain.People;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository //必须?
public interface PeopleMapper {
    @Select("select * from people")
    List<People> findAll();

    @Select("select * from people where id=#{id}")
    People findOne(int id);

    @Insert("insert into people value(null,#{name},#{interest},#{age})")
    int add(People people);

    @Update("update people set interest=#{interest} where id=#{id}")
    int updateById(@Param("id")int id, @Param("interest")String interest);

    @Delete("delete from people where id=#{id}")
    int deleteById(int id);
}
