@extends('layouts.app')
@section('title')
Editar Materia 
@endsection
@section('content')
 <div class="list-group">
    <form class="form-horizontal" action="{{url("materias")}}" method="post">
             {{ csrf_field() }}
             @method('PUT')
         <div class="input-group">
               Producto <input type="text" class="form-control" name="nombre" placeholder="nombre" value={{$materia->nombre}} >
             </div>
            <div class="input-group">
               Descripcion <input type="text" class="form-control" name="sigla" placeholder="sigla" value={{$materia->sigla}}>
             </div>
             <div class="input-group">
              Descripcion <input type="text" class="form-control" name="docente" placeholder="docente" value={{$materia->docente}}>
            </div>
             <br/>
             <div >
                 Horas Teoricas <input type="text" class="form-control" name="horasteoricas" value={{$materia->horasteoricas}} > 
             </div>
             <div >
              Horas Practicas <input type="text" class="form-control" name="horaspracticas" value={{$materia->horaspracticas}} > 
          </div>
             <div class="input-group">
                  <input type="submit" name="" class="btn btn-info pull-right" value="Editar">
             </div>
        </form>
</div>
@endsection
