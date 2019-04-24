
        <%@ include file="../_shared/header.jsp" %>
        <div class="wrapper wrapper-content animated fadeInRight">
            <div class="row">
                <div class="col-lg-12">
                    <div class="ibox float-e-margins">
                        <div class="ibox-title">
                            <h5>Atividades </h5>
                            <div class="ibox-tools">
                                <a class="collapse-link">
                                    <i class="fa fa-chevron-up"></i>
                                </a>
                            </div>
                        </div>
                        <div class="ibox-content">
                            <form class="form-control form-new-resume" action="/Membro/New">
                                <div class="form-group">
                                    <div class="col-sm-4 ">
                                        <button class="btn btn-w-m btn-success" type="submit"><i class="fa fa-plus"></i>Adicionar atividade</button>
                                    </div>
                                </div>
                            </form>
                            <table class="table table-bordered">
                                <thead>
                                    <tr>
                                        <th>#</th>
                                        <th>Título</th>
                                        <th>Data início</th>
                                        <th>Data fim</th>
                                        <th class="links-grid"><i class="fa fa-cogs"></i></th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <c:forEach var="atividade" items="${atividades}">
                                            <tr>
                                                <td>${atividade.id}</td>
                                                <td>${atividade.titulo}</td>
                                                <td>${atividade.dtInicio}</td>
                                                <td>${atividade.dtFim}</td>
                                                <td class="links-grid">
                                                    <a title="Editar" href="/Atividade/Edit?id=${atividade.id}">
                                                        <i class= "fa fa-edit color-blue"></i>
                                                    </a>
                                                    <a title="Excluir" href="/Atividade/Delete?id=${atividade.id}">
                                                        <i class= "fa fa-trash color-red"></i>
                                                    </a>
                                                </td>
                                            </tr>
                                    </c:forEach>
                                </tbody>
                            </table>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <%@ include file="../_shared/footer.jsp" %>