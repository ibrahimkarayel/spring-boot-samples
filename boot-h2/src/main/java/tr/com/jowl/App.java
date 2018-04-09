package tr.com.jowl;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {

    private static final Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }


   /* @Bean
    CommandLineRunner runner(ImageService imageService){
        return args -> {
            logger.info("Loading images");
            imageService.save(new Image("Image 1"));
            imageService.save(new Image("Image 2"));
            imageService.save(new Image("Image 3"));
            imageService.save(new Image("Image 4"));
            List<Image> imageList=imageService.findAll();
            logger.info("image size {}",imageList.size() );
            imageList.forEach(image -> logger.info("img id {} name {}", image.getId(), image.getName()));
        };
    }*/
}
