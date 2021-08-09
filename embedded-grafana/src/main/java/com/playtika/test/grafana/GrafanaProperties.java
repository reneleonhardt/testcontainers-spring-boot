package com.playtika.test.grafana;

import com.playtika.test.common.properties.CommonContainerProperties;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Accessors(chain = true)
@Data
@EqualsAndHashCode(callSuper = true)
@ConfigurationProperties("embedded.grafana")
public class GrafanaProperties extends CommonContainerProperties {

    static final String GRAFANA_BEAN_NAME = "grafana";

    boolean enabled = true;
    // https://hub.docker.com/r/grafana/grafana
    String dockerImage = "grafana/grafana:8.1.0";
    String networkAlias = "grafana";
    String username = "admin";
    String password = "password";
    int port = 3000;
}
