

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/doCalc2")
public class Case1_Calc2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String number1=request.getParameter("number1");
		String number2=request.getParameter("number2");
		String operator=request.getParameter("operator");
		
		double result = 0, n1 = 0, n2 = 0;
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();

		n1=Double.parseDouble(number1);
		n2=Double.parseDouble(number2);
		
		switch(operator) {
			case "add":
				result=n1+n2;
				break;
			case "sub":
				result=n1-n2;
				break;
			case "mul":
				result=n1*n2;
				break;
			case "div":
				result=n1/n2;
		}
		
		out.print("<html>");
		out.print("<head><title>計算結果</title></head>");
		out.print("<body>");
		out.print("<h1>計算結果: "+result+"</h1>");
		out.print("</body>");
		out.print("</html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
