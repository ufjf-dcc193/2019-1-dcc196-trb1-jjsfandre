
<%@ include file="../_shared/header.jsp" %>
<div class="wrapper wrapper-content animated fadeInRight">
    <div class="row">
        <div class="col-lg-12">
            <div class="ibox float-e-margins">
                <div class="ibox-title">
                    <h5>Editando atividade</small></h5>
                    <div class="ibox-tools">
                        <a class="collapse-link">
                            <i class="fa fa-chevron-up"></i>
                        </a>
                    </div>
                </div>
                <div class="ibox-content">
                    <div class="row">
                        <form role="form" action="/Atividade/Save" method="post" class="form-control">
                            <input type="hidden" name="id" value="${atividade.id}" />
                            <div class="form-group">
                                <label>Título</label> 
                                <input value="${atividade.titulo}" type="text" name="titulo" placeholder="Digite o titulo" class="form-control">
                            </div>
                            <div class="form-group">
                                <label>Descrição</label> 
                                <textarea value="${atividade.descricao}" type="text" name="descricao" placeholder="Digite a descrição" class="form-control"></textarea>
                            </div>
                            <div class="form-group">
                                <label>Sede</label> 
                                
                                <select class="form-control m-b" name="sedeId">
                                    <option value="0">Escolha a sede</option>
                                    <c:forEach var="sede" items="${listaSedes}">
                                        <c:choose>
                                            <c:when test="${sede.id==atividade.sedeId}">
                                                <option selected value="${sede.id}">${sede.nomeFantasia}</option>
                                            </c:when>
                                            <c:otherwise>
                                                <option value="${sede.id}">${sede.nomeFantasia}</option>
                                            </c:otherwise>
                                        </c:choose>
                                    </c:forEach>
                                </select>
                            </div>
                            <div class="form-group">
                                <label>Data de início da atividade</label> 
                                <input value="${atividade.dtInicio}" data-mask="99/99/9999" type="text" name="dtInicio" placeholder="__/__/____" class="form-control">
                            </div>
                            <div class="form-group">
                                <label>Data de término da atividade</label> 
                                <input value="${atividade.dtFim}" data-mask="99/99/9999" type="text" name="dtFim" placeholder="__/__/____" class="form-control">
                            </div>
                            <div class="form-group">
                                <label>Horas na categoria assistencial</label> 
                                <input value="${atividade.hrComputCatAssistencial}" type="number" name="hrComputCatAssistencial" placeholder="0" class="form-control">
                            </div>
                            <div class="form-group">
                                <label>Horas na categoria jurídica</label> 
                                <input value="${atividade.hrComputCatJuridica}" type="number" name="hrComputCatJuridica" placeholder="0" class="form-control">
                            </div>
                            <div class="form-group">
                                <label>Horas na categoria financeira</label> 
                                <input value="${atividade.hrComputCatFinanceira}" type="number" name="hrComputCatFinanceira" placeholder="0" class="form-control">
                            </div>
                            <div class="form-group">
                                <label>Horas na categoria executiva</label> 
                                <input value="${atividade.hrComputCatExecutiva}" type="number" name="hrComputCatExecutiva" placeholder="0" class="form-control">
                            </div>
                            <div class="form-group buttons-submit-cancel">
                                <div class="col-sm-4 ">
                                    <a href="/Atividade/list"><button class="btn btn-danger" type="button"><i class="fa fa-times"></i>Cancelar</button></a>
                                    <button class="btn btn-primary" type="submit"><i class="fa fa-check"></i>Salvar</button>
                                </div>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<%@ include file="../_shared/footer.jsp" %>