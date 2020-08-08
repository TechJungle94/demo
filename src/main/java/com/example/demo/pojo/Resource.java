package com.example.demo.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ConfigurationProperties(prefix="com.example.demo.openresource")
// classpath用来指代src/main/java/
@PropertySource(value="classpath:resource.properties")
public class Resource {
    private String name;
    private String website;
    private String language;

    public void setName(String name) {
        this.name = name;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getName() {
        return name;
    }

    public String getWebsite() {
        return website;
    }

    public String getLanguage() {
        return language;
    }
    
}