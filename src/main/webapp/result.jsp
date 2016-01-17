<%@ page import="java.util.*" %>
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<h1>Beer Selection Page JSP</h1>

<%
    List<String> recommended = (List<String>) request.getAttribute("styles");
    Iterator it = recommended.iterator();
    while (it.hasNext()){
        out.print("<br>We recomended <strong>" + it.next() + "</strong>");
    }
%>

</body>
</html>