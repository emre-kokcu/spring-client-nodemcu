package com.emrekokcu.nodemcu.util;

import java.util.HashMap;
import java.util.Map;

public class SensorData {
  public static Map<String, String> sensorsDataMap = new HashMap<String, String>() {{
    put("temperature", "0.0000");
    put("ldr", "0.0000");
    put("rain", "0.0000");
    put("moisture", "0.0000");
  }};
}
