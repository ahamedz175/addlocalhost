package io.apibuild.buildingapi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/catalog")
public class buildapiresource {
	
	@RequestMapping("/names")
	public Name getName()
	{
		return new Name("Value1", "Value2");
	}

}
