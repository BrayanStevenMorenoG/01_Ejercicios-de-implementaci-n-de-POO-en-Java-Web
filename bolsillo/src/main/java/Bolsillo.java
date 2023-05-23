import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Metodos.*;
public class Bolsillo extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String accion=req.getParameter("accion");
        System.out.println(accion);
        switch (accion) {
            case "ingresarNequi":
            req.getRequestDispatcher("inicioNequi.jsp").forward(req, resp);
                break;
            case "ingresarDaviplata":
            req.getRequestDispatcher("inicioDaviplata.jsp").forward(req, resp);
                break;
            case "Nequi":
            req.getRequestDispatcher("Nequi.jsp").forward(req, resp);
                break;
            case "Daviplata":
            req.getRequestDispatcher("Daviplata.jsp").forward(req, resp);
                break;
            case "recargaNequi":
            req.getRequestDispatcher("recargaNequi.jsp").forward(req, resp);
                break;
            case "recargaDaviplata":
            req.getRequestDispatcher("recargaDaviplata.jsp").forward(req, resp);
                break;
            case "retiroNequi":
            req.getRequestDispatcher("retiroNequi.jsp").forward(req, resp);
                break;
            case "retiroDaviplata":
            req.getRequestDispatcher("retiroDaviplata.jsp").forward(req, resp);
                break;
            case "consultarNequi":
            req.getRequestDispatcher("consultarNequi.jsp").forward(req, resp);
                break;
            case "consultarDaviplata":
            req.getRequestDispatcher("consultarDaviplata.jsp").forward(req, resp);
                break;
            case "index":
            req.getRequestDispatcher("index.jsp").forward(req, resp);
                break;
            case "volverNequi":
            req.getRequestDispatcher("inicioNequi.jsp").forward(req, resp);
                break;
            case "volverDaviplata":
            req.getRequestDispatcher("inicioDaviplata.jsp").forward(req, resp);
                break;
        }
    }

    MetodosNequi accionsaldo = new MetodosNequi();
    MetodosDaviplata accionSaldo = new MetodosDaviplata();

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException { 
        // super.doPost(req, resp);
        String accion=req.getParameter("accion");
        System.out.println(accion);
        switch(accion){
            case "Recarga Nequi":
                double recarga = Double.parseDouble(req.getParameter("recarga"));
                req.setAttribute("recarga", recarga);
                req.setAttribute("saldo", accionsaldo.recargarSaldo(recarga));
                System.out.println("Recarga de: "+recarga+" - Su saldo es: "+ accionsaldo.getSaldo());
                req.getRequestDispatcher("ResRecargaNequi.jsp").forward(req, resp);
            break;
            case "Retirar Nequi":
                double retiro = Double.parseDouble(req.getParameter("retirar"));
                if (accionsaldo.getSaldo()>=retiro){
                req.setAttribute("retiro", retiro);
                req.setAttribute("saldo", accionsaldo.retirarSaldo(retiro));
                    System.out.println("Retiro de: "+retiro+" - Su saldo es: "+ accionsaldo.getSaldo());
                req.getRequestDispatcher("ResRetiroNequi.jsp").forward(req, resp);
                } else {
                req.setAttribute("saldo", accionsaldo.retirarSaldo(retiro));
                req.getRequestDispatcher("ErrorNequi.jsp").forward(req, resp);
                }
                
            break;
            case "Consultar Nequi":
                req.setAttribute("saldo", accionsaldo.getSaldo());
                System.out.println("Su saldo es: "+ accionsaldo.getSaldo());
                req.getRequestDispatcher("ResConsultaNequi.jsp").forward(req, resp);
            break;

            case "Recarga Daviplata":
                double recargaa = Double.parseDouble(req.getParameter("recargar"));
                req.setAttribute("recarga", recargaa);
                req.setAttribute("saldo", accionSaldo.recargarSaldo(recargaa));
                System.out.println("Recarga de: "+recargaa+" - Su saldo es: "+accionSaldo.getSaldo());
                req.getRequestDispatcher("ResRecargaDaviplata.jsp").forward(req, resp);
            break;
            case "Retirar Daviplata":
                double retiroo = Double.parseDouble(req.getParameter("retirar"));
            if (accionSaldo.getSaldo()>=retiroo){
                req.setAttribute("retiro", retiroo);
                req.setAttribute("saldo", accionSaldo.retirarSaldo(retiroo));
                System.out.println("Retiro de: "+retiroo+" - Su saldo es: "+ accionSaldo.getSaldo());
                req.getRequestDispatcher("ResRetiroDaviplata.jsp").forward(req, resp);
            } else {
                req.setAttribute("saldo", accionSaldo.retirarSaldo(retiroo));
                req.getRequestDispatcher("ErrorDaviplata.jsp").forward(req, resp);
            }
            case "Consultar Daviplata":
                req.setAttribute("saldo", accionSaldo.getSaldo());
                System.out.println("Su saldo es: "+ accionSaldo.getSaldo());
                req.getRequestDispatcher("ResConsultaDaviplata.jsp").forward(req, resp);
            break;

            case "Ingresar Nequi":
                double numero = Double.parseDouble(req.getParameter("celular"));
                double contraseña = Double.parseDouble(req.getParameter("contra"));
                if (numero == 123456 && contraseña == 9874){
                    System.out.println("Ingreso a Nequi");
                    req.getRequestDispatcher("inicioNequi.jsp").forward(req, resp);
                } else {
                    System.out.println("Datos erroneos");
                    req.getRequestDispatcher("errorIngreso.jsp").forward(req, resp);
                }
            break;
            case "Ingresar Daviplata":
                double cedula = Double.parseDouble(req.getParameter("cedula"));
                double contraseñaa = Double.parseDouble(req.getParameter("contra"));
                if (cedula == 654321 && contraseñaa == 4567){
                    System.out.println("Ingreso a Daviplata");
                    req.getRequestDispatcher("inicioDaviplata.jsp").forward(req, resp);
                } else {
                    System.out.println("Datos erroneos");
                    req.getRequestDispatcher("errorIngreso.jsp").forward(req, resp);
                }
            break;
    }
    
}
}