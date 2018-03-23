package at.refugeescode.Mp4The.English.Gentelman;
import org.springframework.stereotype.Component;


@Component
public class TheEnglishGentelman {


    private Lighter lighter;
    private Monocle monocle;

    private boolean read;
    private boolean smoked;


    public TheEnglishGentelman(Lighter lighter, Monocle monocle){
        this.lighter = lighter;
        this.monocle= monocle;
    }


    public void read(Newspaper newspaper) {
        monocle.read(newspaper);
        read = true;
    }


    public void smoke(Cigar cigar){
        lighter.light(cigar);
        cigar.smokecigar();
        smoked = true;
    }

    public boolean hadAGoodDay() {
        return read && smoked;
    }

}
