
        <%@ include file="../_shared/header.jsp" %>
        <div class="wrapper wrapper-content animated fadeInRight">
            <div class="row">
                <div class="col-lg-12">
                    <div class="ibox float-e-margins">
                        <div class="ibox-title">
                            <h5>Sedes </h5>
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
                                        <th>Nome fantasia</th>
                                        <th>Cidade</th>
                                        <th>UF</th>
                                        <th>E-mail</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <c:forEach var="sede" items="${sedes}">
                                            <tr>
                                                <td>${sede.id}</td>
                                                <td>${sede.nomeFantasia}</td>
                                                <td>${sede.cidade}</td>
                                                <td>${sede.uf}</td>
                                                <td>${sede.email}</td>
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