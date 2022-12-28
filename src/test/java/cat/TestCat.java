package cat;

import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)

public class TestCat {

    @Mock
    Feline feline;


    @Test
    public void getSoundReturnMew() {
        Cat cat = new Cat(feline);
        assertEquals("Мяу", cat.getSound());
    }
    @Test
    public void getFoodCatIsPredator() throws Exception {
        Cat cat = new Cat(feline);
        Mockito.when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        assertEquals(List.of("Животные", "Птицы", "Рыба"),cat.getFood());
    }
}
