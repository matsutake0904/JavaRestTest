package com.mkjson;

public class MkJson {
	private String mkdJson="{";
	public String mkJson() {
		StringBuilder jsonB = new StringBuilder(this.mkdJson);
		
			for(int i=0; i < 100; i++ ) {
				jsonB.append( Integer.toString(i) + ":" + Integer.toString(i*i) + ", ");
			}
		jsonB.append("100: 10000 }");
		mkdJson = jsonB.toString();
		return mkdJson;
		
	}

}
