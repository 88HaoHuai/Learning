package com.imooc.firstappdemo.config;

import com.imooc.firstappdemo.domain.User;
import com.imooc.firstappdemo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Collection;

/**
 * Created by huaihao on 2018/11/27.
 * 路由器函数配置
 */
@Configuration
public class RouterFunctionConfiguration {

    /**
     * Servlet
     * 请求接口：ServletRequest 或者 HttpServlertRequest
     * 相应接口：ServletResponse 或者 HttpServlertResponse
     * Spring 5.0 重新定义了服务请求和相应接口：
     * 请求接口：ServletRequest
     * 相应接口：ServletResponse
     * 即可支持Servlet规范，也可以支持自定义，比如 Netty（Web Server）
     * <p>
     * 以本利：
     * 定义GET请求，并且返回所有的用户对象 URL: /person/find/all
     * Flux 是 0 - N个对象集合
     * Mono 是 0 - 1个对象集合
     * Reactive 中的 Flux或者Mono 它是异步处理（非阻塞）
     * 集合对象基本上是同步处理（阻塞）
     * Flux 或者 Mono 都是 Publisher
     */

    @Bean
    @Autowired
    public RouterFunction<ServerResponse> personFindAll(UserRepository userRepository) {
        // 返回所有的用户对象
        Collection<User> user = userRepository.findAll();

        return RouterFunctions.route(RequestPredicates.GET("/person/find/all"),
                request -> {
                    Mono<ServerResponse> response = null;
                    Flux<User> userFlux = Flux.fromIterable(user);
                    return ServerResponse.ok().body(userFlux, User.class);
                });
    }
}
