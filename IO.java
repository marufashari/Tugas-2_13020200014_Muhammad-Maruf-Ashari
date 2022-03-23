import java.io.IOException;
import java.io.InputStreamReader;
public class IO {
	public static void main(String args[]) throws IOException
{
	InputStreamReader cin = null;

	try {
	  cin = new InputStreamReader(System.in);
	  System.out.println("Masukan karakter, 'q' untuk berhenti.");
	  char c;
	  do {
		c = (char) cin.read();
		System.out.print(c);
	  } while(c != 'q');
	}finally {
	  if (cin != null) {
		cin.close();
	  }
	}
  }
}