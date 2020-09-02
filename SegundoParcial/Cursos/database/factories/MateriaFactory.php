<?php

/** @var \Illuminate\Database\Eloquent\Factory $factory */

use App\Materia;
use Faker\Generator as Faker;
use Illuminate\Support\Str;

$factory->define(Materia::class, function (Faker $faker) {
    return [
        'nombre' => Str::random(30),
        'sigla' => Str::random(10),
        'docente' => $faker->name." ".$faker->lastName,
        'horasteoricas' => 20,
        'horaspracticas'  => 20,
        
    ];
});
