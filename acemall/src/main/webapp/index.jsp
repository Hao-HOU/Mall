<%@ page contentType="text/html; charset=utf-8" %>
<%@ page isELIgnored="false" %>
<html>
<body>
<h2>Hello World!</h2>

SpringMVC文件上传
<form name="upload" action="/manage/product/upload.do" method="post" enctype="multipart/form-data">
    <input type="file" name="upload_file"/>
    <input type="submit" value="上传">
</form>

富文本图片上传
<form name="rich_upload" action="/manage/product/richtext_img_upload.do" method="post" enctype="multipart/form-data">
    <input type="file" name="upload_file"/>
    <input type="submit" value="富文本上传">
</form>
</body>
</html>
