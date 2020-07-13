package com.revision;

public class HelpDemo {

	public static void main(String[] args) {
		HelpLine help=new HelpLine();
		help.setCommand(new People(), 1);
		help.useCommand(1);
	}

	

}
