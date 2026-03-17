package org.task_manager;

import org.task_manager.dao.BaseDAO;
import org.task_manager.dao.TarefaDAO;
import org.task_manager.dao.UsuarioDAO;
import org.task_manager.entity.Usuario;
import org.task_manager.service.Auth;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Seja bem-vindo ao TaskManager!\n");

        boolean acaoEscolhida = false;
        while (!acaoEscolhida) {

            System.out.println("Informe a ação desejada:");
            System.out.println("1 - Login");
            System.out.println("2 - Cadastro");
            System.out.println("3 - Encerrar\n");
            int acao = leitor.nextInt();
            leitor.nextLine();

            boolean acesso = false;
            if (acao == 1) {
                acaoEscolhida = true;
                while (!acesso) {
                    System.out.println("-".repeat(5) + "LOGIN" + "-".repeat(5));
                    System.out.println("Digite seu e-mail: ");
                    String email = leitor.nextLine();
                    System.out.println("Digite sua senha: ");
                    String senha = leitor.nextLine();

                    boolean autenticado = Auth.login(email, senha);

                    if (autenticado) {
                        System.out.println("\nLogin realizado com sucesso!");
                        acesso = true;
                    } else {
                        System.out.println("\nE-mail ou senha incorretos, tente novamente!\n");
                    }

                }

            } else if (acao == 2) {
                acaoEscolhida = true;
                while (!acesso) {
                    System.out.println("-".repeat(5) + "CADASTRO" + "-".repeat(5));
                    System.out.println("Digite seu nome: ");
                    String nome = leitor.nextLine();
                    System.out.println("Digite seu e-mail: ");
                    String email = leitor.nextLine();
                    System.out.println("Digite sua senha: ");
                    String senha = leitor.nextLine();

                    boolean autenticado = Auth.cadastro(nome, email, senha);

                    if (autenticado) {
                        System.out.println("\nCadastro realizado com sucesso!");
                        acesso = true;
                    } else {
                        System.out.println("\nE-mail escrito incorretamente ou já cadastrado, tente novamente!\n");
                    }

                }

            } else if (acao == 3) {
                acaoEscolhida = true;
                System.out.println("Encerrando programa...");
            } else {
                System.out.println("Não entendi a ação desejada, informe com um número correspondente!");
            }

        }




    }
}
