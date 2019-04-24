
        <%@ include file="../_shared/header.jsp" %>
        <div class="wrapper wrapper-content animated fadeInRight">
            <div class="row">
                <div class="col-lg-12">
                    <div class="ibox float-e-margins">
                        <div class="ibox-title">
                            <h5>Somatório de horas computadas em cada categoria por sede </h5>
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
                                        <th>Sede</th>
                                        <th>Categoria Asisstencial</th>
                                        <th>Categoria Jurídica</th>
                                        <th>Categoria Financeira</th>
                                        <th>Categoria Executiva</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <c:forEach var="item" items="${itens}">
                                            <tr>
                                                <td>${item.sede}</td>
                                                <td>${item.sumHrComputCatAssistencial}</td>
                                                <td>${item.sumHrComputCatJuridica}</td>
                                                <td>${item.sumHrComputCatFinanceira}</td>
                                                <td>${item.sumHrComputCatExecutiva}</td>
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