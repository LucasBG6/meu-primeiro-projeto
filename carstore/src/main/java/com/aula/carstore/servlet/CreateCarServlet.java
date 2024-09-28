
package com.aula.carstore.servlet;

import com.aula.carstore.servlet.dao.CarDao;
import com.aula.carstore.servlet.model.Car;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/create-car")
public class CreateCarServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String carName = request.getParameter("car-name");

        System.out.println(carName);

        Car car = new Car();

        car.setName(carName);

        CarDao carDao = new CarDao();

        carDao.createCar(car);


        request.getRequestDispatcher("index.jsp").forward(request, response);

    }

}