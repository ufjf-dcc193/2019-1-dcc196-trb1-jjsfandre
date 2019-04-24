
<%@ include file="../_shared/header.jsp" %>
<div class="wrapper wrapper-content animated fadeInRight">
    <div class="row">
        <div class="col-lg-12">
            <div class="ibox float-e-margins">
                <div class="ibox-title">
                    <h5>Editando sede</small></h5>
                    <div class="ibox-tools">
                        <a class="collapse-link">
                            <i class="fa fa-chevron-up"></i>
                        </a>
                    </div>
                </div>
                <div class="ibox-content">
                    <div class="row">
                        <form role="form" action="/Sede/Save" method="post" class="form-control">
                            <input type="hidden" name="id" value="${sede.id}" />
                            <div class="form-group"><label>Nome fantasia</label> <input value="${sede.nomeFantasia}" type="text" name="nomeFantasia" placeholder="Digite o nome fantasia" class="form-control"></div>
                            <div class="form-group"><label>UF</label> <input value="${sede.uf}" type="text" name="uf" placeholder="UF" class="form-control"></div>
                            <div class="form-group"><label>Cidade</label> <input value="${sede.cidade}" type="text" name="cidade" placeholder="Digite a cidade" class="form-control"></div>
                            <div class="form-group"><label>Bairro</label> <input value="${sede.bairro}" type="text" name="bairro" placeholder="Digite o bairro" class="form-control"></div>
                            <div class="form-group"><label>Telefone</label> <input value="${sede.telefone}" type="text" name="telefone" placeholder="Digite o telefone" class="form-control"></div>
                            <div class="form-group"><label>E-mail</label> <input value="${sede.email}" type="email" name="email" placeholder="Digite o e-mail" class="form-control"></div>
                            <div class="form-group"><label>Site</label> <input value="${sede.site}" type="text" name="site" placeholder="Digite o site" class="form-control"></div>
                            <div class="form-group buttons-submit-cancel">
                                <div class="col-sm-4 ">
                                    <a href="/Sede/list"><button class="btn btn-danger" type="button"><i class="fa fa-times"></i>Cancelar</button></a>
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