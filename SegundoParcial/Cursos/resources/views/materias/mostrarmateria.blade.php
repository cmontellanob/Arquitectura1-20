@extends('layouts.app')
@section('title')
Mostrar Producto
@endsection
@section('content')

<ul>
    <li>Producto:{{$producto->producto}}</li>
    <li>Descripcion:{{$producto->descripcion}}</li>
    <li>Precio:{{$producto->precio}}</li>
</ul>
@endsection