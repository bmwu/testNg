package com.bmwu.bo;

import com.bmwu.entity.Order;
import com.bmwu.exception.NotFoundException;
import com.bmwu.exception.SaveException;
import com.bmwu.exception.UpdateException;

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
