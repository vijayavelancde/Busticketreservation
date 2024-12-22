package PROJECT;

class adminvalidation extends Exception{
	
	String a;
	String b;
	
	adminvalidation(String a, String b){
		this.a = a;
		this.b = b;
	}
}

 class notmatchedexception extends Exception {
	
	int val;
	
	notmatchedexception(int n){
		this.val = n;
	}

}

