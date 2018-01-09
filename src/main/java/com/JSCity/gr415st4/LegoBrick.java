package com.JSCity.gr415st4;

import java.util.ArrayList;
import java.util.List;
import eu.printingin3d.javascad.coords.Angles3d;
import eu.printingin3d.javascad.models.Abstract3dModel;
import eu.printingin3d.javascad.coords.Coords3d;
import eu.printingin3d.javascad.coords.Dims3d;
import eu.printingin3d.javascad.models.*;
import eu.printingin3d.javascad.tranzitions.Difference;
import eu.printingin3d.javascad.tranzitions.Union;

class LegoBrick extends Union {


	LegoBrick() {super(getModels());}

	private static List<Abstract3dModel> getModels() {
		//полная модель
		List<Abstract3dModel> models = new ArrayList<Abstract3dModel>();

		Union first = new Union(
				//здание
				new Cube(new Dims3d(600,600,1800)).move(new Coords3d(0,0,900)),
				new Cube(new Dims3d(700,700,600)).move(new Coords3d(0,0,2095)),
				new Cube(new Dims3d(500,500,300)).move(new Coords3d(0,0,2545)),
				new Prism(350,400,250,4).rotate(new Angles3d(0,0,45)).move(new Coords3d(0,0,2870)),
				new Cube(new Dims3d(320,320,350)).move(new Coords3d(0,0,3220)),
				new Prism(500,250,10,4).rotate(new Angles3d(0,0,45)).move(new Coords3d(0,0,3645)),
				new Prism(200,9,3,4).rotate(new Angles3d(0,0,45)).move(new Coords3d(0,0,3995)),
				//Часы
				new Cube(new Dims3d(450,50,500)).move(new Coords3d(0,350,2095)),
				new Cylinder(50,215).rotate(new Angles3d(90,0,0)).move(new Coords3d(0,370,2095)),
				new Cube(new Dims3d(25,50,210)).move(new Coords3d(0,385,2195)),
				new Cube(new Dims3d(25,50,150)).rotate(new Angles3d(0,45,0)).move(new Coords3d(50,395,2150)),

				new Cube(new Dims3d(450,50,500)).move(new Coords3d(0,-350,2095)),
				new Cylinder(50,215).rotate(new Angles3d(90,0,0)).move(new Coords3d(0,-370,2095)),
				new Cube(new Dims3d(25,50,210)).move(new Coords3d(0,-385,2195)),
				new Cube(new Dims3d(25,50,150)).rotate(new Angles3d(0,-45,0)).move(new Coords3d(-50,-395,2150)),


				new Cube(new Dims3d(50,450,500)).move(new Coords3d(350,0,2095)),
				new Cylinder(50,215).rotate(new Angles3d(0,90,0)).move(new Coords3d(370,0,2095)),
				new Cube(new Dims3d(50,25,210)).move(new Coords3d(385,0,2195)),
				new Cube(new Dims3d(50,25,150)).rotate(new Angles3d(45,0,0)).move(new Coords3d(395,-50,2150)),


				new Cube(new Dims3d(50,450,500)).move(new Coords3d(-350,0,2095)),
				new Cylinder(50,215).rotate(new Angles3d(0,90,0)).move(new Coords3d(-370,0,2095)),
				new Cube(new Dims3d(50,25,210)).move(new Coords3d(-385,0,2195)),
				new Cube(new Dims3d(50,25,150)).rotate(new Angles3d(-45,0,0)).move(new Coords3d(-395,50,2150))
		);
		//обрезание предметов
		Difference second = new Difference(first,

				new Cube(new Dims3d(50,550,200)).move(new Coords3d(0,0,2510)),
				new Cube(new Dims3d(50,550,200)).move(new Coords3d(65,0,2510)),
				new Cube(new Dims3d(50,550,200)).move(new Coords3d(-65,0,2510)),
				new Cube(new Dims3d(50,550,200)).move(new Coords3d(130,0,2510)),
				new Cube(new Dims3d(50,550,200)).move(new Coords3d(-130,0,2510)),
				new Cube(new Dims3d(50,550,200)).move(new Coords3d(195,0,2510)),
				new Cube(new Dims3d(50,550,200)).move(new Coords3d(-195,0,2510)),

				new Cube(new Dims3d(550,50,200)).move(new Coords3d(0,0,2510)),
				new Cube(new Dims3d(550,50,200)).move(new Coords3d(0,65,2510)),
				new Cube(new Dims3d(550,50,200)).move(new Coords3d(0,-65,2510)),
				new Cube(new Dims3d(550,50,200)).move(new Coords3d(0,130,2510)),
				new Cube(new Dims3d(550,50,200)).move(new Coords3d(0,-130,2510)),
				new Cube(new Dims3d(550,50,200)).move(new Coords3d(0,195,2510)),
				new Cube(new Dims3d(550,50,200)).move(new Coords3d(0,-195,2510))


		);
		models.add(second);
		return models;
	}
}
