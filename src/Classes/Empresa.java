package Classes;

/**
 * Esta classe tem por objetivo a criação de bancos.
 *
 * @author Taffarel Xavier e Ramon 3º Período de Licenciatura em Computação
 * <taffarel_deus@hotmail.com>
 */
public class Empresa {

    /**
     *
     */
    private String nome;

    /**
     *
     */
    private String CNPJ;

    /**
     *
     */
    private String inscricaoEstadual;

    /**
     *
     */
    private String dataAbertura;

    /**
     *
     */
    private String numero;

    /**
     *
     */
    private String telefone;

    /**
     *
     */
    private Endereco endereco;

    /**
     *
     * @return
     */
    public String getNome() {
        return nome;
    }

    /**
     *
     * @param nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     *
     * @return
     */
    public String getCNPJ() {
        return CNPJ;
    }

    /**
     *
     * @param CNPJ
     */
    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    /**
     *
     * @return
     */
    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    /**
     *
     * @param inscricaoEstadual
     */
    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    /**
     *
     * @return
     */
    public String getDataAbertura() {
        return dataAbertura;
    }

    /**
     *
     * @param dataAbertura
     */
    public void setDataAbertura(String dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    /**
     *
     * @return
     */
    public String getNumero() {
        return numero;
    }

    /**
     *
     * @param numero
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }

    /**
     *
     * @return
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     *
     * @param telefone
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     *
     * @return
     */
    public Endereco getEndereco() {
        return endereco;
    }

    /**
     *
     * @param endereco
     */
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    /**
     * 
     * @param nome
     * @param CNPJ
     * @param inscricaoEstadual
     * @param dataAbertura
     * @param numero
     * @param telefone
     * @param endereco 
     */
    public Empresa(String nome, String CNPJ,
            String inscricaoEstadual,
            String dataAbertura,
            String numero,
            String telefone,
            Endereco endereco) {
        this.nome = nome;
        this.CNPJ = CNPJ;
        this.inscricaoEstadual = inscricaoEstadual;
        this.dataAbertura = dataAbertura;
        this.numero = numero;
        this.telefone = telefone;
        this.endereco = endereco;
    }

}
