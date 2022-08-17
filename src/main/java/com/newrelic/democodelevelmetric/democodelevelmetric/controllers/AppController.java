package com.newrelic.democodelevelmetric.democodelevelmetric.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
  @ResponseStatus(HttpStatus.OK)
  @RequestMapping(method = RequestMethod.GET, path = "/error")
  public @ResponseBody int getError() {
    int d = 0;
    return (1 / d);
  }

  @ResponseStatus(HttpStatus.OK)
  @RequestMapping(method = RequestMethod.GET, path = "/")
  public @ResponseBody String getHealth() {
    return "ok";
  }

  @ResponseStatus(HttpStatus.OK)
  @RequestMapping(method = RequestMethod.GET, path = "/ping")
  public @ResponseBody String ping() {
    return "pong";
  }
}
