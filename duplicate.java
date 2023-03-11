
public class duplicate {

		 public static void main(String argu[]) {

		  String[] inp= new String[] {"amrutha","nimisha","appu","amrutha"};
		  //int cnt = 0;
		  //char[] inp = inp.toCharArray();
		  System.out.println("Duplicate Characters are:");
		  for (int i = 0; i < inp.length; i++) {
		   for (int j = i + 1; j < inp.length; j++) {
		    if (inp[i] == inp[j]) {
		     System.out.println(inp[j]);
		    //cnt++;
		    // break;
		    }
		   }
		  }
		 }
		}


