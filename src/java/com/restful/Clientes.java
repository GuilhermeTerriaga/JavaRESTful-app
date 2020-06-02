/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restful;

import com.google.gson.Gson;
import dao.ClienteDao;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import model.Cliente;

/**
 * REST Web Service
 *
 * @author guilherme
 */
@Path("clientes")
public class Clientes {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of Clientes
     */
    public Clientes() {
    }

    /**
     * Retrieves representation of an instance of com.restful.Clientes
     *
     * @return an instance of java.lang.String
     *
     */
    @GET
    @Path("/listar")
    @Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
    public Response getClientes() {
        Gson objson = new Gson();

        ClienteDao clienteDao = new ClienteDao();

        return Response.ok(objson.toJson(clienteDao.listarTodos())).build();
    }
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/cadastrar")
    public Response cadastrar(String content){
    Gson objson = new Gson();
    Cliente cliente = (Cliente) objson.fromJson(content, Cliente.class);
    ClienteDao clienteDao = new ClienteDao();
    return  Response.ok(clienteDao.cadastrar(cliente)).build();
    }
    

}
