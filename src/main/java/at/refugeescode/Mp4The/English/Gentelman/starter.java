package at.refugeescode.Mp4The.English.Gentelman;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class starter {

        @Bean
       ApplicationRunner applicationRunner(TheEnglishGentelman theEnglishGentelman,Cigar cigar,Lighter lighter){
            return args -> {
                theEnglishGentelman.smoke(cigar);

            };
        }
    }


