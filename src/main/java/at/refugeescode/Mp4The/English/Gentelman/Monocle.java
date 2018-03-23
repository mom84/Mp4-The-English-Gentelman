package at.refugeescode.Mp4The.English.Gentelman;
import org.springframework.stereotype.Component;

@Component
public class Monocle {

    private Newspaper newspaper;

    public Monocle(Newspaper newspaper){
        this.newspaper=newspaper;
    }

    public String read(Newspaper newspaper){
        return newspaper.readNewsPaper();
    }
}
