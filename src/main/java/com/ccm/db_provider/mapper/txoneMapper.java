package com.ccm.db_provider.mapper;

import com.ccm.db_provider.entity.txone;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

@Mapper
@Service
public interface txoneMapper {

    @Insert("insert into orders(id,name,age) values(#{id},#{name},#{age})")
    public void insertUser(txone user);
}
