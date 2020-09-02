@extends('layouts.app')
@section('title')
Mosrar Materia 
@endsection
@section('content')
Se inserto con extito
<ul>
    <li>{{$materia->nombre}}</li>
    <li>{{$materia->sigla}}</li>
    <li>{{$materia->docente}}</li>
    <li>{{$materia->horasteoricas}}</li>
     <li>{{$materia->horaspracticas}}</li>
</ul>
@endsection