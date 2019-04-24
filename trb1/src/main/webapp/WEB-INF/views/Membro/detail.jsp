
<%@ include file="../_shared/header.jsp" %>
<div class="wrapper wrapper-content animated fadeInRight">
    <div class="row">
        <div class="col-lg-12">
            <div class="ibox float-e-margins">
                <div class="ibox-title">
                    <h5>Editando membro</small></h5>
                    <div class="ibox-tools">
                        <a class="collapse-link">
                            <i class="fa fa-chevron-up"></i>
                        </a>
                    </div>
                </div>
                <div class="ibox-content">
                    <div class="row">
                        <form role="form" action="/Membro/Save" method="post" class="form-control">
                            <input type="hidden" name="id" value="${membro.id}" />
                            <div class="form-group">
                                <label>Nome</label> 
                                <input value="${membro.nome}" type="text" name="nome" placeholder="Digite o nome" class="form-control">
                            </div>
                            <div class="form-group">
                                <label>Função</label> 
                                <input value="${membro.funcao}" type="text" name="funcao" placeholder="Digite a função" class="form-control">
                            </div>
                            <div class="form-group">
                                <label>E-mail</label> 
                                <input value="${membro.email}" type="email" name="email" placeholder="Digite o email" class="form-control">
                            </div>
                            <div class="form-group">
                                <label>Data de entrada na função</label> 
                                <input value="${membro.dtEntrada}" data-mask="99/99/9999" type="text" name="dtEntrada" placeholder="__/__/____" class="form-control">
                            </div>
                            <div class="form-group">
                                <label>Data de saída na função</label> 
                                <input value="${membro.dtSaida}" data-mask="99/99/9999" type="text" name="dtSaida" placeholder="__/__/____" class="form-control">
                            </div>
                            <div class="form-group buttons-submit-cancel">
                                <div class="col-sm-4 ">
                                    <a href="/Membro/list"><button class="btn btn-danger" type="button"><i class="fa fa-times"></i>Cancelar</button></a>
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