package br.ufjf.dcc193.trb1.model;



public class SomatorioHorasCategoria {
    private Double sumHrComputCatAssistencial;
    private Double sumHrComputCatJuridica;
    private Double sumHrComputCatFinanceira;
    private Double sumHrComputCatExecutiva;
    private String sede;


    public SomatorioHorasCategoria() {

    }

    //#region getters and setters

    /**
     * @return the sumHrComputCatAssistencial
     */
    public Double getSumHrComputCatAssistencial() {
        return sumHrComputCatAssistencial;
    }

    /**
     * @param sumHrComputCatAssistencial the sumHrComputCatAssistencial to set
     */
    public void setSumHrComputCatAssistencial(Double sumHrComputCatAssistencial) {
        this.sumHrComputCatAssistencial = sumHrComputCatAssistencial;
    }

    /**
     * @return the sumHrComputCatJuridica
     */
    public Double getSumHrComputCatJuridica() {
        return sumHrComputCatJuridica;
    }

    /**
     * @param sumHrComputCatJuridica the sumHrComputCatJuridica to set
     */
    public void setSumHrComputCatJuridica(Double sumHrComputCatJuridica) {
        this.sumHrComputCatJuridica = sumHrComputCatJuridica;
    }

    /**
     * @return the sumHrComputCatFinanceira
     */
    public Double getSumHrComputCatFinanceira() {
        return sumHrComputCatFinanceira;
    }

    /**
     * @param sumHrComputCatFinanceira the sumHrComputCatFinanceira to set
     */
    public void setSumHrComputCatFinanceira(Double sumHrComputCatFinanceira) {
        this.sumHrComputCatFinanceira = sumHrComputCatFinanceira;
    }

    /**
     * @return the sumHrComputCatExecutiva
     */
    public Double getSumHrComputCatExecutiva() {
        return sumHrComputCatExecutiva;
    }

    /**
     * @param sumHrComputCatExecutiva the sumHrComputCatExecutiva to set
     */
    public void setSumHrComputCatExecutiva(Double sumHrComputCatExecutiva) {
        this.sumHrComputCatExecutiva = sumHrComputCatExecutiva;
    }

    /**
     * @return the sede
     */
    public String getSede() {
        return sede;
    }

    /**
     * @param sede the sede to set
     */
    public void setSede(String sede) {
        this.sede = sede;
    }

    //#endregion

}