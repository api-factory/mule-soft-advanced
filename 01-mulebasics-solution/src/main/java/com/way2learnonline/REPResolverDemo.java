package com.way2learnonline;


	public class REPResolverDemo {

		public String multipleArgumentsMethod(String arg1, String arg2) {
			return "Request resolved to multipleArgumentsMethod ("
											+ arg1 + ", " + arg2 + ")";
		}		
		public String singleArgumentMethod(String arg1) {
			return "Request resolved to singleArgumentsMethod(" + arg1 + ")";
		}		
		public String noArgumentsMethod() {
			return "Request resolved to noArgumentsMethod";
		}		
	}

	