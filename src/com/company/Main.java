package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        for (int i = 1; i <= 25; i++) {

            double price = 3.00;

            ArrayList<ArrayList<String>> burritoList = new ArrayList<ArrayList<String>>();

            Random t = new Random();

            ArrayList<String> Rice = new ArrayList<String>();


            Rice.add("white rice, ");
            Rice.add("brown rice, ");
            Rice.add("no rice, ");
            Rice.add("all, ");

//                if (   String j == 2) {
//                    System.out.println("You had one job.");
//                    System.exit(0);
//                }
            ArrayList<String> Meat = new ArrayList<String>();

            Meat.add("chicken, ");
            Meat.add("steak, ");
            Meat.add("carnidas, ");
            Meat.add("chorizo, ");
            Meat.add("sofritas, ");
            Meat.add("veggies, ");
            Meat.add("no meat, ");
            Meat.add("all, ");


            ArrayList<String> Beans = new ArrayList<String>();

            Beans.add("pinto beans, ");
            Beans.add("black beans, ");
            Beans.add("no beans, ");

            ArrayList<String> Salsa = new ArrayList<String>();

            Salsa.add("mild, ");
            Salsa.add("medium, ");
            Salsa.add("hot, ");
            Salsa.add("no salsa, ");
            Salsa.add("all, ");


            ArrayList<String> Veggies = new ArrayList<>();

            Veggies.add("lettuce, ");
            Veggies.add("fajita veggies, ");
            Veggies.add("no veggies, ");
            Veggies.add("all, ");

            ArrayList<String> Cheese = new ArrayList<>();

            Cheese.add("no cheese, ");
            Cheese.add("cheese, ");

            ArrayList<String> Guac = new ArrayList<>();

            Guac.add("no guac, ");
            Guac.add("guac, ");

            ArrayList<String> Queso = new ArrayList<>();

            Queso.add("no queso, ");
            Queso.add("queso, ");

            ArrayList<String> sourCream = new ArrayList<String>();

            sourCream.add("no sour cream, ");
            sourCream.add("sour cream, ");


            burritoList.add(Rice);
            burritoList.add(Meat);
            burritoList.add(Beans);
            burritoList.add(Salsa);
            burritoList.add(Veggies);
            burritoList.add(Cheese);
            burritoList.add(Guac);
            burritoList.add(Queso);
            burritoList.add(sourCream);

            Random r = new Random();


            String burrito = ("Burrito " + i + ": ")
                    + Rice.get(r.nextInt(Rice.size()))
                    + Meat.get(r.nextInt(Meat.size()))
                    + Beans.get(r.nextInt(Beans.size()))
                    + Salsa.get(r.nextInt(Salsa.size()))
                    + Veggies.get(r.nextInt(Veggies.size()))
                    + Cheese.get(r.nextInt(Cheese.size()))
                    + Guac.get(r.nextInt(Guac.size()))
                    + Queso.get(r.nextInt(Queso.size()))
                    + sourCream.get(r.nextInt(sourCream.size()));

           double price = computePrice(double price)
            System.out.println(burrito + double price);

        }

        }

        public static double computePrice(double price){

            if (Rice.equals("no rice");
            {
                price + .00;
            }
            if (Rice.equals("all");
            {
                price + 1.00;
            }
            if (Rice.equals("black rice");
            {
                price + .50;
            }
            if (Rice.equals("brown rice");
            {
                price + .50;
            }
            if (Meat.equals("chicken");
            {
                price + .50;
            }
            if (Meat.equals("steak");
            {
                price + .50;
            }
            if (Meat.equals("carnidas");
            {
                price + .50;
            }
            if (Meat.equals("chorizo");
            {
                price + .50;
            }
            if (Meat.equals("sofritas");
            {
                price + .50;
            }
            if (Meat.equals("veggies");
            {
                price + .50;
            }
            if (Meat.equals("no meat");
            {
                price + .00;
            }
            if (Meat.equals("all");
            {
                price + 3.00;
            }
            if (Beans.equals("black beans");
            {
                price + .50;
            }
            if (Beans.equals("brown rice");
            {
                price + .50;
            }
            if (Beans.equals("no beans");
            {
                price + .00;
            }
            if (Beans.equals("all");
            {
                price + 1.00;
            }
            if (Salsa.equals("mild salsa");
            {
                price + .50;
            }
            if (Salsa.equals("medium salsa");
            {
                price + .50;
            }
            if (Salsa.equals("hot salsa");
            {
                price + .50;
            }
            if (Salsa.equals("no salsa");
            {
                price + .00;
            }
            if (Salsa.equals("all");
            {
                price + 1.50;
            }
            if (Veggies.equals("all");
            {
                price + 1.00;
            }
            if (Veggies.equals("lettuce");
            {
                price + .50;
            }
            if (Veggies.equals("fajita veggies");
            {
                price + .50;
            }
            if (Veggies.equals("no veggies");
            {
                price + .00;
            }
            if (Cheese.equals("no cheese");
            {
                price + .00;
            }
            if (Cheese.equals("cheese");
            {
                price + .50;
            }
            if (Guac.equals("no guac");
            {
                price + .00;
            }
            if (Guac.equals("guac");
            {
                price + .50;
            }
            if (Queso.equals("no queso");
            {
                price + .00;
            }
            if (Queso.equals("queso");
            {
                price + .50;
            }
            if (sourCream.equals("sour cream");
            {
                price + .50;
            }
            if (sourCream.equals("no sour cream");
            {
                price + .00;
            }
            else{
                price + .50;
            }
                return (double price);

        }

    }


