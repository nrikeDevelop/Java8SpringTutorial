package com.gftraining;

import org.springframework.stereotype.Component;

@Component
public class FrankShore implements Performance {

	@Override
	public void perform() throws Exception {
		System.out.println("Asi siy yo, complicado ....");
		//BREAK WITH WXCEPTION
		throw new Exception("Desafine brutal");


	}

}
