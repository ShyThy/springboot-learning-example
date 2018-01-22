package org.spring.springboot.controller;

import org.spring.springboot.domain.City;
import org.spring.springboot.domain.Merchandise;
import org.spring.springboot.domain.User;
import org.spring.springboot.service.MerchandiseService;
import org.spring.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户控制层
 *
 * Created by bysocket on 07/02/2017.
 */
@RestController
public class UserRestController {

    @Autowired
    private UserService userService;
    @Autowired
    private MerchandiseService merchandiseService;

    /**
     * 根据用户名获取用户信息，包括从库的地址信息
     *
     * @param userName
     * @return
     */
    @RequestMapping(value = "/api/user", method = RequestMethod.GET)
    public User findByName(@RequestParam(value = "userName", required = true) String userName) {
        return userService.findByName(userName);
    }

    @RequestMapping(value = "/api/merchandise", method = RequestMethod.GET)
    public Merchandise findByMerchandiseName(@RequestParam(value = "name") String name) {
        Merchandise m = merchandiseService.findByName(name);
        return m;
    }

}
