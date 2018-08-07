package top.siki.order.config;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

/**
 * @author: wiki
 * @date: 2018/8/6
 * @description:
 */
@Data
@Component
@ConfigurationProperties(prefix = "girl")
@RefreshScope
public class GirlConfig {

    private String name;

    private Integer age;
}

