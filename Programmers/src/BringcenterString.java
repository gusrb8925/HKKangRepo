
class BringcenterString {
  public String solution(String a) {
      if(a.length() % 2 == 0){
            return a.substring(a.length()/2-1, a.length()/2+1);
        }
        else{
            return Character.toString(a.charAt(a.length()/2));
        }
  }


	public static void main(String[] args) {
		BringcenterString s = new BringcenterString();
		System.out.println(s.solution("center"));
		System.out.println(s.solution("power"));

	}

}
