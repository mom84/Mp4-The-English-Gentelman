package at.refugeescode.Mp4The.English.Gentelman;

import org.springframework.stereotype.Component;

@Component
public class Cigar {

    private boolean isLit;


    public void light() {
        isLit = true;
    }


    public String smokecigar() {
        if (isLit) {
            return "I smoked cigar";
        }
        throw new IllegalStateException("The cigar was not lit before");
    }


}
