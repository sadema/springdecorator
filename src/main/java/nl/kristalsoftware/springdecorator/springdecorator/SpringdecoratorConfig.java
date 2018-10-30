package nl.kristalsoftware.springdecorator.springdecorator;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@RefreshScope
@Slf4j
@Configuration
public class SpringdecoratorConfig {

    @ConditionalOnProperty(
            name = {"zeza.feature"},
            havingValue = "true",
            matchIfMissing = true
    )
    @Bean
    public InsuranceMapper create() {
        log.info("create InsuranceService");
        return new InsuranceMapper();
    }

    @ConditionalOnProperty(
            name = {"zeza.feature"},
            havingValue = "false"
    )
    @Bean
    public InsuranceMapper createDecorator() {
        log.info("create InsuranceDecoratorService");
        return new InsuranceDecoratorMapper();
    }

}
