package com.JSCity.gr415st7;

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
				new Cube(new Dims3d(700,1200,400)).move(new Coords3d(0,0,200)),
				//крыша
				new Cube(new Dims3d(700,1200,25)).rotate(new Angles3d(0,30,0)).move(new Coords3d(295,0,445)),
				new Cube(new Dims3d(500,1200,25)).rotate(new Angles3d(0,-30,0)).move(new Coords3d(-210,0,495)),
				new Cube(new Dims3d(700,25,230)).move(new Coords3d(0,-580,512)),
				new Cube(new Dims3d(700,25,230)).move(new Coords3d(0,580,512))

		);
		//обрезание предметов
		Difference second = new Difference(first,
				//крыша
				new Cube(new Dims3d(450,1200,180)).rotate(new Angles3d(0,30,0)).move(new Coords3d(235,0,600)),
				new Cube(new Dims3d(450,1200,180)).rotate(new Angles3d(0,-30,0)).move(new Coords3d(-235,0,600)),
				//1 этаж
				new Cube(new Dims3d(670,1150,350)).move(new Coords3d(0,0,200)),
				//окно
				new Cube(new Dims3d(150,50,200)).move(new Coords3d(125,-580,200)),
				new Cube(new Dims3d(150,50,200)).move(new Coords3d(-125,-580,200)),

				new Cube(new Dims3d(50,250,200)).move(new Coords3d(325,-370,200)),
				new Cube(new Dims3d(50,250,200)).move(new Coords3d(325,300,200)),
				new Cube(new Dims3d(50,150,200)).move(new Coords3d(325,-40,200)),

				new Cube(new Dims3d(300,350,200)).move(new Coords3d(505,-425,300)),
				new Cube(new Dims3d(300,350,200)).move(new Coords3d(505,425,300)),
				//2 этаж
				new Cube(new Dims3d(125,50,125)).move(new Coords3d(0,-580,480))
		);
		models.add(second);
		return models;
	}
}