package com.xue.config;

import com.xue.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;



@Configuration
@ComponentScan(value = "com.xue",excludeFilters = {
        @ComponentScan.Filter(type = FilterType.ANNOTATION,classes = {Controller.class,Service.class})
},useDefaultFilters = false)
public class MyConfig {

    //给容器注册一个bean,类型为返回值的类型，id默认为方法名作为id
    @Bean("person")//指定id名
    public Person person01(){
        return new Person(20,"lisi");
    }
}
