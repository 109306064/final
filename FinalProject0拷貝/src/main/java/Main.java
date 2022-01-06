import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServelt("/Main")
public class Main extends HttpServlet {
	public static void main(String[] args) throws IOException {
		WebTree searchResult = new WebTree();
		KeywordList wordList = new KeywordList();
		
//		System.out.println("hello world");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Type something and search:");
		String searchKeyword = scanner.nextLine();
		
		searchResult.search(searchKeyword);
		searchResult.setPostOrderScore(wordList.getKeywordList());
		searchResult.eularPrintTree();
		scanner.close();

	}
	
}