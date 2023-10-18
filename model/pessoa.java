package model;



import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/pessoa")
public class pessoa extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        try {
            int anoNascimento = Integer.parseInt(request.getParameter("anoNascimento"));
            String fezAniversario = request.getParameter("fezAniversario");

            int anoAtual = Calendar.getInstance().get(Calendar.YEAR);

            int idade = anoAtual - anoNascimento;
            if ("nao".equals(fezAniversario)) {
                idade--;
            }

            out.println("<html>");
            out.println("<head>");
            out.println("<title>Idade Atual</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Sua Idade Atual é: " + idade + " anos</h1>");
            out.println("</body>");
            out.println("</html>");
        } catch (NumberFormatException e) {
            out.println("Ano de nascimento inválido.");
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}