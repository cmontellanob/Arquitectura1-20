@extends('layouts.app')
@section('title')
Materias
@endsection

@section('content')

<table>
 <tr>
     <th>nombre</th>
     <th>sigla</th>
     <th>docente</th>
     <th>horasteoricas</th>
     <th>horaspracticas</th>

     <th>Operaciones</th>
 </tr>
 @foreach ($materias as $materia)
    <tr>
    <td>{{$materia->nombre}}</td>
    <td>{{$materia->sigla}}</td>
    <td>{{$materia->docente}}</td>
    <td>{{$materia->horasteoricas}}</td>
    <td>{{$materia->horaspracticas}}</td>
    
    <td><a href="{{route("materias.edit",$materia)}}">Editar</a></td>
    <td><a href="{{route("materias.destroy",$materia)}}">Eliminar</a></td>

    </tr>
@endforeach

</table>

@endsection
