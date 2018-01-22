package org.spring.springboot.service;

import org.spring.springboot.domain.Merchandise;

/**
 * @Author: thy
 * @Date: Created in 2018/1/22 14:03
 * @Modified By:
 */
public interface MerchandiseService {

    Merchandise findByName(String name);
}
