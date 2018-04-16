package kr.co.huxx.commandcontroller;

import kr.co.huxx.process.Processing;
import kr.co.huxx.vo.VO;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CommandController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String cmd = req.getParameter("cmd");
        String url = "page/upload.jsp";
        if ("upload".equals(cmd)){
            url = "page/upload_process.jsp";

        } else if ("file".equals(cmd)) {
            Processing processing = new Processing();
            String fileName = req.getParameter("name");
            System.out.println(fileName);
            String e = processing.image_processing(fileName);
            System.out.println(e);
        }
        RequestDispatcher requestDispatcher = req.getRequestDispatcher(url);
        requestDispatcher.forward(req,resp);
    }
}
