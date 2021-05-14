<%@ page import="io.github.olgazskiba.bean.StudentsServlet" %>
<%@ page import="java.util.List" %>
<!DOCTYPE html>
<html lang=en>
<head>
 <meta charset=UTF-8>
 <title>timer</title>
</head>
<body align=center>
<h1> Olga changed servlets </h1>
<p> <% out.print(request.getAttribute("studentsTotal")); %></p>
<table align=center>
 <tr>
     <th>id</th>
     <th>name</th>
     <th>lastName</th>
     <th>email</th>
     <th>age</th>
     </tr>

    <%
  //      List<StudentsServlet> servletList = (List<StudentsServlet>) request.getAttribute("studentList");
        for (StudentsServlet s : (List<StudentsServlet>) request.getAttribute("studentList")){
            out.print(

                    " <tr>\n" +
                            " <td>" + s.getId() + "</td>\n" +
                            " <td><a href=\"/school/student/?id=" + s.getId() + "\">" +s.getName()+"</a></td>\n" +
                            " <td>"+s.getLastName()+"</td>\n" +
                            " <td>"+s.getAge()+"</td>\n" +
                            " </tr>\n");
        }
    %>

     <tr>
     <th>id</th>
     <th>name</th>
     <th>lastName</th>
     <th>email</th>
     <th>age</th>
     </tr>
    </table>
</body>
</html>