package com.imooc;

import com.imooc.domain.Girl;
import com.imooc.service.GirlService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by Administrator on 2018/12/1.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class GirlSeviceTest {

    @Autowired
    private GirlService grilSevice;

    @Test
    public void findOneTest(){
        Girl girl =grilSevice.findOne(6);
        Assert.assertEquals(new Integer(15),girl.getAge());
    }
}
