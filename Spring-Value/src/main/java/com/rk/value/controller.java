package com.rk.value;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class controller {
	@Value("{message}")
private String msg;
	
	@Value("#{${mapvalues}}")
private Map<String,Integer>testMap;
	
@GetMapping("/hello")
public String msg() {
	return msg;
}
public  Map<String,Integer> hello()
{
	return testMap;
}

}
