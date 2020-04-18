import com.Sam.ReverseStr2ACSII;

public class Test {

    @org.junit.Test
    public void test() {
        String str = "China USA";
        ReverseStr2ACSII test = new ReverseStr2ACSII();
        //test.setO(str);
        String s = test.RunIt();
        System.out.println(s);
    }
}
