package com.emrekokcu.nodemcu.controller;

import java.text.DecimalFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping(value = "/nodemcu")
public class MockNodemcuController {
  private static Double MIN = 0.05D;
  private static Double MAX = 0.50D;
  private static final DecimalFormat DF = new DecimalFormat("0.0000");

  @GetMapping(value = "/temperature")
  public ResponseEntity<?> getTemperatureData() {
    double random = MIN + Math.random() * (MAX - MIN);
    return ResponseEntity.ok(DF.format(random));
  }

  @GetMapping(value = "/ldr")
  public ResponseEntity<?> getLdrData() {
    double random = MIN + Math.random() * (MAX - MIN);
    return ResponseEntity.ok(DF.format(random));
  }

  @GetMapping(value = "/rain")
  public ResponseEntity<?> getRainData() {
    double random = MIN + Math.random() * (MAX - MIN);
    return ResponseEntity.ok(DF.format(random));
  }

  @GetMapping(value = "/moisture")
  public ResponseEntity<?> getMoistureData() {
    double random = MIN + Math.random() * (MAX - MIN);
    return ResponseEntity.ok(DF.format(random));
  }

}
