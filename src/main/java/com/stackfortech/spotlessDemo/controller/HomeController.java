/*
 * Copyright 2020 @ stackfortech.
 *
 * All rights reserved.
 * All information contained herein is, and remains
 * the property of Stackfortech.The intellectual and technical concepts contained
 * herein are proprietary to Stackfortech.
 * Reproduction and reuse of this material is allowed with credit given to
 *  the original author
 */
package com.stackfortech.spotlessDemo.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.math.BigDecimal;
import java.util.*;

@Component
public class HomeController {

        private static Integer counter = 0;
        private static final String greetingMessage = "Hello enthusiast ! Good to know you are here.And By the way you are visitor no : ";


        @GetMapping("/hello")
        public ResponseEntity<String> greet() {
          String message = greetingMessage.concat(String.valueOf(counter));
          counter++;
          return new ResponseEntity<String>(message, HttpStatus.OK);
  }
}
