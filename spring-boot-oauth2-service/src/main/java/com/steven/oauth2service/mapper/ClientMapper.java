package com.steven.oauth2service.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.steven.shiro.entity.Client;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface ClientMapper extends BaseMapper<Client>{
}
