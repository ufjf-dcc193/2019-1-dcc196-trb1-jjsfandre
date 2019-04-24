
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
                            <table class="table table-bordered">
                                <thead>
                                    <tr>
                                        <th>#</th>
                                        <th>Título</th>
                                        <th>Data início</th>
                                        <th>Data fim</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <c:forEach var="atividade" items="${atividades}">
                                            <tr>
                                                <td>${atividade.id}</td>
                                                <td>${atividade.titulo}</td>
                                                <td>${atividade.dtInicio}</td>
                                                <td>${atividade.dtFim}</td>
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