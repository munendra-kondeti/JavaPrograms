
public class JumpStatements {

	public static void main(String[] args) {
		int N =4;
		if (N%2 != 0){
            System.out.print("Weird");
        }
        else if(N % 2 == 0 ){
            if (N >=2 && N <=5)
                System.out.print("Not Werid");
            else if(N >=6 && N<=20) 
                System.out.print("Weird");
            else if(N > 20)
                System.out.print("Not Weird");
        }
		
	}

}
