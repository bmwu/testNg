package com.bmwu.testng.expectedexception;

import com.bmwu.testng.bo.OrderBo;
import com.bmwu.testng.entity.Order;
import com.bmwu.testng.exception.NotFoundException;
import com.bmwu.testng.exception.SaveException;
import com.bmwu.testng.exception.UpdateException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Created by michael on 3/3/17.
 */
public class OrderBoTest {

    private OrderBo orderBo;
    private Order data;


    @BeforeTest
    void setup() {
        orderBo = new OrderBo();

        data = new Order();
        data.setID(1);
        data.setCreateBy("michael");
    }

    @Test(expectedExceptions = SaveException.class)
    public void throwIfOrderIsNull() throws SaveException {
        orderBo.save(null);
    }

    @Test(expectedExceptions = { UpdateException.class, NotFoundException.class })
    public void throwIfOrderIsNotExists() throws UpdateException, NotFoundException {
        orderBo.update(data);
    }

}
