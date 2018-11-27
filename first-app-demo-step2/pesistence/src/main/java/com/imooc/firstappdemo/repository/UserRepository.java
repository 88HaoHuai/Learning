package com.imooc.firstappdemo.repository;

import com.imooc.firstappdemo.domain.User;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by huaihao on 2018/11/27.
 * 仓储
 * {@link User} {@link Repository}
 */
@Repository
public class UserRepository {

    /**
     * 采用内存型的存储方式 ->Map
     */
    private ConcurrentMap<Integer,User> repository= new ConcurrentHashMap<>();

    private final static AtomicInteger idGenerator= new AtomicInteger();


    /**
     * 保存用户对象，
     * @param user {@link User}
     * @return 如果保存成功，返回<code>true</code>，否则返回<code>false</code>
     */
    public boolean save(User user){
        // ID 从1开始
        Integer id=idGenerator.incrementAndGet();
        user.setId(id);
        return repository.put(id,user) == null;
    }

    /**
     * 返回所有用户列表
     * @return
     */
    public Collection<User> findAll(){
        return repository.values();
    }
}
