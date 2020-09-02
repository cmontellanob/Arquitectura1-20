@extends('layouts.app')
@section('title')
Crear MAteria 
@endsection
@section('content')
 <div class="list-group">                                       
    <form class="form-horizontal" action="{{url("materias")}}" method="post">
             {{ csrf_field() }}
         <div class="input-group">
               Nombre <input type="text" class="form-control" name="nombre" placeholder="nombre" >
             </div>
            <div class="input-group">
               SiglA <input type="text" class="form-control" name="sigla" placeholder="sigla">
             </div>

             <br/>
             <div class="input-group">
              Docente <input type="text" class="form-control" name="docente" placeholder="docente">
            </div>
           <br>
             <div >
                 horasteoricas <input type="text" class="form-control" name="horasteoricas" > 
             </div>
             <div >
              horasteoricas <input type="text" class="form-control" name="horaspracticas" > 
          </div>
             <div class="input-group">
                  <input type="submit" name="" class="btn btn-info pull-right" value="Crear">
             </div>
        </form>
</div>
@endsection
