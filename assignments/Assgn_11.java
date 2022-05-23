package assignments;

public class Assgn_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="GoodMorningtoall";
		int len=s.length();
		int n=5,i=0;
		
		int div=len/n;
		
		System.out.println("Length: "+len+" ,number of parts:"+n);
		
		char []chs=s.toCharArray();
		
		while(i<len-1){
			for(int j=i;j<div;j++) {
				System.out.print(chs[j]);
			}
			System.out.println();
			i=i+3;
			div=div+3;
		}
		
		
		
	}

}
