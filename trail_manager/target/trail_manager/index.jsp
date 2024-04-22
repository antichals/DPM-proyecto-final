<html>
<head>
    <meta charset="utf-8">
    <title>Servicios Web Alumnos</title>
  </head>
<body>
<ul> 
<li><h3>Metodo <i>getAlumnosJson</i>: Devuelve el listado de alumnos</h3>
<p><b>Tipo peticion:</b> GET</p>
<p><b>Parametro entrada:</b>  - </p>
<p><b>Salida:</b> JSon de la forma: <i>{"code":"code", "message":"message", "result": [{"nombre":"Nombre 1","titulacion":"Titulacion 1","id":"11111111A","edad":20},{"nombre":"Nombre 4","titulacion":"Titulacion 2","id":"44444444A","edad":30}]}</i></p>

<a href="getAlumnosJson">Metodo Get - Mostrar todos los alumnos</a>
</li>

<li><h3>Metodo <i>filtraAlumnosPorEdad</i>: Devuelve aquellos alumnos mayores que la edad introducida</h3>
<p><b>Tipo peticion:</b> POST</p>
<p><b>Parametro entrada:</b> edad (tipo <i>entero</i>)</p>
<p><b>Salida:</b> JSon de la forma: <i>{"code":"code", "message":"message", "result": [{"nombre":"Nombre 1","titulacion":"Titulacion 1","id":"11111111A","edad":20},{"nombre":"Nombre 4","titulacion":"Titulacion 2","id":"44444444A","edad":30}]}</i></p>

<form action="filtraAlumnosPorEdad" method="POST">
<label for="edad">Edad:</label> <input type="text" name="edad">
<input type="submit" value="Submit" />
</form>
</li>

<li><h3>Metodo <i>filtraPorEdad</i>: Devuelve aquellos alumnos mayores que la edad introducida</h3>
<p><b>Tipo peticion:</b> POST</p>
<p><b>Parametro entrada:</b> edad (tipo <i>entero</i>)</p>
<p><b>Salida:</b> JSon de la forma: <i>{"code":"code", "message":"message", "result": [{"nombre":"Nombre 1","titulacion":"Titulacion 1","id":"11111111A","edad":20},{"nombre":"Nombre 4","titulacion":"Titulacion 2","id":"44444444A","edad":30}]}</i></p>

<form action="filtraPorEdad" method="POST">
<label for="edad">Edad:</label> <input type="text" name="edad">
<input type="submit" value="Submit" />
</form>
</li>

<li><h3>Metodo <i>filtraAlumnosPorTitulacion</i>: Devuelve aquellos alumnos cuya titulacion coincidan</h3>
<p><b>Tipo peticion:</b> POST</p>
<p><b>Parametro entrada:</b> titulacion (tipo <i>string</i>)</p>
<p><b>Salida:</b> JSon de la forma: <i>{"code":"code", "message":"message", "result": [{"nombre":"Nombre 1","titulacion":"Titulacion 1","id":"11111111A","edad":20},{"nombre":"Nombre 4","titulacion":"Titulacion 2","id":"44444444A","edad":30}]}</i></p>

<form action="filtraAlumnosPorTitulacion" method="POST">
<label for="titulacion">Titulacion</label> <input type="text" name="titulacion">
<input type="submit" value="Submit" />
</form>
</li>

<li><h3>Metodo <i>filtraPorTitulacion</i>: Devuelve aquellos alumnos cuya titulacion coincidan</h3>
<p><b>Tipo peticion:</b> POST</p>
<p><b>Parametro entrada:</b> titulacion (tipo <i>string</i>)</p>
<p><b>Salida:</b> JSon de la forma: <i>{"code":"code", "message":"message", "result": [{"nombre":"Nombre 1","titulacion":"Titulacion 1","id":"11111111A","edad":20},{"nombre":"Nombre 4","titulacion":"Titulacion 2","id":"44444444A","edad":30}]}</i></p>

<form action="filtraPorTitulacion" method="POST">
<label for="titulacion">Titulacion</label> <input type="text" name="titulacion">
<input type="submit" value="Submit" />
</form>
</li>

</ul> 
</body>
</html>