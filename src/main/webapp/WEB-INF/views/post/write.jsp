<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="kor">
<head>

    <title>Narrow Jumbotron Template for Bootstrap</title>
    <link rel="stylesheet"
          href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
          integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
          crossorigin="anonymous">
</head>

<body>

<div class="container">
    <div class="header clearfix">
        <nav>
            <ul class="nav nav-pills pull-right">
                <li role="presentation" class="active"><a href="#">Home</a></li>
                <li role="presentation"><a href="#">About</a></li>
                <li role="presentation"><a href="#">Contact</a></li>
            </ul>
        </nav>
        <h3 class="text-muted">글쓰기 화면입니다.</h3>
    </div>

    <div class="jumbotron">
        <form action="/post/write" method="post">
            <%--<div class="row">--%>
                <%--<div class="input-group input-group-lg">--%>
                <%--<span class="input-group-addon">--%>
                <%--<i class="glyphicon glyphicon-ok-sign"></i>--%>
                    <%--자동으로 입력되는 글번호 입니다.--%>
                <%--</span>--%>
                    <%--<input type="text" name="articleId" class="form-control" placeholder="1-9999">--%>
                <%--</div>--%>
            <%--</div>--%>
            <div class="row">
                <div class="input-group input-group-lg">
                <span class="input-group-addon">
                    <i class="glyphicon glyphicon-ok-sign"></i>
                    제목
                </span>
                    <input type="text" name="title" class="form-control" placeholder="제목을 입력하세요.">
                </div>
            </div>
            <br>
            <div class="row">
                <div class="input-group input-group-lg">
                <span class="input-group-addon">
                    <i class="glyphicon glyphicon-ok-sign"></i>
                    내용
                </span>
                    <input type="text" name="content" class="form-control" placeholder="내용을 입력하세요">
                </div>
            </div>
            <p><input type="submit" value="글 등록하기" class="btn btn-lg btn-success"></p>
        </form>
    </div>

    <footer class="footer">
        <p>&copy; 2017 KITRI, Inc.</p>
    </footer>

</div> <!-- /container -->


<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
<script src="../../assets/js/ie10-viewport-bug-workaround.js"></script>
</body>
</html>
