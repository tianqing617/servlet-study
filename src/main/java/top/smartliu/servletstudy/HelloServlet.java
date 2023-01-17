package top.smartliu.servletstudy;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    // servlet生命周期：init service(doGet/doPost) destroy

    // 当清求到达Servlet容器时，Servlet容器会判断servlet对象是否存在，如果不存在，则创建实例并初始化。该方法只会执行一次。
    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
    }

    // 当服务器关闭或应用程序停止时，调用读方法。该方法只会执行一次
    public void destroy() {
    }
}