import com.google.gson.Gson;


import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import jdk.nashorn.internal.parser.JSONParser;
import org.apache.logging.log4j.*;

@WebServlet(name = "stub_json", urlPatterns= {"/Stub_json"})

public class Stub_json extends HttpServlet {

    private static final Logger logger = LogManager.getLogger(Stub_json.class.getName());

    private Gson gson = new Gson();

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init();
        logger.debug("я жив");
    }

    @Override
    protected void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        logger.debug("запрос получен");
    }
    @Override
    protected void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        logger.debug("началась обработка запроса");
        request.setCharacterEncoding("UTF-8");
        logger.error(request);
    }



//        Message msg = new Message("Muchtar", 1000);
//        String msgJsonString = this.gson.toJson(msg);
//
//        PrintWriter out = response.getWriter();
//        response.setContentType("application/json");
//        response.setCharacterEncoding("UTF-8");
//        logger.error("alarm");
//        logger.debug(String.valueOf(response));
//        out.print(msgJsonString);
//        out.flush();
   // }


}
