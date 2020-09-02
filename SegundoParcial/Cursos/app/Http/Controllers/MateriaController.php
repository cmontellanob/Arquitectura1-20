<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;
use App\Materia;

class MateriaController extends Controller
{
    /**
     * Display a listing of the resource.
     *
     * @return \Illuminate\Http\Response
     */
    public function index()
    {
        $data = [
            "materias" => Materia::get()
        ];
        return view("materias.listar", $data);
    }

    /**
     * Show the form for creating a new resource.
     *
     * @return \Illuminate\Http\Response
     */
    public function create()
    {
        return view("materias.create");
    }

    /**
     * Store a newly created resource in storage.
     *
     * @param  \Illuminate\Http\Request  $request
     * @return \Illuminate\Http\Response
     */
    public function store(Request $request)
    {
        $input = $request->all();
        $materia=Materia::create([
            "nombre"    => $input["nombre"],
            "sigla" =>$input["sigla"],
            "docente"      =>$input["docente"],
            "horasteoricas" =>$input["horasteoricas"],
            "horaspracticas"      =>$input["horaspracticas"],

        ]);
        return view("materias.exito")->withMateria($materia);
    }

    /**
     * Display the specified resource.
     *
     * @param  int  $id
     * @return \Illuminate\Http\Response
     */
    public function show(Materia $materia)
    {
        return view("materias.mostrarmateria")->withMateria($materia);
    }

    /**
     * Show the form for editing the specified resource.
     *
     * @param  int  $id
     * @return \Illuminate\Http\Response
     */
    public function edit(Materia $materia)
    {
        return view("materias.edit")->withMateria($materia);
    
    }

    /**
     * Update the specified resource in storage.
     *
     * @param  \Illuminate\Http\Request  $request
     * @param  int  $id
     * @return \Illuminate\Http\Response
     */
    public function update(Request $request,Materia $materia)
    {
        $input = $request->all();
        $materia->nombre = $input["nombre"];
        $materia->sigla = $input["sigla"];
        $materia->docente = $input["docente"];
        $materia->horasteoricas = $input["horasteoricas"];
        $materia->horasteoricas = $input["horaspracticas"];
        
        if ($materia->save()) {
            # code...
            return view("materia.mostrarmateria")->withMateria($materia);
        }
        abort(500);
    }

    /**
     * Remove the specified resource from storage.
     *
     * @param  int  $id
     * @return \Illuminate\Http\Response
     */

    public function destroy(Materia $materia)
    {
        $materia->delete();
    }
}
