/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Taffarel Xavier e Ramon 3º Período de Licenciatura em Computação<taffarel_deus@hotmail.com>
 */
public class Funcionario {

    private static List<Funcionario> funcionarios = new ArrayList<>();

    private Cliente[] clientes = new Cliente[Short.MAX_VALUE];

    private Scanner leia = new Scanner(System.in);

    private Scanner entrada1 = new Scanner(System.in);

    public static List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public static void setFuncionarios(List<Funcionario> aFuncionarios) {
        funcionarios = aFuncionarios;
    }

    public Funcionario() {
        //Funcionário padrão:
        cadastrarFuncionario("FRANCISCO TAFFAREL XAVIER DE BRITO", "1", "123");
    }

    /**
     *
     */
    private String nome;
    /**
     *
     */
    private double salario;
    /**
     *
     */
    private String cargo;
    /**
     *
     */
    private String dataAdmissao;

    /**
     * O regime pode ser: estatutário, celetista ou outros.
     */
    private String regime;
    /**
     *
     */
    private String cpf;

    /**
     *
     */
    private String email;

    private String senha;

    private int index = 0;

    public int getIndex() {
        return index;
    }

    public void setIndex(int aIndex) {
        index = aIndex;
    }

    public Cliente[] getClientes() {
        return clientes;
    }

    public void setClientes(Cliente[] aClientes) {
        clientes = aClientes;
    }

    public Scanner getLeia() {
        return leia;
    }

    public void setLeia(Scanner aLeia) {
        leia = aLeia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String aNome) {
        nome = aNome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double aSalario) {
        salario = aSalario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String aCargo) {
        cargo = aCargo;
    }

    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(String aDataAdmissao) {
        dataAdmissao = aDataAdmissao;
    }

    public String getRegime() {
        return regime;
    }

    public void setRegime(String aRegime) {
        regime = aRegime;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String aCpf) {
        cpf = aCpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String aEmail) {
        email = aEmail;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String aSenha) {
        senha = aSenha;
    }

    public Funcionario(String nome, String cpf, String senha) {
        this.nome = nome;
        this.cpf = cpf;
        this.senha = senha;
    }

    /**
     * Lisa Todos os funcionários
     *
     * @param linha
     */
    public static void listarTodosFuncionarios(String linha) {

        System.out.println(linha);

        System.out.println("Lista de Funcionários Cadastrados:");

        System.out.println(linha);

        System.out.println("Nome--CPF");

        for (Funcionario funcionario : Funcionario.getFuncionarios()) {
            System.out.println(funcionario.getNome() + "---" + funcionario.getCpf());
        }

        System.out.println();

        System.out.println(linha);

    }

    /**
     *
     * @param cpf
     */
    public static void pesquisarFuncionarioPorCPF(String cpf) {

        boolean encontrado = false;

        int count = 0;

        if (!Funcionario.getFuncionarios().isEmpty()) {
            
            for (Funcionario funcionario : Funcionario.getFuncionarios()) {

                if (funcionario.getCpf().equals(cpf.toUpperCase())) {

                    System.out.println(funcionario.getNome());

                    encontrado = true;

                    break;
                }
            }
        }

        if (!encontrado) {
            System.out.println("Funcionário não encontrado.");
        }
    }

    /**
     * Cadastra um novo funcionário
     *
     * @param nome
     * @param cpf
     * @param senha
     */
    public static void cadastrarFuncionario(String nome, String cpf, String senha) {
        funcionarios.add(new Funcionario(nome, cpf, senha));
    }

    public void cadastrarCliente() {

        int opcao = 1;

        System.out.println("\tCadastro do Cliente:".toUpperCase());

        while (opcao == 1 || opcao == 2) {

            index++;

            System.out.print("Nome do cliente:");
            String nome_2 = leia.nextLine();

            System.out.print("Sexo:");
            String sexo = leia.nextLine();

            System.out.print("Cidade:");
            String cidade = leia.nextLine();

            System.out.print("Estado:");
            String estado = leia.nextLine();

            System.out.print("Endereço:");
            String endereco = leia.nextLine();

            System.out.print("CPF:");
            String CPF = leia.nextLine();

            System.out.println("Menu:\n1 - Salvar\n2 - Cancelar");

            switch (entrada1.nextInt()) {
                case 1:
                    for (int i = 0; i < 25; ++i) {
                        System.out.println();
                    }
                    clientes[index] = new Cliente(nome_2, sexo, new Endereco(cidade, estado, endereco), CPF);
                    System.out.println("Cadastro Realizado com sucesso!");
                    System.out.println("Deseja fazer outro cadastro?\nMenu\n1 - Sim\n2 - Não");
                    if (entrada1.nextInt() == 1) {

                    } else {
                        opcao = 3;
                    }
                    break;
                case 2:
                    System.out.println("Cancelado!");
                    break;
                default:
                    opcao = 3;
                    break;
            }

        }

    }

    /**
     * Mostra o total de funcionários
     *
     * @return Número de funcionários da lista
     */
    public static int totalDeFuncionarios() {
        return funcionarios.size();
    }

}
