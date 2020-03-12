package note.emily.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import com.baomidou.mybatisplus.extension.plugins.PerformanceInterceptor;

@Configuration
public class MybatisPlusConfig {

    @Bean
    public PerformanceInterceptor performanceInterceptor() {
        PerformanceInterceptor performanceInterceptor = new PerformanceInterceptor();
        //格式化sql语句
        return performanceInterceptor;
    }

    /**
     * 分页插件
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        PaginationInterceptor paginationInterceptor = new PaginationInterceptor();
        //调整MybatisPlus分页查询单业最大限制数量(预设为500、不受限制设定-1)
        //2019.10.28 by James-因为报表与分页查询，有的有共用到，所以设为10000笔，避免报表资料无法查询出来
        paginationInterceptor.setLimit(10000);
        return new PaginationInterceptor();
    }
}
