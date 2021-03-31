package com.ddd.ecommerce100;

import use_case.FakeLivraisons;

class ApplicationTests {

	public static void main(String [] args) {
		FakeLivraisons fakeLivraisons = new FakeLivraisons();
		fakeLivraisons.test1();
		fakeLivraisons.test2();
	}

}
