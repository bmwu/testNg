package com.bmwu.testng.bo;

import com.bmwu.testng.entity.Order;
import com.bmwu.testng.exception.NotFoundException;
import com.bmwu.testng.exception.SaveException;
import com.bmwu.testng.exception.UpdateException;

/**
 * Created by michael on 3/3/17.
 */
public class OrderBo {

    public void update(Order order) throws UpdateException, NotFoundException {

        if (order == null) {
            throw new UpdateException("Order is null");
        }

        throw new NotFoundException("Order does not exist");
    }

    public void save(Order order) throws SaveException {

        if (order == null) {
            throw new SaveException("Order is null");
        }
    }
}
