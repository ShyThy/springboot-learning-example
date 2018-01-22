package org.spring.springboot.dao.third;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.spring.springboot.domain.Merchandise;

/**
 * @Author: thy
 * @Date: Created in 2018/1/22 14:05
 * @Modified By:
 */
@Mapper
public interface MerchandiseDao {
    Merchandise findByName(@Param("name") String name);
}
