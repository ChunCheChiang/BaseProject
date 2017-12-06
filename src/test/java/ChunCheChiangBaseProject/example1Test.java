package ChunCheChiangBaseProject;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class example1Test {
    @Test
    public void getType() throws Exception {
        example1 re=new example1(10,50,10);

        System.out.println(re.getType());
    }

}
