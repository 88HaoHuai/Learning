package com.imooc.service;

import com.imooc.domain.Girl;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2018/12/1.
 */
public class GirlServiceTest {
    @Autowired
    private GirlService grilSevice;

    @Test
    public void findOne() throws Exception {
        Girl girl =grilSevice.findOne(6);
        Assert.assertEquals(new Integer(15),girl.getAge());
    }

}