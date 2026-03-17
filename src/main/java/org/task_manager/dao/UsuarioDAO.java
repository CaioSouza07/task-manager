package org.task_manager.dao;

import org.task_manager.entity.Usuario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UsuarioDAO extends BaseDAO{

    public void cadastrarUsuario(Usuario usuario){

        String query = "INSERT INTO usuarios (nome, email, senha) VALUES (?, ?, ?)";

        try (
                Connection conn = conn();
                PreparedStatement pre = conn().prepareStatement(query);
                ){

            pre.setString(1, usuario.getNome());
            pre.setString(2, usuario.getEmail());
            pre.setString(3, usuario.getSenha());

            pre.execute();

            System.out.println("Usuario cadastrado com sucesso!");

        } catch (SQLException e) {
            System.out.println("Erro ao cadastrar: " + e.getMessage());
            e.printStackTrace();
        }


    }

}
