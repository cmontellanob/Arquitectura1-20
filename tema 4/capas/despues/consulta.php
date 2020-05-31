<?php 
include("conexion.php");
$sql="SELECT productos.Id, Producto,Descripcion,Categoria,Foto,Precio from productos 
left join categorias on (productos.Idcategoria=categorias.Id)
order by ".$ordenar;
$resultado=$con->query($sql);
$productos=array();
while ($fila=$resultado->fetch_assoc())
        {
             $productos[]=$fila;   
        }
$con->close();
?>
