<?php 

$con =new mysqli("localhost", "root", "","bd_prueba");
if ($con->connect_error)
die ("conexion fallada".$con->connect_error);

$sql="SELECT productos.Id, Producto,Descripcion,Categoria,Foto,Precio from productos 
	left join categorias on (productos.Idcategoria=categorias.Id)
order by ".$ordenar;
$resultado=$con->query($sql);
?>

<table>
	<tr>
		<th><a href="listar.php?ordenar=Producto">Producto</a></th>
		<th><a href="listar.php?ordenar=Descripcion">Descripcion </a></th>
		<th><a href="listar.php?ordenar=Categoria">Categoria </a></th>
		
		<th>Fotografia</th>
		<th><a href="listar.php?ordenar=Precio">Precio</a></th>
		<th>Operaciones</th>
	</tr>
<?php 
while ($fila=$resultado->fetch_assoc())
{
 ?><tr>
 	<td><?php echo $fila["Producto"]; ?> </td>
 	<td><?php echo $fila["Descripcion"] ?> </td>
 	<td><?php echo $fila["Categoria"] ?> </td>
 	<td><img src="<?php echo $fila["Foto"] ?>" alt="<?php echo $fila["Foto"] ?>"> </td>
 	<td><?php echo $fila["Precio"];  ?> </td>
 	<td>
 	<?php if ($_SESSION['nivel']==1) { ?>
 		<a href="feditar.php?txtId=<?php echo $fila["Id"]; ?>">Editar</a></td>
 	<td><a href="eliminar.php?txtId=<?php echo $fila["Id"]; ?>">Eliminar</a>
 	</td>
 	<?php } ?>
 </tr>
<?php } 
 $con->close();
 ?>