
        <%@ include file="../_shared/header.jsp" %>
        <div class="wrapper wrapper-content animated fadeInRight">
            <div class="row">
                <div class="col-lg-12">
                    <div class="ibox float-e-margins">
                        <div class="ibox-title">
                            <h5>Membros </h5>
                            <div class="ibox-tools">
                                <a class="collapse-link">
                                    <i class="fa fa-chevron-up"></i>
                                </a>
                            </div>
                        </div>
                        <div class="ibox-content">
                            <table class="table table-bordered">
                                <thead>
                                    <tr>
                                        <th>#</th>
                                        <th>Nome</th>
                                        <th>Função</th>
                                        <th>E-mail</th>
                                        <th class="links-grid"><i class="fa fa-cogs"></i></th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <c:forEach var="membro" items="${membros}">
                                            <tr>
                                                <td>${membro.id}</td>
                                                <td>${membro.nome}</td>
                                                <td>${membro.funcao}</td>
                                                <td>${membro.email}</td>
                                                <td class="links-grid">
                                                    <a title="Editar" href="/Membro/Edit?id=${membro.id}">
                                                        <i class= "fa fa-edit color-blue"></i>
                                                    </a>
                                                    <a title="Excluir" href="/Membro/Delete?id=${membro.id}">
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