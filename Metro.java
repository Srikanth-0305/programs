package com.revision;

public class Metro extends Government{

	public void action() {
		new ESeva().collectPayment(this);
}
}
