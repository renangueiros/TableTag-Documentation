/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.tabletag.servlets;

import br.com.tabletag.modelos.Pessoas;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Renan
 */
@WebServlet(name = "IndexServlet", urlPatterns = {"/index.html"})
public class IndexServlet extends HttpServlet {

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        List<Pessoas> listaPessoas = new ArrayList<>();
        List<String> listaCabecalho = new ArrayList<>();
        List<String> listaCabecalhoCustom = new ArrayList<>();
        String[] arrayPresentedOnTable = new String[]{"cpf", "nome", "telefone"};

        listaCabecalho.add("CPF");
        listaCabecalho.add("Nome");
        listaCabecalho.add("Identidade");
        listaCabecalho.add("Data de Nascimento");
        listaCabecalho.add("Escolaridade");
        listaCabecalho.add("Endereço");
        listaCabecalho.add("Telefone");

        listaPessoas.add(new Pessoas(111222333, "Fellipe", 12345, "31/10/2016", "Graduado", "Rua Sem Nome", "878150111111"));
        listaPessoas.add(new Pessoas(111222333, "Marciele", 12345, "31/10/2016", "Graduado", "Rua Sem Nome", "878150111111"));
        listaPessoas.add(new Pessoas(111222333, "Renan", 12345, "31/10/2016", "Graduado", "Rua Sem Nome", "878150111111"));
        listaPessoas.add(new Pessoas(111222333, "Ricardo", 12345, "31/10/2016", "Graduado", "Rua Sem Nome", "878150111111"));
        listaPessoas.add(new Pessoas(111222333, "Victor", 12345, "31/10/2016", "Graduado", "Rua Sem Nome", "878150111111"));
        listaPessoas.add(new Pessoas(111222333, "Williane", 12345, "31/10/2016", "Graduado", "Rua Sem Nome", "878150111111"));
        
        listaCabecalhoCustom.add("CPF");
        listaCabecalhoCustom.add("Nome");
        listaCabecalhoCustom.add("Telefone");

        request.setAttribute("listaCabecalho", listaCabecalho);
        request.setAttribute("listaPessoas", listaPessoas);
        request.setAttribute("listaCabecalhoCustom", listaCabecalhoCustom);
        request.setAttribute("arrayPresentedOnTable", arrayPresentedOnTable);

        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/paginas/index.jsp");
        dispatcher.forward(request, response);
    }

}
