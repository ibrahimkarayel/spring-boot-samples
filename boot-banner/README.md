Spring Boot Customize Banner
------------

INTRODUCTION
------------
Sample Spring-boot custom banner

REQUIREMENTS
------------
JDK 1.8+, Maven 3.2+ 

INSTALLATION
------------
Download project import as a maven project 
Run spring tr.com.tr.com.jowl.App main class


#### Custom Banner
to create custom banner from ascii 
1. update your drawString and font properties
2. run tr.com.tr.com.jowl.service.ASCIIBannerServiceTest test class
3. copy result to spring-boot-h2\src\main\resources\banner.txt
4. run your main app

#### Disable Banner
1. spring.main.banner-mode=off (application.yml or application.properties)
2. java -Dspring.main.banner-mode=off -jar your-jar-name.jar
3. In main class:
    ```
      SpringApplication app = new SpringApplication(App.class);
        app.setBannerMode(Banner.Mode.OFF);
        app.run(args);
    }
    ```
#### Watch Courses
[![spring-boot-banner](https://img.youtube.com/vi/N9kVPNW6s-s/0.jpg)](https://youtu.be/N9kVPNW6s-s)


[ibrahim karayel](https://www.linkedin.com/in/ibrahimkarayel/)
