<%--
  Created by IntelliJ IDEA.
  User: danawacomputer
  Date: 2017-06-12
  Time: 오후 2:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html lang="en">
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
        <h1>친구 등록 화면</h1>
    </div>

    <div class="jumptron">
    <form action="/amigo/regist" method="post">
        <div class="input-group input-group-lg">
                <span class="input-group-addon">
                <i class="glyphicon glyphicon-ok-sign"></i>
                    친구이름 :
                </span>
            <input type="text" name="amigoName" class="form-control" placeholder="write your friend's name"><br>
        </div>
        <div class="input-group input-group-lg">
                <span class="input-group-addon">
                <i class="glyphicon glyphicon-ok-sign"></i>
                    핸 드 폰 :
                </span>
            <input type="text" name="amigoNumber" class="form-control" placeholder="write your friend's PhoneNumber"><br>
        </div>
        <div class="input-group input-group-lg">
                <span class="input-group-addon">
                <i class="glyphicon glyphicon-ok-sign"></i>
                    이 메 일 :
                </span>
            <input type="text" name="amigoEmail" class="form-control" placeholder="write your friend's email"><br>
        </div>
        <p><input type="submit" value="Regist" class="btn btn-lg btn-success"></p>
    </form>
    </div>


    </div>

    <footer class="footer">
        <p>&copy; 2017 KITRI, R.</p>
    </footer>

</div> <!-- /container -->


<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
<script src="../../assets/js/ie10-viewport-bug-workaround.js"></script>
</body>
</html>
