import org.junit.Assert;
import org.junit.Test;

public class MainClass
{
    int class_number = 20;

    @Test
    public void getClassNumber()
    {
        System.out.println(class_number);

        System.out.println(this.class_number);
    }
}
