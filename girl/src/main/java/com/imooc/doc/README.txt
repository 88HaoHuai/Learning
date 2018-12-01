目录结构：
aspect
	--HttpAspect：aop处理请求
controller
	--GirlController：Girl的Controller类
	--HelloController：简单测试RequestMapping
domain
	--Girl：girl实体与数据库对应
	--Result：http请求返回的最外层对象
enums
	--ResultEnum：定义异常枚举，方便统一维护管理
exception
	--GirlException：定义自己的异常类
handle
	--ExceptionHandle：捕获定义的GirlException异常类
properties
	--GirlProperties：通过注解获得配置信息
repository
	--GirlRepository：查询所有girls列表，Dao接口，继承JPA
service
	--GirlService：Girl的Service类
utils
	--ResultUtil：返回结果定义格式
GirlApplication：SpringBoot程序入口

格式使用Result对象，固定字段
解决逻辑在一个地方处理，引入异常处理，定义了自己的异常GirlException，因此为了获得自己的异常ExceptionHandle，写了自己的异常捕获类
将Code与Message定义为枚举，方便统一管理



一阶段内容
2小时学会Spring Boot：https://blog.csdn.net/qq_22791091/article/details/78371092