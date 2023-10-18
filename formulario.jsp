<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Calculadora de Idade</title>
</head>
<body>
    <h1>Calculadora de Idade</h1>
    <form action="pessoa" method="GET">
        <label for="anoNascimento">Ano de Nascimento:</label>
        <input type="number" id="anoNascimento" name="anoNascimento" required><br><br>
        
        <label for="fezAniversario">Já fez aniversário este ano?</label>
        <input type="radio" id="sim" name="fezAniversario" value="sim" required>
        <label for="sim">Sim</label>
        <input type="radio" id="nao" name="fezAniversario" value="nao" required>
        <label for="nao">Não</label><br><br>
        
        <input type="submit" value="Calcular Idade">
    </form>
</body>
</html>
