package br.ufjf.dcc193.trb1.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Membro {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String nome;
    private String funcao;
    private String email;
    private String dtEntrada;
    private String dtSaida;
    private Long sedeId;


    public Membro(){

    }
    
    public Membro(String nome, String funcao, String email, String dtEntrada, String dtSaida, Long sedeId)
    {
        this.nome = nome;
        this.funcao = funcao;
        this.email = email;
        this.dtEntrada = dtEntrada;
        this.dtSaida = dtSaida;
        this.sedeId = sedeId;
    }

    //#region getters and setters

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the funcao
     */
    public String getFuncao() {
        return funcao;
    }

    /**
     * @param funcao the funcao to set
     */
    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the dtEntrada
     */
    public String getDtEntrada() {
        return dtEntrada;
    }

    /**
     * @param dtEntrada the dtEntrada to set
     */
    public void setDtEntrada(String dtEntrada) {
        this.dtEntrada = dtEntrada;
    }

    /**
     * @return the dtSaida
     */
    public String getDtSaida() {
        return dtSaida;
    }

    /**
     * @param dtSaida the dtSaida to set
     */
    public void setDtSaida(String dtSaida) {
        this.dtSaida = dtSaida;
    }

    /**
     * @return the sedeId
     */
    public Long getSedeId() {
        return sedeId;
    }

    /**
     * @param sedeId the sedeId to set
     */
    public void setSedeId(Long sedeId) {
        this.sedeId = sedeId;
    }

    

    //#endregion
}