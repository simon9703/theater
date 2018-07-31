package com.apache.zsm.flavor.config;

import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DruidConfiguration {
    @Bean
    public ServletRegistrationBean statViewServlet() {

        // 输入loclhost/druid/xx都可以进入/druid/index.html, 未登录过则进入login.html
       ServletRegistrationBean servletRegistrationBean =
                new ServletRegistrationBean(new StatViewServlet(), "/druid/*");
        //servletRegistrationBean.addInitParameter("allow", "ip地址，ip地址"); //允许访问ip
        //servletRegistrationBean.addInitParameter("deny", "ip地址");  //禁止访问的地址，优先有allow
        servletRegistrationBean.addInitParameter("loginUsername", "druid");
        servletRegistrationBean.addInitParameter("loginPassword", "123");
        servletRegistrationBean.addInitParameter("resetEnable", "false"); // 浏览器中是否能重置数据
        return servletRegistrationBean;
    }

    @Bean
    public FilterRegistrationBean statFilter() {

        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean(new WebStatFilter());
        filterRegistrationBean.addUrlPatterns("/*");
        filterRegistrationBean.addInitParameter("exclusions",
                "*.js,*.css,*.gif,*.jpg,*.png,*.ico,/druid/*");
        return filterRegistrationBean;
    }
}
