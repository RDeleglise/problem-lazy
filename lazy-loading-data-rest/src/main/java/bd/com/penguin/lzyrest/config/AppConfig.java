package bd.com.penguin.lzyrest.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.hibernate5.Hibernate5Module;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;

@Configuration
public class AppConfig {
    @Bean
    public Jackson2ObjectMapperBuilder configureObjectMapper() {
        return new Jackson2ObjectMapperBuilder()
                .modulesToInstall(Hibernate5Module.class);
    }
}


