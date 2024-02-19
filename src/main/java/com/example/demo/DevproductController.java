package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DevproductController {
@GetMapping(value="/productok")
public String getMsg() {
	return "product save sucessfully";
}

}
