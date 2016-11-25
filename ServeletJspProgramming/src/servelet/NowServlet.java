package servelet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class NowServlet extends HttpServlet{
	//필드
	private String location;
	
	//생성자
	public NowServlet(){		//처음 요청할때 생성되고 서블릿은 한번 생성되면 재사용된다. 그때마다 생기지 않는다
		System.out.println("NowServlet 객체 생성");
	}
	
	//초기화 메소드		객체가 만들어지고 나서 초기화메소드가 실행된다.
	@Override
	public void init(ServletConfig config) throws ServletException {	//web.xml 에서 init을 실행하가위해 받는다
		System.out.println("NowServlet 초기화");
		location = config.getInitParameter("location");
	}
	
	//메소드
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");	//text/html 은 공백이 들어가면 안댐 , =앞뒤는 공백이 있으면 안댄다
		//response.setHeader(arg0, arg1);		//응답HTTP 헤더행에 추가하는것을 적음
		
		PrintWriter out = response.getWriter();			//출력스트림에 출력되는건 응답HTTP 본문행에 들어간다
		out.println("<html>");
		out.println("<head><meta charset='UTF-8'</head>");
		out.println("<body>");
		out.print("현재" +location +"시간:" + new Date().toString());
		out.println("</body>");
		out.println("</html>");
	}
}
