<%@ page contentType="text/html;charset=UTF-8" %>

<html>
<h1>
    File upload
</h1>
<form aciton="/upload" method="post" enctype="multipart/form-data">
    <input type="file" name="file" />
    <input type="submit"/>
</form>

<img src="${url}" />
</html>
