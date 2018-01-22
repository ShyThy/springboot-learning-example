package org.spring.springboot.service.impl;

import org.spring.springboot.dao.third.MerchandiseDao;
import org.spring.springboot.domain.Merchandise;
import org.spring.springboot.service.MerchandiseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: thy
 * @Date: Created in 2018/1/22 14:14
 * @Modified By:
 */
@Service
public class MerchandiseServiceImpl implements MerchandiseService{
    @Autowired
    private MerchandiseDao merchandiseDao;

    @Override
    public Merchandise findByName(String name) {
        Merchandise m = merchandiseDao.findByName(name);

        return m;
    }
}
