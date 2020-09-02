<?php

use Illuminate\Database\Seeder;
use App\Materia;

class MateriaSeeder extends Seeder
{
    /**
     * Run the database seeds.
     *
     * @return void
     */
    public function run()
    {
        factory(Materia::class, 50)->create(); //
    }
}
