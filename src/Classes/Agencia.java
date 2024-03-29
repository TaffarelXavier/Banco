package Classes;

/**
 *
 * @author Taffarel Xavier <taffarel_deus@hotmail.com>
 */
public class Agencia {

    /**
     *
     */
    private String agenciaNumero;
    /**
     *
     */
    private Endereco endereco;

    
    public Agencia(String numeroAgencia, Endereco endereco) {
        this.agenciaNumero = numeroAgencia;
        this.endereco = endereco;
    }

    public String getAgenciaNumero() {
        return agenciaNumero;
    }

    public void setAgenciaNumero(String agenciaNumero) {
        this.agenciaNumero = agenciaNumero;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

}
