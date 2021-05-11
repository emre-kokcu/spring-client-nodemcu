package com.emrekokcu.nodemcu.controller;

import static com.emrekokcu.nodemcu.util.SensorData.sensorsDataMap;

import java.text.DecimalFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping(value = "/nodemcu")
public class MockNodemcuController {
  private static final DecimalFormat DF = new DecimalFormat("0.0000");

  @GetMapping(value = "/temperature")
  public ResponseEntity<?> getTemperatureData() {
    return ResponseEntity.ok(sensorsDataMap.get("temperature"));
  }

  @GetMapping(value = "/ldr")
  public ResponseEntity<?> getLdrData() {
    return ResponseEntity.ok(sensorsDataMap.get("ldr"));
  }

  @GetMapping(value = "/rain")
  public ResponseEntity<?> getRainData() {
    return ResponseEntity.ok(sensorsDataMap.get("rain"));
  }

  @GetMapping(value = "/moisture")
  public ResponseEntity<?> getMoistureData() {
    return ResponseEntity.ok(sensorsDataMap.get("moisture"));
  }

  @PostMapping(value = "/temperature")
  public ResponseEntity<?> postTemperatureData(@RequestBody String data) {
    sensorsDataMap.put("temperature", data);
    return ResponseEntity.ok(data);
  }

  @PostMapping(value = "/ldr")
  public ResponseEntity<?> postLdrData(@RequestBody String data) {
    sensorsDataMap.put("ldr", data);
    return ResponseEntity.ok(data);
  }

  @PostMapping(value = "/rain")
  public ResponseEntity<?> postRainData(@RequestBody String data) {
    sensorsDataMap.put("rain", data);
    return ResponseEntity.ok(data);
  }

  @PostMapping(value = "/moisture")
  public ResponseEntity<?> postMoistureData(@RequestBody String data) {
    sensorsDataMap.put("moisture", data);
    return ResponseEntity.ok(data);
  }


}
