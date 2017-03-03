package com.bmwu.expectedexception;

import com.bmwu.bo.OrderBo;
import com.bmwu.entity.Order;
import com.bmwu.exception.NotFoundException;
import com.bmwu.exception.SaveException;
import com.bmwu.exception.UpdateException;
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
