package com.gftraining;

import org.springframework.stereotype.Component;

@Component
public class Smiths implements Performance {

	@Override
	public void perform() {
		System.out.println("HANG THE DJ,HANG...");

	}

}
