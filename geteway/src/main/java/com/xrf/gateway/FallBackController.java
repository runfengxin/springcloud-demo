package com.xrf.gateway;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xinrunfeng
 * @description:
 */
@RestController
public class FallBackController {

    @RequestMapping("/fallback")
    public String fallback() {
        return"fallback";
    }
}
