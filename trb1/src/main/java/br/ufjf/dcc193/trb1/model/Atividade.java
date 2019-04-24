package br.ufjf.dcc193.trb1.model;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;




@Entity
public class Atividade {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String titulo;
    private String descricao;
    private String dtInicio; 
    private String dtFim;
    private Double hrComputCatAssistencial;
    private Double hrComputCatJuridica;
    private Double hrComputCatFinanceira;
    private Double hrComputCatExecutiva;
    private int sedeId;


    public Atividade(){

    }

    public Atividade(String titulo, String descricao, String dtInicio, String dtFim, Double hrComputCatAssistencial, Double hrComputCatJuridica, Double hrComputCatFinanceira, Double hrComputCatExecutiva, int sedeId)
    {
        this.titulo = titulo;
        this.descricao = descricao;
        this.dtInicio = dtInicio; 
        this.dtFim = dtFim;
        this.hrComputCatAssistencial = hrComputCatAssistencial;
        this.hrComputCatJuridica = hrComputCatJuridica;
        this.hrComputCatFinanceira = hrComputCatFinanceira;
        this.hrComputCatExecutiva = hrComputCatExecutiva;
        this.sedeId =  sedeId;
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
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the dtInicio
     */
    public String getDtInicio() {
        return dtInicio;
    }

    /**
     * @param dtInicio the dtInicio to set
     */
    public void setDtInicio(String dtInicio) {
        this.dtInicio = dtInicio;
    }

    /**
     * @return the dtFim
     */
    public String getDtFim() {
        return dtFim;
    }

    /**
     * @param dtFim the dtFim to set
     */
    public void setDtFim(String dtFim) {
        this.dtFim = dtFim;
    }

    /**
     * @return the hrComputCatAssistencial
     */
    public Double getHrComputCatAssistencial() {
        return hrComputCatAssistencial;
    }

    /**
     * @param hrComputCatAssistencial the hrComputCatAssistencial to set
     */
    public void setHrComputCatAssistencial(Double hrComputCatAssistencial) {
        this.hrComputCatAssistencial = hrComputCatAssistencial;
    }

    /**
     * @return the hrComputCatJuridica
     */
    public Double getHrComputCatJuridica() {
        return hrComputCatJuridica;
    }

    /**
     * @param hrComputCatJuridica the hrComputCatJuridica to set
     */
    public void setHrComputCatJuridica(Double hrComputCatJuridica) {
        this.hrComputCatJuridica = hrComputCatJuridica;
    }

    /**
     * @return the hrComputCatFinanceira
     */
    public Double getHrComputCatFinanceira() {
        return hrComputCatFinanceira;
    }

    /**
     * @param hrComputCatFinanceira the hrComputCatFinanceira to set
     */
    public void setHrComputCatFinanceira(Double hrComputCatFinanceira) {
        this.hrComputCatFinanceira = hrComputCatFinanceira;
    }

    /**
     * @return the hrComputCatExecutiva
     */
    public Double getHrComputCatExecutiva() {
        return hrComputCatExecutiva;
    }

    /**
     * @param hrComputCatExecutiva the hrComputCatExecutiva to set
     */
    public void setHrComputCatExecutiva(Double hrComputCatExecutiva) {
        this.hrComputCatExecutiva = hrComputCatExecutiva;
    }

    /**
     * @return the sedeId
     */
    public int getSedeId() {
        return sedeId;
    }

    /**
     * @param sedeId the sedeId to set
     */
    public void setSedeId(int sedeId) {
        this.sedeId = sedeId;
    }

    //#endregion
}