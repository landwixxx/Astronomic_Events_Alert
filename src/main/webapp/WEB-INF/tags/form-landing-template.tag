<%@tag description="Template fora do sistema" %>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<%@attribute name="firstPlaceholder"%>
<%@attribute name="secondPlaceholder"%>
<%@attribute name="formAction"%>
<%@attribute name="instruction"%>
<!DOCTYPE html>
<html>
<head>
    <title>AEA - Astronomic Events Alert</title>
    <link rel="stylesheet" href="resources/css/main.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Nunito:wght@400;500;700&display=swap" rel="stylesheet">
</head>
<body>
<h1>Space Events Alert <img src="resources/img/galaxy-icon.png" alt="[ ícone galáctico ]"></h1>
<br/>
<main id="content" class="d-grid gap-2">
    <p class="instruction">${instruction}</p>
    <br>
    <form action="${formAction}" class="d-grid gap-3">
        <div class="form-group">
           <input type="email" class="form-control" id="email" placeholder="${firstPlaceholder}">
        </div>
        <div class="form-group">
           <input type="password" class="form-control" id="pwd" placeholder="${secondPlaceholder}">
        </div>
        <button type="submit" class="btn btn-warning">${formAction}</button>
    </form>
    <button type="button" class="btn btn-dark">voltar</button>
</main>
<br/>
</body>
<footer><img id="logo" src="resources/img/utfpr.png" alt="[ Logo UTFPR ]"></footer>
</html>