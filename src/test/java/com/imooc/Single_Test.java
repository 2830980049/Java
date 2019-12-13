package com.imooc;

import com.imooc.Single.SingleOne;
import com.imooc.Single.SingleTwo;
import org.junit.Test;

/**
 * @author Wuqili
 * @version 1.0
 * @date 2019/12/13 15:39
 */
public class Single_Test {
    @Test
    public void Test_Single() {
        // TODO Auto-generated method stub
        SingleOne one = SingleOne.getInstance();
        SingleOne two = SingleOne.getInstance();
        System.out.println(one);
        System.out.println(two);
        System.out.println("==================================");
        SingleTwo one1 = SingleTwo.getInstance();
        SingleTwo two1 = SingleTwo.getInstance();
        System.out.println(one1);
        System.out.println(two1);
    }

}
