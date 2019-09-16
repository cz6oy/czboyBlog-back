<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page pageEncoding="UTF-8" isELIgnored="false" contentType="text/html; utf-8" %>
<script>
    var testEditor;
    $(function () {
        testEditor = editormd("test-editormd", {
            width: 1200,
            height: 500,
            syncScrolling: "single",
            saveHTMLToTextarea: true, //设置可保存为html 获取的时候testEditor.getHtml();就可以了
            /*theme : "dark",*/  //设置主题，有默认
            /*previewTheme : "dark",*/
            /*editorTheme : "pastel-on-dark",*/
            searchReplace: true,
            emoji: true,
            taskList: true,
            tocm: true,         // Using [TOCM]
            tex: true,                   // 开启科学公式TeX语言支持，默认关闭
            flowChart: true,             // 开启流程图支持，默认关闭
            sequenceDiagram: true,       // 开启时序/序列图支持，默认关闭,
            dialogLockScreen: false,   // 设置弹出层对话框不锁屏，全局通用，默认为true
            imageUpload: true,
            readOnly:false,//禁用只读模式
            imageFormats: ["jpg", "jpeg", "gif", "png", "bmp", "webp"],
            imageUploadURL: "./php/upload.php",
            path: "${pageContext.request.contextPath}/editor.md-master/lib/"
        });

        var type;
        $.ajax({
            type: 'POST',
            url: '${pageContext.request.contextPath}/sys/article',
            data: {
                type: type
            },
            success: function (res) {
                console.log(res);
                for (var i = 0; i < res.length; i++) {
                    var th1 = "<th scope=\"row\">" + (i + 1) + "</th>";
                    var th2 = "<td>" + res[i].title + "</td>";
                    var th3 = "<td>" + res[i].classname + "</td>";
                    var th4 = "<td>" + res[i].hotvalue + "</td>";
                    var th5 = "<td>" + res[i].visible + "</td>";
                    var th6 = "<td>" + res[i].createtime + "</td>";
                    var th7 = "<td>" +
                        "<button type=\"button\" class=\"btn btn-success\" onclick='details(" + res[i].id + ")'>详情</button>" +
                        "&nbsp;&nbsp;&nbsp;<button type=\"button\" class=\"btn btn-danger\" onclick='del(" + res[i].id + ")'>删除</button>" +
                        "<td/>";
                    $("#tbody ").append("<tr>" + th1 + th2 + th3 + th4 + th5 + th6 + th7 + "</tr>");
                }
            },
            error: function (err) {
                console.log(err);
            }
        })


    })

    function addArticle(type){
        $.ajax({
            type:'POST',
            url:'${pageContext.request.contextPath}/sys/addArticle'
        })
        console.log(testEditor.getHTML()); // 获取 Textarea 保存的 HTML 源码

        console.log(testEditor.getMarkdown());       // 获取 Markdown 源码
        console.log(testEditor.getPreviewedHTML());  // 获取预览窗口里的 HTML，在开启
    }

    function markdown() {
        $('#myModal2').modal('show')
    }

    function del(id) {
        console.log(id);
        $('#myModal').modal('show')
    }

    function details(id) {
        console.log(id);
    }
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
                <option>java</option>
                <option>web前端</option>
                <option>python</option>
                <option>大数据</option>
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
            <button type="button" class="btn btn-success" onclick="markdown()">添加文章</button>
        </div>
    </div>
    <br/>

    <div class="bs-example" data-example-id="bordered-table">
        <table class="table table-bordered">
            <thead>
            <tr>
                <th>#</th>
                <th>文章名称</th>
                <th>所属类别</th>
                <th>热度</th>
                <th>状态</th>
                <th>创建日期</th>
                <th>操作</th>
            </tr>
            </thead>
            <tbody id="tbody">

            </tbody>
        </table>
    </div>
    <%--删除提示模态框--%>
    <div id="myModal" class="modal fade" tabindex="-1" role="dialog">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span
                            aria-hidden="true">&times;</span></button>
                    <h4 class="modal-title">温馨提示</h4>
                </div>
                <div class="modal-body">
                    <p>确定要删除当前文章吗？T_T&hellip;</p>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                    <button type="button" class="btn btn-danger">Save changes</button>
                </div>
            </div>
        </div>
    </div>
    <%--markdown模态框--%>
    <div id="myModal2" class="modal fade bs-example-modal-lg" tabindex="-1" role="dialog"
         aria-labelledby="myLargeModalLabel">
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" placeholder="文章标题"> &nbsp;&nbsp;
        <input type="file" value="文章封面">
        <div id="test-editormd">
            <textarea name="blogContent" id="blogContent"></textarea>
        </div>
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<button type="button" class="btn btn-default" onclick="addArticle(0)">草稿</button>
        <button type="button" class="btn btn-primary" onclick="addArticle(1)">发布</button>
    </div>
</div>
</div>
