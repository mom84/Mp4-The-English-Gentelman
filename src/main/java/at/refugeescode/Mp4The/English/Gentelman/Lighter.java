package at.refugeescode.Mp4The.English.Gentelman;


import org.springframework.stereotype.Component;

@Component
public class Lighter {

    public void light(Cigar cigar){
        cigar.light();
    }
}
