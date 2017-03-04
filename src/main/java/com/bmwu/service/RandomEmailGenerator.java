package com.bmwu.service;

import org.springframework.stereotype.Service;

/**
 * Created by michael on 3/5/17.
 */
@Service
public class RandomEmailGenerator implements EmailGenerator {

    public String generateEmail() {
        return "bmwu.hz@gmail.com";
    }
}
