package jp.ac.hiroshima_u.fu_midori.SSH2017.test7;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by 遠藤拓斗 on 2017/04/24.
 */
public class CalcTest {
    @Test
    public void add1_2() {
        Calc calc = new Calc();
        assertEquals(3, calc.add(1, 2));
    }

    @Test
    public void add2_3() {
        Calc calc = new Calc();
        assertEquals(5, calc.add(2, 3));
    }
}