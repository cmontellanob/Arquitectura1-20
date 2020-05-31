<?php 
include("consulta.php");

{foreach ($productos as $producto)
 ?><tr>
 	<td><?php echo $producto["Producto"]; ?> </td>
 	<td><?php echo $producto["Descripcion"] ?> </td>
 	<td><?php echo $producto["Categoria"] ?> </td>
 	<td><img src="<?php echo $producto["Foto"] ?>" alt="<?php echo $producto["Foto"] ?>"> </td>
 	<td><?php echo $producto["Precio"];  ?> </td>
 	<td>
 	<?php if ($_SESSION['nivel']==1) { ?>
 		<a href="feditar.php?txtId=<?php echo $producto["Id"]; ?>">Editar</a></td>
 	<td><a href="eliminar.php?txtId=<?php echo $producto["Id"]; ?>">Eliminar</a>
 	</td>
 	<?php } ?>
 </tr>
<?php } 
 ?>