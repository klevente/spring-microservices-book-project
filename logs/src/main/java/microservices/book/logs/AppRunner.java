package microservices.book.logs;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class AppRunner implements ApplicationRunner {

    @Value("${spring.cloud.consul.host:#{null}}")
    private String consulName;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        log.info("Consul located at: {}", consulName);
    }
}
