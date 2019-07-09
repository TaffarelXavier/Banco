package Classes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Taffarel Xavier e Ramon - do 3º Período de Licenciatura em Computação<taffarel_deus@hotmail.com>
 */
public class Cliente {

    List<Cliente> clientes = new ArrayList<>();

    private static int totalDeCliente = -1;
    /**
     *
     */
    private String nome;

    
    /**
     *|
     */
    private String sexo;

    /**
     *
     */
    private Endereco endereco;

    /**
     *
     */
    private String cpf;

    /**
     *
     * @param nome
     * @param sexo
     * @param endereco
     * @param cpf
     */
    public Cliente(String nome, String sexo, Endereco endereco, String cpf) {
        this.nome = nome;
        this.sexo = sexo;
        this.endereco = endereco;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static int getTotalDeCliente() {
        return totalDeCliente;
    }

    public static void setTotalDeCliente(int totalDeCliente) {
        Cliente.totalDeCliente = totalDeCliente;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

}
