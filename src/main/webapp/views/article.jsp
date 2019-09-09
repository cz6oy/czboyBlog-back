<%@page pageEncoding="UTF-8" isELIgnored="false" contentType="text/html; utf-8" %>
<script>
    $(function () {
        console.log("来了老弟");

    })
</script>

<!--初始化表格-->
<div>
    <ol class="breadcrumb">
        <li><a href="#">主页</a></li>
        <li><a href="#">导航目录</a></li>
        <li class="active">文章管理</li>
    </ol>
    <div class="row">
        <div class="col-lg-2">
            <select class="form-control">
                <option>文章类别</option>
                <option>2</option>
                <option>3</option>
                <option>4</option>
                <option>5</option>
            </select>
        </div>
        <div class="col-lg-4">
            <div class="input-group">
                <input type="text" class="form-control" placeholder="文章名称模糊查询...">
                <span class="input-group-btn">
                    <button class="btn btn-default" type="button">搜索</button>
                </span>
            </div>
        </div>
        <div class="col-lg-4">
            <button type="button" class="btn btn-success">添加文章</button>
        </div>
    </div>
    <br/>
    <div class="bs-example" data-example-id="bordered-table">
        <table class="table table-bordered">
            <thead>
            <tr>
                <th>#</th>
                <th>First Name</th>
                <th>Last Name</th>
                <th>Username</th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <th scope="row">1</th>
                <td>Mark</td>
                <td>Otto</td>
                <td>@mdo</td>
            </tr>
            <tr>
                <th scope="row">2</th>
                <td>Jacob</td>
                <td>Thornton</td>
                <td>@fat</td>
            </tr>
            <tr>
                <th scope="row">3</th>
                <td>Larry</td>
                <td>the Bird</td>
                <td>@twitter</td>
            </tr>
            </tbody>
        </table>
    </div>
</div>
</div>
