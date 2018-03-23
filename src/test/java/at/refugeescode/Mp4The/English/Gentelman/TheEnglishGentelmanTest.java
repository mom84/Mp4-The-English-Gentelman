package at.refugeescode.Mp4The.English.Gentelman;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@DirtiesContext(classMode = DirtiesContext.ClassMode.BEFORE_EACH_TEST_METHOD)
class TheEnglishGentelmanTest {


    @Autowired
    private TheEnglishGentelman theEnglishGentelman;


    @Test
    void hadABadDay() {
        boolean result = theEnglishGentelman.hadAGoodDay();
        assertEquals(false , result);
    }

    @Test
    void hadAGoodDay() {
        theEnglishGentelman.read(new Newspaper());
        theEnglishGentelman.smoke(new Cigar());
        boolean result = theEnglishGentelman.hadAGoodDay();
        assertEquals(true, result);
    }

}