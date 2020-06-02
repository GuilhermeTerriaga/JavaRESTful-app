/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import model.Cliente;

/**
 *
 * @author guilherme
 */
public class ClienteDao {

    public ArrayList<Cliente> listarTodos() {
        ArrayList<Cliente> lista = new ArrayList<>();

        lista.add(new Cliente(1, "Maria"));
        lista.add(new Cliente(2, "João"));
        lista.add(new Cliente(3, "Guilherme"));

        return lista;

    }

    public boolean cadastrar(Cliente cliente) {

        return true;
    }
}
