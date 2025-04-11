<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.Map" %><%--
  Created by IntelliJ IDEA.
  User: ranjith-suranga
  Date: 4/11/25
  Time: 3:43 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hello</title>
</head>
<body>
    <h1>I am a jsp</h1>
    <hr>
    <%
        Map<String, Object> attributes = new HashMap<>();
        request.getAttributeNames().asIterator().forEachRemaining(name ->{
            attributes.put(name, request.getAttribute(name));
        });
        for (String name : attributes.keySet()) {
    %>
            <h1><%= name %>: <%= request.getAttribute(name)%></h1>
    <%
        }
    %>

</body>
</html>
